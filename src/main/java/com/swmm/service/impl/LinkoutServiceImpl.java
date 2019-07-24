package com.swmm.service.impl;

import com.swmm.dao.LinkoutMapper;
import com.swmm.model.Linkout;
import com.swmm.service.LinkoutService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class LinkoutServiceImpl extends AbstractService<Linkout> implements LinkoutService {
    @Resource
    private LinkoutMapper linkoutMapper;

}
