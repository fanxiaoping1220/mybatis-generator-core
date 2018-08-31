package com.xseshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBankcardCriteria {
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
     * TABLE： t_user_bankcard
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer start;

    /**
     * TABLE： t_user_bankcard
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer size;

    /**
     * <br>
     *
     * TABLE： t_user_bankcard<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public UserBankcardCriteria() {
        oredCriteria = new ArrayList<Criteria>();
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
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
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
    public String getOrderByClause() {
        return orderByClause;
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
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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
    public boolean isDistinct() {
        return distinct;
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
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
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
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
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
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
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
     * TABLE： t_user_bankcard<br>
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
     * TABLE： t_user_bankcard<br>
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
     * TABLE： t_user_bankcard<br>
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
     * TABLE： t_user_bankcard<br>
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
     * TABLE： t_user_bankcard<br>
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
     * TABLE： t_user_bankcard<br>
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
     * 对应的数据库表为： t_user_bankcard
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

        public Criteria andBankcardIdIsNull() {
            addCriterion("bankcard_id is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIdIsNotNull() {
            addCriterion("bankcard_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardIdEqualTo(String value) {
            addCriterion("bankcard_id =", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotEqualTo(String value) {
            addCriterion("bankcard_id <>", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdGreaterThan(String value) {
            addCriterion("bankcard_id >", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_id >=", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLessThan(String value) {
            addCriterion("bankcard_id <", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLessThanOrEqualTo(String value) {
            addCriterion("bankcard_id <=", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLike(String value) {
            addCriterion("bankcard_id like", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotLike(String value) {
            addCriterion("bankcard_id not like", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdIn(List<String> values) {
            addCriterion("bankcard_id in", values, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotIn(List<String> values) {
            addCriterion("bankcard_id not in", values, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdBetween(String value1, String value2) {
            addCriterion("bankcard_id between", value1, value2, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotBetween(String value1, String value2) {
            addCriterion("bankcard_id not between", value1, value2, "bankcardId");
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

        public Criteria andBankcardNoIsNull() {
            addCriterion("bankcard_no is null");
            return (Criteria) this;
        }

        public Criteria andBankcardNoIsNotNull() {
            addCriterion("bankcard_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardNoEqualTo(String value) {
            addCriterion("bankcard_no =", value, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoNotEqualTo(String value) {
            addCriterion("bankcard_no <>", value, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoGreaterThan(String value) {
            addCriterion("bankcard_no >", value, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_no >=", value, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoLessThan(String value) {
            addCriterion("bankcard_no <", value, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoLessThanOrEqualTo(String value) {
            addCriterion("bankcard_no <=", value, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoLike(String value) {
            addCriterion("bankcard_no like", value, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoNotLike(String value) {
            addCriterion("bankcard_no not like", value, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoIn(List<String> values) {
            addCriterion("bankcard_no in", values, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoNotIn(List<String> values) {
            addCriterion("bankcard_no not in", values, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoBetween(String value1, String value2) {
            addCriterion("bankcard_no between", value1, value2, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankcardNoNotBetween(String value1, String value2) {
            addCriterion("bankcard_no not between", value1, value2, "bankcardNo");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeIsNull() {
            addCriterion("bankcard_type is null");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeIsNotNull() {
            addCriterion("bankcard_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeEqualTo(String value) {
            addCriterion("bankcard_type =", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeNotEqualTo(String value) {
            addCriterion("bankcard_type <>", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeGreaterThan(String value) {
            addCriterion("bankcard_type >", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_type >=", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeLessThan(String value) {
            addCriterion("bankcard_type <", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeLessThanOrEqualTo(String value) {
            addCriterion("bankcard_type <=", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeLike(String value) {
            addCriterion("bankcard_type like", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeNotLike(String value) {
            addCriterion("bankcard_type not like", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeIn(List<String> values) {
            addCriterion("bankcard_type in", values, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeNotIn(List<String> values) {
            addCriterion("bankcard_type not in", values, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeBetween(String value1, String value2) {
            addCriterion("bankcard_type between", value1, value2, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeNotBetween(String value1, String value2) {
            addCriterion("bankcard_type not between", value1, value2, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIsNull() {
            addCriterion("identity_no is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIsNotNull() {
            addCriterion("identity_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNoEqualTo(String value) {
            addCriterion("identity_no =", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotEqualTo(String value) {
            addCriterion("identity_no <>", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoGreaterThan(String value) {
            addCriterion("identity_no >", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoGreaterThanOrEqualTo(String value) {
            addCriterion("identity_no >=", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLessThan(String value) {
            addCriterion("identity_no <", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLessThanOrEqualTo(String value) {
            addCriterion("identity_no <=", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLike(String value) {
            addCriterion("identity_no like", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotLike(String value) {
            addCriterion("identity_no not like", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIn(List<String> values) {
            addCriterion("identity_no in", values, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotIn(List<String> values) {
            addCriterion("identity_no not in", values, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoBetween(String value1, String value2) {
            addCriterion("identity_no between", value1, value2, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotBetween(String value1, String value2) {
            addCriterion("identity_no not between", value1, value2, "identityNo");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileIsNull() {
            addCriterion("bankcard_mobile is null");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileIsNotNull() {
            addCriterion("bankcard_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileEqualTo(String value) {
            addCriterion("bankcard_mobile =", value, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileNotEqualTo(String value) {
            addCriterion("bankcard_mobile <>", value, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileGreaterThan(String value) {
            addCriterion("bankcard_mobile >", value, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_mobile >=", value, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileLessThan(String value) {
            addCriterion("bankcard_mobile <", value, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileLessThanOrEqualTo(String value) {
            addCriterion("bankcard_mobile <=", value, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileLike(String value) {
            addCriterion("bankcard_mobile like", value, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileNotLike(String value) {
            addCriterion("bankcard_mobile not like", value, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileIn(List<String> values) {
            addCriterion("bankcard_mobile in", values, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileNotIn(List<String> values) {
            addCriterion("bankcard_mobile not in", values, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileBetween(String value1, String value2) {
            addCriterion("bankcard_mobile between", value1, value2, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andBankcardMobileNotBetween(String value1, String value2) {
            addCriterion("bankcard_mobile not between", value1, value2, "bankcardMobile");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCvc2IsNull() {
            addCriterion("CVC2 is null");
            return (Criteria) this;
        }

        public Criteria andCvc2IsNotNull() {
            addCriterion("CVC2 is not null");
            return (Criteria) this;
        }

        public Criteria andCvc2EqualTo(String value) {
            addCriterion("CVC2 =", value, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2NotEqualTo(String value) {
            addCriterion("CVC2 <>", value, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2GreaterThan(String value) {
            addCriterion("CVC2 >", value, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2GreaterThanOrEqualTo(String value) {
            addCriterion("CVC2 >=", value, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2LessThan(String value) {
            addCriterion("CVC2 <", value, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2LessThanOrEqualTo(String value) {
            addCriterion("CVC2 <=", value, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2Like(String value) {
            addCriterion("CVC2 like", value, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2NotLike(String value) {
            addCriterion("CVC2 not like", value, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2In(List<String> values) {
            addCriterion("CVC2 in", values, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2NotIn(List<String> values) {
            addCriterion("CVC2 not in", values, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2Between(String value1, String value2) {
            addCriterion("CVC2 between", value1, value2, "cvc2");
            return (Criteria) this;
        }

        public Criteria andCvc2NotBetween(String value1, String value2) {
            addCriterion("CVC2 not between", value1, value2, "cvc2");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodIsNull() {
            addCriterion("bankcard_month_period is null");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodIsNotNull() {
            addCriterion("bankcard_month_period is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodEqualTo(String value) {
            addCriterion("bankcard_month_period =", value, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodNotEqualTo(String value) {
            addCriterion("bankcard_month_period <>", value, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodGreaterThan(String value) {
            addCriterion("bankcard_month_period >", value, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_month_period >=", value, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodLessThan(String value) {
            addCriterion("bankcard_month_period <", value, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodLessThanOrEqualTo(String value) {
            addCriterion("bankcard_month_period <=", value, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodLike(String value) {
            addCriterion("bankcard_month_period like", value, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodNotLike(String value) {
            addCriterion("bankcard_month_period not like", value, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodIn(List<String> values) {
            addCriterion("bankcard_month_period in", values, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodNotIn(List<String> values) {
            addCriterion("bankcard_month_period not in", values, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodBetween(String value1, String value2) {
            addCriterion("bankcard_month_period between", value1, value2, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardMonthPeriodNotBetween(String value1, String value2) {
            addCriterion("bankcard_month_period not between", value1, value2, "bankcardMonthPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodIsNull() {
            addCriterion("bankcard_year_period is null");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodIsNotNull() {
            addCriterion("bankcard_year_period is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodEqualTo(String value) {
            addCriterion("bankcard_year_period =", value, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodNotEqualTo(String value) {
            addCriterion("bankcard_year_period <>", value, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodGreaterThan(String value) {
            addCriterion("bankcard_year_period >", value, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_year_period >=", value, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodLessThan(String value) {
            addCriterion("bankcard_year_period <", value, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodLessThanOrEqualTo(String value) {
            addCriterion("bankcard_year_period <=", value, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodLike(String value) {
            addCriterion("bankcard_year_period like", value, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodNotLike(String value) {
            addCriterion("bankcard_year_period not like", value, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodIn(List<String> values) {
            addCriterion("bankcard_year_period in", values, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodNotIn(List<String> values) {
            addCriterion("bankcard_year_period not in", values, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodBetween(String value1, String value2) {
            addCriterion("bankcard_year_period between", value1, value2, "bankcardYearPeriod");
            return (Criteria) this;
        }

        public Criteria andBankcardYearPeriodNotBetween(String value1, String value2) {
            addCriterion("bankcard_year_period not between", value1, value2, "bankcardYearPeriod");
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
     * 对应的数据库表为： t_user_bankcard
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
     * 对应的数据库表为： t_user_bankcard
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