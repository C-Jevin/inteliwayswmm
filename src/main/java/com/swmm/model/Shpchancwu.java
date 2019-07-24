package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shpchancwu {
    /**
     * 图斑面积 单位：m2
     */
    @Id
    private BigDecimal area;

    /**
     * 人口数
     */
    private BigDecimal popu;

    /**
     * 污水量 单位：m3/s
     */
    @Column(name = "sewFlow")
    private BigDecimal sewflow;

    /**
     * 获取图斑面积 单位：m2
     *
     * @return area - 图斑面积 单位：m2
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * 设置图斑面积 单位：m2
     *
     * @param area 图斑面积 单位：m2
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    /**
     * 获取人口数
     *
     * @return popu - 人口数
     */
    public BigDecimal getPopu() {
        return popu;
    }

    /**
     * 设置人口数
     *
     * @param popu 人口数
     */
    public void setPopu(BigDecimal popu) {
        this.popu = popu;
    }

    /**
     * 获取污水量 单位：m3/s
     *
     * @return sewFlow - 污水量 单位：m3/s
     */
    public BigDecimal getSewflow() {
        return sewflow;
    }

    /**
     * 设置污水量 单位：m3/s
     *
     * @param sewflow 污水量 单位：m3/s
     */
    public void setSewflow(BigDecimal sewflow) {
        this.sewflow = sewflow;
    }
}