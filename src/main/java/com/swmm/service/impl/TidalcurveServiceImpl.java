package com.swmm.service.impl;

import com.swmm.dao.TidalcurveMapper;
import com.swmm.model.Tidalcurve;
import com.swmm.service.TidalcurveService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class TidalcurveServiceImpl extends AbstractService<Tidalcurve> implements TidalcurveService {
    @Resource
    private TidalcurveMapper tidalcurveMapper;

}
