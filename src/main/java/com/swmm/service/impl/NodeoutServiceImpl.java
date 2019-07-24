package com.swmm.service.impl;

import com.swmm.dao.NodeoutMapper;
import com.swmm.model.Nodeout;
import com.swmm.service.NodeoutService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class NodeoutServiceImpl extends AbstractService<Nodeout> implements NodeoutService {
    @Resource
    private NodeoutMapper nodeoutMapper;

}