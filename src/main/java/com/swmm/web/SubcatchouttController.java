package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Subcatchoutt;
import com.swmm.service.SubcatchouttService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/30.
*/
@RestController
@RequestMapping("/subcatchoutt")
public class SubcatchouttController {
    @Resource
    private SubcatchouttService subcatchouttService;

    /*@PostMapping
    public Result add(@RequestBody Subcatchoutt subcatchoutt) {
        subcatchouttService.save(subcatchoutt);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        subcatchouttService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Subcatchoutt subcatchoutt) {
        subcatchouttService.update(subcatchoutt);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Subcatchoutt subcatchoutt = subcatchouttService.findById(id);
        return ResultGenerator.genSuccessResult(subcatchoutt);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Subcatchoutt> list = subcatchouttService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
