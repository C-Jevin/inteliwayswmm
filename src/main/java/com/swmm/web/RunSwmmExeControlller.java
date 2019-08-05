package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.text.MessageFormat;
import java.util.UUID;

@Api(value = "RunSwmmEXE", description = "运行swmm.exe API", position = 100, protocols = "http")
@RestController
@RequestMapping("swmm")
public class RunSwmmExeControlller {
    private static Logger Log = LoggerFactory.getLogger(RunSwmmExeControlller.class);
    @GetMapping("/runswmmexe")
   // @Async
    public Result mainrun(){
//		String uid = request.getParameter("uid");
//		String pathInp = request.getParameter("path");
        String uid = "cccc";
        String pathInp ="D:\\InteliwaySwmmProject\\UpLoadFile";
//        System.out.println(uid);
//        System.out.println(pathInp);
        String pathExedir = this.InputCopy(uid, pathInp);
        String cmd;
        cmd = "cmd /c cd "+pathExedir + " & Intelway_SWMM.exe " + pathExedir;
//		String cmd = "D:\\work\\java\\InteliwaySwmmRun\\InteliwaySwmmProject\\SwmmModel\\aaaa\\5e27579c-89f0-4fe0-a485-06eb216b6530\\Intelway_SWMM.exe D:\\work\\java\\InteliwaySwmmRun\\InteliwaySwmmProject\\SwmmModel\\aaaa\\5e27579c-89f0-4fe0-a485-06eb216b6530";
        Log.info(""+runMSG);
       // System.out.println(runMSG);
        //  System.out.println(cmd);
        Process pswmm = null;
        Process ptodb = null;

        try {
            Runtime rt = Runtime.getRuntime();
            pswmm = rt.exec(cmd);
            this.exeLogPrint(pswmm);
            pswmm.waitFor();
            Log.info("模拟完成。");
            System.out.println("模拟完成。。。");

          //  System.out.println("结果入库完成。。。");
            return  ResultGenerator.genSuccessResult();
        } catch (Exception e) {
            runMSG = "出错！！！";
            e.printStackTrace();
           // return ResultGenerator.genFailResult(e.getMessage());
        }finally {
           // if (pswmm != null){
                pswmm.destroy();
            //}
        }
        try {
            Runtime rt = Runtime.getRuntime();
            cmd = "python  {1}\\swmmToDB.py {0} {1}" ;
            cmd = MessageFormat.format(cmd, uid,pathExedir);
            Log.info("cmd="+cmd);
            // System.out.println(cmd);
            ptodb = rt.exec(cmd);
            ptodb.waitFor();
            runMSG = "运行完成";
            Log.info("结果入库。。");
            //  System.out.println("结果入库完成。。。");
            //return  ResultGenerator.genSuccessResult();
        } catch (Exception e) {
            runMSG = "出错！！！";
            e.printStackTrace();
            //return ResultGenerator.genFailResult(e.getMessage());
        }finally {
            if(ptodb !=null){
                ptodb.destroy();
            }
        }
    return ResultGenerator.genSuccessResult();
    }
    public String runMSG = "拷贝完成";
    private String basedir = "D:\\InteliwaySwmmProject\\InteliwaySwmmBase";
    private String modeldir = "D:\\InteliwaySwmmProject\\SwmmModel";
    //@Async
    String InputCopy(String uid, String pathInp){
      //  System.out.println("input文件拷贝开始......");
        Log.info("input文件拷贝开始...");
        //第一步，新建一个文件夹存放本次运行的和结果。情景编号作为文件夹名称
        UUID uuid = UUID.randomUUID();
        String uuidstr = uuid.toString();
        String dirName = modeldir + "\\" + uid ;
        File dir = new File(dirName);
        if(!dir.exists()){//判断文件夹是否存在，新建文件夹
            dir.mkdir();
        }
        dirName = dirName + "\\" + uuidstr ;
        dir = new File(dirName);
        if(!dir.exists()){//判断文件夹是否存在，新建文件夹
            dir.mkdir();
        }
        File inpdir = new File(basedir);
        File[] flist = inpdir.listFiles();
        for(File f : flist){
            fcopy(basedir + "\\" + f.getName(),dirName+"\\" +f.getName());
        }
        Log.info("base文件拷贝结束...");
      //  System.out.println("base文件拷贝结束！！！");
        inpdir = new File(pathInp);
        flist = inpdir.listFiles();
        for(File f : flist){
            if(f.isDirectory()){
                continue;
            }
            fcopy(pathInp+"\\" +f.getName(),dirName+"\\" +f.getName());
        }
        Log.info("inp文件拷贝结束。。。");
      //  System.out.println("inp文件拷贝结束！！！");
        return dirName;
    }
    //用户InputCopy里，单个文件的拷贝
    //@Async
    void fcopy(String src, String des)  {
        //io流固定格式
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));
            int i = -1;//记录获取长度
            byte[] bt = new byte[2048];//缓冲区
            while ((i = bis.read(bt))!=-1) {
                bos.write(bt, 0, i);
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
            runMSG = src + "文件拷贝失败";
        }
        //关闭流
    }
    //@Async
    void exeLogPrint(Process p) throws IOException {
        InputStream tmpstm = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(tmpstm);
        BufferedReader br = new BufferedReader(isr);
        String line=null;
        while((line=br.readLine())!=null){
            //Log.info(line);
            System.out.println(line);
        }
    }
}
