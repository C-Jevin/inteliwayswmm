package com.swmm.service.impl;

import com.swmm.dao.SubcatchouttMapper;
import com.swmm.model.Subcatchoutt;
import com.swmm.service.SubcatchouttService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/30.
 */
@Service
@Transactional
public class SubcatchouttServiceImpl extends AbstractService<Subcatchoutt> implements SubcatchouttService {
    @Resource
    private SubcatchouttMapper subcatchoutMapper;

}
