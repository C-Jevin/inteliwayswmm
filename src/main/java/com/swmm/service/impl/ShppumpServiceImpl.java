package com.swmm.service.impl;

import com.swmm.dao.ShppumpMapper;
import com.swmm.model.Shppump;
import com.swmm.service.ShppumpService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShppumpServiceImpl extends AbstractService<Shppump> implements ShppumpService {
    @Resource
    private ShppumpMapper shppumpMapper;

}
