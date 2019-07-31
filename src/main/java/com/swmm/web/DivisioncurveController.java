package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Divisioncurve;
import com.swmm.service.DivisioncurveService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/divisioncurve")
public class DivisioncurveController {
    @Resource
    private DivisioncurveService divisioncurveService;

    /*@PostMapping
    public Result add(@RequestBody Divisioncurve divisioncurve) {
        divisioncurveService.save(divisioncurve);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        divisioncurveService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Divisioncurve divisioncurve) {
        divisioncurveService.update(divisioncurve);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Divisioncurve divisioncurve = divisioncurveService.findById(id);
        return ResultGenerator.genSuccessResult(divisioncurve);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Divisioncurve> list = divisioncurveService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
