package com.xseshop.dao;

import com.xseshop.entity.UserLogin;
import com.xseshop.entity.UserLoginCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    long countByCriteria(UserLoginCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByCriteria(UserLoginCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByPrimaryKey(String loginId);

    /**
     * 添加数据到<br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int insertSelective(UserLogin record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    List<UserLogin> selectByCriteria(UserLoginCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    UserLogin selectByPrimaryKey(String loginId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByCriteriaSelective(@Param("record") UserLogin record, @Param("criteria") UserLoginCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByPrimaryKeySelective(UserLogin record);

    UserLogin selectSingleByCriteria(UserLoginCriteria criteria);

    int insertBatchSelective(List<UserLogin> records);

    int updateBatchByPrimaryKeySelective(List<UserLogin> records);
}