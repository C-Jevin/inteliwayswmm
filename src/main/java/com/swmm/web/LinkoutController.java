package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Linkout;
import com.swmm.service.LinkoutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
import java.util.TimeZone;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@Api(value = "LinkOut", description = "LinkOut 结果操作API", position = 100, protocols = "http")
@RestController
@RequestMapping("swmm/linkout")
public class LinkoutController {
    private static Logger Log = LoggerFactory.getLogger(LinkoutController.class);

    @Resource
    private LinkoutService linkoutService;

   /* @PostMapping
    public Result add(@RequestBody Linkout linkout) {
        linkoutService.save(linkout);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        linkoutService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Linkout linkout) {
        linkoutService.update(linkout);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Linkout linkout = linkoutService.findById(id);
        return ResultGenerator.genSuccessResult(linkout);
    }*/

    /**
     * page 和 size 为0时，默认不分页查询所有的记录。
     * @param page 当前的页码
     * @param size 每页的记录条数
     * @return
     */
   @ApiOperation(
           value = "分页查询linkout的结果",
           notes = "分页查询linkout的结果（page和size都为0时，默认查询所有记录。）",
           produces="application/json",
           consumes="application/json")
    @GetMapping
    public Result list(@RequestParam(defaultValue = "1",name = "当前页码") Integer page, @RequestParam(defaultValue = "10",name = "每页条数") Integer size) {
        PageHelper.startPage(page, size);
        List<Linkout> list = linkoutService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    /**
     *根据字段link,dt,pollutant,查询相关的记录。
     * @param linkout
     * @return
     */
    @ApiOperation(
            value = "根据字段link,dt,pollutant,查询相关的记录",
            notes = "如果时间(dt)为空,则根据link,pollutant查询相关记录",
            produces="application/json",
            consumes="application/json")
    @PostMapping("/detailOfLink")
    public Result searchByCondition(@RequestBody @ApiParam(required = true,name="LinkOut查询条件",value="传入json格式,如果时间(dt)为空,则根据link,pollutant查询相关记录")Linkout linkout){
        try{
            if (linkout.getPollutant().equals(""))
                throw new Exception("污染物类型不能为空");
            /* 将查询条件转化为condition */
            Condition condition = new Condition(Linkout.class,false,false);
            Example.Criteria criteria = condition.createCriteria();
            if (!"".equals(linkout.getDt()))
                criteria.andEqualTo("dt",linkout.getDt());
            criteria.andEqualTo("link",linkout.getLink());
            criteria.andEqualTo("pollutant",linkout.getPollutant());
            List<Linkout> linkoutList = linkoutService.findByCondition(condition);
            return ResultGenerator.genSuccessResult(linkoutList);
        }catch (Exception e){
            e.printStackTrace();
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }
}
