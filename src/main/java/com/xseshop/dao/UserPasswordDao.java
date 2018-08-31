package com.xseshop.dao;

import com.xseshop.entity.UserPassword;
import com.xseshop.entity.UserPasswordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPasswordDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    long countByCriteria(UserPasswordCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByCriteria(UserPasswordCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByPrimaryKey(String passwordId);

    /**
     * 添加数据到<br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int insertSelective(UserPassword record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    List<UserPassword> selectByCriteria(UserPasswordCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    UserPassword selectByPrimaryKey(String passwordId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByCriteriaSelective(@Param("record") UserPassword record, @Param("criteria") UserPasswordCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByPrimaryKeySelective(UserPassword record);

    UserPassword selectSingleByCriteria(UserPasswordCriteria criteria);

    int insertBatchSelective(List<UserPassword> records);

    int updateBatchByPrimaryKeySelective(List<UserPassword> records);
}