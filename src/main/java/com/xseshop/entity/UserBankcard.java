package com.xseshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:t_user_bankcard
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2017-10-31 17:04
 */
public class UserBankcard implements Serializable {
    /**
     * ID，8位日期+用户ID后6位+2位自增
     * t_user_bankcard.bankcard_id
     */
    private String bankcardId;

    /**
     * 用户ID
     * t_user_bankcard.user_id
     */
    private String userId;

    private String bankcardNo;

    /**
     * 银行名称，编码
     * t_user_bankcard.bank_code
     */
    private String bankCode;

    /**
     * 银行卡类型 01：借记卡（储蓄卡）  02：贷记卡（信用卡）
     * t_user_bankcard.bankcard_type
     */
    private String bankcardType;

    /**
     * 姓名
     * t_user_bankcard.name
     */
    private String name;

    private String identityNo;

    /**
     * 银行预留手机，根据银行要求决定是否需要预留手机号
     * t_user_bankcard.bankcard_mobile
     */
    private String bankcardMobile;

    /**
     * 是否有效 01：有效  02：失效
     * t_user_bankcard.status
     */
    private String status;

    /**
     * 信用卡时必填，3位安全码
     * t_user_bankcard.CVC2
     */
    private String cvc2;

    /**
     * 信用卡时填写，有效期 月
     * t_user_bankcard.bankcard_month_period
     */
    private String bankcardMonthPeriod;

    /**
     * 信用卡时填写，有效期 年
     * t_user_bankcard.bankcard_year_period
     */
    private String bankcardYearPeriod;

    /**
     * 创建时间
     * t_user_bankcard.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * t_user_bankcard.update_time
     */
    private Date updateTime;

    /**
     * TABLE： t_user_bankcard
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_bankcard.bankcard_id<br>
     * @return bankcard_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getBankcardId() {
        return bankcardId;
    }

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_bankcard.bankcard_id<br>
     * @param bankcardId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setBankcardId(String bankcardId) {
        this.bankcardId = bankcardId;
    }

    /**
     * 用户ID<br>
     *
     * column：t_user_bankcard.user_id<br>
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
     * column：t_user_bankcard.user_id<br>
     * @param userId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo;
    }

    /**
     * 银行名称，编码<br>
     *
     * column：t_user_bankcard.bank_code<br>
     * @return bank_code
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 银行名称，编码<br>
     *
     * column：t_user_bankcard.bank_code<br>
     * @param bankCode
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 银行卡类型 01：借记卡（储蓄卡）  02：贷记卡（信用卡）<br>
     *
     * column：t_user_bankcard.bankcard_type<br>
     * @return bankcard_type
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getBankcardType() {
        return bankcardType;
    }

    /**
     * 银行卡类型 01：借记卡（储蓄卡）  02：贷记卡（信用卡）<br>
     *
     * column：t_user_bankcard.bankcard_type<br>
     * @param bankcardType
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setBankcardType(String bankcardType) {
        this.bankcardType = bankcardType;
    }

    /**
     * 姓名<br>
     *
     * column：t_user_bankcard.name<br>
     * @return name
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名<br>
     *
     * column：t_user_bankcard.name<br>
     * @param name
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * 银行预留手机，根据银行要求决定是否需要预留手机号<br>
     *
     * column：t_user_bankcard.bankcard_mobile<br>
     * @return bankcard_mobile
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getBankcardMobile() {
        return bankcardMobile;
    }

    /**
     * 银行预留手机，根据银行要求决定是否需要预留手机号<br>
     *
     * column：t_user_bankcard.bankcard_mobile<br>
     * @param bankcardMobile
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setBankcardMobile(String bankcardMobile) {
        this.bankcardMobile = bankcardMobile;
    }

    /**
     * 是否有效 01：有效  02：失效<br>
     *
     * column：t_user_bankcard.status<br>
     * @return status
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getStatus() {
        return status;
    }

    /**
     * 是否有效 01：有效  02：失效<br>
     *
     * column：t_user_bankcard.status<br>
     * @param status
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 信用卡时必填，3位安全码<br>
     *
     * column：t_user_bankcard.CVC2<br>
     * @return CVC2
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getCvc2() {
        return cvc2;
    }

    /**
     * 信用卡时必填，3位安全码<br>
     *
     * column：t_user_bankcard.CVC2<br>
     * @param cvc2
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setCvc2(String cvc2) {
        this.cvc2 = cvc2;
    }

    /**
     * 信用卡时填写，有效期 月<br>
     *
     * column：t_user_bankcard.bankcard_month_period<br>
     * @return bankcard_month_period
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getBankcardMonthPeriod() {
        return bankcardMonthPeriod;
    }

    /**
     * 信用卡时填写，有效期 月<br>
     *
     * column：t_user_bankcard.bankcard_month_period<br>
     * @param bankcardMonthPeriod
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setBankcardMonthPeriod(String bankcardMonthPeriod) {
        this.bankcardMonthPeriod = bankcardMonthPeriod;
    }

    /**
     * 信用卡时填写，有效期 年<br>
     *
     * column：t_user_bankcard.bankcard_year_period<br>
     * @return bankcard_year_period
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getBankcardYearPeriod() {
        return bankcardYearPeriod;
    }

    /**
     * 信用卡时填写，有效期 年<br>
     *
     * column：t_user_bankcard.bankcard_year_period<br>
     * @param bankcardYearPeriod
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setBankcardYearPeriod(String bankcardYearPeriod) {
        this.bankcardYearPeriod = bankcardYearPeriod;
    }

    /**
     * 创建时间<br>
     *
     * column：t_user_bankcard.create_time<br>
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
     * column：t_user_bankcard.create_time<br>
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
     * column：t_user_bankcard.update_time<br>
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
     * column：t_user_bankcard.update_time<br>
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
     * TABLE： t_user_bankcard<br>
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
        UserBankcard other = (UserBankcard) that;
        return (this.getBankcardId() == null ? other.getBankcardId() == null : this.getBankcardId().equals(other.getBankcardId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBankcardNo() == null ? other.getBankcardNo() == null : this.getBankcardNo().equals(other.getBankcardNo()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankcardType() == null ? other.getBankcardType() == null : this.getBankcardType().equals(other.getBankcardType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdentityNo() == null ? other.getIdentityNo() == null : this.getIdentityNo().equals(other.getIdentityNo()))
            && (this.getBankcardMobile() == null ? other.getBankcardMobile() == null : this.getBankcardMobile().equals(other.getBankcardMobile()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCvc2() == null ? other.getCvc2() == null : this.getCvc2().equals(other.getCvc2()))
            && (this.getBankcardMonthPeriod() == null ? other.getBankcardMonthPeriod() == null : this.getBankcardMonthPeriod().equals(other.getBankcardMonthPeriod()))
            && (this.getBankcardYearPeriod() == null ? other.getBankcardYearPeriod() == null : this.getBankcardYearPeriod().equals(other.getBankcardYearPeriod()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * <br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBankcardId() == null) ? 0 : getBankcardId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBankcardNo() == null) ? 0 : getBankcardNo().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankcardType() == null) ? 0 : getBankcardType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdentityNo() == null) ? 0 : getIdentityNo().hashCode());
        result = prime * result + ((getBankcardMobile() == null) ? 0 : getBankcardMobile().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCvc2() == null) ? 0 : getCvc2().hashCode());
        result = prime * result + ((getBankcardMonthPeriod() == null) ? 0 : getBankcardMonthPeriod().hashCode());
        result = prime * result + ((getBankcardYearPeriod() == null) ? 0 : getBankcardYearPeriod().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： t_user_bankcard<br>
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
        sb.append(", bankcardId=").append(bankcardId);
        sb.append(", userId=").append(userId);
        sb.append(", bankcardNo=").append(bankcardNo);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankcardType=").append(bankcardType);
        sb.append(", name=").append(name);
        sb.append(", identityNo=").append(identityNo);
        sb.append(", bankcardMobile=").append(bankcardMobile);
        sb.append(", status=").append(status);
        sb.append(", cvc2=").append(cvc2);
        sb.append(", bankcardMonthPeriod=").append(bankcardMonthPeriod);
        sb.append(", bankcardYearPeriod=").append(bankcardYearPeriod);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}