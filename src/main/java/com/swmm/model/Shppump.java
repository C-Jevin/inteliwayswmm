package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shppump {
    /**
     * 泵机ID
     */
    @Id
    @Column(name = "pumpID")
    private String pumpid;

    /**
     * 泵机进水节点ID
     */
    @Column(name = "usNodeID")
    private String usnodeid;

    /**
     * 泵机出水节点ID
     */
    @Column(name = "dsNodeID")
    private String dsnodeid;

    /**
     * 泵机额定流量 单位：m3/s
     */
    private BigDecimal flow;

    /**
     * 开机水位 单位：m
     */
    @Column(name = "swithOn")
    private BigDecimal swithon;

    /**
     * 关机水位 单位：m
     */
    @Column(name = "swithOff")
    private BigDecimal swithoff;

    /**
     * 获取泵机ID
     *
     * @return pumpID - 泵机ID
     */
    public String getPumpid() {
        return pumpid;
    }

    /**
     * 设置泵机ID
     *
     * @param pumpid 泵机ID
     */
    public void setPumpid(String pumpid) {
        this.pumpid = pumpid;
    }

    /**
     * 获取泵机进水节点ID
     *
     * @return usNodeID - 泵机进水节点ID
     */
    public String getUsnodeid() {
        return usnodeid;
    }

    /**
     * 设置泵机进水节点ID
     *
     * @param usnodeid 泵机进水节点ID
     */
    public void setUsnodeid(String usnodeid) {
        this.usnodeid = usnodeid;
    }

    /**
     * 获取泵机出水节点ID
     *
     * @return dsNodeID - 泵机出水节点ID
     */
    public String getDsnodeid() {
        return dsnodeid;
    }

    /**
     * 设置泵机出水节点ID
     *
     * @param dsnodeid 泵机出水节点ID
     */
    public void setDsnodeid(String dsnodeid) {
        this.dsnodeid = dsnodeid;
    }

    /**
     * 获取泵机额定流量 单位：m3/s
     *
     * @return flow - 泵机额定流量 单位：m3/s
     */
    public BigDecimal getFlow() {
        return flow;
    }

    /**
     * 设置泵机额定流量 单位：m3/s
     *
     * @param flow 泵机额定流量 单位：m3/s
     */
    public void setFlow(BigDecimal flow) {
        this.flow = flow;
    }

    /**
     * 获取开机水位 单位：m
     *
     * @return swithOn - 开机水位 单位：m
     */
    public BigDecimal getSwithon() {
        return swithon;
    }

    /**
     * 设置开机水位 单位：m
     *
     * @param swithon 开机水位 单位：m
     */
    public void setSwithon(BigDecimal swithon) {
        this.swithon = swithon;
    }

    /**
     * 获取关机水位 单位：m
     *
     * @return swithOff - 关机水位 单位：m
     */
    public BigDecimal getSwithoff() {
        return swithoff;
    }

    /**
     * 设置关机水位 单位：m
     *
     * @param swithoff 关机水位 单位：m
     */
    public void setSwithoff(BigDecimal swithoff) {
        this.swithoff = swithoff;
    }
}