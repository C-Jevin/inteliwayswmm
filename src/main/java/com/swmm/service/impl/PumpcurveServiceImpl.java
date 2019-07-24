package com.swmm.service.impl;

import com.swmm.dao.PumpcurveMapper;
import com.swmm.model.Pumpcurve;
import com.swmm.service.PumpcurveService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class PumpcurveServiceImpl extends AbstractService<Pumpcurve> implements PumpcurveService {
    @Resource
    private PumpcurveMapper pumpcurveMapper;

}
