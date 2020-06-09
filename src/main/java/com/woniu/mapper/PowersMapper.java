package com.woniu.mapper;

import com.woniu.pojo.Powers;
import com.woniu.pojo.PowersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	long countByExample(PowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int deleteByExample(PowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int deleteByPrimaryKey(Integer pid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int insert(Powers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int insertSelective(Powers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	List<Powers> selectByExample(PowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	Powers selectByPrimaryKey(Integer pid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int updateByExampleSelective(@Param("record") Powers record, @Param("example") PowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int updateByExample(@Param("record") Powers record, @Param("example") PowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int updateByPrimaryKeySelective(Powers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table powers
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int updateByPrimaryKey(Powers record);
}