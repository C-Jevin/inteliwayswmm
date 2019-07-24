package com.swmm.service.impl;

import com.swmm.dao.ShpyanMapper;
import com.swmm.model.Shpyan;
import com.swmm.service.ShpyanService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShpyanServiceImpl extends AbstractService<Shpyan> implements ShpyanService {
    @Resource
    private ShpyanMapper shpyanMapper;

}
