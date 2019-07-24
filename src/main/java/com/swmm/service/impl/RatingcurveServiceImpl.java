package com.swmm.service.impl;

import com.swmm.dao.RatingcurveMapper;
import com.swmm.model.Ratingcurve;
import com.swmm.service.RatingcurveService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class RatingcurveServiceImpl extends AbstractService<Ratingcurve> implements RatingcurveService {
    @Resource
    private RatingcurveMapper ratingcurveMapper;

}
