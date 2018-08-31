package com.xseshop.dao;

import com.xseshop.entity.UserReceipt;
import com.xseshop.entity.UserReceiptCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserReceiptDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    long countByCriteria(UserReceiptCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByCriteria(UserReceiptCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByPrimaryKey(String receiptId);

    /**
     * 添加数据到<br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int insertSelective(UserReceipt record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    List<UserReceipt> selectByCriteria(UserReceiptCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    UserReceipt selectByPrimaryKey(String receiptId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByCriteriaSelective(@Param("record") UserReceipt record, @Param("criteria") UserReceiptCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByPrimaryKeySelective(UserReceipt record);

    UserReceipt selectSingleByCriteria(UserReceiptCriteria criteria);

    int insertBatchSelective(List<UserReceipt> records);

    int updateBatchByPrimaryKeySelective(List<UserReceipt> records);
}