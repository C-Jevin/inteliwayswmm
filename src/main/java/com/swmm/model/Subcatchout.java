package com.swmm.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Subcatchout {
    @Id
    private String uid;

   // @Id
    private String subcatch;

   //@Id
    private Date dt;

    //@Id
    private String pollutant;

    private BigDecimal rainfall;

    private BigDecimal snowdepth;

    private BigDecimal evap;

    private BigDecimal infil;

    @Column(name = "gw_flow")
    private BigDecimal gwFlow;

    @Column(name = "gw_elev")
    private BigDecimal gwElev;

    @Column(name = "soil_moist")
    private BigDecimal soilMoist;

    private BigDecimal runoff;

    private String washoff;

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
     * @return subcatch
     */
    public String getSubcatch() {
        return subcatch;
    }

    /**
     * @param subcatch
     */
    public void setSubcatch(String subcatch) {
        this.subcatch = subcatch;
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
     * @return rainfall
     */
    public BigDecimal getRainfall() {
        return rainfall;
    }

    /**
     * @param rainfall
     */
    public void setRainfall(BigDecimal rainfall) {
        this.rainfall = rainfall;
    }

    /**
     * @return snowdepth
     */
    public BigDecimal getSnowdepth() {
        return snowdepth;
    }

    /**
     * @param snowdepth
     */
    public void setSnowdepth(BigDecimal snowdepth) {
        this.snowdepth = snowdepth;
    }

    /**
     * @return evap
     */
    public BigDecimal getEvap() {
        return evap;
    }

    /**
     * @param evap
     */
    public void setEvap(BigDecimal evap) {
        this.evap = evap;
    }

    /**
     * @return infil
     */
    public BigDecimal getInfil() {
        return infil;
    }

    /**
     * @param infil
     */
    public void setInfil(BigDecimal infil) {
        this.infil = infil;
    }

    /**
     * @return gw_flow
     */
    public BigDecimal getGwFlow() {
        return gwFlow;
    }

    /**
     * @param gwFlow
     */
    public void setGwFlow(BigDecimal gwFlow) {
        this.gwFlow = gwFlow;
    }

    /**
     * @return gw_elev
     */
    public BigDecimal getGwElev() {
        return gwElev;
    }

    /**
     * @param gwElev
     */
    public void setGwElev(BigDecimal gwElev) {
        this.gwElev = gwElev;
    }

    /**
     * @return soil_moist
     */
    public BigDecimal getSoilMoist() {
        return soilMoist;
    }

    /**
     * @param soilMoist
     */
    public void setSoilMoist(BigDecimal soilMoist) {
        this.soilMoist = soilMoist;
    }

    /**
     * @return runoff
     */
    public BigDecimal getRunoff() {
        return runoff;
    }

    /**
     * @param runoff
     */
    public void setRunoff(BigDecimal runoff) {
        this.runoff = runoff;
    }

    /**
     * @return washoff
     */
    public String getWashoff() {
        return washoff;
    }

    /**
     * @param washoff
     */
    public void setWashoff(String washoff) {
        this.washoff = washoff;
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