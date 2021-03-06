package com.swmm.dao;

import com.swmm.core.Mapper;
import com.swmm.model.Linkout;

import java.util.List;
import java.util.Map;

public interface LinkoutMapper extends Mapper<Linkout> {
    List<Map> findMaxAndMin();
    List<Map> findDate();
}