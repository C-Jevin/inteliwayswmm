package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Shpyongdi;
import com.swmm.service.ShpyongdiService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/shpyongdi")
public class ShpyongdiController {
    @Resource
    private ShpyongdiService shpyongdiService;

    @PostMapping
    public Result add(@RequestBody Shpyongdi shpyongdi) {
        shpyongdiService.save(shpyongdi);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        shpyongdiService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Shpyongdi shpyongdi) {
        shpyongdiService.update(shpyongdi);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Shpyongdi shpyongdi = shpyongdiService.findById(id);
        return ResultGenerator.genSuccessResult(shpyongdi);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Shpyongdi> list = shpyongdiService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
