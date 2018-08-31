package com.xseshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:t_user
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2017-10-31 17:04
 */
public class User implements Serializable {
    /**
     * 用户ID,8位日期+六位随机数
     * t_user.user_id
     */
    private String userId;

    /**
     * 用户名 注册时默认为注册手机号,若用户修改展示昵称,则为昵称
     * t_user.user_name
     */
    private String userName;

    /**
     * 绑定手机号
     * t_user.user_mobile
     */
    private String userMobile;

    /**
     * 邮箱
     * t_user.user_email
     */
    private String userEmail;

    /**
     * 用户头像，存储头像图片地址
     * t_user.user_via
     */
    private String userVia;

    /**
     * 用户状态
     * t_user.user_status
     */
    private String userStatus;

    /**
     * 用户等级  01:1级，为之后用户增加等级功能预留，目前所有用户默认1级
     * t_user.user_level
     */
    private String userLevel;

    /**
     * 用户安全等级  01：手机号验证  02：身份证验证  03：银行卡验证
已验证过的用户，删除认证信息时，不降级
     * t_user.user_safe_level
     */
    private String userSafeLevel;

    /**
     * 最后登录时间
     * t_user.last_login_time
     */
    private Date lastLoginTime;

    /**
     * 创建时间
     * t_user.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * t_user.update_time
     */
    private Date updateTime;

    /**
     * TABLE： t_user
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID,8位日期+六位随机数<br>
     *
     * column：t_user.user_id<br>
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
     * 用户ID,8位日期+六位随机数<br>
     *
     * column：t_user.user_id<br>
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
     * 用户名 注册时默认为注册手机号,若用户修改展示昵称,则为昵称<br>
     *
     * column：t_user.user_name<br>
     * @return user_name
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名 注册时默认为注册手机号,若用户修改展示昵称,则为昵称<br>
     *
     * column：t_user.user_name<br>
     * @param userName
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 绑定手机号<br>
     *
     * column：t_user.user_mobile<br>
     * @return user_mobile
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 绑定手机号<br>
     *
     * column：t_user.user_mobile<br>
     * @param userMobile
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    /**
     * 邮箱<br>
     *
     * column：t_user.user_email<br>
     * @return user_email
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 邮箱<br>
     *
     * column：t_user.user_email<br>
     * @param userEmail
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 用户头像，存储头像图片地址<br>
     *
     * column：t_user.user_via<br>
     * @return user_via
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserVia() {
        return userVia;
    }

    /**
     * 用户头像，存储头像图片地址<br>
     *
     * column：t_user.user_via<br>
     * @param userVia
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserVia(String userVia) {
        this.userVia = userVia;
    }

    /**
     * 用户状态<br>
     *
     * column：t_user.user_status<br>
     * @return user_status
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 用户状态<br>
     *
     * column：t_user.user_status<br>
     * @param userStatus
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 用户等级  01:1级，为之后用户增加等级功能预留，目前所有用户默认1级<br>
     *
     * column：t_user.user_level<br>
     * @return user_level
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * 用户等级  01:1级，为之后用户增加等级功能预留，目前所有用户默认1级<br>
     *
     * column：t_user.user_level<br>
     * @param userLevel
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 用户安全等级  01：手机号验证  02：身份证验证  03：银行卡验证
已验证过的用户，删除认证信息时，不降级<br>
     *
     * column：t_user.user_safe_level<br>
     * @return user_safe_level
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getUserSafeLevel() {
        return userSafeLevel;
    }

    /**
     * 用户安全等级  01：手机号验证  02：身份证验证  03：银行卡验证
已验证过的用户，删除认证信息时，不降级<br>
     *
     * column：t_user.user_safe_level<br>
     * @param userSafeLevel
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setUserSafeLevel(String userSafeLevel) {
        this.userSafeLevel = userSafeLevel;
    }

    /**
     * 最后登录时间<br>
     *
     * column：t_user.last_login_time<br>
     * @return last_login_time
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 最后登录时间<br>
     *
     * column：t_user.last_login_time<br>
     * @param lastLoginTime
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 创建时间<br>
     *
     * column：t_user.create_time<br>
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
     * column：t_user.create_time<br>
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
     * column：t_user.update_time<br>
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
     * column：t_user.update_time<br>
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
     * TABLE： t_user<br>
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserVia() == null ? other.getUserVia() == null : this.getUserVia().equals(other.getUserVia()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getUserSafeLevel() == null ? other.getUserSafeLevel() == null : this.getUserSafeLevel().equals(other.getUserSafeLevel()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * <br>
     *
     * TABLE： t_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserVia() == null) ? 0 : getUserVia().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getUserSafeLevel() == null) ? 0 : getUserSafeLevel().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： t_user<br>
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
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userVia=").append(userVia);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", userSafeLevel=").append(userSafeLevel);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}