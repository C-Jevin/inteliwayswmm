package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shppipe {
    /**
     * 管线类型（排水体制）
     */
    @Id
    @Column(name = "systemType")
    private String systemtype;

    /**
     * 管道ID
     */
    @Column(name = "linkID")
    private String linkid;

    /**
     * 管道长度 单位：m
     */
    private BigDecimal length;

    /**
     * 管段形状
     */
    @Column(name = "geoType")
    private String geotype;

    /**
     *  单位：m
     */
    @Column(name = "geo_1")
    private BigDecimal geo1;

    /**
     *  单位：m
     */
    @Column(name = "geo_2")
    private BigDecimal geo2;

    /**
     *  单位：m
     */
    @Column(name = "geo_3")
    private BigDecimal geo3;

    /**
     *  单位：m
     */
    @Column(name = "geo_4")
    private BigDecimal geo4;

    /**
     * 最大高度 单位：m
     */
    @Column(name = "maxDepth")
    private BigDecimal maxdepth;

    /**
     * 进水节点ID
     */
    @Column(name = "usNodeID")
    private String usnodeid;

    /**
     * 出水节点ID
     */
    @Column(name = "dsNodeID")
    private String dsnodeid;

    /**
     * 管线糙率
     */
    @Column(name = "roughLink")
    private BigDecimal roughlink;

    /**
     * 进水节点底部高程 单位：m
     */
    @Column(name = "usNodeEle")
    private BigDecimal usnodeele;

    /**
     * 出水节点底部高程 单位：m
     */
    @Column(name = "dsNodeEle")
    private BigDecimal dsnodeele;

    /**
     * 管段上游高程 单位：m
     */
    @Column(name = "inEle")
    private BigDecimal inele;

    /**
     * 管段下游高程 单位：m
     */
    @Column(name = "outEle")
    private BigDecimal outele;

    /**
     * 管线类型
     */
    @Column(name = "linkType")
    private String linktype;

    /**
     * 管线进口能量损失系数
     */
    @Column(name = "entryLossCoe")
    private BigDecimal entrylosscoe;

    /**
     * 管线出口能量损失系数
     */
    @Column(name = "exitLossCoe")
    private BigDecimal exitlosscoe;

    /**
     * 管线平均能量损失系数
     */
    @Column(name = "avgLossCoe")
    private BigDecimal avglosscoe;

    /**
     * 管线水量损失速率 单位：mm/hr
     */
    @Column(name = "seepLossRate")
    private BigDecimal seeplossrate;

    /**
     * 是否有闸门控制管线污水回流的开关
     */
    @Column(name = "flapGate")
    private String flapgate;

    @Column(name = "userText1")
    private String usertext1;

    @Column(name = "userText2")
    private String usertext2;

    @Column(name = "userText3")
    private String usertext3;

    @Column(name = "userNum1")
    private BigDecimal usernum1;

    @Column(name = "userNum2")
    private BigDecimal usernum2;

    @Column(name = "userNum3")
    private BigDecimal usernum3;

    /**
     * 获取管线类型（排水体制）
     *
     * @return systemType - 管线类型（排水体制）
     */
    public String getSystemtype() {
        return systemtype;
    }

    /**
     * 设置管线类型（排水体制）
     *
     * @param systemtype 管线类型（排水体制）
     */
    public void setSystemtype(String systemtype) {
        this.systemtype = systemtype;
    }

    /**
     * 获取管道ID
     *
     * @return linkID - 管道ID
     */
    public String getLinkid() {
        return linkid;
    }

    /**
     * 设置管道ID
     *
     * @param linkid 管道ID
     */
    public void setLinkid(String linkid) {
        this.linkid = linkid;
    }

    /**
     * 获取管道长度 单位：m
     *
     * @return length - 管道长度 单位：m
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * 设置管道长度 单位：m
     *
     * @param length 管道长度 单位：m
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * 获取管段形状
     *
     * @return geoType - 管段形状
     */
    public String getGeotype() {
        return geotype;
    }

    /**
     * 设置管段形状
     *
     * @param geotype 管段形状
     */
    public void setGeotype(String geotype) {
        this.geotype = geotype;
    }

    /**
     * 获取 单位：m
     *
     * @return geo_1 -  单位：m
     */
    public BigDecimal getGeo1() {
        return geo1;
    }

    /**
     * 设置 单位：m
     *
     * @param geo1  单位：m
     */
    public void setGeo1(BigDecimal geo1) {
        this.geo1 = geo1;
    }

    /**
     * 获取 单位：m
     *
     * @return geo_2 -  单位：m
     */
    public BigDecimal getGeo2() {
        return geo2;
    }

    /**
     * 设置 单位：m
     *
     * @param geo2  单位：m
     */
    public void setGeo2(BigDecimal geo2) {
        this.geo2 = geo2;
    }

    /**
     * 获取 单位：m
     *
     * @return geo_3 -  单位：m
     */
    public BigDecimal getGeo3() {
        return geo3;
    }

    /**
     * 设置 单位：m
     *
     * @param geo3  单位：m
     */
    public void setGeo3(BigDecimal geo3) {
        this.geo3 = geo3;
    }

    /**
     * 获取 单位：m
     *
     * @return geo_4 -  单位：m
     */
    public BigDecimal getGeo4() {
        return geo4;
    }

    /**
     * 设置 单位：m
     *
     * @param geo4  单位：m
     */
    public void setGeo4(BigDecimal geo4) {
        this.geo4 = geo4;
    }

    /**
     * 获取最大高度 单位：m
     *
     * @return maxDepth - 最大高度 单位：m
     */
    public BigDecimal getMaxdepth() {
        return maxdepth;
    }

    /**
     * 设置最大高度 单位：m
     *
     * @param maxdepth 最大高度 单位：m
     */
    public void setMaxdepth(BigDecimal maxdepth) {
        this.maxdepth = maxdepth;
    }

    /**
     * 获取进水节点ID
     *
     * @return usNodeID - 进水节点ID
     */
    public String getUsnodeid() {
        return usnodeid;
    }

    /**
     * 设置进水节点ID
     *
     * @param usnodeid 进水节点ID
     */
    public void setUsnodeid(String usnodeid) {
        this.usnodeid = usnodeid;
    }

    /**
     * 获取出水节点ID
     *
     * @return dsNodeID - 出水节点ID
     */
    public String getDsnodeid() {
        return dsnodeid;
    }

    /**
     * 设置出水节点ID
     *
     * @param dsnodeid 出水节点ID
     */
    public void setDsnodeid(String dsnodeid) {
        this.dsnodeid = dsnodeid;
    }

    /**
     * 获取管线糙率
     *
     * @return roughLink - 管线糙率
     */
    public BigDecimal getRoughlink() {
        return roughlink;
    }

    /**
     * 设置管线糙率
     *
     * @param roughlink 管线糙率
     */
    public void setRoughlink(BigDecimal roughlink) {
        this.roughlink = roughlink;
    }

    /**
     * 获取进水节点底部高程 单位：m
     *
     * @return usNodeEle - 进水节点底部高程 单位：m
     */
    public BigDecimal getUsnodeele() {
        return usnodeele;
    }

    /**
     * 设置进水节点底部高程 单位：m
     *
     * @param usnodeele 进水节点底部高程 单位：m
     */
    public void setUsnodeele(BigDecimal usnodeele) {
        this.usnodeele = usnodeele;
    }

    /**
     * 获取出水节点底部高程 单位：m
     *
     * @return dsNodeEle - 出水节点底部高程 单位：m
     */
    public BigDecimal getDsnodeele() {
        return dsnodeele;
    }

    /**
     * 设置出水节点底部高程 单位：m
     *
     * @param dsnodeele 出水节点底部高程 单位：m
     */
    public void setDsnodeele(BigDecimal dsnodeele) {
        this.dsnodeele = dsnodeele;
    }

    /**
     * 获取管段上游高程 单位：m
     *
     * @return inEle - 管段上游高程 单位：m
     */
    public BigDecimal getInele() {
        return inele;
    }

    /**
     * 设置管段上游高程 单位：m
     *
     * @param inele 管段上游高程 单位：m
     */
    public void setInele(BigDecimal inele) {
        this.inele = inele;
    }

    /**
     * 获取管段下游高程 单位：m
     *
     * @return outEle - 管段下游高程 单位：m
     */
    public BigDecimal getOutele() {
        return outele;
    }

    /**
     * 设置管段下游高程 单位：m
     *
     * @param outele 管段下游高程 单位：m
     */
    public void setOutele(BigDecimal outele) {
        this.outele = outele;
    }

    /**
     * 获取管线类型
     *
     * @return linkType - 管线类型
     */
    public String getLinktype() {
        return linktype;
    }

    /**
     * 设置管线类型
     *
     * @param linktype 管线类型
     */
    public void setLinktype(String linktype) {
        this.linktype = linktype;
    }

    /**
     * 获取管线进口能量损失系数
     *
     * @return entryLossCoe - 管线进口能量损失系数
     */
    public BigDecimal getEntrylosscoe() {
        return entrylosscoe;
    }

    /**
     * 设置管线进口能量损失系数
     *
     * @param entrylosscoe 管线进口能量损失系数
     */
    public void setEntrylosscoe(BigDecimal entrylosscoe) {
        this.entrylosscoe = entrylosscoe;
    }

    /**
     * 获取管线出口能量损失系数
     *
     * @return exitLossCoe - 管线出口能量损失系数
     */
    public BigDecimal getExitlosscoe() {
        return exitlosscoe;
    }

    /**
     * 设置管线出口能量损失系数
     *
     * @param exitlosscoe 管线出口能量损失系数
     */
    public void setExitlosscoe(BigDecimal exitlosscoe) {
        this.exitlosscoe = exitlosscoe;
    }

    /**
     * 获取管线平均能量损失系数
     *
     * @return avgLossCoe - 管线平均能量损失系数
     */
    public BigDecimal getAvglosscoe() {
        return avglosscoe;
    }

    /**
     * 设置管线平均能量损失系数
     *
     * @param avglosscoe 管线平均能量损失系数
     */
    public void setAvglosscoe(BigDecimal avglosscoe) {
        this.avglosscoe = avglosscoe;
    }

    /**
     * 获取管线水量损失速率 单位：mm/hr
     *
     * @return seepLossRate - 管线水量损失速率 单位：mm/hr
     */
    public BigDecimal getSeeplossrate() {
        return seeplossrate;
    }

    /**
     * 设置管线水量损失速率 单位：mm/hr
     *
     * @param seeplossrate 管线水量损失速率 单位：mm/hr
     */
    public void setSeeplossrate(BigDecimal seeplossrate) {
        this.seeplossrate = seeplossrate;
    }

    /**
     * 获取是否有闸门控制管线污水回流的开关
     *
     * @return flapGate - 是否有闸门控制管线污水回流的开关
     */
    public String getFlapgate() {
        return flapgate;
    }

    /**
     * 设置是否有闸门控制管线污水回流的开关
     *
     * @param flapgate 是否有闸门控制管线污水回流的开关
     */
    public void setFlapgate(String flapgate) {
        this.flapgate = flapgate;
    }

    /**
     * @return userText1
     */
    public String getUsertext1() {
        return usertext1;
    }

    /**
     * @param usertext1
     */
    public void setUsertext1(String usertext1) {
        this.usertext1 = usertext1;
    }

    /**
     * @return userText2
     */
    public String getUsertext2() {
        return usertext2;
    }

    /**
     * @param usertext2
     */
    public void setUsertext2(String usertext2) {
        this.usertext2 = usertext2;
    }

    /**
     * @return userText3
     */
    public String getUsertext3() {
        return usertext3;
    }

    /**
     * @param usertext3
     */
    public void setUsertext3(String usertext3) {
        this.usertext3 = usertext3;
    }

    /**
     * @return userNum1
     */
    public BigDecimal getUsernum1() {
        return usernum1;
    }

    /**
     * @param usernum1
     */
    public void setUsernum1(BigDecimal usernum1) {
        this.usernum1 = usernum1;
    }

    /**
     * @return userNum2
     */
    public BigDecimal getUsernum2() {
        return usernum2;
    }

    /**
     * @param usernum2
     */
    public void setUsernum2(BigDecimal usernum2) {
        this.usernum2 = usernum2;
    }

    /**
     * @return userNum3
     */
    public BigDecimal getUsernum3() {
        return usernum3;
    }

    /**
     * @param usernum3
     */
    public void setUsernum3(BigDecimal usernum3) {
        this.usernum3 = usernum3;
    }
}