package com.xseshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:t_user_authinfo
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2017-10-31 17:04
 */
public class UserAuthinfo implements Serializable {
    /**
     * ID，8位日期+用户ID后6位+2位自增
     * t_user_authinfo.auth_id
     */
    private String authId;

    /**
     * 用户ID
     * t_user_authinfo.useer_id
     */
    private String useerId;

    /**
     * 认证类型  01：手机认证  02：身份证  03：银行卡
     * t_user_authinfo.auth_type
     */
    private String authType;

    /**
     * 认证状态 01：待审核  02：有效  03：失效
     * t_user_authinfo.auth_status
     */
    private String authStatus;

    /**
     * 认证时间
     * t_user_authinfo.auth_time
     */
    private Date authTime;

    /**
     * 认证备注
     * t_user_authinfo.auth_remark
     */
    private String authRemark;

    /**
     * 创建时间
     * t_user_authinfo.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * t_user_authinfo.update_time
     */
    private Date updateTime;

    /**
     * TABLE： t_user_authinfo
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_authinfo.auth_id<br>
     * @return auth_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getAuthId() {
        return authId;
    }

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_authinfo.auth_id<br>
     * @param authId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setAuthId(String authId) {
        this.authId = authId;
    }

    /**
     * 用户ID<br>
     *
     * column：t_user_authinfo.useer_id<br>
     * @return useer_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUseerId() {
        return useerId;
    }

    /**
     * 用户ID<br>
     *
     * column：t_user_authinfo.useer_id<br>
     * @param useerId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUseerId(String useerId) {
        this.useerId = useerId;
    }

    /**
     * 认证类型  01：手机认证  02：身份证  03：银行卡<br>
     *
     * column：t_user_authinfo.auth_type<br>
     * @return auth_type
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * 认证类型  01：手机认证  02：身份证  03：银行卡<br>
     *
     * column：t_user_authinfo.auth_type<br>
     * @param authType
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * 认证状态 01：待审核  02：有效  03：失效<br>
     *
     * column：t_user_authinfo.auth_status<br>
     * @return auth_status
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * 认证状态 01：待审核  02：有效  03：失效<br>
     *
     * column：t_user_authinfo.auth_status<br>
     * @param authStatus
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * 认证时间<br>
     *
     * column：t_user_authinfo.auth_time<br>
     * @return auth_time
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public Date getAuthTime() {
        return authTime;
    }

    /**
     * 认证时间<br>
     *
     * column：t_user_authinfo.auth_time<br>
     * @param authTime
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    /**
     * 认证备注<br>
     *
     * column：t_user_authinfo.auth_remark<br>
     * @return auth_remark
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getAuthRemark() {
        return authRemark;
    }

    /**
     * 认证备注<br>
     *
     * column：t_user_authinfo.auth_remark<br>
     * @param authRemark
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setAuthRemark(String authRemark) {
        this.authRemark = authRemark;
    }

    /**
     * 创建时间<br>
     *
     * column：t_user_authinfo.create_time<br>
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
     * column：t_user_authinfo.create_time<br>
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
     * column：t_user_authinfo.update_time<br>
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
     * column：t_user_authinfo.update_time<br>
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
     * TABLE： t_user_authinfo<br>
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
        UserAuthinfo other = (UserAuthinfo) that;
        return (this.getAuthId() == null ? other.getAuthId() == null : this.getAuthId().equals(other.getAuthId()))
            && (this.getUseerId() == null ? other.getUseerId() == null : this.getUseerId().equals(other.getUseerId()))
            && (this.getAuthType() == null ? other.getAuthType() == null : this.getAuthType().equals(other.getAuthType()))
            && (this.getAuthStatus() == null ? other.getAuthStatus() == null : this.getAuthStatus().equals(other.getAuthStatus()))
            && (this.getAuthTime() == null ? other.getAuthTime() == null : this.getAuthTime().equals(other.getAuthTime()))
            && (this.getAuthRemark() == null ? other.getAuthRemark() == null : this.getAuthRemark().equals(other.getAuthRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * <br>
     *
     * TABLE： t_user_authinfo<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthId() == null) ? 0 : getAuthId().hashCode());
        result = prime * result + ((getUseerId() == null) ? 0 : getUseerId().hashCode());
        result = prime * result + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        result = prime * result + ((getAuthStatus() == null) ? 0 : getAuthStatus().hashCode());
        result = prime * result + ((getAuthTime() == null) ? 0 : getAuthTime().hashCode());
        result = prime * result + ((getAuthRemark() == null) ? 0 : getAuthRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： t_user_authinfo<br>
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
        sb.append(", authId=").append(authId);
        sb.append(", useerId=").append(useerId);
        sb.append(", authType=").append(authType);
        sb.append(", authStatus=").append(authStatus);
        sb.append(", authTime=").append(authTime);
        sb.append(", authRemark=").append(authRemark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}