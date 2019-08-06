package com.swmm.service.impl;

import com.swmm.dao.NodeoutMapper;
import com.swmm.model.Nodeout;
import com.swmm.service.NodeoutService;
import com.swmm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class NodeoutServiceImpl extends AbstractService<Nodeout> implements NodeoutService {
    @Resource
    private NodeoutMapper nodeoutMapper;

    @Override
    public List<Map> findMaxAndMin() {
        try {
            if(nodeoutMapper.findMaxAndMin()==null)
                throw new Exception("此指标数据为空!");
            return nodeoutMapper.findMaxAndMin();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<Map> findDate() {
        if (nodeoutMapper.findDate().get(0)!=null && nodeoutMapper.findDate().get(1)!=null)
            return nodeoutMapper.findDate();
        else return null;

    }
}
