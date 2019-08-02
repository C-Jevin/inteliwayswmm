package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.service.LinkoutService;
import com.swmm.service.NodeoutService;
import com.swmm.service.SubcatchouttService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chenjh
 * @create 2019-07-31-10:23
 */
@Api(value = "ProjectInformation", description = "项目概要信息API", position = 100, protocols = "http")
@RestController
@RequestMapping("swmm/projectInfo")
public class ProjectInfoController {

    private static Logger Log = LoggerFactory.getLogger(ProjectInfoController.class);

    @Resource
    LinkoutService linkoutService;
    @Resource
    NodeoutService nodeoutService;
    @Resource
    SubcatchouttService subcatchouttService;

    @GetMapping("/{tName}")
    public Result detailOfProject(@PathVariable @RequestParam(defaultValue = "linkout",name = "结果表名(linkout,nodeout,subcatchout)",required = true) String tName){
        Map<String,Object> resMap = new HashMap<>();
        List pollutantList = new ArrayList();
        Map<String,Object> pollutantMap =new HashMap<>();
        try {
            if (tName.equals(""))
                throw new Exception("tName结果表名不能为空！");
            if (tName.equals("linkout")) {

            }else if (tName.equals("nodeout")) {

            }else if (tName.equals("subcatchout")) {

            }else {
                throw new Exception("此tName结果表名不存在！");
            }
        }catch (Exception e){
            e.printStackTrace();
            Log.error(e.getMessage());
            return  ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult();
    }
}
