package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Shpwupaishui;
import com.swmm.service.ShpwupaishuiService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/shpwupaishui")
public class ShpwupaishuiController {
    @Resource
    private ShpwupaishuiService shpwupaishuiService;

    /*@PostMapping
    public Result add(@RequestBody Shpwupaishui shpwupaishui) {
        shpwupaishuiService.save(shpwupaishui);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        shpwupaishuiService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Shpwupaishui shpwupaishui) {
        shpwupaishuiService.update(shpwupaishui);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Shpwupaishui shpwupaishui = shpwupaishuiService.findById(id);
        return ResultGenerator.genSuccessResult(shpwupaishui);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Shpwupaishui> list = shpwupaishuiService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
