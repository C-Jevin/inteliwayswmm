package com.swmm.service.impl;

import com.swmm.dao.ShpnodeMapper;
import com.swmm.model.Shpnode;
import com.swmm.service.ShpnodeService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShpnodeServiceImpl extends AbstractService<Shpnode> implements ShpnodeService {
    @Resource
    private ShpnodeMapper shpnodeMapper;

}
