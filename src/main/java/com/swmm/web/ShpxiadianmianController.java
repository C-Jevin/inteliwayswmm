package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Shpxiadianmian;
import com.swmm.service.ShpxiadianmianService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/shpxiadianmian")
public class ShpxiadianmianController {
    @Resource
    private ShpxiadianmianService shpxiadianmianService;

   /* @PostMapping
    public Result add(@RequestBody Shpxiadianmian shpxiadianmian) {
        shpxiadianmianService.save(shpxiadianmian);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        shpxiadianmianService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Shpxiadianmian shpxiadianmian) {
        shpxiadianmianService.update(shpxiadianmian);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Shpxiadianmian shpxiadianmian = shpxiadianmianService.findById(id);
        return ResultGenerator.genSuccessResult(shpxiadianmian);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Shpxiadianmian> list = shpxiadianmianService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
