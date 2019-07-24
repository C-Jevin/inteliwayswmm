package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shpnode {
    /**
     * 节点排水体制
     */
    @Id
    @Column(name = "systemType")
    private String systemtype;

    /**
     * 节点ID
     */
    @Column(name = "nodeID")
    private String nodeid;

    /**
     * 节点底部高程 单位：m
     */
    @Column(name = "bottomEle")
    private BigDecimal bottomele;

    /**
     * 节点地表高程 单位：m
     */
    @Column(name = "groundEle")
    private BigDecimal groundele;

    /**
     * 节点类型
     */
    @Column(name = "nodeType")
    private String nodetype;

    /**
     * 节点承接污水人口数
     */
    private BigDecimal popu;

    /**
     * 节点承接污水量 单位：m3/s
     */
    @Column(name = "sewFlow")
    private BigDecimal sewflow;

    /**
     * 节点深度 单位：m
     */
    private BigDecimal depth;

    /**
     * 初始水深 单位：m
     */
    @Column(name = "iniDepth")
    private BigDecimal inidepth;

    /**
     * 溢流水深 单位：m
     */
    @Column(name = "suiDeipth")
    private BigDecimal suideipth;

    /**
     * 溢流面积 单位：m2
     */
    @Column(name = "pondArea")
    private BigDecimal pondarea;

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
     * 获取节点排水体制
     *
     * @return systemType - 节点排水体制
     */
    public String getSystemtype() {
        return systemtype;
    }

    /**
     * 设置节点排水体制
     *
     * @param systemtype 节点排水体制
     */
    public void setSystemtype(String systemtype) {
        this.systemtype = systemtype;
    }

    /**
     * 获取节点ID
     *
     * @return nodeID - 节点ID
     */
    public String getNodeid() {
        return nodeid;
    }

    /**
     * 设置节点ID
     *
     * @param nodeid 节点ID
     */
    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }

    /**
     * 获取节点底部高程 单位：m
     *
     * @return bottomEle - 节点底部高程 单位：m
     */
    public BigDecimal getBottomele() {
        return bottomele;
    }

    /**
     * 设置节点底部高程 单位：m
     *
     * @param bottomele 节点底部高程 单位：m
     */
    public void setBottomele(BigDecimal bottomele) {
        this.bottomele = bottomele;
    }

    /**
     * 获取节点地表高程 单位：m
     *
     * @return groundEle - 节点地表高程 单位：m
     */
    public BigDecimal getGroundele() {
        return groundele;
    }

    /**
     * 设置节点地表高程 单位：m
     *
     * @param groundele 节点地表高程 单位：m
     */
    public void setGroundele(BigDecimal groundele) {
        this.groundele = groundele;
    }

    /**
     * 获取节点类型
     *
     * @return nodeType - 节点类型
     */
    public String getNodetype() {
        return nodetype;
    }

    /**
     * 设置节点类型
     *
     * @param nodetype 节点类型
     */
    public void setNodetype(String nodetype) {
        this.nodetype = nodetype;
    }

    /**
     * 获取节点承接污水人口数
     *
     * @return popu - 节点承接污水人口数
     */
    public BigDecimal getPopu() {
        return popu;
    }

    /**
     * 设置节点承接污水人口数
     *
     * @param popu 节点承接污水人口数
     */
    public void setPopu(BigDecimal popu) {
        this.popu = popu;
    }

    /**
     * 获取节点承接污水量 单位：m3/s
     *
     * @return sewFlow - 节点承接污水量 单位：m3/s
     */
    public BigDecimal getSewflow() {
        return sewflow;
    }

    /**
     * 设置节点承接污水量 单位：m3/s
     *
     * @param sewflow 节点承接污水量 单位：m3/s
     */
    public void setSewflow(BigDecimal sewflow) {
        this.sewflow = sewflow;
    }

    /**
     * 获取节点深度 单位：m
     *
     * @return depth - 节点深度 单位：m
     */
    public BigDecimal getDepth() {
        return depth;
    }

    /**
     * 设置节点深度 单位：m
     *
     * @param depth 节点深度 单位：m
     */
    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    /**
     * 获取初始水深 单位：m
     *
     * @return iniDepth - 初始水深 单位：m
     */
    public BigDecimal getInidepth() {
        return inidepth;
    }

    /**
     * 设置初始水深 单位：m
     *
     * @param inidepth 初始水深 单位：m
     */
    public void setInidepth(BigDecimal inidepth) {
        this.inidepth = inidepth;
    }

    /**
     * 获取溢流水深 单位：m
     *
     * @return suiDeipth - 溢流水深 单位：m
     */
    public BigDecimal getSuideipth() {
        return suideipth;
    }

    /**
     * 设置溢流水深 单位：m
     *
     * @param suideipth 溢流水深 单位：m
     */
    public void setSuideipth(BigDecimal suideipth) {
        this.suideipth = suideipth;
    }

    /**
     * 获取溢流面积 单位：m2
     *
     * @return pondArea - 溢流面积 单位：m2
     */
    public BigDecimal getPondarea() {
        return pondarea;
    }

    /**
     * 设置溢流面积 单位：m2
     *
     * @param pondarea 溢流面积 单位：m2
     */
    public void setPondarea(BigDecimal pondarea) {
        this.pondarea = pondarea;
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