package com.peny.mapper;

import com.peny.po.Chat;
import com.peny.po.ChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    int countByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    int deleteByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    int insert(Chat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    int insertSelective(Chat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    List<Chat> selectByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Chat record, @Param("example") ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Chat record, @Param("example") ChatExample example);
}