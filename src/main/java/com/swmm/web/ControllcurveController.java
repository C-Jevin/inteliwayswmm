package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Controllcurve;
import com.swmm.service.ControllcurveService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/

@RestController
@RequestMapping("/controllcurve")
public class ControllcurveController {
    @Resource
    private ControllcurveService controllcurveService;

   /* @PostMapping
    public Result add(@RequestBody Controllcurve controllcurve) {
        controllcurveService.save(controllcurve);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        controllcurveService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Controllcurve controllcurve) {
        controllcurveService.update(controllcurve);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Controllcurve controllcurve = controllcurveService.findById(id);
        return ResultGenerator.genSuccessResult(controllcurve);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Controllcurve> list = controllcurveService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
