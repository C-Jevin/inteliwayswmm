package com.swmm.service.impl;

import com.swmm.dao.SubcatchoutMapper;
import com.swmm.model.Subcatchout;
import com.swmm.service.SubcatchoutService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class SubcatchoutServiceImpl extends AbstractService<Subcatchout> implements SubcatchoutService {
    @Resource
    private SubcatchoutMapper subcatchoutMapper;

}
