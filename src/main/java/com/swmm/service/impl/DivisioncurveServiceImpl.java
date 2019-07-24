package com.swmm.service.impl;

import com.swmm.dao.DivisioncurveMapper;
import com.swmm.model.Divisioncurve;
import com.swmm.service.DivisioncurveService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class DivisioncurveServiceImpl extends AbstractService<Divisioncurve> implements DivisioncurveService {
    @Resource
    private DivisioncurveMapper divisioncurveMapper;

}
