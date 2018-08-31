package com.xseshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:t_user_password
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2017-10-31 17:04
 */
public class UserPassword implements Serializable {
    /**
     * ID，8位日期+用户ID后6位+2位自增
     * t_user_password.password_id
     */
    private String passwordId;

    /**
     * 用户ID
     * t_user_password.user_id
     */
    private String userId;

    /**
     * 用户密码
     * t_user_password.user_password
     */
    private String userPassword;

    /**
     * 密码盐值
     * t_user_password.password_salt
     */
    private String passwordSalt;

    /**
     * 密码类型  01：登录密码  02：支付密码
     * t_user_password.password_type
     */
    private String passwordType;

    /**
     * 密码安全等级  01:密码强度一般  02：密码安全   03：密码强壮
     * t_user_password.password_safe_level
     */
    private String passwordSafeLevel;

    /**
     * 创建时间
     * t_user_password.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * t_user_password.update_time
     */
    private Date updateTime;

    /**
     * TABLE： t_user_password
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_password.password_id<br>
     * @return password_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getPasswordId() {
        return passwordId;
    }

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_password.password_id<br>
     * @param passwordId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setPasswordId(String passwordId) {
        this.passwordId = passwordId;
    }

    /**
     * 用户ID<br>
     *
     * column：t_user_password.user_id<br>
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
     * column：t_user_password.user_id<br>
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
     * 用户密码<br>
     *
     * column：t_user_password.user_password<br>
     * @return user_password
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 用户密码<br>
     *
     * column：t_user_password.user_password<br>
     * @param userPassword
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 密码盐值<br>
     *
     * column：t_user_password.password_salt<br>
     * @return password_salt
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**
     * 密码盐值<br>
     *
     * column：t_user_password.password_salt<br>
     * @param passwordSalt
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    /**
     * 密码类型  01：登录密码  02：支付密码<br>
     *
     * column：t_user_password.password_type<br>
     * @return password_type
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getPasswordType() {
        return passwordType;
    }

    /**
     * 密码类型  01：登录密码  02：支付密码<br>
     *
     * column：t_user_password.password_type<br>
     * @param passwordType
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setPasswordType(String passwordType) {
        this.passwordType = passwordType;
    }

    /**
     * 密码安全等级  01:密码强度一般  02：密码安全   03：密码强壮<br>
     *
     * column：t_user_password.password_safe_level<br>
     * @return password_safe_level
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getPasswordSafeLevel() {
        return passwordSafeLevel;
    }

    /**
     * 密码安全等级  01:密码强度一般  02：密码安全   03：密码强壮<br>
     *
     * column：t_user_password.password_safe_level<br>
     * @param passwordSafeLevel
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setPasswordSafeLevel(String passwordSafeLevel) {
        this.passwordSafeLevel = passwordSafeLevel;
    }

    /**
     * 创建时间<br>
     *
     * column：t_user_password.create_time<br>
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
     * column：t_user_password.create_time<br>
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
     * column：t_user_password.update_time<br>
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
     * column：t_user_password.update_time<br>
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
     * TABLE： t_user_password<br>
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
        UserPassword other = (UserPassword) that;
        return (this.getPasswordId() == null ? other.getPasswordId() == null : this.getPasswordId().equals(other.getPasswordId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getPasswordSalt() == null ? other.getPasswordSalt() == null : this.getPasswordSalt().equals(other.getPasswordSalt()))
            && (this.getPasswordType() == null ? other.getPasswordType() == null : this.getPasswordType().equals(other.getPasswordType()))
            && (this.getPasswordSafeLevel() == null ? other.getPasswordSafeLevel() == null : this.getPasswordSafeLevel().equals(other.getPasswordSafeLevel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * <br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPasswordId() == null) ? 0 : getPasswordId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getPasswordSalt() == null) ? 0 : getPasswordSalt().hashCode());
        result = prime * result + ((getPasswordType() == null) ? 0 : getPasswordType().hashCode());
        result = prime * result + ((getPasswordSafeLevel() == null) ? 0 : getPasswordSafeLevel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： t_user_password<br>
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
        sb.append(", passwordId=").append(passwordId);
        sb.append(", userId=").append(userId);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", passwordSalt=").append(passwordSalt);
        sb.append(", passwordType=").append(passwordType);
        sb.append(", passwordSafeLevel=").append(passwordSafeLevel);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}