package com.xseshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPasswordCriteria {
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
     * TABLE： t_user_password
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer start;

    /**
     * TABLE： t_user_password
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer size;

    /**
     * <br>
     *
     * TABLE： t_user_password<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public UserPasswordCriteria() {
        oredCriteria = new ArrayList<Criteria>();
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
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
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
    public String getOrderByClause() {
        return orderByClause;
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
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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
    public boolean isDistinct() {
        return distinct;
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
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
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
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
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
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
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
     * TABLE： t_user_password<br>
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
     * TABLE： t_user_password<br>
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
     * TABLE： t_user_password<br>
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
     * TABLE： t_user_password<br>
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
     * TABLE： t_user_password<br>
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
     * TABLE： t_user_password<br>
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
     * 对应的数据库表为： t_user_password
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

        public Criteria andPasswordIdIsNull() {
            addCriterion("password_id is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIdIsNotNull() {
            addCriterion("password_id is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordIdEqualTo(String value) {
            addCriterion("password_id =", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdNotEqualTo(String value) {
            addCriterion("password_id <>", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdGreaterThan(String value) {
            addCriterion("password_id >", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdGreaterThanOrEqualTo(String value) {
            addCriterion("password_id >=", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdLessThan(String value) {
            addCriterion("password_id <", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdLessThanOrEqualTo(String value) {
            addCriterion("password_id <=", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdLike(String value) {
            addCriterion("password_id like", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdNotLike(String value) {
            addCriterion("password_id not like", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdIn(List<String> values) {
            addCriterion("password_id in", values, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdNotIn(List<String> values) {
            addCriterion("password_id not in", values, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdBetween(String value1, String value2) {
            addCriterion("password_id between", value1, value2, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdNotBetween(String value1, String value2) {
            addCriterion("password_id not between", value1, value2, "passwordId");
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

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNull() {
            addCriterion("password_salt is null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNotNull() {
            addCriterion("password_salt is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltEqualTo(String value) {
            addCriterion("password_salt =", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotEqualTo(String value) {
            addCriterion("password_salt <>", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThan(String value) {
            addCriterion("password_salt >", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThanOrEqualTo(String value) {
            addCriterion("password_salt >=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThan(String value) {
            addCriterion("password_salt <", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThanOrEqualTo(String value) {
            addCriterion("password_salt <=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLike(String value) {
            addCriterion("password_salt like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotLike(String value) {
            addCriterion("password_salt not like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIn(List<String> values) {
            addCriterion("password_salt in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotIn(List<String> values) {
            addCriterion("password_salt not in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltBetween(String value1, String value2) {
            addCriterion("password_salt between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotBetween(String value1, String value2) {
            addCriterion("password_salt not between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeIsNull() {
            addCriterion("password_type is null");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeIsNotNull() {
            addCriterion("password_type is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeEqualTo(String value) {
            addCriterion("password_type =", value, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeNotEqualTo(String value) {
            addCriterion("password_type <>", value, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeGreaterThan(String value) {
            addCriterion("password_type >", value, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("password_type >=", value, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeLessThan(String value) {
            addCriterion("password_type <", value, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeLessThanOrEqualTo(String value) {
            addCriterion("password_type <=", value, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeLike(String value) {
            addCriterion("password_type like", value, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeNotLike(String value) {
            addCriterion("password_type not like", value, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeIn(List<String> values) {
            addCriterion("password_type in", values, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeNotIn(List<String> values) {
            addCriterion("password_type not in", values, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeBetween(String value1, String value2) {
            addCriterion("password_type between", value1, value2, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordTypeNotBetween(String value1, String value2) {
            addCriterion("password_type not between", value1, value2, "passwordType");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelIsNull() {
            addCriterion("password_safe_level is null");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelIsNotNull() {
            addCriterion("password_safe_level is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelEqualTo(String value) {
            addCriterion("password_safe_level =", value, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelNotEqualTo(String value) {
            addCriterion("password_safe_level <>", value, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelGreaterThan(String value) {
            addCriterion("password_safe_level >", value, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelGreaterThanOrEqualTo(String value) {
            addCriterion("password_safe_level >=", value, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelLessThan(String value) {
            addCriterion("password_safe_level <", value, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelLessThanOrEqualTo(String value) {
            addCriterion("password_safe_level <=", value, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelLike(String value) {
            addCriterion("password_safe_level like", value, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelNotLike(String value) {
            addCriterion("password_safe_level not like", value, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelIn(List<String> values) {
            addCriterion("password_safe_level in", values, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelNotIn(List<String> values) {
            addCriterion("password_safe_level not in", values, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelBetween(String value1, String value2) {
            addCriterion("password_safe_level between", value1, value2, "passwordSafeLevel");
            return (Criteria) this;
        }

        public Criteria andPasswordSafeLevelNotBetween(String value1, String value2) {
            addCriterion("password_safe_level not between", value1, value2, "passwordSafeLevel");
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
     * 对应的数据库表为： t_user_password
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
     * 对应的数据库表为： t_user_password
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