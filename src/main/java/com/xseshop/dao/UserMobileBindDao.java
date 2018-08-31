package com.xseshop.dao;

import com.xseshop.entity.UserMobileBind;
import com.xseshop.entity.UserMobileBindCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMobileBindDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    long countByCriteria(UserMobileBindCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByCriteria(UserMobileBindCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByPrimaryKey(String mobileBindId);

    /**
     * 添加数据到<br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int insertSelective(UserMobileBind record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    List<UserMobileBind> selectByCriteria(UserMobileBindCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    UserMobileBind selectByPrimaryKey(String mobileBindId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByCriteriaSelective(@Param("record") UserMobileBind record, @Param("criteria") UserMobileBindCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByPrimaryKeySelective(UserMobileBind record);

    UserMobileBind selectSingleByCriteria(UserMobileBindCriteria criteria);

    int insertBatchSelective(List<UserMobileBind> records);

    int updateBatchByPrimaryKeySelective(List<UserMobileBind> records);
}