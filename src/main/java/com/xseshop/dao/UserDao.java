package com.xseshop.dao;

import com.xseshop.entity.User;
import com.xseshop.entity.UserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 16:49
     */
    long countByCriteria(UserCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 16:49
     */
    int deleteByCriteria(UserCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 16:49
     */
    int deleteByPrimaryKey(String userId);

    /**
     * 添加数据到<br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 16:49
     */
    int insertSelective(User record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 16:49
     */
    List<User> selectByCriteria(UserCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 16:49
     */
    User selectByPrimaryKey(String userId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 16:49
     */
    int updateByCriteriaSelective(@Param("record") User record, @Param("criteria") UserCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 16:49
     */
    int updateByPrimaryKeySelective(User record);

    User selectSingleByCriteria(UserCriteria criteria);

    int insertBatchSelective(List<User> records);

    int updateBatchByPrimaryKeySelective(List<User> records);
}
