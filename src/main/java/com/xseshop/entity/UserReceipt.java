package com.xseshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:t_user_receipt
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2017-10-31 17:04
 */
public class UserReceipt implements Serializable {
    /**
     * 收货ID，8位日期+用户ID后6位+2位自增
     * t_user_receipt.receipt_id
     */
    private String receiptId;

    /**
     * 用户ID
     * t_user_receipt.user_id
     */
    private String userId;

    /**
     * 收货信息状态  01：可用  02：失效
     * t_user_receipt.receipt_status
     */
    private String receiptStatus;

    /**
     * 收货手机号
     * t_user_receipt.receipt_mobile
     */
    private String receiptMobile;

    /**
     * 收货地址
     * t_user_receipt.receipt_address
     */
    private String receiptAddress;

    /**
     * 邮编
     * t_user_receipt.zipcode
     */
    private String zipcode;

    /**
     * 是否默认地址，Y 是默认地址  N默认地址
     * t_user_receipt.is_default
     */
    private String isDefault;

    /**
     * 收货信息标签，可为空
     * t_user_receipt.receipt_mark
     */
    private String receiptMark;

    /**
     * 创建时间
     * t_user_receipt.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * t_user_receipt.update_time
     */
    private Date updateTime;

    /**
     * TABLE： t_user_receipt
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * 收货ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_receipt.receipt_id<br>
     * @return receipt_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * 收货ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_receipt.receipt_id<br>
     * @param receiptId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * 用户ID<br>
     *
     * column：t_user_receipt.user_id<br>
     * @return user_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID<br>
     *
     * column：t_user_receipt.user_id<br>
     * @param userId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 收货信息状态  01：可用  02：失效<br>
     *
     * column：t_user_receipt.receipt_status<br>
     * @return receipt_status
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getReceiptStatus() {
        return receiptStatus;
    }

    /**
     * 收货信息状态  01：可用  02：失效<br>
     *
     * column：t_user_receipt.receipt_status<br>
     * @param receiptStatus
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setReceiptStatus(String receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    /**
     * 收货手机号<br>
     *
     * column：t_user_receipt.receipt_mobile<br>
     * @return receipt_mobile
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getReceiptMobile() {
        return receiptMobile;
    }

    /**
     * 收货手机号<br>
     *
     * column：t_user_receipt.receipt_mobile<br>
     * @param receiptMobile
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setReceiptMobile(String receiptMobile) {
        this.receiptMobile = receiptMobile;
    }

    /**
     * 收货地址<br>
     *
     * column：t_user_receipt.receipt_address<br>
     * @return receipt_address
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getReceiptAddress() {
        return receiptAddress;
    }

    /**
     * 收货地址<br>
     *
     * column：t_user_receipt.receipt_address<br>
     * @param receiptAddress
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setReceiptAddress(String receiptAddress) {
        this.receiptAddress = receiptAddress;
    }

    /**
     * 邮编<br>
     *
     * column：t_user_receipt.zipcode<br>
     * @return zipcode
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 邮编<br>
     *
     * column：t_user_receipt.zipcode<br>
     * @param zipcode
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * 是否默认地址，Y 是默认地址  N默认地址<br>
     *
     * column：t_user_receipt.is_default<br>
     * @return is_default
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 是否默认地址，Y 是默认地址  N默认地址<br>
     *
     * column：t_user_receipt.is_default<br>
     * @param isDefault
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 收货信息标签，可为空<br>
     *
     * column：t_user_receipt.receipt_mark<br>
     * @return receipt_mark
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getReceiptMark() {
        return receiptMark;
    }

    /**
     * 收货信息标签，可为空<br>
     *
     * column：t_user_receipt.receipt_mark<br>
     * @param receiptMark
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setReceiptMark(String receiptMark) {
        this.receiptMark = receiptMark;
    }

    /**
     * 创建时间<br>
     *
     * column：t_user_receipt.create_time<br>
     * @return create_time
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间<br>
     *
     * column：t_user_receipt.create_time<br>
     * @param createTime
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间<br>
     *
     * column：t_user_receipt.update_time<br>
     * @return update_time
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间<br>
     *
     * column：t_user_receipt.update_time<br>
     * @param updateTime
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
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
        UserReceipt other = (UserReceipt) that;
        return (this.getReceiptId() == null ? other.getReceiptId() == null : this.getReceiptId().equals(other.getReceiptId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getReceiptStatus() == null ? other.getReceiptStatus() == null : this.getReceiptStatus().equals(other.getReceiptStatus()))
            && (this.getReceiptMobile() == null ? other.getReceiptMobile() == null : this.getReceiptMobile().equals(other.getReceiptMobile()))
            && (this.getReceiptAddress() == null ? other.getReceiptAddress() == null : this.getReceiptAddress().equals(other.getReceiptAddress()))
            && (this.getZipcode() == null ? other.getZipcode() == null : this.getZipcode().equals(other.getZipcode()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getReceiptMark() == null ? other.getReceiptMark() == null : this.getReceiptMark().equals(other.getReceiptMark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * <br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReceiptId() == null) ? 0 : getReceiptId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getReceiptStatus() == null) ? 0 : getReceiptStatus().hashCode());
        result = prime * result + ((getReceiptMobile() == null) ? 0 : getReceiptMobile().hashCode());
        result = prime * result + ((getReceiptAddress() == null) ? 0 : getReceiptAddress().hashCode());
        result = prime * result + ((getZipcode() == null) ? 0 : getZipcode().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getReceiptMark() == null) ? 0 : getReceiptMark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", receiptId=").append(receiptId);
        sb.append(", userId=").append(userId);
        sb.append(", receiptStatus=").append(receiptStatus);
        sb.append(", receiptMobile=").append(receiptMobile);
        sb.append(", receiptAddress=").append(receiptAddress);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", receiptMark=").append(receiptMark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}