package com.swmm.service.impl;

import com.swmm.dao.ShpyuhuishuiMapper;
import com.swmm.model.Shpyuhuishui;
import com.swmm.service.ShpyuhuishuiService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShpyuhuishuiServiceImpl extends AbstractService<Shpyuhuishui> implements ShpyuhuishuiService {
    @Resource
    private ShpyuhuishuiMapper shpyuhuishuiMapper;

}
