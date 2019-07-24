package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shpzhamen {
    /**
     * 闸门ID
     */
    @Id
    @Column(name = "gateID")
    private String gateid;

    /**
     * 管线类型
     */
    @Column(name = "linkType")
    private String linktype;

    /**
     * 闸门上游节点ID
     */
    @Column(name = "usNodeID")
    private String usnodeid;

    /**
     * 闸门下游节点ID
     */
    @Column(name = "dsNodeID")
    private String dsnodeid;

    /**
     * 底部高程 单位：m
     */
    @Column(name = "bottomEle")
    private BigDecimal bottomele;

    /**
     * 高度 单位：mm
     */
    private BigDecimal height;

    /**
     * 宽度 单位：mm
     */
    private BigDecimal width;

    /**
     * 获取闸门ID
     *
     * @return gateID - 闸门ID
     */
    public String getGateid() {
        return gateid;
    }

    /**
     * 设置闸门ID
     *
     * @param gateid 闸门ID
     */
    public void setGateid(String gateid) {
        this.gateid = gateid;
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
     * 获取闸门上游节点ID
     *
     * @return usNodeID - 闸门上游节点ID
     */
    public String getUsnodeid() {
        return usnodeid;
    }

    /**
     * 设置闸门上游节点ID
     *
     * @param usnodeid 闸门上游节点ID
     */
    public void setUsnodeid(String usnodeid) {
        this.usnodeid = usnodeid;
    }

    /**
     * 获取闸门下游节点ID
     *
     * @return dsNodeID - 闸门下游节点ID
     */
    public String getDsnodeid() {
        return dsnodeid;
    }

    /**
     * 设置闸门下游节点ID
     *
     * @param dsnodeid 闸门下游节点ID
     */
    public void setDsnodeid(String dsnodeid) {
        this.dsnodeid = dsnodeid;
    }

    /**
     * 获取底部高程 单位：m
     *
     * @return bottomEle - 底部高程 单位：m
     */
    public BigDecimal getBottomele() {
        return bottomele;
    }

    /**
     * 设置底部高程 单位：m
     *
     * @param bottomele 底部高程 单位：m
     */
    public void setBottomele(BigDecimal bottomele) {
        this.bottomele = bottomele;
    }

    /**
     * 获取高度 单位：mm
     *
     * @return height - 高度 单位：mm
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * 设置高度 单位：mm
     *
     * @param height 高度 单位：mm
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * 获取宽度 单位：mm
     *
     * @return width - 宽度 单位：mm
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * 设置宽度 单位：mm
     *
     * @param width 宽度 单位：mm
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }
}