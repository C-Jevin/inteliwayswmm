package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Ratingcurve;
import com.swmm.service.RatingcurveService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/ratingcurve")
public class RatingcurveController {
    @Resource
    private RatingcurveService ratingcurveService;

    @PostMapping
    public Result add(@RequestBody Ratingcurve ratingcurve) {
        ratingcurveService.save(ratingcurve);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        ratingcurveService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Ratingcurve ratingcurve) {
        ratingcurveService.update(ratingcurve);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Ratingcurve ratingcurve = ratingcurveService.findById(id);
        return ResultGenerator.genSuccessResult(ratingcurve);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Ratingcurve> list = ratingcurveService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
