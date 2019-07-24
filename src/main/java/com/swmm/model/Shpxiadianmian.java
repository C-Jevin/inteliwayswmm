package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shpxiadianmian {
    /**
     * 绿地面积 单位：m2
     */
    @Id
    private BigDecimal green;

    /**
     * 道路面积 单位：m2
     */
    private BigDecimal road;

    /**
     * 水体面积 单位：m2
     */
    private BigDecimal water;

    /**
     * 建筑工地面积 单位：m2
     */
    @Column(name = "buildSite")
    private BigDecimal buildsite;

    /**
     * 屋顶面积 单位：m2
     */
    private BigDecimal roof;

    /**
     * 庭院面积 单位：m2
     */
    private BigDecimal yard;

    /**
     * 农田面积 单位：m2
     */
    private BigDecimal farm;

    /**
     * 体育场面积 单位：m2
     */
    private BigDecimal stadium;

    /**
     * 林地面积 单位：m2
     */
    private BigDecimal forest;

    /**
     * 获取绿地面积 单位：m2
     *
     * @return green - 绿地面积 单位：m2
     */
    public BigDecimal getGreen() {
        return green;
    }

    /**
     * 设置绿地面积 单位：m2
     *
     * @param green 绿地面积 单位：m2
     */
    public void setGreen(BigDecimal green) {
        this.green = green;
    }

    /**
     * 获取道路面积 单位：m2
     *
     * @return road - 道路面积 单位：m2
     */
    public BigDecimal getRoad() {
        return road;
    }

    /**
     * 设置道路面积 单位：m2
     *
     * @param road 道路面积 单位：m2
     */
    public void setRoad(BigDecimal road) {
        this.road = road;
    }

    /**
     * 获取水体面积 单位：m2
     *
     * @return water - 水体面积 单位：m2
     */
    public BigDecimal getWater() {
        return water;
    }

    /**
     * 设置水体面积 单位：m2
     *
     * @param water 水体面积 单位：m2
     */
    public void setWater(BigDecimal water) {
        this.water = water;
    }

    /**
     * 获取建筑工地面积 单位：m2
     *
     * @return buildSite - 建筑工地面积 单位：m2
     */
    public BigDecimal getBuildsite() {
        return buildsite;
    }

    /**
     * 设置建筑工地面积 单位：m2
     *
     * @param buildsite 建筑工地面积 单位：m2
     */
    public void setBuildsite(BigDecimal buildsite) {
        this.buildsite = buildsite;
    }

    /**
     * 获取屋顶面积 单位：m2
     *
     * @return roof - 屋顶面积 单位：m2
     */
    public BigDecimal getRoof() {
        return roof;
    }

    /**
     * 设置屋顶面积 单位：m2
     *
     * @param roof 屋顶面积 单位：m2
     */
    public void setRoof(BigDecimal roof) {
        this.roof = roof;
    }

    /**
     * 获取庭院面积 单位：m2
     *
     * @return yard - 庭院面积 单位：m2
     */
    public BigDecimal getYard() {
        return yard;
    }

    /**
     * 设置庭院面积 单位：m2
     *
     * @param yard 庭院面积 单位：m2
     */
    public void setYard(BigDecimal yard) {
        this.yard = yard;
    }

    /**
     * 获取农田面积 单位：m2
     *
     * @return farm - 农田面积 单位：m2
     */
    public BigDecimal getFarm() {
        return farm;
    }

    /**
     * 设置农田面积 单位：m2
     *
     * @param farm 农田面积 单位：m2
     */
    public void setFarm(BigDecimal farm) {
        this.farm = farm;
    }

    /**
     * 获取体育场面积 单位：m2
     *
     * @return stadium - 体育场面积 单位：m2
     */
    public BigDecimal getStadium() {
        return stadium;
    }

    /**
     * 设置体育场面积 单位：m2
     *
     * @param stadium 体育场面积 单位：m2
     */
    public void setStadium(BigDecimal stadium) {
        this.stadium = stadium;
    }

    /**
     * 获取林地面积 单位：m2
     *
     * @return forest - 林地面积 单位：m2
     */
    public BigDecimal getForest() {
        return forest;
    }

    /**
     * 设置林地面积 单位：m2
     *
     * @param forest 林地面积 单位：m2
     */
    public void setForest(BigDecimal forest) {
        this.forest = forest;
    }
}