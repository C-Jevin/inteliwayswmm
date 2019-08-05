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
        /*List<Map> mapList = new ArrayList<>();
        try {
                List<Map> linkoutList = linkoutMapper.findMaxAndMin();
                if (linkoutList == null)
                    throw new Exception("表数据为空！");
                for (int i = 0 ; i<linkoutList.size(); i++) {
                    Map<String,Object> resMap = new HashMap<>();
                    resMap.put("name", linkoutList.get(i).get("pollu"));
                    resMap.put("max",linkoutList.get(i).get("CapaMax"));
                    resMap.put("min",linkoutList.get(i).get("CapaMin"));
                    mapList.add(resMap);
                }
                return mapList;
        }catch (Exception e){
            e.printStackTrace();
            Map map = new HashMap();
            map.put("errMsg",e.getMessage());
            mapList.add(map);
            return mapList;
        }*/
       return linkoutMapper.findMaxAndMin();
    }

    @Override
    public List<Map> findDate() {
        return linkoutMapper.findDate();
    }
}
