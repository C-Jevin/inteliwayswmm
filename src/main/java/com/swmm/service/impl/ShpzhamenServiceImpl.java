package com.swmm.service.impl;

import com.swmm.dao.ShpzhamenMapper;
import com.swmm.model.Shpzhamen;
import com.swmm.service.ShpzhamenService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShpzhamenServiceImpl extends AbstractService<Shpzhamen> implements ShpzhamenService {
    @Resource
    private ShpzhamenMapper shpzhamenMapper;

}
