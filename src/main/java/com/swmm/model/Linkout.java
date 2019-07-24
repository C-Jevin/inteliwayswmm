package com.swmm.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Linkout {
    @Id
    private String uid;

    //@Id
    private String link;

    //@Id
    private Date dt;

    //@Id
    private String pollutant;

    private BigDecimal depth;

    private BigDecimal flow;

    private BigDecimal velocity;

    private BigDecimal volume;

    private BigDecimal capacity;

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