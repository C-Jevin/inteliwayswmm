package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Tidalcurve {
    /**
     * 曲线名称
     */
    @Id
    private String name;

    /**
     * 小时
     */
    private BigDecimal hour;

    /**
     * 水位 单位：m
     */
    private BigDecimal stage;

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
     * 获取小时
     *
     * @return hour - 小时
     */
    public BigDecimal getHour() {
        return hour;
    }

    /**
     * 设置小时
     *
     * @param hour 小时
     */
    public void setHour(BigDecimal hour) {
        this.hour = hour;
    }

    /**
     * 获取水位 单位：m
     *
     * @return stage - 水位 单位：m
     */
    public BigDecimal getStage() {
        return stage;
    }

    /**
     * 设置水位 单位：m
     *
     * @param stage 水位 单位：m
     */
    public void setStage(BigDecimal stage) {
        this.stage = stage;
    }
}