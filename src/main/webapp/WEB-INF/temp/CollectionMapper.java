package com.peny.dao;

import com.peny.po.Collection;
import com.peny.po.CollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    int countByExample(CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    int deleteByExample(CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    int insert(Collection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    int insertSelective(Collection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    List<Collection> selectByExample(CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Collection record, @Param("example") CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Collection record, @Param("example") CollectionExample example);
}