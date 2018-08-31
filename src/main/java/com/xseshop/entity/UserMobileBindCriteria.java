package com.xseshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMobileBindCriteria {
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
     * TABLE： t_user_mobile_bind
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer start;

    /**
     * TABLE： t_user_mobile_bind
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer size;

    /**
     * <br>
     *
     * TABLE： t_user_mobile_bind<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public UserMobileBindCriteria() {
        oredCriteria = new ArrayList<Criteria>();
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
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
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
    public String getOrderByClause() {
        return orderByClause;
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
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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
    public boolean isDistinct() {
        return distinct;
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
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
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
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
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
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
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
     * TABLE： t_user_mobile_bind<br>
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
     * TABLE： t_user_mobile_bind<br>
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
     * TABLE： t_user_mobile_bind<br>
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
     * TABLE： t_user_mobile_bind<br>
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
     * TABLE： t_user_mobile_bind<br>
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
     * TABLE： t_user_mobile_bind<br>
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
     * 对应的数据库表为： t_user_mobile_bind
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

        public Criteria andMobileBindIdIsNull() {
            addCriterion("mobile_bind_id is null");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdIsNotNull() {
            addCriterion("mobile_bind_id is not null");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdEqualTo(String value) {
            addCriterion("mobile_bind_id =", value, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdNotEqualTo(String value) {
            addCriterion("mobile_bind_id <>", value, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdGreaterThan(String value) {
            addCriterion("mobile_bind_id >", value, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_bind_id >=", value, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdLessThan(String value) {
            addCriterion("mobile_bind_id <", value, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdLessThanOrEqualTo(String value) {
            addCriterion("mobile_bind_id <=", value, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdLike(String value) {
            addCriterion("mobile_bind_id like", value, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdNotLike(String value) {
            addCriterion("mobile_bind_id not like", value, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdIn(List<String> values) {
            addCriterion("mobile_bind_id in", values, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdNotIn(List<String> values) {
            addCriterion("mobile_bind_id not in", values, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdBetween(String value1, String value2) {
            addCriterion("mobile_bind_id between", value1, value2, "mobileBindId");
            return (Criteria) this;
        }

        public Criteria andMobileBindIdNotBetween(String value1, String value2) {
            addCriterion("mobile_bind_id not between", value1, value2, "mobileBindId");
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

        public Criteria andMobileNoIsNull() {
            addCriterion("mobile_no is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("mobile_no is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("mobile_no =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("mobile_no <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("mobile_no >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("mobile_no <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("mobile_no <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("mobile_no like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("mobile_no not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("mobile_no in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("mobile_no not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("mobile_no between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("mobile_no not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andBindStatusIsNull() {
            addCriterion("bind_status is null");
            return (Criteria) this;
        }

        public Criteria andBindStatusIsNotNull() {
            addCriterion("bind_status is not null");
            return (Criteria) this;
        }

        public Criteria andBindStatusEqualTo(String value) {
            addCriterion("bind_status =", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotEqualTo(String value) {
            addCriterion("bind_status <>", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusGreaterThan(String value) {
            addCriterion("bind_status >", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bind_status >=", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusLessThan(String value) {
            addCriterion("bind_status <", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusLessThanOrEqualTo(String value) {
            addCriterion("bind_status <=", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusLike(String value) {
            addCriterion("bind_status like", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotLike(String value) {
            addCriterion("bind_status not like", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusIn(List<String> values) {
            addCriterion("bind_status in", values, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotIn(List<String> values) {
            addCriterion("bind_status not in", values, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusBetween(String value1, String value2) {
            addCriterion("bind_status between", value1, value2, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotBetween(String value1, String value2) {
            addCriterion("bind_status not between", value1, value2, "bindStatus");
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
     * 对应的数据库表为： t_user_mobile_bind
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
     * 对应的数据库表为： t_user_mobile_bind
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