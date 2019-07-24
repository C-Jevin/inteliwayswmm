package com.swmm.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Nodeinflow {
    /**
     * 时间序列名称
     */
    @Id
    private String name;

    /**
     * 是否使用外部文件开关
     */
    @Column(name = "extFlieFlag")
    private Integer extflieflag;

    /**
     * 日期
     */
    private Date date;

    /**
     * 时间
     */
    private Date time;

    /**
     * 值
     */
    private BigDecimal value;

    /**
     * 获取时间序列名称
     *
     * @return name - 时间序列名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置时间序列名称
     *
     * @param name 时间序列名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否使用外部文件开关
     *
     * @return extFlieFlag - 是否使用外部文件开关
     */
    public Integer getExtflieflag() {
        return extflieflag;
    }

    /**
     * 设置是否使用外部文件开关
     *
     * @param extflieflag 是否使用外部文件开关
     */
    public void setExtflieflag(Integer extflieflag) {
        this.extflieflag = extflieflag;
    }

    /**
     * 获取日期
     *
     * @return date - 日期
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置日期
     *
     * @param date 日期
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取时间
     *
     * @return time - 时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置时间
     *
     * @param time 时间
     */
    public void setTime(Date time) {
        this.time = time;
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
}