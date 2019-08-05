package com.swmm.service.impl;

import com.swmm.dao.SubcatchouttMapper;
import com.swmm.model.Subcatchoutt;
import com.swmm.service.SubcatchouttService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/30.
 */
@Service
@Transactional
public class SubcatchouttServiceImpl extends AbstractService<Subcatchoutt> implements SubcatchouttService {
    @Resource
    private SubcatchouttMapper subcatchoutMapper;

    @Override
    public List<Map> findMaxAndMin() {
        return subcatchoutMapper.findMaxAndMin();
    }

    @Override
    public List<Map> findDate() {
        return subcatchoutMapper.findDate();
    }
}
