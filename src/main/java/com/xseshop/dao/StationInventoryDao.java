package com.xseshop.dao;

import com.xseshop.entity.StationInventory;
import com.xseshop.entity.StationInventoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationInventoryDao {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:40
     */
    long countByCriteria(StationInventoryCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:40
     */
    int deleteByCriteria(StationInventoryCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:40
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加数据到<br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:40
     */
    int insertSelective(StationInventory record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:40
     */
    List<StationInventory> selectByCriteria(StationInventoryCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:40
     */
    StationInventory selectByPrimaryKey(Long id);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:40
     */
    int updateByCriteriaSelective(@Param("record") StationInventory record, @Param("criteria") StationInventoryCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:40
     */
    int updateByPrimaryKeySelective(StationInventory record);

    StationInventory selectSingleByCriteria(StationInventoryCriteria criteria);

    int insertBatchSelective(List<StationInventory> records);

    int updateBatchByPrimaryKeySelective(List<StationInventory> records);
}
