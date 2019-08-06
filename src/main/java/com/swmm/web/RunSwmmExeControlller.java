package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

import java.util.HashMap;
import java.util.Map;


@Api(value = "RunSwmmEXE", description = "运行swmm.exe API", position = 100, protocols = "http")
@RestController
@RequestMapping("swmm")
public class RunSwmmExeControlller {
    private static Logger Log = LoggerFactory.getLogger(RunSwmmExeControlller.class);

    private String uid = "testUser";
    private String modeldir = "D:\\InteliwaySwmmProject\\SwmmModel";
    private String dirName = modeldir + "\\" + uid ;
    private String uuidstr = "testProject";

    /**
     * 运行swmm.exe
     * @return
     */
    @ApiOperation(
            value = "调用Swmm.exe",
            notes = "异步调用exe",
            produces="application/json",
            consumes="application/json")
    @GetMapping("/runswmmexe")
    public Result mainrun(){
        String pathInp = "D:\\InteliwaySwmmProject\\UpLoadFile";
        String pathExedir = this.InputCopy(pathInp);
        String cmd;
        cmd = "cmd /c cd "+pathExedir + " & Intelway_SWMM.exe " + pathExedir;
        new Thread(()->{
            Log.info("模拟开始...");
            Runtime rt = Runtime.getRuntime();
            Process pswmm = null;
            try {
                pswmm = rt.exec(cmd);
                exeLogPrint(pswmm);
                pswmm.waitFor();
                Log.info("模拟完成...");
            } catch (IOException e) {
                e.printStackTrace();
                Log.error("模型运行错误！");
            } catch (InterruptedException e) {
                e.printStackTrace();
                Log.error("模型运行中断！");
            }finally {
                if (pswmm != null) {
                    pswmm.destroy();
                }
            }
        }).start();

        Map<String,Object> resMap = new HashMap<>();
        resMap.put("exeStatus","模型运行中...");
        resMap.put("projectId",uuidstr);
        return ResultGenerator.genSuccessResult(resMap);
    }

    private String InputCopy(String pathInp){
        Log.info("input文件拷贝开始...");
        //第一步，新建一个文件夹存放本次运行的和结果。情景编号作为文件夹名称
        File dir = new File(dirName);
        if(!dir.exists()){//判断文件夹是否存在，新建文件夹
            dir.mkdir();
        }
        dirName = dirName + "\\" + uuidstr;
        dir = new File(dirName);
        if(!dir.exists()){//判断文件夹是否存在，新建文件夹
            dir.mkdir();
        }
        String basedir = "D:\\InteliwaySwmmProject\\InteliwaySwmmBase";
        File inpdir = new File(basedir);
        File[] flist = inpdir.listFiles();
        for(File f : flist){
            fcopy(basedir + "\\" + f.getName(),dirName+"\\" +f.getName());
        }
        Log.info("base文件拷贝结束...");
        inpdir = new File(pathInp);
        flist = inpdir.listFiles();
        assert flist != null;
        for(File f : flist){
            if(f.isDirectory()){
                continue;
            }
            fcopy(pathInp+"\\" +f.getName(),dirName+"\\" +f.getName());
        }
        Log.info("inp文件拷贝结束。。。");
        return dirName;
    }
    //用户InputCopy里，单个文件的拷贝
    private void fcopy(String src, String des)  {
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
        }
        //关闭流
    }
    //@Async
    void exeLogPrint(Process p) throws IOException {
        InputStream tmpstm = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(tmpstm);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while((line=br.readLine())!=null){
            //Log.info(line);
            System.out.println(line);
        }
    }

    /**
     * 根据projectID查看swmm.exe运行进度
     * @return
     */
    @ApiOperation(
            value = "查看swmm.exe运行进度",
            notes = "模型运算进度查看",
            produces="application/json",
            consumes="application/json")
    @GetMapping()
    public Result getExeProgress(){
        String path = "D:\\InteliwaySwmmProject\\SwmmModel\\testUser\\testProject\\SimulationProgress.txt";
        InputStreamReader read;
        Map<String,Object> resMap = new HashMap<>();
        try {
            read = new InputStreamReader(new FileInputStream(path), "utf-8");
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            resMap.put("exeProgress",0);
            return ResultGenerator.genSuccessResult(resMap);
        }
        BufferedReader reader = new BufferedReader(read);
        String line;
        try {
            String Progress;
            line = reader.readLine();
            String[] arr = line.split("\t");
            String SimulationProgress = arr[1];
            Progress = SimulationProgress.trim();
            resMap.put("exeProgress",Progress);
            return ResultGenerator.genSuccessResult(resMap);
        } catch (IOException e) {
            resMap.put("exeProgress",0);
            return ResultGenerator.genSuccessResult(resMap);
        }
    }
}
