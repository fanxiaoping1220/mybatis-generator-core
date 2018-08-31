package com.xseshop.dao;

import com.xseshop.entity.UserAuthinfo;
import com.xseshop.entity.UserAuthinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthinfoDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    long countByCriteria(UserAuthinfoCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByCriteria(UserAuthinfoCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int deleteByPrimaryKey(String authId);

    /**
     * 添加数据到<br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int insertSelective(UserAuthinfo record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    List<UserAuthinfo> selectByCriteria(UserAuthinfoCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    UserAuthinfo selectByPrimaryKey(String authId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByCriteriaSelective(@Param("record") UserAuthinfo record, @Param("criteria") UserAuthinfoCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    int updateByPrimaryKeySelective(UserAuthinfo record);

    UserAuthinfo selectSingleByCriteria(UserAuthinfoCriteria criteria);

    int insertBatchSelective(List<UserAuthinfo> records);

    int updateBatchByPrimaryKeySelective(List<UserAuthinfo> records);
}