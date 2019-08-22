package com.swmm.dao;

import com.swmm.core.Mapper;
import com.swmm.model.Nodeout;

import java.util.List;
import java.util.Map;

public interface NodeoutMapper extends Mapper<Nodeout> {
    List<Map> findMaxAndMin();
    List<Map> findDate();
}