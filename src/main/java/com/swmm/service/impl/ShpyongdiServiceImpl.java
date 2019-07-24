package com.swmm.service.impl;

import com.swmm.dao.ShpyongdiMapper;
import com.swmm.model.Shpyongdi;
import com.swmm.service.ShpyongdiService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShpyongdiServiceImpl extends AbstractService<Shpyongdi> implements ShpyongdiService {
    @Resource
    private ShpyongdiMapper shpyongdiMapper;

}
