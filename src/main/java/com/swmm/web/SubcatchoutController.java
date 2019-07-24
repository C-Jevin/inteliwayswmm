package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Subcatchout;
import com.swmm.service.SubcatchoutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/subcatchout")
public class SubcatchoutController {
    @Resource
    private SubcatchoutService subcatchoutService;

    @PostMapping
    public Result add(@RequestBody Subcatchout subcatchout) {
        subcatchoutService.save(subcatchout);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        subcatchoutService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Subcatchout subcatchout) {
        subcatchoutService.update(subcatchout);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Subcatchout subcatchout = subcatchoutService.findById(id);
        return ResultGenerator.genSuccessResult(subcatchout);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Subcatchout> list = subcatchoutService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
