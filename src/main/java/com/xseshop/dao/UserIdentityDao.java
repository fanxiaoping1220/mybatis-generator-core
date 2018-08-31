package com.xseshop.dao;

import com.xseshop.entity.UserIdentity;
import com.xseshop.entity.UserIdentityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserIdentityDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    long countByCriteria(UserIdentityCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByCriteria(UserIdentityCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByPrimaryKey(String identityId);

    /**
     * 添加数据到<br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int insertSelective(UserIdentity record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    List<UserIdentity> selectByCriteria(UserIdentityCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    UserIdentity selectByPrimaryKey(String identityId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByCriteriaSelective(@Param("record") UserIdentity record, @Param("criteria") UserIdentityCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByPrimaryKeySelective(UserIdentity record);

    UserIdentity selectSingleByCriteria(UserIdentityCriteria criteria);

    int insertBatchSelective(List<UserIdentity> records);

    int updateBatchByPrimaryKeySelective(List<UserIdentity> records);
}