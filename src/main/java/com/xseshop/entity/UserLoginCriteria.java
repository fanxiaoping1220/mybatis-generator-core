package com.xseshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginCriteria {
    /**
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected List<Criteria> oredCriteria;

    /**
     * TABLE： t_user_login
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer start;

    /**
     * TABLE： t_user_login
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer size;

    /**
     * <br>
     *
     * TABLE： t_user_login<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public UserLoginCriteria() {
        oredCriteria = new ArrayList<Criteria>();
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
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
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
    public String getOrderByClause() {
        return orderByClause;
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
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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
    public boolean isDistinct() {
        return distinct;
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
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
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
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
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
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
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
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
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
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
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
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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
    public void setStart(Integer start) {
        this.start = start;
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
    public Integer getStart() {
        return start;
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
    public void setSize(Integer size) {
        this.size = size;
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
    public Integer getSize() {
        return size;
    }

    /**
     * 此类为自动生成.
     * 对应的数据库表为： t_user_login
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("login_id like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("login_id not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginNoIsNull() {
            addCriterion("login_no is null");
            return (Criteria) this;
        }

        public Criteria andLoginNoIsNotNull() {
            addCriterion("login_no is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNoEqualTo(String value) {
            addCriterion("login_no =", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotEqualTo(String value) {
            addCriterion("login_no <>", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoGreaterThan(String value) {
            addCriterion("login_no >", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoGreaterThanOrEqualTo(String value) {
            addCriterion("login_no >=", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLessThan(String value) {
            addCriterion("login_no <", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLessThanOrEqualTo(String value) {
            addCriterion("login_no <=", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLike(String value) {
            addCriterion("login_no like", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotLike(String value) {
            addCriterion("login_no not like", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoIn(List<String> values) {
            addCriterion("login_no in", values, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotIn(List<String> values) {
            addCriterion("login_no not in", values, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoBetween(String value1, String value2) {
            addCriterion("login_no between", value1, value2, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotBetween(String value1, String value2) {
            addCriterion("login_no not between", value1, value2, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNull() {
            addCriterion("login_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNotNull() {
            addCriterion("login_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeEqualTo(String value) {
            addCriterion("login_type =", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotEqualTo(String value) {
            addCriterion("login_type <>", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThan(String value) {
            addCriterion("login_type >", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("login_type >=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThan(String value) {
            addCriterion("login_type <", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThanOrEqualTo(String value) {
            addCriterion("login_type <=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLike(String value) {
            addCriterion("login_type like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotLike(String value) {
            addCriterion("login_type not like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIn(List<String> values) {
            addCriterion("login_type in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotIn(List<String> values) {
            addCriterion("login_type not in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeBetween(String value1, String value2) {
            addCriterion("login_type between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotBetween(String value1, String value2) {
            addCriterion("login_type not between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIsNull() {
            addCriterion("login_token is null");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIsNotNull() {
            addCriterion("login_token is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTokenEqualTo(String value) {
            addCriterion("login_token =", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotEqualTo(String value) {
            addCriterion("login_token <>", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenGreaterThan(String value) {
            addCriterion("login_token >", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenGreaterThanOrEqualTo(String value) {
            addCriterion("login_token >=", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLessThan(String value) {
            addCriterion("login_token <", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLessThanOrEqualTo(String value) {
            addCriterion("login_token <=", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLike(String value) {
            addCriterion("login_token like", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotLike(String value) {
            addCriterion("login_token not like", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIn(List<String> values) {
            addCriterion("login_token in", values, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotIn(List<String> values) {
            addCriterion("login_token not in", values, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenBetween(String value1, String value2) {
            addCriterion("login_token between", value1, value2, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotBetween(String value1, String value2) {
            addCriterion("login_token not between", value1, value2, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNull() {
            addCriterion("login_status is null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNotNull() {
            addCriterion("login_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusEqualTo(String value) {
            addCriterion("login_status =", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotEqualTo(String value) {
            addCriterion("login_status <>", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThan(String value) {
            addCriterion("login_status >", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThanOrEqualTo(String value) {
            addCriterion("login_status >=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThan(String value) {
            addCriterion("login_status <", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThanOrEqualTo(String value) {
            addCriterion("login_status <=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLike(String value) {
            addCriterion("login_status like", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotLike(String value) {
            addCriterion("login_status not like", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIn(List<String> values) {
            addCriterion("login_status in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotIn(List<String> values) {
            addCriterion("login_status not in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusBetween(String value1, String value2) {
            addCriterion("login_status between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotBetween(String value1, String value2) {
            addCriterion("login_status not between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * 此类为自动生成.
     * 对应的数据库表为： t_user_login
     *
     * @mbg.generated 该代码为自动生成，请不要修改
     *
     * DATE: 2017-10-31 17:04
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 此类为自动生成.
     * 对应的数据库表为： t_user_login
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}