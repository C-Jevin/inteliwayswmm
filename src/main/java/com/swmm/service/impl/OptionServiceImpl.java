package com.swmm.service.impl;

import com.swmm.dao.OptionMapper;
import com.swmm.model.Option;
import com.swmm.service.OptionService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class OptionServiceImpl extends AbstractService<Option> implements OptionService {
    @Resource
    private OptionMapper optionMapper;

}
