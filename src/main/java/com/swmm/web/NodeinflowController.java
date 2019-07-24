package com.swmm.web;

import com.swmm.core.Result;
import com.swmm.core.ResultGenerator;
import com.swmm.model.Nodeinflow;
import com.swmm.service.NodeinflowService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/20.
*/
@RestController
@RequestMapping("/nodeinflow")
public class NodeinflowController {
    @Resource
    private NodeinflowService nodeinflowService;

    @PostMapping
    public Result add(@RequestBody Nodeinflow nodeinflow) {
        nodeinflowService.save(nodeinflow);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        nodeinflowService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Nodeinflow nodeinflow) {
        nodeinflowService.update(nodeinflow);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Nodeinflow nodeinflow = nodeinflowService.findById(id);
        return ResultGenerator.genSuccessResult(nodeinflow);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Nodeinflow> list = nodeinflowService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
