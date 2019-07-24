package com.swmm.service.impl;

import com.swmm.dao.ShpchancwuMapper;
import com.swmm.model.Shpchancwu;
import com.swmm.service.ShpchancwuService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShpchancwuServiceImpl extends AbstractService<Shpchancwu> implements ShpchancwuService {
    @Resource
    private ShpchancwuMapper shpchancwuMapper;

}
