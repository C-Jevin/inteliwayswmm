package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Controllcurve {
    /**
     * 曲线名称
     */
    @Id
    private String name;

    /**
     * 值
     */
    private BigDecimal value;

    /**
     * 控制值
     */
    @Column(name = "conSetting")
    private Integer consetting;

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
     * 获取值
     *
     * @return value - 值
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 设置值
     *
     * @param value 值
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * 获取控制值
     *
     * @return conSetting - 控制值
     */
    public Integer getConsetting() {
        return consetting;
    }

    /**
     * 设置控制值
     *
     * @param consetting 控制值
     */
    public void setConsetting(Integer consetting) {
        this.consetting = consetting;
    }
}