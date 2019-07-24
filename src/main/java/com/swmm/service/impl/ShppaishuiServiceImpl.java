package com.swmm.service.impl;

import com.swmm.dao.ShppaishuiMapper;
import com.swmm.model.Shppaishui;
import com.swmm.service.ShppaishuiService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class ShppaishuiServiceImpl extends AbstractService<Shppaishui> implements ShppaishuiService {
    @Resource
    private ShppaishuiMapper shppaishuiMapper;

}
