package com.swmm.service.impl;

import com.swmm.dao.ShpxiadianmianMapper;
import com.swmm.model.Shpxiadianmian;
import com.swmm.service.ShpxiadianmianService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShpxiadianmianServiceImpl extends AbstractService<Shpxiadianmian> implements ShpxiadianmianService {
    @Resource
    private ShpxiadianmianMapper shpxiadianmianMapper;

}
