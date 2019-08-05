package com.swmm.service;
import com.swmm.model.Subcatchoutt;
import com.swmm.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/30.
 */
public interface SubcatchouttService extends Service<Subcatchoutt> {
    List<Map> findMaxAndMin();
    List<Map> findDate();
}
