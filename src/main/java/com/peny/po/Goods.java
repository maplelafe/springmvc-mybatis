package com.peny.po;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodsId
     *
     * @mbggenerated
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodsName
     *
     * @mbggenerated
     */
    private String goodsname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbggenerated
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.num
     *
     * @mbggenerated
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.upTime
     *
     * @mbggenerated
     */
    private Date uptime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.category
     *
     * @mbggenerated
     */
    private Integer category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.detailCate
     *
     * @mbggenerated
     */
    private String detailcate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.activityId
     *
     * @mbggenerated
     */
    private Integer activityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodsId
     *
     * @return the value of goods.goodsId
     *
     * @mbggenerated
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodsId
     *
     * @param goodsid the value for goods.goodsId
     *
     * @mbggenerated
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodsName
     *
     * @return the value of goods.goodsName
     *
     * @mbggenerated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodsName
     *
     * @param goodsname the value for goods.goodsName
     *
     * @mbggenerated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbggenerated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbggenerated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.num
     *
     * @return the value of goods.num
     *
     * @mbggenerated
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.num
     *
     * @param num the value for goods.num
     *
     * @mbggenerated
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.upTime
     *
     * @return the value of goods.upTime
     *
     * @mbggenerated
     */
    public Date getUptime() {
        return uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.upTime
     *
     * @param uptime the value for goods.upTime
     *
     * @mbggenerated
     */
    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.category
     *
     * @return the value of goods.category
     *
     * @mbggenerated
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.category
     *
     * @param category the value for goods.category
     *
     * @mbggenerated
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.detailCate
     *
     * @return the value of goods.detailCate
     *
     * @mbggenerated
     */
    public String getDetailcate() {
        return detailcate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.detailCate
     *
     * @param detailcate the value for goods.detailCate
     *
     * @mbggenerated
     */
    public void setDetailcate(String detailcate) {
        this.detailcate = detailcate == null ? null : detailcate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.activityId
     *
     * @return the value of goods.activityId
     *
     * @mbggenerated
     */
    public Integer getActivityid() {
        return activityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.activityId
     *
     * @param activityid the value for goods.activityId
     *
     * @mbggenerated
     */
    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.description
     *
     * @return the value of goods.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.description
     *
     * @param description the value for goods.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Goods other = (Goods) that;
        return (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getGoodsname() == null ? other.getGoodsname() == null : this.getGoodsname().equals(other.getGoodsname()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getUptime() == null ? other.getUptime() == null : this.getUptime().equals(other.getUptime()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getDetailcate() == null ? other.getDetailcate() == null : this.getDetailcate().equals(other.getDetailcate()))
            && (this.getActivityid() == null ? other.getActivityid() == null : this.getActivityid().equals(other.getActivityid()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getGoodsname() == null) ? 0 : getGoodsname().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getUptime() == null) ? 0 : getUptime().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getDetailcate() == null) ? 0 : getDetailcate().hashCode());
        result = prime * result + ((getActivityid() == null) ? 0 : getActivityid().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsid=").append(goodsid);
        sb.append(", goodsname=").append(goodsname);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", uptime=").append(uptime);
        sb.append(", category=").append(category);
        sb.append(", detailcate=").append(detailcate);
        sb.append(", activityid=").append(activityid);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}