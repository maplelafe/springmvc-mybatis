package com.peny.po;

import java.io.Serializable;

public class Imagepath implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imagepath.pathId
     *
     * @mbggenerated
     */
    private Integer pathid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imagepath.goodId
     *
     * @mbggenerated
     */
    private Integer goodid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column imagepath.path
     *
     * @mbggenerated
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table imagepath
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imagepath.pathId
     *
     * @return the value of imagepath.pathId
     *
     * @mbggenerated
     */
    public Integer getPathid() {
        return pathid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imagepath.pathId
     *
     * @param pathid the value for imagepath.pathId
     *
     * @mbggenerated
     */
    public void setPathid(Integer pathid) {
        this.pathid = pathid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imagepath.goodId
     *
     * @return the value of imagepath.goodId
     *
     * @mbggenerated
     */
    public Integer getGoodid() {
        return goodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imagepath.goodId
     *
     * @param goodid the value for imagepath.goodId
     *
     * @mbggenerated
     */
    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column imagepath.path
     *
     * @return the value of imagepath.path
     *
     * @mbggenerated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column imagepath.path
     *
     * @param path the value for imagepath.path
     *
     * @mbggenerated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imagepath
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
        Imagepath other = (Imagepath) that;
        return (this.getPathid() == null ? other.getPathid() == null : this.getPathid().equals(other.getPathid()))
            && (this.getGoodid() == null ? other.getGoodid() == null : this.getGoodid().equals(other.getGoodid()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imagepath
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPathid() == null) ? 0 : getPathid().hashCode());
        result = prime * result + ((getGoodid() == null) ? 0 : getGoodid().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imagepath
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pathid=").append(pathid);
        sb.append(", goodid=").append(goodid);
        sb.append(", path=").append(path);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}