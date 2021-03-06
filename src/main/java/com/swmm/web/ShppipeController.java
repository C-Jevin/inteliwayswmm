package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Shppipe;
import com.swmm.service.ShppipeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/shppipe")
public class ShppipeController {
    @Resource
    private ShppipeService shppipeService;

    /*@PostMapping
    public Result add(@RequestBody Shppipe shppipe) {
        shppipeService.save(shppipe);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        shppipeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Shppipe shppipe) {
        shppipeService.update(shppipe);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Shppipe shppipe = shppipeService.findById(id);
        return ResultGenerator.genSuccessResult(shppipe);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Shppipe> list = shppipeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
