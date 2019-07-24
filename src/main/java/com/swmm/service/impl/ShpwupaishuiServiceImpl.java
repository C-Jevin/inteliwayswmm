package com.swmm.service.impl;

import com.swmm.dao.ShpwupaishuiMapper;
import com.swmm.model.Shpwupaishui;
import com.swmm.service.ShpwupaishuiService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShpwupaishuiServiceImpl extends AbstractService<Shpwupaishui> implements ShpwupaishuiService {
    @Resource
    private ShpwupaishuiMapper shpwupaishuiMapper;

}
