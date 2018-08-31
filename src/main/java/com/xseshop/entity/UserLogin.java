package com.xseshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:t_user_login
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2017-10-31 17:04
 */
public class UserLogin implements Serializable {
    /**
     * 用户登录方式ID，8位日期+用户号后6位+2位自增
     * t_user_login.login_id
     */
    private String loginId;

    /**
     * 用户ID，关联用户表ID
     * t_user_login.user_id
     */
    private String userId;

    /**
     * 用户登录账号
     * t_user_login.login_no
     */
    private String loginNo;

    /**
     * 登录方式类型  01：手机号  02：邮箱  03：用户名  04：微信  05：支付宝
     * t_user_login.login_type
     */
    private String loginType;

    /**
     * 第三方登录时令牌
     * t_user_login.login_token
     */
    private String loginToken;

    /**
     * 用户登录方式 状态
     * t_user_login.login_status
     */
    private String loginStatus;

    /**
     * 最后登录时间
     * t_user_login.last_login_time
     */
    private Date lastLoginTime;

    /**
     * 创建时间
     * t_user_login.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * t_user_login.update_time
     */
    private Date updateTime;

    /**
     * TABLE： t_user_login
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户登录方式ID，8位日期+用户号后6位+2位自增<br>
     *
     * column：t_user_login.login_id<br>
     * @return login_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 用户登录方式ID，8位日期+用户号后6位+2位自增<br>
     *
     * column：t_user_login.login_id<br>
     * @param loginId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 用户ID，关联用户表ID<br>
     *
     * column：t_user_login.user_id<br>
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
     * 用户ID，关联用户表ID<br>
     *
     * column：t_user_login.user_id<br>
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
     * 用户登录账号<br>
     *
     * column：t_user_login.login_no<br>
     * @return login_no
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getLoginNo() {
        return loginNo;
    }

    /**
     * 用户登录账号<br>
     *
     * column：t_user_login.login_no<br>
     * @param loginNo
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo;
    }

    /**
     * 登录方式类型  01：手机号  02：邮箱  03：用户名  04：微信  05：支付宝<br>
     *
     * column：t_user_login.login_type<br>
     * @return login_type
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getLoginType() {
        return loginType;
    }

    /**
     * 登录方式类型  01：手机号  02：邮箱  03：用户名  04：微信  05：支付宝<br>
     *
     * column：t_user_login.login_type<br>
     * @param loginType
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    /**
     * 第三方登录时令牌<br>
     *
     * column：t_user_login.login_token<br>
     * @return login_token
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getLoginToken() {
        return loginToken;
    }

    /**
     * 第三方登录时令牌<br>
     *
     * column：t_user_login.login_token<br>
     * @param loginToken
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    /**
     * 用户登录方式 状态<br>
     *
     * column：t_user_login.login_status<br>
     * @return login_status
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getLoginStatus() {
        return loginStatus;
    }

    /**
     * 用户登录方式 状态<br>
     *
     * column：t_user_login.login_status<br>
     * @param loginStatus
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    /**
     * 最后登录时间<br>
     *
     * column：t_user_login.last_login_time<br>
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
     * column：t_user_login.last_login_time<br>
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
     * column：t_user_login.create_time<br>
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
     * column：t_user_login.create_time<br>
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
     * column：t_user_login.update_time<br>
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
     * column：t_user_login.update_time<br>
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
     * TABLE： t_user_login<br>
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
        UserLogin other = (UserLogin) that;
        return (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getLoginNo() == null ? other.getLoginNo() == null : this.getLoginNo().equals(other.getLoginNo()))
            && (this.getLoginType() == null ? other.getLoginType() == null : this.getLoginType().equals(other.getLoginType()))
            && (this.getLoginToken() == null ? other.getLoginToken() == null : this.getLoginToken().equals(other.getLoginToken()))
            && (this.getLoginStatus() == null ? other.getLoginStatus() == null : this.getLoginStatus().equals(other.getLoginStatus()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * <br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getLoginNo() == null) ? 0 : getLoginNo().hashCode());
        result = prime * result + ((getLoginType() == null) ? 0 : getLoginType().hashCode());
        result = prime * result + ((getLoginToken() == null) ? 0 : getLoginToken().hashCode());
        result = prime * result + ((getLoginStatus() == null) ? 0 : getLoginStatus().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： t_user_login<br>
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
        sb.append(", loginId=").append(loginId);
        sb.append(", userId=").append(userId);
        sb.append(", loginNo=").append(loginNo);
        sb.append(", loginType=").append(loginType);
        sb.append(", loginToken=").append(loginToken);
        sb.append(", loginStatus=").append(loginStatus);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}