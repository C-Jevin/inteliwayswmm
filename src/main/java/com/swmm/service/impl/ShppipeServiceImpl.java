package com.swmm.service.impl;

import com.swmm.dao.ShppipeMapper;
import com.swmm.model.Shppipe;
import com.swmm.service.ShppipeService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShppipeServiceImpl extends AbstractService<Shppipe> implements ShppipeService {
    @Resource
    private ShppipeMapper shppipeMapper;

}
