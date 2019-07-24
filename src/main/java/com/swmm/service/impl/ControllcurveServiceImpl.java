package com.swmm.service.impl;

import com.swmm.dao.ControllcurveMapper;
import com.swmm.model.Controllcurve;
import com.swmm.service.ControllcurveService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ControllcurveServiceImpl extends AbstractService<Controllcurve> implements ControllcurveService {
    @Resource
    private ControllcurveMapper controllcurveMapper;

}
