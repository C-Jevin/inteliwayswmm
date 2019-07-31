package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Nodeout;
import com.swmm.service.NodeoutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/nodeout")
public class NodeoutController {
    @Resource
    private NodeoutService nodeoutService;

    /*@PostMapping
    public Result add(@RequestBody Nodeout nodeout) {
        nodeoutService.save(nodeout);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        nodeoutService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Nodeout nodeout) {
        nodeoutService.update(nodeout);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Nodeout nodeout = nodeoutService.findById(id);
        return ResultGenerator.genSuccessResult(nodeout);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Nodeout> list = nodeoutService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
