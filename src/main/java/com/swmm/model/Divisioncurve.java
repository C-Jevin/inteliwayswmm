package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Divisioncurve {
    /**
     * 曲线名称
     */
    @Id
    private String name;

    /**
     * 入流流量 单位：m3/s
     */
    private BigDecimal inflow;

    /**
     * 出流流浪 单位：m3/s
     */
    private BigDecimal outflow;

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
     * 获取入流流量 单位：m3/s
     *
     * @return inflow - 入流流量 单位：m3/s
     */
    public BigDecimal getInflow() {
        return inflow;
    }

    /**
     * 设置入流流量 单位：m3/s
     *
     * @param inflow 入流流量 单位：m3/s
     */
    public void setInflow(BigDecimal inflow) {
        this.inflow = inflow;
    }

    /**
     * 获取出流流浪 单位：m3/s
     *
     * @return outflow - 出流流浪 单位：m3/s
     */
    public BigDecimal getOutflow() {
        return outflow;
    }

    /**
     * 设置出流流浪 单位：m3/s
     *
     * @param outflow 出流流浪 单位：m3/s
     */
    public void setOutflow(BigDecimal outflow) {
        this.outflow = outflow;
    }
}