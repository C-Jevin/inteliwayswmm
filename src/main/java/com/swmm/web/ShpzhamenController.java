package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Shpzhamen;
import com.swmm.service.ShpzhamenService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/shpzhamen")
public class ShpzhamenController {
    @Resource
    private ShpzhamenService shpzhamenService;

    /*@PostMapping
    public Result add(@RequestBody Shpzhamen shpzhamen) {
        shpzhamenService.save(shpzhamen);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        shpzhamenService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Shpzhamen shpzhamen) {
        shpzhamenService.update(shpzhamen);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Shpzhamen shpzhamen = shpzhamenService.findById(id);
        return ResultGenerator.genSuccessResult(shpzhamen);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Shpzhamen> list = shpzhamenService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
