package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Shpyuhuishui;
import com.swmm.service.ShpyuhuishuiService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/shpyuhuishui")
public class ShpyuhuishuiController {
    @Resource
    private ShpyuhuishuiService shpyuhuishuiService;

    @PostMapping
    public Result add(@RequestBody Shpyuhuishui shpyuhuishui) {
        shpyuhuishuiService.save(shpyuhuishui);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        shpyuhuishuiService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Shpyuhuishui shpyuhuishui) {
        shpyuhuishuiService.update(shpyuhuishui);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Shpyuhuishui shpyuhuishui = shpyuhuishuiService.findById(id);
        return ResultGenerator.genSuccessResult(shpyuhuishui);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Shpyuhuishui> list = shpyuhuishuiService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
