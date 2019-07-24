package com.swmm.service.impl;

import com.swmm.dao.StoragecurveMapper;
import com.swmm.model.Storagecurve;
import com.swmm.service.StoragecurveService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class StoragecurveServiceImpl extends AbstractService<Storagecurve> implements StoragecurveService {
    @Resource
    private StoragecurveMapper storagecurveMapper;

}
