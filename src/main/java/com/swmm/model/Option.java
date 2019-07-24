package com.swmm.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Option {
    /**
     * 模型模拟模块
     */
    @Id
    @Column(name = "proModel")
    private Integer promodel;

    /**
     * 水动力计算方法
     */
    @Column(name = "routingModel")
    private Integer routingmodel;

    /**
     * 下渗计算方法
     */
    @Column(name = "infilMode")
    private Integer infilmode;

    /**
     * 是否允许溢流开关
     */
    @Column(name = "pondingFlag")
    private Integer pondingflag;

    /**
     * 是否生成控制报告
     */
    @Column(name = "conActReport")
    private Integer conactreport;

    /**
     * 是否生成输入总结报告
     */
    @Column(name = "sumInpReport")
    private Integer suminpreport;

    /**
     * 最小管线坡度 单位：%
     */
    @Column(name = "minConSlope")
    private BigDecimal minconslope;

    /**
     * 模拟开始时间
     */
    @Column(name = "startAanTime")
    private Date startaantime;

    /**
     * 报告开始时间
     */
    @Column(name = "startRepTime")
    private Date startreptime;

    /**
     * 模拟结束时间
     */
    @Column(name = "ednAnaTime")
    private Date ednanatime;

    /**
     * 清扫开始时间
     */
    @Column(name = "startSweepDate")
    private Date startsweepdate;

    /**
     * 清扫结束时间
     */
    @Column(name = "endSweepDate")
    private Date endsweepdate;

    /**
     * 前期干旱时间
     */
    @Column(name = "antDryDays")
    private BigDecimal antdrydays;

    /**
     * 结果输出天步长
     */
    @Column(name = "reportStep")
    private Date reportstep;

    /**
     * 径流旱天模拟步长
     */
    @Column(name = "dryRunoffStep")
    private Date dryrunoffstep;

    /**
     * 径流雨天模拟步长
     */
    @Column(name = "wetRunoffStep")
    private Date wetrunoffstep;

    /**
     * 水动力模拟步长
     */
    @Column(name = "routingStep")
    private Date routingstep;

    /**
     * 是否跳过稳定流计算开关
     */
    @Column(name = "skipSteadyFlow")
    private Integer skipsteadyflow;

    /**
     * 系统流量阈值 单位：%
     */
    @Column(name = "sysFlowTol")
    private Integer sysflowtol;

    /**
     * 侧向流量阈值 单位：%
     */
    @Column(name = "latFlowTol")
    private Integer latflowtol;

    /**
     * 惯量项处理方式
     */
    @Column(name = "interTerm")
    private Integer interterm;

    /**
     * 超临界流确定规则
     */
    @Column(name = "norFlowCrit")
    private Integer norflowcrit;

    /**
     * 压力管计算方法
     */
    @Column(name = "forceConEqu")
    private Integer forceconequ;

    /**
     * 变步长开关
     */
    @Column(name = "varTimeStepFlag")
    private Integer vartimestepflag;

    /**
     * 计算步长校正系数 单位：%
     */
    @Column(name = "varTimeStepAdj")
    private Integer vartimestepadj;

    /**
     * 最小变步长 单位：S
     */
    @Column(name = "minVarTimeStep")
    private BigDecimal minvartimestep;

    /**
     * 管道延长计算步长 单位：S
     */
    @Column(name = "conLengthTimeStep")
    private BigDecimal conlengthtimestep;

    /**
     * 节点最小表面积 单位：m2
     */
    @Column(name = "minNodeSurArea")
    private BigDecimal minnodesurarea;

    /**
     * 每个计算步长最大迭代次数
     */
    @Column(name = "maxTri")
    private Integer maxtri;

    /**
     * 水头计算收敛精度 单位：m
     */
    @Column(name = "headConToler")
    private BigDecimal headcontoler;

    /**
     * 并行计算核数
     */
    @Column(name = "numThreads")
    private Integer numthreads;

    /**
     * 获取模型模拟模块
     *
     * @return proModel - 模型模拟模块
     */
    public Integer getPromodel() {
        return promodel;
    }

    /**
     * 设置模型模拟模块
     *
     * @param promodel 模型模拟模块
     */
    public void setPromodel(Integer promodel) {
        this.promodel = promodel;
    }

    /**
     * 获取水动力计算方法
     *
     * @return routingModel - 水动力计算方法
     */
    public Integer getRoutingmodel() {
        return routingmodel;
    }

    /**
     * 设置水动力计算方法
     *
     * @param routingmodel 水动力计算方法
     */
    public void setRoutingmodel(Integer routingmodel) {
        this.routingmodel = routingmodel;
    }

    /**
     * 获取下渗计算方法
     *
     * @return infilMode - 下渗计算方法
     */
    public Integer getInfilmode() {
        return infilmode;
    }

    /**
     * 设置下渗计算方法
     *
     * @param infilmode 下渗计算方法
     */
    public void setInfilmode(Integer infilmode) {
        this.infilmode = infilmode;
    }

    /**
     * 获取是否允许溢流开关
     *
     * @return pondingFlag - 是否允许溢流开关
     */
    public Integer getPondingflag() {
        return pondingflag;
    }

    /**
     * 设置是否允许溢流开关
     *
     * @param pondingflag 是否允许溢流开关
     */
    public void setPondingflag(Integer pondingflag) {
        this.pondingflag = pondingflag;
    }

    /**
     * 获取是否生成控制报告
     *
     * @return conActReport - 是否生成控制报告
     */
    public Integer getConactreport() {
        return conactreport;
    }

    /**
     * 设置是否生成控制报告
     *
     * @param conactreport 是否生成控制报告
     */
    public void setConactreport(Integer conactreport) {
        this.conactreport = conactreport;
    }

    /**
     * 获取是否生成输入总结报告
     *
     * @return sumInpReport - 是否生成输入总结报告
     */
    public Integer getSuminpreport() {
        return suminpreport;
    }

    /**
     * 设置是否生成输入总结报告
     *
     * @param suminpreport 是否生成输入总结报告
     */
    public void setSuminpreport(Integer suminpreport) {
        this.suminpreport = suminpreport;
    }

    /**
     * 获取最小管线坡度 单位：%
     *
     * @return minConSlope - 最小管线坡度 单位：%
     */
    public BigDecimal getMinconslope() {
        return minconslope;
    }

    /**
     * 设置最小管线坡度 单位：%
     *
     * @param minconslope 最小管线坡度 单位：%
     */
    public void setMinconslope(BigDecimal minconslope) {
        this.minconslope = minconslope;
    }

    /**
     * 获取模拟开始时间
     *
     * @return startAanTime - 模拟开始时间
     */
    public Date getStartaantime() {
        return startaantime;
    }

    /**
     * 设置模拟开始时间
     *
     * @param startaantime 模拟开始时间
     */
    public void setStartaantime(Date startaantime) {
        this.startaantime = startaantime;
    }

    /**
     * 获取报告开始时间
     *
     * @return startRepTime - 报告开始时间
     */
    public Date getStartreptime() {
        return startreptime;
    }

    /**
     * 设置报告开始时间
     *
     * @param startreptime 报告开始时间
     */
    public void setStartreptime(Date startreptime) {
        this.startreptime = startreptime;
    }

    /**
     * 获取模拟结束时间
     *
     * @return ednAnaTime - 模拟结束时间
     */
    public Date getEdnanatime() {
        return ednanatime;
    }

    /**
     * 设置模拟结束时间
     *
     * @param ednanatime 模拟结束时间
     */
    public void setEdnanatime(Date ednanatime) {
        this.ednanatime = ednanatime;
    }

    /**
     * 获取清扫开始时间
     *
     * @return startSweepDate - 清扫开始时间
     */
    public Date getStartsweepdate() {
        return startsweepdate;
    }

    /**
     * 设置清扫开始时间
     *
     * @param startsweepdate 清扫开始时间
     */
    public void setStartsweepdate(Date startsweepdate) {
        this.startsweepdate = startsweepdate;
    }

    /**
     * 获取清扫结束时间
     *
     * @return endSweepDate - 清扫结束时间
     */
    public Date getEndsweepdate() {
        return endsweepdate;
    }

    /**
     * 设置清扫结束时间
     *
     * @param endsweepdate 清扫结束时间
     */
    public void setEndsweepdate(Date endsweepdate) {
        this.endsweepdate = endsweepdate;
    }

    /**
     * 获取前期干旱时间
     *
     * @return antDryDays - 前期干旱时间
     */
    public BigDecimal getAntdrydays() {
        return antdrydays;
    }

    /**
     * 设置前期干旱时间
     *
     * @param antdrydays 前期干旱时间
     */
    public void setAntdrydays(BigDecimal antdrydays) {
        this.antdrydays = antdrydays;
    }

    /**
     * 获取结果输出天步长
     *
     * @return reportStep - 结果输出天步长
     */
    public Date getReportstep() {
        return reportstep;
    }

    /**
     * 设置结果输出天步长
     *
     * @param reportstep 结果输出天步长
     */
    public void setReportstep(Date reportstep) {
        this.reportstep = reportstep;
    }

    /**
     * 获取径流旱天模拟步长
     *
     * @return dryRunoffStep - 径流旱天模拟步长
     */
    public Date getDryrunoffstep() {
        return dryrunoffstep;
    }

    /**
     * 设置径流旱天模拟步长
     *
     * @param dryrunoffstep 径流旱天模拟步长
     */
    public void setDryrunoffstep(Date dryrunoffstep) {
        this.dryrunoffstep = dryrunoffstep;
    }

    /**
     * 获取径流雨天模拟步长
     *
     * @return wetRunoffStep - 径流雨天模拟步长
     */
    public Date getWetrunoffstep() {
        return wetrunoffstep;
    }

    /**
     * 设置径流雨天模拟步长
     *
     * @param wetrunoffstep 径流雨天模拟步长
     */
    public void setWetrunoffstep(Date wetrunoffstep) {
        this.wetrunoffstep = wetrunoffstep;
    }

    /**
     * 获取水动力模拟步长
     *
     * @return routingStep - 水动力模拟步长
     */
    public Date getRoutingstep() {
        return routingstep;
    }

    /**
     * 设置水动力模拟步长
     *
     * @param routingstep 水动力模拟步长
     */
    public void setRoutingstep(Date routingstep) {
        this.routingstep = routingstep;
    }

    /**
     * 获取是否跳过稳定流计算开关
     *
     * @return skipSteadyFlow - 是否跳过稳定流计算开关
     */
    public Integer getSkipsteadyflow() {
        return skipsteadyflow;
    }

    /**
     * 设置是否跳过稳定流计算开关
     *
     * @param skipsteadyflow 是否跳过稳定流计算开关
     */
    public void setSkipsteadyflow(Integer skipsteadyflow) {
        this.skipsteadyflow = skipsteadyflow;
    }

    /**
     * 获取系统流量阈值 单位：%
     *
     * @return sysFlowTol - 系统流量阈值 单位：%
     */
    public Integer getSysflowtol() {
        return sysflowtol;
    }

    /**
     * 设置系统流量阈值 单位：%
     *
     * @param sysflowtol 系统流量阈值 单位：%
     */
    public void setSysflowtol(Integer sysflowtol) {
        this.sysflowtol = sysflowtol;
    }

    /**
     * 获取侧向流量阈值 单位：%
     *
     * @return latFlowTol - 侧向流量阈值 单位：%
     */
    public Integer getLatflowtol() {
        return latflowtol;
    }

    /**
     * 设置侧向流量阈值 单位：%
     *
     * @param latflowtol 侧向流量阈值 单位：%
     */
    public void setLatflowtol(Integer latflowtol) {
        this.latflowtol = latflowtol;
    }

    /**
     * 获取惯量项处理方式
     *
     * @return interTerm - 惯量项处理方式
     */
    public Integer getInterterm() {
        return interterm;
    }

    /**
     * 设置惯量项处理方式
     *
     * @param interterm 惯量项处理方式
     */
    public void setInterterm(Integer interterm) {
        this.interterm = interterm;
    }

    /**
     * 获取超临界流确定规则
     *
     * @return norFlowCrit - 超临界流确定规则
     */
    public Integer getNorflowcrit() {
        return norflowcrit;
    }

    /**
     * 设置超临界流确定规则
     *
     * @param norflowcrit 超临界流确定规则
     */
    public void setNorflowcrit(Integer norflowcrit) {
        this.norflowcrit = norflowcrit;
    }

    /**
     * 获取压力管计算方法
     *
     * @return forceConEqu - 压力管计算方法
     */
    public Integer getForceconequ() {
        return forceconequ;
    }

    /**
     * 设置压力管计算方法
     *
     * @param forceconequ 压力管计算方法
     */
    public void setForceconequ(Integer forceconequ) {
        this.forceconequ = forceconequ;
    }

    /**
     * 获取变步长开关
     *
     * @return varTimeStepFlag - 变步长开关
     */
    public Integer getVartimestepflag() {
        return vartimestepflag;
    }

    /**
     * 设置变步长开关
     *
     * @param vartimestepflag 变步长开关
     */
    public void setVartimestepflag(Integer vartimestepflag) {
        this.vartimestepflag = vartimestepflag;
    }

    /**
     * 获取计算步长校正系数 单位：%
     *
     * @return varTimeStepAdj - 计算步长校正系数 单位：%
     */
    public Integer getVartimestepadj() {
        return vartimestepadj;
    }

    /**
     * 设置计算步长校正系数 单位：%
     *
     * @param vartimestepadj 计算步长校正系数 单位：%
     */
    public void setVartimestepadj(Integer vartimestepadj) {
        this.vartimestepadj = vartimestepadj;
    }

    /**
     * 获取最小变步长 单位：S
     *
     * @return minVarTimeStep - 最小变步长 单位：S
     */
    public BigDecimal getMinvartimestep() {
        return minvartimestep;
    }

    /**
     * 设置最小变步长 单位：S
     *
     * @param minvartimestep 最小变步长 单位：S
     */
    public void setMinvartimestep(BigDecimal minvartimestep) {
        this.minvartimestep = minvartimestep;
    }

    /**
     * 获取管道延长计算步长 单位：S
     *
     * @return conLengthTimeStep - 管道延长计算步长 单位：S
     */
    public BigDecimal getConlengthtimestep() {
        return conlengthtimestep;
    }

    /**
     * 设置管道延长计算步长 单位：S
     *
     * @param conlengthtimestep 管道延长计算步长 单位：S
     */
    public void setConlengthtimestep(BigDecimal conlengthtimestep) {
        this.conlengthtimestep = conlengthtimestep;
    }

    /**
     * 获取节点最小表面积 单位：m2
     *
     * @return minNodeSurArea - 节点最小表面积 单位：m2
     */
    public BigDecimal getMinnodesurarea() {
        return minnodesurarea;
    }

    /**
     * 设置节点最小表面积 单位：m2
     *
     * @param minnodesurarea 节点最小表面积 单位：m2
     */
    public void setMinnodesurarea(BigDecimal minnodesurarea) {
        this.minnodesurarea = minnodesurarea;
    }

    /**
     * 获取每个计算步长最大迭代次数
     *
     * @return maxTri - 每个计算步长最大迭代次数
     */
    public Integer getMaxtri() {
        return maxtri;
    }

    /**
     * 设置每个计算步长最大迭代次数
     *
     * @param maxtri 每个计算步长最大迭代次数
     */
    public void setMaxtri(Integer maxtri) {
        this.maxtri = maxtri;
    }

    /**
     * 获取水头计算收敛精度 单位：m
     *
     * @return headConToler - 水头计算收敛精度 单位：m
     */
    public BigDecimal getHeadcontoler() {
        return headcontoler;
    }

    /**
     * 设置水头计算收敛精度 单位：m
     *
     * @param headcontoler 水头计算收敛精度 单位：m
     */
    public void setHeadcontoler(BigDecimal headcontoler) {
        this.headcontoler = headcontoler;
    }

    /**
     * 获取并行计算核数
     *
     * @return numThreads - 并行计算核数
     */
    public Integer getNumthreads() {
        return numthreads;
    }

    /**
     * 设置并行计算核数
     *
     * @param numthreads 并行计算核数
     */
    public void setNumthreads(Integer numthreads) {
        this.numthreads = numthreads;
    }
}