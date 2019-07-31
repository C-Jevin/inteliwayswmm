package com.swmm.model;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Linkout {
    @Id
    @ApiModelProperty(value = "",required = false,hidden = true)
    private String uid;

    //@Id
    @ApiModelProperty(value = "link",example = "tianjia_ZL_update_1",required = false)
    private String link;

    //@Id
    @ApiModelProperty(value = "时间(2017-01-01 01:00:00)",example = "2017-01-01 01:00:00",required = false)
    private Date dt;

    //@Id
    @ApiModelProperty(notes = "污染物(TN,TP,COD,NH4,SS)",example = "TN",required = true)
    private String pollutant;

    @ApiModelProperty(value = "",required = false,hidden = true)
    private BigDecimal depth;

    @ApiModelProperty(value = "",required = false,hidden = true)
    private BigDecimal flow;

    @ApiModelProperty(value = "",required = false,hidden = true)
    private BigDecimal velocity;

    @ApiModelProperty(value = "",required = false,hidden = true)
    private BigDecimal volume;

    @ApiModelProperty(value = "",required = false,hidden = true)
    private BigDecimal capacity;

    @ApiModelProperty(value = "",required = false,hidden = true)
    private BigDecimal qual;

    /**
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return dt
     */
    public Date getDt() {
        if ("".equals(dt))
            return null;
        return dt;
    }

    /**
     * @param dt
     */
    public void setDt(Date dt) {
        this.dt = dt;
    }

    /**
     * @return pollutant
     */
    public String getPollutant() {
        return pollutant;
    }

    /**
     * @param pollutant
     */
    public void setPollutant(String pollutant) {
        this.pollutant = pollutant;
    }

    /**
     * @return depth
     */
    public BigDecimal getDepth() {
        return depth;
    }

    /**
     * @param depth
     */
    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    /**
     * @return flow
     */
    public BigDecimal getFlow() {
        return flow;
    }

    /**
     * @param flow
     */
    public void setFlow(BigDecimal flow) {
        this.flow = flow;
    }

    /**
     * @return velocity
     */
    public BigDecimal getVelocity() {
        return velocity;
    }

    /**
     * @param velocity
     */
    public void setVelocity(BigDecimal velocity) {
        this.velocity = velocity;
    }

    /**
     * @return volume
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * @param volume
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * @return capacity
     */
    public BigDecimal getCapacity() {
        return capacity;
    }

    /**
     * @param capacity
     */
    public void setCapacity(BigDecimal capacity) {
        this.capacity = capacity;
    }

    /**
     * @return qual
     */
    public BigDecimal getQual() {
        return qual;
    }

    /**
     * @param qual
     */
    public void setQual(BigDecimal qual) {
        this.qual = qual;
    }
}