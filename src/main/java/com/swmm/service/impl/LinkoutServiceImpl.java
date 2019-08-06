package com.swmm.service.impl;

import com.swmm.dao.LinkoutMapper;
import com.swmm.model.Linkout;
import com.swmm.service.LinkoutService;
import com.swmm.core.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
@Service
@Transactional
public class LinkoutServiceImpl extends AbstractService<Linkout> implements LinkoutService {
    @Resource
    LinkoutMapper linkoutMapper;

    @Override
    public List<Map> findMaxAndMin() {
        try{
            if(linkoutMapper.findMaxAndMin()==null)
                throw new Exception("此指标数据为空");
            return linkoutMapper.findMaxAndMin();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<Map> findDate() {
        if (linkoutMapper.findDate()!=null )
            return linkoutMapper.findDate();
        else return null;
    }
}
