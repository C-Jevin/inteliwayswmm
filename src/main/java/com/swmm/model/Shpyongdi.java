package com.swmm.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Shpyongdi {
    /**
     * 中文名称
     */
    @Id

    @Column(name = "NameCN")
    private String namecn;

    /**
     * 英文名称
     */
    @Column(name = "NameEN")
    private String nameen;

    /**
     * 户数
     */
    @Column(name = "Household")
    private BigDecimal household;

    /**
     * 人口数
     */
    @Column(name = "Popu")
    private BigDecimal popu;

    /**
     * 中文类型
     */
    @Column(name = "TypeCN")
    private String typecn;

    /**
     * 英文类型
     */
    @Column(name = "TypeEN")
    private String typeen;

    /**
     * 获取中文名称
     *
     * @return NameCN - 中文名称
     */
    public String getNamecn() {
        return namecn;
    }

    /**
     * 设置中文名称
     *
     * @param namecn 中文名称
     */
    public void setNamecn(String namecn) {
        this.namecn = namecn;
    }

    /**
     * 获取英文名称
     *
     * @return NameEN - 英文名称
     */
    public String getNameen() {
        return nameen;
    }

    /**
     * 设置英文名称
     *
     * @param nameen 英文名称
     */
    public void setNameen(String nameen) {
        this.nameen = nameen;
    }

    /**
     * 获取户数
     *
     * @return Household - 户数
     */
    public BigDecimal getHousehold() {
        return household;
    }

    /**
     * 设置户数
     *
     * @param household 户数
     */
    public void setHousehold(BigDecimal household) {
        this.household = household;
    }

    /**
     * 获取人口数
     *
     * @return Popu - 人口数
     */
    public BigDecimal getPopu() {
        return popu;
    }

    /**
     * 设置人口数
     *
     * @param popu 人口数
     */
    public void setPopu(BigDecimal popu) {
        this.popu = popu;
    }

    /**
     * 获取中文类型
     *
     * @return TypeCN - 中文类型
     */
    public String getTypecn() {
        return typecn;
    }

    /**
     * 设置中文类型
     *
     * @param typecn 中文类型
     */
    public void setTypecn(String typecn) {
        this.typecn = typecn;
    }

    /**
     * 获取英文类型
     *
     * @return TypeEN - 英文类型
     */
    public String getTypeen() {
        return typeen;
    }

    /**
     * 设置英文类型
     *
     * @param typeen 英文类型
     */
    public void setTypeen(String typeen) {
        this.typeen = typeen;
    }
}