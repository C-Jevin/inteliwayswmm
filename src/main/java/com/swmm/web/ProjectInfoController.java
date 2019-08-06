package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Linkout;
import com.swmm.service.LinkoutService;
import com.swmm.service.NodeoutService;
import com.swmm.service.SubcatchouttService;
import io.swagger.annotations.Api;
import org.apache.http.client.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author Chenjh
 * @create 2019-07-31-10:23
 */
@Api(value = "ProjectInformation", description = "项目概要信息API", position = 100, protocols = "http")
@RestController
@RequestMapping("swmm/projectInfo")
public class ProjectInfoController {

    private static Logger Log = LoggerFactory.getLogger(ProjectInfoController.class);

    @Autowired
    LinkoutService linkoutService;
    @Resource
    NodeoutService nodeoutService;
    @Resource
    SubcatchouttService subcatchouttService;

    @GetMapping
    public Result detailOfProject( @RequestParam(defaultValue = "linkout",name = "tName",required = true) String tName){
        Map<String,Object> resMap = new HashMap<>();
        List<Map> dts;
        List<Map> list;
        //List pollutantList = new ArrayList();
        //Map<String,Object> pollutantMap =new HashMap<>();
        TimeZone tz = TimeZone.getTimeZone("ETC/GMT-8");
        TimeZone.setDefault(tz);
        try {
            if (tName.equals(""))
                throw new Exception("tName结果表名不能为空！");
            if (tName.equals("linkout")) {
                dts = linkoutService.findDate();
                list = linkoutService.findMaxAndMin();
                resMap.put("project","项目名称linkout");
            }else if (tName.equals("nodeout")) {
                dts = nodeoutService.findDate();
                list = nodeoutService.findMaxAndMin();
                resMap.put("project","项目名称nodeout");
            }else if (tName.equals("subcatchout")) {
                dts = subcatchouttService.findDate();
                list = subcatchouttService.findMaxAndMin();
                resMap.put("project","项目名称subcatchout");
            }else {
                throw new Exception("此tName结果表名不存在！");
            }
            if(dts!=null){
                //System.err.println(list.toString());
                for (int i = 0 ; i<dts.size() ; i++){
                    resMap.put("startTime",DateUtils.formatDate((Date) dts.get(i).get("DtMin"),"yyyy-MM-dd HH:mm:ss"));
                    resMap.put("endTime",DateUtils.formatDate((Date) dts.get(i).get("DtMax"),"yyyy-MM-dd HH:mm:ss"));
                }
            }else {
                throw new Exception("表数据不存在或为空！");
            }

            resMap.put("pollutant",list);
            return ResultGenerator.genSuccessResult(resMap);
        }catch (Exception e){
            e.printStackTrace();
            Log.error(e.getMessage());
            return  ResultGenerator.genFailResult(e.getMessage());
        }
        //return ResultGenerator.genSuccessResult();
    }
}
