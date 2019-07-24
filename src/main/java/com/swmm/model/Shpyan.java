package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shpyan {
    /**
     * 堰ID
     */
    @Id
    @Column(name = "weirID")
    private String weirid;

    /**
     * 堰上游节点ID
     */
    @Column(name = "usNodeID")
    private String usnodeid;

    /**
     * 堰下游节点ID
     */
    @Column(name = "dsNodeID")
    private String dsnodeid;

    /**
     * 管线类型
     */
    @Column(name = "linkType")
    private String linktype;

    /**
     * 堰高度 单位：mm
     */
    private BigDecimal height;

    /**
     * 堰顶高程 单位：m
     */
    @Column(name = "crestEle")
    private BigDecimal crestele;

    /**
     * 获取堰ID
     *
     * @return weirID - 堰ID
     */
    public String getWeirid() {
        return weirid;
    }

    /**
     * 设置堰ID
     *
     * @param weirid 堰ID
     */
    public void setWeirid(String weirid) {
        this.weirid = weirid;
    }

    /**
     * 获取堰上游节点ID
     *
     * @return usNodeID - 堰上游节点ID
     */
    public String getUsnodeid() {
        return usnodeid;
    }

    /**
     * 设置堰上游节点ID
     *
     * @param usnodeid 堰上游节点ID
     */
    public void setUsnodeid(String usnodeid) {
        this.usnodeid = usnodeid;
    }

    /**
     * 获取堰下游节点ID
     *
     * @return dsNodeID - 堰下游节点ID
     */
    public String getDsnodeid() {
        return dsnodeid;
    }

    /**
     * 设置堰下游节点ID
     *
     * @param dsnodeid 堰下游节点ID
     */
    public void setDsnodeid(String dsnodeid) {
        this.dsnodeid = dsnodeid;
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
     * 获取堰高度 单位：mm
     *
     * @return height - 堰高度 单位：mm
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * 设置堰高度 单位：mm
     *
     * @param height 堰高度 单位：mm
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * 获取堰顶高程 单位：m
     *
     * @return crestEle - 堰顶高程 单位：m
     */
    public BigDecimal getCrestele() {
        return crestele;
    }

    /**
     * 设置堰顶高程 单位：m
     *
     * @param crestele 堰顶高程 单位：m
     */
    public void setCrestele(BigDecimal crestele) {
        this.crestele = crestele;
    }
}