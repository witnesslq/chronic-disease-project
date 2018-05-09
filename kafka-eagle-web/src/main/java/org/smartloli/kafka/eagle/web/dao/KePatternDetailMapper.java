package org.smartloli.kafka.eagle.web.dao;

import org.smartloli.kafka.eagle.web.pojo.KePatternDetail;

import java.util.List;

public interface KePatternDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ke_pattern_detail
     *
     * @mbggenerated Wed May 09 12:04:41 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ke_pattern_detail
     *
     * @mbggenerated Wed May 09 12:04:41 CST 2018
     */
    int insert(KePatternDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ke_pattern_detail
     *
     * @mbggenerated Wed May 09 12:04:41 CST 2018
     */
    int insertSelective(KePatternDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ke_pattern_detail
     *
     * @mbggenerated Wed May 09 12:04:41 CST 2018
     */
    KePatternDetail selectByPrimaryKey(String id);
    List<KePatternDetail> selectBySPId(String symbolicPatternId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ke_pattern_detail
     *
     * @mbggenerated Wed May 09 12:04:41 CST 2018
     */
    int updateByPrimaryKeySelective(KePatternDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ke_pattern_detail
     *
     * @mbggenerated Wed May 09 12:04:41 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(KePatternDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ke_pattern_detail
     *
     * @mbggenerated Wed May 09 12:04:41 CST 2018
     */
    int updateByPrimaryKey(KePatternDetail record);
}
