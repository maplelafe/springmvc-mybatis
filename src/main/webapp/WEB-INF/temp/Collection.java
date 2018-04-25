package com.peny.po;

import java.io.Serializable;
import java.util.Date;

public class Collection implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collection.userId
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collection.goodsId
     *
     * @mbggenerated
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collection.collectTime
     *
     * @mbggenerated
     */
    private Date collecttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table collection
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collection.userId
     *
     * @return the value of collection.userId
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collection.userId
     *
     * @param userid the value for collection.userId
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collection.goodsId
     *
     * @return the value of collection.goodsId
     *
     * @mbggenerated
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collection.goodsId
     *
     * @param goodsid the value for collection.goodsId
     *
     * @mbggenerated
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collection.collectTime
     *
     * @return the value of collection.collectTime
     *
     * @mbggenerated
     */
    public Date getCollecttime() {
        return collecttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collection.collectTime
     *
     * @param collecttime the value for collection.collectTime
     *
     * @mbggenerated
     */
    public void setCollecttime(Date collecttime) {
        this.collecttime = collecttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
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
        Collection other = (Collection) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getCollecttime() == null ? other.getCollecttime() == null : this.getCollecttime().equals(other.getCollecttime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getCollecttime() == null) ? 0 : getCollecttime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", collecttime=").append(collecttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}