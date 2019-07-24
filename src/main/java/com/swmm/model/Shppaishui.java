package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shppaishui {
    /**
     * 片区面积 单位：m2
     */
    @Id
    private BigDecimal area;

    /**
     * 片区排水体制
     */
    @Column(name = "systemType")
    private String systemtype;

    /**
     * 片区名称
     */
    @Column(name = "nameCN")
    private String namecn;

    /**
     * 污水系统
     */
    @Column(name = "foulSys")
    private String foulsys;

    /**
     * 河流系统
     */
    @Column(name = "riverSys")
    private String riversys;

    /**
     * 获取片区面积 单位：m2
     *
     * @return area - 片区面积 单位：m2
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * 设置片区面积 单位：m2
     *
     * @param area 片区面积 单位：m2
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    /**
     * 获取片区排水体制
     *
     * @return systemType - 片区排水体制
     */
    public String getSystemtype() {
        return systemtype;
    }

    /**
     * 设置片区排水体制
     *
     * @param systemtype 片区排水体制
     */
    public void setSystemtype(String systemtype) {
        this.systemtype = systemtype;
    }

    /**
     * 获取片区名称
     *
     * @return nameCN - 片区名称
     */
    public String getNamecn() {
        return namecn;
    }

    /**
     * 设置片区名称
     *
     * @param namecn 片区名称
     */
    public void setNamecn(String namecn) {
        this.namecn = namecn;
    }

    /**
     * 获取污水系统
     *
     * @return foulSys - 污水系统
     */
    public String getFoulsys() {
        return foulsys;
    }

    /**
     * 设置污水系统
     *
     * @param foulsys 污水系统
     */
    public void setFoulsys(String foulsys) {
        this.foulsys = foulsys;
    }

    /**
     * 获取河流系统
     *
     * @return riverSys - 河流系统
     */
    public String getRiversys() {
        return riversys;
    }

    /**
     * 设置河流系统
     *
     * @param riversys 河流系统
     */
    public void setRiversys(String riversys) {
        this.riversys = riversys;
    }
}