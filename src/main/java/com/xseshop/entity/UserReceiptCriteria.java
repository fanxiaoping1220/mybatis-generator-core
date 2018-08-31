package com.xseshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserReceiptCriteria {
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
     * TABLE： t_user_receipt
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer start;

    /**
     * TABLE： t_user_receipt
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    protected Integer size;

    /**
     * <br>
     *
     * TABLE： t_user_receipt<br>
     *
     * @mbg.generated
     *
     * DATE: 2017-10-31 17:04
     */
    public UserReceiptCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * <br>
     *
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * TABLE： t_user_receipt<br>
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
     * 对应的数据库表为： t_user_receipt
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

        public Criteria andReceiptIdIsNull() {
            addCriterion("receipt_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIsNotNull() {
            addCriterion("receipt_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdEqualTo(String value) {
            addCriterion("receipt_id =", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotEqualTo(String value) {
            addCriterion("receipt_id <>", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThan(String value) {
            addCriterion("receipt_id >", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_id >=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThan(String value) {
            addCriterion("receipt_id <", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThanOrEqualTo(String value) {
            addCriterion("receipt_id <=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLike(String value) {
            addCriterion("receipt_id like", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotLike(String value) {
            addCriterion("receipt_id not like", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIn(List<String> values) {
            addCriterion("receipt_id in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotIn(List<String> values) {
            addCriterion("receipt_id not in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdBetween(String value1, String value2) {
            addCriterion("receipt_id between", value1, value2, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotBetween(String value1, String value2) {
            addCriterion("receipt_id not between", value1, value2, "receiptId");
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

        public Criteria andReceiptStatusIsNull() {
            addCriterion("receipt_status is null");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusIsNotNull() {
            addCriterion("receipt_status is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusEqualTo(String value) {
            addCriterion("receipt_status =", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusNotEqualTo(String value) {
            addCriterion("receipt_status <>", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusGreaterThan(String value) {
            addCriterion("receipt_status >", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_status >=", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusLessThan(String value) {
            addCriterion("receipt_status <", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusLessThanOrEqualTo(String value) {
            addCriterion("receipt_status <=", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusLike(String value) {
            addCriterion("receipt_status like", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusNotLike(String value) {
            addCriterion("receipt_status not like", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusIn(List<String> values) {
            addCriterion("receipt_status in", values, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusNotIn(List<String> values) {
            addCriterion("receipt_status not in", values, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusBetween(String value1, String value2) {
            addCriterion("receipt_status between", value1, value2, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusNotBetween(String value1, String value2) {
            addCriterion("receipt_status not between", value1, value2, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileIsNull() {
            addCriterion("receipt_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileIsNotNull() {
            addCriterion("receipt_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileEqualTo(String value) {
            addCriterion("receipt_mobile =", value, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileNotEqualTo(String value) {
            addCriterion("receipt_mobile <>", value, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileGreaterThan(String value) {
            addCriterion("receipt_mobile >", value, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_mobile >=", value, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileLessThan(String value) {
            addCriterion("receipt_mobile <", value, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileLessThanOrEqualTo(String value) {
            addCriterion("receipt_mobile <=", value, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileLike(String value) {
            addCriterion("receipt_mobile like", value, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileNotLike(String value) {
            addCriterion("receipt_mobile not like", value, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileIn(List<String> values) {
            addCriterion("receipt_mobile in", values, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileNotIn(List<String> values) {
            addCriterion("receipt_mobile not in", values, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileBetween(String value1, String value2) {
            addCriterion("receipt_mobile between", value1, value2, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptMobileNotBetween(String value1, String value2) {
            addCriterion("receipt_mobile not between", value1, value2, "receiptMobile");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIsNull() {
            addCriterion("receipt_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIsNotNull() {
            addCriterion("receipt_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressEqualTo(String value) {
            addCriterion("receipt_address =", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotEqualTo(String value) {
            addCriterion("receipt_address <>", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressGreaterThan(String value) {
            addCriterion("receipt_address >", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_address >=", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLessThan(String value) {
            addCriterion("receipt_address <", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLessThanOrEqualTo(String value) {
            addCriterion("receipt_address <=", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLike(String value) {
            addCriterion("receipt_address like", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotLike(String value) {
            addCriterion("receipt_address not like", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIn(List<String> values) {
            addCriterion("receipt_address in", values, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotIn(List<String> values) {
            addCriterion("receipt_address not in", values, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressBetween(String value1, String value2) {
            addCriterion("receipt_address between", value1, value2, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotBetween(String value1, String value2) {
            addCriterion("receipt_address not between", value1, value2, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("is_default like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("is_default not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkIsNull() {
            addCriterion("receipt_mark is null");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkIsNotNull() {
            addCriterion("receipt_mark is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkEqualTo(String value) {
            addCriterion("receipt_mark =", value, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkNotEqualTo(String value) {
            addCriterion("receipt_mark <>", value, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkGreaterThan(String value) {
            addCriterion("receipt_mark >", value, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_mark >=", value, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkLessThan(String value) {
            addCriterion("receipt_mark <", value, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkLessThanOrEqualTo(String value) {
            addCriterion("receipt_mark <=", value, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkLike(String value) {
            addCriterion("receipt_mark like", value, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkNotLike(String value) {
            addCriterion("receipt_mark not like", value, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkIn(List<String> values) {
            addCriterion("receipt_mark in", values, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkNotIn(List<String> values) {
            addCriterion("receipt_mark not in", values, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkBetween(String value1, String value2) {
            addCriterion("receipt_mark between", value1, value2, "receiptMark");
            return (Criteria) this;
        }

        public Criteria andReceiptMarkNotBetween(String value1, String value2) {
            addCriterion("receipt_mark not between", value1, value2, "receiptMark");
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
     * 对应的数据库表为： t_user_receipt
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
     * 对应的数据库表为： t_user_receipt
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