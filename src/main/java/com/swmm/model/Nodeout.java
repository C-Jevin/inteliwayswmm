package com.swmm.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Nodeout {
    @Id
    private String uid;

   // @Id
    private String node;

    //@Id
    private Date dt;

    //@Id
    private String pollutant;

    private BigDecimal depth;

    private BigDecimal head;

    private BigDecimal volume;

    private BigDecimal latflow;

    private BigDecimal inflow;

    private BigDecimal overflow;

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
     * @return node
     */
    public String getNode() {
        return node;
    }

    /**
     * @param node
     */
    public void setNode(String node) {
        this.node = node;
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
     * @return head
     */
    public BigDecimal getHead() {
        return head;
    }

    /**
     * @param head
     */
    public void setHead(BigDecimal head) {
        this.head = head;
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
     * @return latflow
     */
    public BigDecimal getLatflow() {
        return latflow;
    }

    /**
     * @param latflow
     */
    public void setLatflow(BigDecimal latflow) {
        this.latflow = latflow;
    }

    /**
     * @return inflow
     */
    public BigDecimal getInflow() {
        return inflow;
    }

    /**
     * @param inflow
     */
    public void setInflow(BigDecimal inflow) {
        this.inflow = inflow;
    }

    /**
     * @return overflow
     */
    public BigDecimal getOverflow() {
        return overflow;
    }

    /**
     * @param overflow
     */
    public void setOverflow(BigDecimal overflow) {
        this.overflow = overflow;
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