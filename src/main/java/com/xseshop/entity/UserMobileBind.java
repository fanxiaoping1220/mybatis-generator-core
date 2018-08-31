package com.xseshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:t_user_mobile_bind
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2017-10-31 17:04
 */
public class UserMobileBind implements Serializable {
    /**
     * ID，8位日期+用户ID后6位+2位自增
     * t_user_mobile_bind.mobile_bind_id
     */
    private String mobileBindId;

    /**
     * 用户ID
     * t_user_mobile_bind.user_id
     */
    private String userId;

    /**
     * 用户绑定手机
     * t_user_mobile_bind.mobile_no
     */
    private String mobileNo;

    /**
     * 绑定状态 01：有效  02：失效
     * t_user_mobile_bind.bind_status
     */
    private String bindStatus;

    /**
     * 创建时间
     * t_user_mobile_bind.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * t_user_mobile_bind.update_time
     */
    private Date updateTime;

    /**
     * TABLE： t_user_mobile_bind
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_mobile_bind.mobile_bind_id<br>
     * @return mobile_bind_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getMobileBindId() {
        return mobileBindId;
    }

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_mobile_bind.mobile_bind_id<br>
     * @param mobileBindId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setMobileBindId(String mobileBindId) {
        this.mobileBindId = mobileBindId;
    }

    /**
     * 用户ID<br>
     *
     * column：t_user_mobile_bind.user_id<br>
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
     * column：t_user_mobile_bind.user_id<br>
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
     * 用户绑定手机<br>
     *
     * column：t_user_mobile_bind.mobile_no<br>
     * @return mobile_no
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 用户绑定手机<br>
     *
     * column：t_user_mobile_bind.mobile_no<br>
     * @param mobileNo
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 绑定状态 01：有效  02：失效<br>
     *
     * column：t_user_mobile_bind.bind_status<br>
     * @return bind_status
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getBindStatus() {
        return bindStatus;
    }

    /**
     * 绑定状态 01：有效  02：失效<br>
     *
     * column：t_user_mobile_bind.bind_status<br>
     * @param bindStatus
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
    }

    /**
     * 创建时间<br>
     *
     * column：t_user_mobile_bind.create_time<br>
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
     * column：t_user_mobile_bind.create_time<br>
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
     * column：t_user_mobile_bind.update_time<br>
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
     * column：t_user_mobile_bind.update_time<br>
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
     * TABLE： t_user_mobile_bind<br>
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
        UserMobileBind other = (UserMobileBind) that;
        return (this.getMobileBindId() == null ? other.getMobileBindId() == null : this.getMobileBindId().equals(other.getMobileBindId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMobileNo() == null ? other.getMobileNo() == null : this.getMobileNo().equals(other.getMobileNo()))
            && (this.getBindStatus() == null ? other.getBindStatus() == null : this.getBindStatus().equals(other.getBindStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * <br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMobileBindId() == null) ? 0 : getMobileBindId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMobileNo() == null) ? 0 : getMobileNo().hashCode());
        result = prime * result + ((getBindStatus() == null) ? 0 : getBindStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： t_user_mobile_bind<br>
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
        sb.append(", mobileBindId=").append(mobileBindId);
        sb.append(", userId=").append(userId);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", bindStatus=").append(bindStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}