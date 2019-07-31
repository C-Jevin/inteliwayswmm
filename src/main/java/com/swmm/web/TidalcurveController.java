package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Tidalcurve;
import com.swmm.service.TidalcurveService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/tidalcurve")
public class TidalcurveController {
    @Resource
    private TidalcurveService tidalcurveService;

    /*@PostMapping
    public Result add(@RequestBody Tidalcurve tidalcurve) {
        tidalcurveService.save(tidalcurve);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        tidalcurveService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Tidalcurve tidalcurve) {
        tidalcurveService.update(tidalcurve);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Tidalcurve tidalcurve = tidalcurveService.findById(id);
        return ResultGenerator.genSuccessResult(tidalcurve);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Tidalcurve> list = tidalcurveService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
