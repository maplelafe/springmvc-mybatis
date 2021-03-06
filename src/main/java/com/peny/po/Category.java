package com.peny.po;

import java.io.Serializable;

public class Category implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.cateId
     *
     * @mbggenerated
     */
    private Integer cateid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.cateName
     *
     * @mbggenerated
     */
    private String catename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table category
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.cateId
     *
     * @return the value of category.cateId
     *
     * @mbggenerated
     */
    public Integer getCateid() {
        return cateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.cateId
     *
     * @param cateid the value for category.cateId
     *
     * @mbggenerated
     */
    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.cateName
     *
     * @return the value of category.cateName
     *
     * @mbggenerated
     */
    public String getCatename() {
        return catename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.cateName
     *
     * @param catename the value for category.cateName
     *
     * @mbggenerated
     */
    public void setCatename(String catename) {
        this.catename = catename == null ? null : catename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
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
        Category other = (Category) that;
        return (this.getCateid() == null ? other.getCateid() == null : this.getCateid().equals(other.getCateid()))
            && (this.getCatename() == null ? other.getCatename() == null : this.getCatename().equals(other.getCatename()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCateid() == null) ? 0 : getCateid().hashCode());
        result = prime * result + ((getCatename() == null) ? 0 : getCatename().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cateid=").append(cateid);
        sb.append(", catename=").append(catename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}