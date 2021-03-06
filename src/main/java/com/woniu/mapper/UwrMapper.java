package com.woniu.mapper;

import com.woniu.pojo.Uwr;
import com.woniu.pojo.UwrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UwrMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	long countByExample(UwrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int deleteByExample(UwrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int deleteByPrimaryKey(Integer uwrid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int insert(Uwr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int insertSelective(Uwr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	List<Uwr> selectByExample(UwrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	Uwr selectByPrimaryKey(Integer uwrid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int updateByExampleSelective(@Param("record") Uwr record, @Param("example") UwrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int updateByExample(@Param("record") Uwr record, @Param("example") UwrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int updateByPrimaryKeySelective(Uwr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	int updateByPrimaryKey(Uwr record);
}