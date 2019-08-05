package com.swmm.service;
import com.swmm.model.Nodeout;
import com.swmm.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/20.
 */
public interface NodeoutService extends Service<Nodeout> {
    List<Map> findMaxAndMin();
    List<Map> findDate();
}
