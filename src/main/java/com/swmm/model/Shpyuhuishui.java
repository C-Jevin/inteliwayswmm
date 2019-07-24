package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shpyuhuishui {
    /**
     * 小区面积 单位：m2
     */
    @Id
    private BigDecimal area;

    /**
     * 小区名称
     */
    @Column(name = "catID")
    private String catid;

    /**
     * 雨量站
     */
    @Column(name = "rainGate")
    private String raingate;

    /**
     * 出流口
     */
    private String outlet;

    /**
     * 水力宽度 单位：mm
     */
    private BigDecimal width;

    /**
     * 不透水率 单位：%
     */
    private BigDecimal imperv;

    /**
     * 小区坡度
     */
    private BigDecimal slope;

    /**
     * 不透水地表糙率
     */
    @Column(name = "nImperv")
    private BigDecimal nimperv;

    /**
     * 透水地表糙率
     */
    @Column(name = "nPerv")
    private BigDecimal nperv;

    /**
     * 不透水地表洼蓄量 单位：mm
     */
    @Column(name = "desImoerv")
    private BigDecimal desimoerv;

    /**
     * 透水地表洼蓄量 单位：mm
     */
    @Column(name = "desPerv")
    private BigDecimal desperv;

    /**
     * 无洼蓄的不透水地表面积比例
     */
    @Column(name = "zeroImperv")
    private BigDecimal zeroimperv;

    /**
     * 内部水流流向
     */
    @Column(name = "subareaRout")
    private Integer subarearout;

    /**
     * 水量流向比例
     */
    @Column(name = "percentRout")
    private BigDecimal percentrout;

    /**
     * 下渗计算方法
     */
    private String inflitration;

    /**
     * 地下水计算开关
     */
    @Column(name = "groundwaterFlag")
    private Integer groundwaterflag;

    /**
     * 融雪计算参数组
     */
    @Column(name = "snowPack")
    private String snowpack;

    /**
     * 用地类型1面积比例
     */
    @Column(name = "landuse_1")
    private BigDecimal landuse1;

    /**
     * 用地类型2面积比例
     */
    @Column(name = "landuse_2")
    private BigDecimal landuse2;

    /**
     * 用地类型3面积比例
     */
    @Column(name = "landuse_3")
    private BigDecimal landuse3;

    /**
     * 用地类型4面积比例
     */
    @Column(name = "landuse_4")
    private BigDecimal landuse4;

    /**
     * 获取小区面积 单位：m2
     *
     * @return area - 小区面积 单位：m2
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * 设置小区面积 单位：m2
     *
     * @param area 小区面积 单位：m2
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    /**
     * 获取小区名称
     *
     * @return catID - 小区名称
     */
    public String getCatid() {
        return catid;
    }

    /**
     * 设置小区名称
     *
     * @param catid 小区名称
     */
    public void setCatid(String catid) {
        this.catid = catid;
    }

    /**
     * 获取雨量站
     *
     * @return rainGate - 雨量站
     */
    public String getRaingate() {
        return raingate;
    }

    /**
     * 设置雨量站
     *
     * @param raingate 雨量站
     */
    public void setRaingate(String raingate) {
        this.raingate = raingate;
    }

    /**
     * 获取出流口
     *
     * @return outlet - 出流口
     */
    public String getOutlet() {
        return outlet;
    }

    /**
     * 设置出流口
     *
     * @param outlet 出流口
     */
    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    /**
     * 获取水力宽度 单位：mm
     *
     * @return width - 水力宽度 单位：mm
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * 设置水力宽度 单位：mm
     *
     * @param width 水力宽度 单位：mm
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * 获取不透水率 单位：%
     *
     * @return imperv - 不透水率 单位：%
     */
    public BigDecimal getImperv() {
        return imperv;
    }

    /**
     * 设置不透水率 单位：%
     *
     * @param imperv 不透水率 单位：%
     */
    public void setImperv(BigDecimal imperv) {
        this.imperv = imperv;
    }

    /**
     * 获取小区坡度
     *
     * @return slope - 小区坡度
     */
    public BigDecimal getSlope() {
        return slope;
    }

    /**
     * 设置小区坡度
     *
     * @param slope 小区坡度
     */
    public void setSlope(BigDecimal slope) {
        this.slope = slope;
    }

    /**
     * 获取不透水地表糙率
     *
     * @return nImperv - 不透水地表糙率
     */
    public BigDecimal getNimperv() {
        return nimperv;
    }

    /**
     * 设置不透水地表糙率
     *
     * @param nimperv 不透水地表糙率
     */
    public void setNimperv(BigDecimal nimperv) {
        this.nimperv = nimperv;
    }

    /**
     * 获取透水地表糙率
     *
     * @return nPerv - 透水地表糙率
     */
    public BigDecimal getNperv() {
        return nperv;
    }

    /**
     * 设置透水地表糙率
     *
     * @param nperv 透水地表糙率
     */
    public void setNperv(BigDecimal nperv) {
        this.nperv = nperv;
    }

    /**
     * 获取不透水地表洼蓄量 单位：mm
     *
     * @return desImoerv - 不透水地表洼蓄量 单位：mm
     */
    public BigDecimal getDesimoerv() {
        return desimoerv;
    }

    /**
     * 设置不透水地表洼蓄量 单位：mm
     *
     * @param desimoerv 不透水地表洼蓄量 单位：mm
     */
    public void setDesimoerv(BigDecimal desimoerv) {
        this.desimoerv = desimoerv;
    }

    /**
     * 获取透水地表洼蓄量 单位：mm
     *
     * @return desPerv - 透水地表洼蓄量 单位：mm
     */
    public BigDecimal getDesperv() {
        return desperv;
    }

    /**
     * 设置透水地表洼蓄量 单位：mm
     *
     * @param desperv 透水地表洼蓄量 单位：mm
     */
    public void setDesperv(BigDecimal desperv) {
        this.desperv = desperv;
    }

    /**
     * 获取无洼蓄的不透水地表面积比例
     *
     * @return zeroImperv - 无洼蓄的不透水地表面积比例
     */
    public BigDecimal getZeroimperv() {
        return zeroimperv;
    }

    /**
     * 设置无洼蓄的不透水地表面积比例
     *
     * @param zeroimperv 无洼蓄的不透水地表面积比例
     */
    public void setZeroimperv(BigDecimal zeroimperv) {
        this.zeroimperv = zeroimperv;
    }

    /**
     * 获取内部水流流向
     *
     * @return subareaRout - 内部水流流向
     */
    public Integer getSubarearout() {
        return subarearout;
    }

    /**
     * 设置内部水流流向
     *
     * @param subarearout 内部水流流向
     */
    public void setSubarearout(Integer subarearout) {
        this.subarearout = subarearout;
    }

    /**
     * 获取水量流向比例
     *
     * @return percentRout - 水量流向比例
     */
    public BigDecimal getPercentrout() {
        return percentrout;
    }

    /**
     * 设置水量流向比例
     *
     * @param percentrout 水量流向比例
     */
    public void setPercentrout(BigDecimal percentrout) {
        this.percentrout = percentrout;
    }

    /**
     * 获取下渗计算方法
     *
     * @return inflitration - 下渗计算方法
     */
    public String getInflitration() {
        return inflitration;
    }

    /**
     * 设置下渗计算方法
     *
     * @param inflitration 下渗计算方法
     */
    public void setInflitration(String inflitration) {
        this.inflitration = inflitration;
    }

    /**
     * 获取地下水计算开关
     *
     * @return groundwaterFlag - 地下水计算开关
     */
    public Integer getGroundwaterflag() {
        return groundwaterflag;
    }

    /**
     * 设置地下水计算开关
     *
     * @param groundwaterflag 地下水计算开关
     */
    public void setGroundwaterflag(Integer groundwaterflag) {
        this.groundwaterflag = groundwaterflag;
    }

    /**
     * 获取融雪计算参数组
     *
     * @return snowPack - 融雪计算参数组
     */
    public String getSnowpack() {
        return snowpack;
    }

    /**
     * 设置融雪计算参数组
     *
     * @param snowpack 融雪计算参数组
     */
    public void setSnowpack(String snowpack) {
        this.snowpack = snowpack;
    }

    /**
     * 获取用地类型1面积比例
     *
     * @return landuse_1 - 用地类型1面积比例
     */
    public BigDecimal getLanduse1() {
        return landuse1;
    }

    /**
     * 设置用地类型1面积比例
     *
     * @param landuse1 用地类型1面积比例
     */
    public void setLanduse1(BigDecimal landuse1) {
        this.landuse1 = landuse1;
    }

    /**
     * 获取用地类型2面积比例
     *
     * @return landuse_2 - 用地类型2面积比例
     */
    public BigDecimal getLanduse2() {
        return landuse2;
    }

    /**
     * 设置用地类型2面积比例
     *
     * @param landuse2 用地类型2面积比例
     */
    public void setLanduse2(BigDecimal landuse2) {
        this.landuse2 = landuse2;
    }

    /**
     * 获取用地类型3面积比例
     *
     * @return landuse_3 - 用地类型3面积比例
     */
    public BigDecimal getLanduse3() {
        return landuse3;
    }

    /**
     * 设置用地类型3面积比例
     *
     * @param landuse3 用地类型3面积比例
     */
    public void setLanduse3(BigDecimal landuse3) {
        this.landuse3 = landuse3;
    }

    /**
     * 获取用地类型4面积比例
     *
     * @return landuse_4 - 用地类型4面积比例
     */
    public BigDecimal getLanduse4() {
        return landuse4;
    }

    /**
     * 设置用地类型4面积比例
     *
     * @param landuse4 用地类型4面积比例
     */
    public void setLanduse4(BigDecimal landuse4) {
        this.landuse4 = landuse4;
    }
}