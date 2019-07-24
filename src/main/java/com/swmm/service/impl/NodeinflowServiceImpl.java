package com.swmm.service.impl;

import com.swmm.dao.NodeinflowMapper;
import com.swmm.model.Nodeinflow;
import com.swmm.service.NodeinflowService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class NodeinflowServiceImpl extends AbstractService<Nodeinflow> implements NodeinflowService {
    @Resource
    private NodeinflowMapper nodeinflowMapper;

}
