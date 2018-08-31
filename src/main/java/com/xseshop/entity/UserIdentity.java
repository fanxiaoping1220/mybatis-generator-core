package com.xseshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:t_user_identity
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2017-10-31 17:04
 */
public class UserIdentity implements Serializable {
    /**
     * ID，8位日期+用户ID后6位+2位自增
     * t_user_identity.identity_id
     */
    private String identityId;

    /**
     * 用户ID
     * t_user_identity.user_id
     */
    private String userId;

    /**
     * 证件类型 01：身份证  02：军官证  03：护照  04：港澳台通行证
     * t_user_identity.identity_type
     */
    private String identityType;

    /**
     * 证件状态  01：有效 02：失效
     * t_user_identity.identity_status
     */
    private String identityStatus;

    /**
     * 姓名
     * t_user_identity.name
     */
    private String name;

    /**
     * 证件号
     * t_user_identity.identity_no
     */
    private String identityNo;

    /**
     * 证件起始时间
     * t_user_identity.identity_start_time
     */
    private Date identityStartTime;

    /**
     * 证件到期时间
     * t_user_identity.identity_end_time
     */
    private Date identityEndTime;

    /**
     * 创建时间
     * t_user_identity.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * t_user_identity.update_time
     */
    private Date updateTime;

    /**
     * TABLE： t_user_identity
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_identity.identity_id<br>
     * @return identity_id
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * ID，8位日期+用户ID后6位+2位自增<br>
     *
     * column：t_user_identity.identity_id<br>
     * @param identityId
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * 用户ID<br>
     *
     * column：t_user_identity.user_id<br>
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
     * column：t_user_identity.user_id<br>
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
     * 证件类型 01：身份证  02：军官证  03：护照  04：港澳台通行证<br>
     *
     * column：t_user_identity.identity_type<br>
     * @return identity_type
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * 证件类型 01：身份证  02：军官证  03：护照  04：港澳台通行证<br>
     *
     * column：t_user_identity.identity_type<br>
     * @param identityType
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * 证件状态  01：有效 02：失效<br>
     *
     * column：t_user_identity.identity_status<br>
     * @return identity_status
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getIdentityStatus() {
        return identityStatus;
    }

    /**
     * 证件状态  01：有效 02：失效<br>
     *
     * column：t_user_identity.identity_status<br>
     * @param identityStatus
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setIdentityStatus(String identityStatus) {
        this.identityStatus = identityStatus;
    }

    /**
     * 姓名<br>
     *
     * column：t_user_identity.name<br>
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
     * column：t_user_identity.name<br>
     * @param name
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 证件号<br>
     *
     * column：t_user_identity.identity_no<br>
     * @return identity_no
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * 证件号<br>
     *
     * column：t_user_identity.identity_no<br>
     * @param identityNo
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * 证件起始时间<br>
     *
     * column：t_user_identity.identity_start_time<br>
     * @return identity_start_time
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public Date getIdentityStartTime() {
        return identityStartTime;
    }

    /**
     * 证件起始时间<br>
     *
     * column：t_user_identity.identity_start_time<br>
     * @param identityStartTime
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setIdentityStartTime(Date identityStartTime) {
        this.identityStartTime = identityStartTime;
    }

    /**
     * 证件到期时间<br>
     *
     * column：t_user_identity.identity_end_time<br>
     * @return identity_end_time
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public Date getIdentityEndTime() {
        return identityEndTime;
    }

    /**
     * 证件到期时间<br>
     *
     * column：t_user_identity.identity_end_time<br>
     * @param identityEndTime
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public void setIdentityEndTime(Date identityEndTime) {
        this.identityEndTime = identityEndTime;
    }

    /**
     * 创建时间<br>
     *
     * column：t_user_identity.create_time<br>
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
     * column：t_user_identity.create_time<br>
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
     * column：t_user_identity.update_time<br>
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
     * column：t_user_identity.update_time<br>
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
     * TABLE： t_user_identity<br>
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
        UserIdentity other = (UserIdentity) that;
        return (this.getIdentityId() == null ? other.getIdentityId() == null : this.getIdentityId().equals(other.getIdentityId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getIdentityType() == null ? other.getIdentityType() == null : this.getIdentityType().equals(other.getIdentityType()))
            && (this.getIdentityStatus() == null ? other.getIdentityStatus() == null : this.getIdentityStatus().equals(other.getIdentityStatus()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdentityNo() == null ? other.getIdentityNo() == null : this.getIdentityNo().equals(other.getIdentityNo()))
            && (this.getIdentityStartTime() == null ? other.getIdentityStartTime() == null : this.getIdentityStartTime().equals(other.getIdentityStartTime()))
            && (this.getIdentityEndTime() == null ? other.getIdentityEndTime() == null : this.getIdentityEndTime().equals(other.getIdentityEndTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * <br>
     *
     * TABLE： t_user_identity<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        result = prime * result + ((getIdentityStatus() == null) ? 0 : getIdentityStatus().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdentityNo() == null) ? 0 : getIdentityNo().hashCode());
        result = prime * result + ((getIdentityStartTime() == null) ? 0 : getIdentityStartTime().hashCode());
        result = prime * result + ((getIdentityEndTime() == null) ? 0 : getIdentityEndTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： t_user_identity<br>
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
        sb.append(", identityId=").append(identityId);
        sb.append(", userId=").append(userId);
        sb.append(", identityType=").append(identityType);
        sb.append(", identityStatus=").append(identityStatus);
        sb.append(", name=").append(name);
        sb.append(", identityNo=").append(identityNo);
        sb.append(", identityStartTime=").append(identityStartTime);
        sb.append(", identityEndTime=").append(identityEndTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}