package com.xseshop.dao;

import com.xseshop.entity.UserBankcard;
import com.xseshop.entity.UserBankcardCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBankcardDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    long countByCriteria(UserBankcardCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByCriteria(UserBankcardCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByPrimaryKey(String bankcardId);

    /**
     * 添加数据到<br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int insertSelective(UserBankcard record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    List<UserBankcard> selectByCriteria(UserBankcardCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    UserBankcard selectByPrimaryKey(String bankcardId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByCriteriaSelective(@Param("record") UserBankcard record, @Param("criteria") UserBankcardCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByPrimaryKeySelective(UserBankcard record);

    UserBankcard selectSingleByCriteria(UserBankcardCriteria criteria);

    int insertBatchSelective(List<UserBankcard> records);

    int updateBatchByPrimaryKeySelective(List<UserBankcard> records);
}