package com.xseshop.entity;

import java.util.ArrayList;
import java.util.List;

public class StationInventoryCriteria {
    /**
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    protected List<Criteria> oredCriteria;

    /**
     * TABLE： station_inventory
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    protected Integer start;

    /**
     * TABLE： station_inventory
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    protected Integer size;

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public StationInventoryCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
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
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public Integer getStart() {
        return start;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <br>
     *
     * TABLE： station_inventory<br>
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 此类为自动生成.
     * 对应的数据库表为： station_inventory
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNull() {
            addCriterion("station_no is null");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNotNull() {
            addCriterion("station_no is not null");
            return (Criteria) this;
        }

        public Criteria andStationNoEqualTo(String value) {
            addCriterion("station_no =", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotEqualTo(String value) {
            addCriterion("station_no <>", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThan(String value) {
            addCriterion("station_no >", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("station_no >=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThan(String value) {
            addCriterion("station_no <", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThanOrEqualTo(String value) {
            addCriterion("station_no <=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLike(String value) {
            addCriterion("station_no like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotLike(String value) {
            addCriterion("station_no not like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoIn(List<String> values) {
            addCriterion("station_no in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotIn(List<String> values) {
            addCriterion("station_no not in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoBetween(String value1, String value2) {
            addCriterion("station_no between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotBetween(String value1, String value2) {
            addCriterion("station_no not between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoIsNull() {
            addCriterion("inventory_no is null");
            return (Criteria) this;
        }

        public Criteria andInventoryNoIsNotNull() {
            addCriterion("inventory_no is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryNoEqualTo(String value) {
            addCriterion("inventory_no =", value, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoNotEqualTo(String value) {
            addCriterion("inventory_no <>", value, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoGreaterThan(String value) {
            addCriterion("inventory_no >", value, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_no >=", value, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoLessThan(String value) {
            addCriterion("inventory_no <", value, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoLessThanOrEqualTo(String value) {
            addCriterion("inventory_no <=", value, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoLike(String value) {
            addCriterion("inventory_no like", value, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoNotLike(String value) {
            addCriterion("inventory_no not like", value, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoIn(List<String> values) {
            addCriterion("inventory_no in", values, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoNotIn(List<String> values) {
            addCriterion("inventory_no not in", values, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoBetween(String value1, String value2) {
            addCriterion("inventory_no between", value1, value2, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNoNotBetween(String value1, String value2) {
            addCriterion("inventory_no not between", value1, value2, "inventoryNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoIsNull() {
            addCriterion("storage_no is null");
            return (Criteria) this;
        }

        public Criteria andStorageNoIsNotNull() {
            addCriterion("storage_no is not null");
            return (Criteria) this;
        }

        public Criteria andStorageNoEqualTo(String value) {
            addCriterion("storage_no =", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotEqualTo(String value) {
            addCriterion("storage_no <>", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoGreaterThan(String value) {
            addCriterion("storage_no >", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoGreaterThanOrEqualTo(String value) {
            addCriterion("storage_no >=", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLessThan(String value) {
            addCriterion("storage_no <", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLessThanOrEqualTo(String value) {
            addCriterion("storage_no <=", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLike(String value) {
            addCriterion("storage_no like", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotLike(String value) {
            addCriterion("storage_no not like", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoIn(List<String> values) {
            addCriterion("storage_no in", values, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotIn(List<String> values) {
            addCriterion("storage_no not in", values, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoBetween(String value1, String value2) {
            addCriterion("storage_no between", value1, value2, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotBetween(String value1, String value2) {
            addCriterion("storage_no not between", value1, value2, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNameIsNull() {
            addCriterion("storage_name is null");
            return (Criteria) this;
        }

        public Criteria andStorageNameIsNotNull() {
            addCriterion("storage_name is not null");
            return (Criteria) this;
        }

        public Criteria andStorageNameEqualTo(String value) {
            addCriterion("storage_name =", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameNotEqualTo(String value) {
            addCriterion("storage_name <>", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameGreaterThan(String value) {
            addCriterion("storage_name >", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameGreaterThanOrEqualTo(String value) {
            addCriterion("storage_name >=", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameLessThan(String value) {
            addCriterion("storage_name <", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameLessThanOrEqualTo(String value) {
            addCriterion("storage_name <=", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameLike(String value) {
            addCriterion("storage_name like", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameNotLike(String value) {
            addCriterion("storage_name not like", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameIn(List<String> values) {
            addCriterion("storage_name in", values, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameNotIn(List<String> values) {
            addCriterion("storage_name not in", values, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameBetween(String value1, String value2) {
            addCriterion("storage_name between", value1, value2, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameNotBetween(String value1, String value2) {
            addCriterion("storage_name not between", value1, value2, "storageName");
            return (Criteria) this;
        }

        public Criteria andRackNoIsNull() {
            addCriterion("rack_no is null");
            return (Criteria) this;
        }

        public Criteria andRackNoIsNotNull() {
            addCriterion("rack_no is not null");
            return (Criteria) this;
        }

        public Criteria andRackNoEqualTo(String value) {
            addCriterion("rack_no =", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoNotEqualTo(String value) {
            addCriterion("rack_no <>", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoGreaterThan(String value) {
            addCriterion("rack_no >", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoGreaterThanOrEqualTo(String value) {
            addCriterion("rack_no >=", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoLessThan(String value) {
            addCriterion("rack_no <", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoLessThanOrEqualTo(String value) {
            addCriterion("rack_no <=", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoLike(String value) {
            addCriterion("rack_no like", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoNotLike(String value) {
            addCriterion("rack_no not like", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoIn(List<String> values) {
            addCriterion("rack_no in", values, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoNotIn(List<String> values) {
            addCriterion("rack_no not in", values, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoBetween(String value1, String value2) {
            addCriterion("rack_no between", value1, value2, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoNotBetween(String value1, String value2) {
            addCriterion("rack_no not between", value1, value2, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNameIsNull() {
            addCriterion("rack_name is null");
            return (Criteria) this;
        }

        public Criteria andRackNameIsNotNull() {
            addCriterion("rack_name is not null");
            return (Criteria) this;
        }

        public Criteria andRackNameEqualTo(String value) {
            addCriterion("rack_name =", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotEqualTo(String value) {
            addCriterion("rack_name <>", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameGreaterThan(String value) {
            addCriterion("rack_name >", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameGreaterThanOrEqualTo(String value) {
            addCriterion("rack_name >=", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLessThan(String value) {
            addCriterion("rack_name <", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLessThanOrEqualTo(String value) {
            addCriterion("rack_name <=", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLike(String value) {
            addCriterion("rack_name like", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotLike(String value) {
            addCriterion("rack_name not like", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameIn(List<String> values) {
            addCriterion("rack_name in", values, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotIn(List<String> values) {
            addCriterion("rack_name not in", values, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameBetween(String value1, String value2) {
            addCriterion("rack_name between", value1, value2, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotBetween(String value1, String value2) {
            addCriterion("rack_name not between", value1, value2, "rackName");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIsNull() {
            addCriterion("subject_no is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIsNotNull() {
            addCriterion("subject_no is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNoEqualTo(String value) {
            addCriterion("subject_no =", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotEqualTo(String value) {
            addCriterion("subject_no <>", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThan(String value) {
            addCriterion("subject_no >", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("subject_no >=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThan(String value) {
            addCriterion("subject_no <", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThanOrEqualTo(String value) {
            addCriterion("subject_no <=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLike(String value) {
            addCriterion("subject_no like", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotLike(String value) {
            addCriterion("subject_no not like", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIn(List<String> values) {
            addCriterion("subject_no in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotIn(List<String> values) {
            addCriterion("subject_no not in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoBetween(String value1, String value2) {
            addCriterion("subject_no between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotBetween(String value1, String value2) {
            addCriterion("subject_no not between", value1, value2, "subjectNo");
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

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Double value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Double value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Double value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Double value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Double value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Double value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Double> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Double> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Double value1, Double value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Double value1, Double value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineIsNull() {
            addCriterion("warn_low_line is null");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineIsNotNull() {
            addCriterion("warn_low_line is not null");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineEqualTo(Double value) {
            addCriterion("warn_low_line =", value, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineNotEqualTo(Double value) {
            addCriterion("warn_low_line <>", value, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineGreaterThan(Double value) {
            addCriterion("warn_low_line >", value, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineGreaterThanOrEqualTo(Double value) {
            addCriterion("warn_low_line >=", value, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineLessThan(Double value) {
            addCriterion("warn_low_line <", value, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineLessThanOrEqualTo(Double value) {
            addCriterion("warn_low_line <=", value, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineIn(List<Double> values) {
            addCriterion("warn_low_line in", values, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineNotIn(List<Double> values) {
            addCriterion("warn_low_line not in", values, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineBetween(Double value1, Double value2) {
            addCriterion("warn_low_line between", value1, value2, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnLowLineNotBetween(Double value1, Double value2) {
            addCriterion("warn_low_line not between", value1, value2, "warnLowLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineIsNull() {
            addCriterion("warn_high_line is null");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineIsNotNull() {
            addCriterion("warn_high_line is not null");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineEqualTo(Double value) {
            addCriterion("warn_high_line =", value, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineNotEqualTo(Double value) {
            addCriterion("warn_high_line <>", value, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineGreaterThan(Double value) {
            addCriterion("warn_high_line >", value, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineGreaterThanOrEqualTo(Double value) {
            addCriterion("warn_high_line >=", value, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineLessThan(Double value) {
            addCriterion("warn_high_line <", value, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineLessThanOrEqualTo(Double value) {
            addCriterion("warn_high_line <=", value, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineIn(List<Double> values) {
            addCriterion("warn_high_line in", values, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineNotIn(List<Double> values) {
            addCriterion("warn_high_line not in", values, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineBetween(Double value1, Double value2) {
            addCriterion("warn_high_line between", value1, value2, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andWarnHighLineNotBetween(Double value1, Double value2) {
            addCriterion("warn_high_line not between", value1, value2, "warnHighLine");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyIsNull() {
            addCriterion("pollen_or_honey is null");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyIsNotNull() {
            addCriterion("pollen_or_honey is not null");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyEqualTo(Integer value) {
            addCriterion("pollen_or_honey =", value, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyNotEqualTo(Integer value) {
            addCriterion("pollen_or_honey <>", value, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyGreaterThan(Integer value) {
            addCriterion("pollen_or_honey >", value, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pollen_or_honey >=", value, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyLessThan(Integer value) {
            addCriterion("pollen_or_honey <", value, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyLessThanOrEqualTo(Integer value) {
            addCriterion("pollen_or_honey <=", value, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyIn(List<Integer> values) {
            addCriterion("pollen_or_honey in", values, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyNotIn(List<Integer> values) {
            addCriterion("pollen_or_honey not in", values, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyBetween(Integer value1, Integer value2) {
            addCriterion("pollen_or_honey between", value1, value2, "pollenOrHoney");
            return (Criteria) this;
        }

        public Criteria andPollenOrHoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("pollen_or_honey not between", value1, value2, "pollenOrHoney");
            return (Criteria) this;
        }
    }

    /**
     * 此类为自动生成.
     * 对应的数据库表为： station_inventory
     *
     * @mbg.generated 该代码为自动生成，请不要修改
     *
     * DATE: 2018-08-31 14:41
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 此类为自动生成.
     * 对应的数据库表为： station_inventory
     *
     * @mbg.generated
     *
     * DATE: 2018-08-31 14:41
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