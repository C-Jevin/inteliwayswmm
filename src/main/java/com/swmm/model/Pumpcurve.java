package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Pumpcurve {
    /**
     * 曲线名称
     */
    @Id
    private String name;

    /**
     * 曲线类型
     */
    @Column(name = "curveType")
    private Integer curvetype;

    /**
     * 值1
     */
    private BigDecimal value1;

    /**
     * 值2
     */
    private BigDecimal value2;

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
     * 获取曲线类型
     *
     * @return curveType - 曲线类型
     */
    public Integer getCurvetype() {
        return curvetype;
    }

    /**
     * 设置曲线类型
     *
     * @param curvetype 曲线类型
     */
    public void setCurvetype(Integer curvetype) {
        this.curvetype = curvetype;
    }

    /**
     * 获取值1
     *
     * @return value1 - 值1
     */
    public BigDecimal getValue1() {
        return value1;
    }

    /**
     * 设置值1
     *
     * @param value1 值1
     */
    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    /**
     * 获取值2
     *
     * @return value2 - 值2
     */
    public BigDecimal getValue2() {
        return value2;
    }

    /**
     * 设置值2
     *
     * @param value2 值2
     */
    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }
}