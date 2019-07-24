package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Ratingcurve {
    /**
     * 曲线名称
     */
    @Id
    private String name;

    /**
     * 水头 单位：m
     */
    private BigDecimal head;

    /**
     * 出流流量 单位：m3/s
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
     * 获取水头 单位：m
     *
     * @return head - 水头 单位：m
     */
    public BigDecimal getHead() {
        return head;
    }

    /**
     * 设置水头 单位：m
     *
     * @param head 水头 单位：m
     */
    public void setHead(BigDecimal head) {
        this.head = head;
    }

    /**
     * 获取出流流量 单位：m3/s
     *
     * @return outflow - 出流流量 单位：m3/s
     */
    public BigDecimal getOutflow() {
        return outflow;
    }

    /**
     * 设置出流流量 单位：m3/s
     *
     * @param outflow 出流流量 单位：m3/s
     */
    public void setOutflow(BigDecimal outflow) {
        this.outflow = outflow;
    }
}