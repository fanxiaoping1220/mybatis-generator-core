package com.xseshop.entity;

import java.io.Serializable;

/**
 *
 * TABLE:station_inventory
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2018-08-31 14:41
 */
public class StationInventory implements Serializable {
    private Long id;

    /**
     * 回收站编号
     * station_inventory.station_no
     */
    private String stationNo;

    /**
     * 记录编号
     * station_inventory.inventory_no
     */
    private String inventoryNo;

    /**
     * 仓库编号
     * station_inventory.storage_no
     */
    private String storageNo;

    /**
     * 仓库名称
     * station_inventory.storage_name
     */
    private String storageName;

    /**
     * 库位编号
     * station_inventory.rack_no
     */
    private String rackNo;

    /**
     * 库位名称
     * station_inventory.rack_name
     */
    private String rackName;

    /**
     * 科目编号
     * station_inventory.subject_no
     */
    private String subjectNo;

    /**
     * 科目识别编号
     * station_inventory.identity_no
     */
    private String identityNo;

    /**
     * 科目名称
     * station_inventory.subject_name
     */
    private String subjectName;

    /**
     * 当前存货
     * station_inventory.stock
     */
    private Double stock;

    /**
     * 预警线低位
     * station_inventory.warn_low_line
     */
    private Double warnLowLine;

    /**
     * 预警线高位
     * station_inventory.warn_high_line
     */
    private Double warnHighLine;

    /**
     * 0:pollen;1:honey
     * station_inventory.pollen_or_honey
     */
    private Integer pollenOrHoney;

    /**
     * TABLE： station_inventory
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 回收站编号<br>
     *
     * column：station_inventory.station_no<br>
     * @return station_no
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getStationNo() {
        return stationNo;
    }

    /**
     * 回收站编号<br>
     *
     * column：station_inventory.station_no<br>
     * @param stationNo
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    /**
     * 记录编号<br>
     *
     * column：station_inventory.inventory_no<br>
     * @return inventory_no
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getInventoryNo() {
        return inventoryNo;
    }

    /**
     * 记录编号<br>
     *
     * column：station_inventory.inventory_no<br>
     * @param inventoryNo
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setInventoryNo(String inventoryNo) {
        this.inventoryNo = inventoryNo;
    }

    /**
     * 仓库编号<br>
     *
     * column：station_inventory.storage_no<br>
     * @return storage_no
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getStorageNo() {
        return storageNo;
    }

    /**
     * 仓库编号<br>
     *
     * column：station_inventory.storage_no<br>
     * @param storageNo
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setStorageNo(String storageNo) {
        this.storageNo = storageNo;
    }

    /**
     * 仓库名称<br>
     *
     * column：station_inventory.storage_name<br>
     * @return storage_name
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getStorageName() {
        return storageName;
    }

    /**
     * 仓库名称<br>
     *
     * column：station_inventory.storage_name<br>
     * @param storageName
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    /**
     * 库位编号<br>
     *
     * column：station_inventory.rack_no<br>
     * @return rack_no
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getRackNo() {
        return rackNo;
    }

    /**
     * 库位编号<br>
     *
     * column：station_inventory.rack_no<br>
     * @param rackNo
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    /**
     * 库位名称<br>
     *
     * column：station_inventory.rack_name<br>
     * @return rack_name
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getRackName() {
        return rackName;
    }

    /**
     * 库位名称<br>
     *
     * column：station_inventory.rack_name<br>
     * @param rackName
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setRackName(String rackName) {
        this.rackName = rackName;
    }

    /**
     * 科目编号<br>
     *
     * column：station_inventory.subject_no<br>
     * @return subject_no
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getSubjectNo() {
        return subjectNo;
    }

    /**
     * 科目编号<br>
     *
     * column：station_inventory.subject_no<br>
     * @param subjectNo
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    /**
     * 科目识别编号<br>
     *
     * column：station_inventory.identity_no<br>
     * @return identity_no
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * 科目识别编号<br>
     *
     * column：station_inventory.identity_no<br>
     * @param identityNo
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * 科目名称<br>
     *
     * column：station_inventory.subject_name<br>
     * @return subject_name
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * 科目名称<br>
     *
     * column：station_inventory.subject_name<br>
     * @param subjectName
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * 当前存货<br>
     *
     * column：station_inventory.stock<br>
     * @return stock
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public Double getStock() {
        return stock;
    }

    /**
     * 当前存货<br>
     *
     * column：station_inventory.stock<br>
     * @param stock
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setStock(Double stock) {
        this.stock = stock;
    }

    /**
     * 预警线低位<br>
     *
     * column：station_inventory.warn_low_line<br>
     * @return warn_low_line
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public Double getWarnLowLine() {
        return warnLowLine;
    }

    /**
     * 预警线低位<br>
     *
     * column：station_inventory.warn_low_line<br>
     * @param warnLowLine
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setWarnLowLine(Double warnLowLine) {
        this.warnLowLine = warnLowLine;
    }

    /**
     * 预警线高位<br>
     *
     * column：station_inventory.warn_high_line<br>
     * @return warn_high_line
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public Double getWarnHighLine() {
        return warnHighLine;
    }

    /**
     * 预警线高位<br>
     *
     * column：station_inventory.warn_high_line<br>
     * @param warnHighLine
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setWarnHighLine(Double warnHighLine) {
        this.warnHighLine = warnHighLine;
    }

    /**
     * 0:pollen;1:honey<br>
     *
     * column：station_inventory.pollen_or_honey<br>
     * @return pollen_or_honey
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public Integer getPollenOrHoney() {
        return pollenOrHoney;
    }

    /**
     * 0:pollen;1:honey<br>
     *
     * column：station_inventory.pollen_or_honey<br>
     * @param pollenOrHoney
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setPollenOrHoney(Integer pollenOrHoney) {
        this.pollenOrHoney = pollenOrHoney;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StationInventory other = (StationInventory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStationNo() == null ? other.getStationNo() == null : this.getStationNo().equals(other.getStationNo()))
            && (this.getInventoryNo() == null ? other.getInventoryNo() == null : this.getInventoryNo().equals(other.getInventoryNo()))
            && (this.getStorageNo() == null ? other.getStorageNo() == null : this.getStorageNo().equals(other.getStorageNo()))
            && (this.getStorageName() == null ? other.getStorageName() == null : this.getStorageName().equals(other.getStorageName()))
            && (this.getRackNo() == null ? other.getRackNo() == null : this.getRackNo().equals(other.getRackNo()))
            && (this.getRackName() == null ? other.getRackName() == null : this.getRackName().equals(other.getRackName()))
            && (this.getSubjectNo() == null ? other.getSubjectNo() == null : this.getSubjectNo().equals(other.getSubjectNo()))
            && (this.getIdentityNo() == null ? other.getIdentityNo() == null : this.getIdentityNo().equals(other.getIdentityNo()))
            && (this.getSubjectName() == null ? other.getSubjectName() == null : this.getSubjectName().equals(other.getSubjectName()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getWarnLowLine() == null ? other.getWarnLowLine() == null : this.getWarnLowLine().equals(other.getWarnLowLine()))
            && (this.getWarnHighLine() == null ? other.getWarnHighLine() == null : this.getWarnHighLine().equals(other.getWarnHighLine()))
            && (this.getPollenOrHoney() == null ? other.getPollenOrHoney() == null : this.getPollenOrHoney().equals(other.getPollenOrHoney()));
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStationNo() == null) ? 0 : getStationNo().hashCode());
        result = prime * result + ((getInventoryNo() == null) ? 0 : getInventoryNo().hashCode());
        result = prime * result + ((getStorageNo() == null) ? 0 : getStorageNo().hashCode());
        result = prime * result + ((getStorageName() == null) ? 0 : getStorageName().hashCode());
        result = prime * result + ((getRackNo() == null) ? 0 : getRackNo().hashCode());
        result = prime * result + ((getRackName() == null) ? 0 : getRackName().hashCode());
        result = prime * result + ((getSubjectNo() == null) ? 0 : getSubjectNo().hashCode());
        result = prime * result + ((getIdentityNo() == null) ? 0 : getIdentityNo().hashCode());
        result = prime * result + ((getSubjectName() == null) ? 0 : getSubjectName().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getWarnLowLine() == null) ? 0 : getWarnLowLine().hashCode());
        result = prime * result + ((getWarnHighLine() == null) ? 0 : getWarnHighLine().hashCode());
        result = prime * result + ((getPollenOrHoney() == null) ? 0 : getPollenOrHoney().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stationNo=").append(stationNo);
        sb.append(", inventoryNo=").append(inventoryNo);
        sb.append(", storageNo=").append(storageNo);
        sb.append(", storageName=").append(storageName);
        sb.append(", rackNo=").append(rackNo);
        sb.append(", rackName=").append(rackName);
        sb.append(", subjectNo=").append(subjectNo);
        sb.append(", identityNo=").append(identityNo);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", stock=").append(stock);
        sb.append(", warnLowLine=").append(warnLowLine);
        sb.append(", warnHighLine=").append(warnHighLine);
        sb.append(", pollenOrHoney=").append(pollenOrHoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}