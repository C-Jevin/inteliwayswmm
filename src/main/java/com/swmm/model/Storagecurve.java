package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Storagecurve {
    /**
     * 曲线名称
     */
    @Id
    private String name;

    /**
     * 深度 单位：m
     */
    private BigDecimal depth;

    /**
     * 面积 单位：m2
     */
    private BigDecimal area;

    /**
     * 获取曲线名称
     *
     * @return name - 曲线名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置曲线名称
     *
     * @param name 曲线名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取深度 单位：m
     *
     * @return depth - 深度 单位：m
     */
    public BigDecimal getDepth() {
        return depth;
    }

    /**
     * 设置深度 单位：m
     *
     * @param depth 深度 单位：m
     */
    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    /**
     * 获取面积 单位：m2
     *
     * @return area - 面积 单位：m2
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * 设置面积 单位：m2
     *
     * @param area 面积 单位：m2
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }
}