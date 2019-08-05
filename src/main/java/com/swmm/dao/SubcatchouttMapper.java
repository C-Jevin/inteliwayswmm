package com.swmm.dao;

import com.swmm.core.Mapper;
import com.swmm.model.Subcatchoutt;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface SubcatchouttMapper extends Mapper<Subcatchoutt> {
    List<Map> findMaxAndMin();
    List<Map> findDate();
}