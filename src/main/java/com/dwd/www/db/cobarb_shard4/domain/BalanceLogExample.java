//package com.dwd.www.db.cobarb_shard4.domain;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class BalanceLogExample {
//    protected String orderByClause;
//
//    protected boolean distinct;
//
//    protected List<Criteria> oredCriteria;
//
//    public BalanceLogExample() {
//        oredCriteria = new ArrayList<Criteria>();
//    }
//
//    public void setOrderByClause(String orderByClause) {
//        this.orderByClause = orderByClause;
//    }
//
//    public String getOrderByClause() {
//        return orderByClause;
//    }
//
//    public void setDistinct(boolean distinct) {
//        this.distinct = distinct;
//    }
//
//    public boolean isDistinct() {
//        return distinct;
//    }
//
//    public List<Criteria> getOredCriteria() {
//        return oredCriteria;
//    }
//
//    public void or(Criteria criteria) {
//        oredCriteria.add(criteria);
//    }
//
//    public Criteria or() {
//        Criteria criteria = createCriteriaInternal();
//        oredCriteria.add(criteria);
//        return criteria;
//    }
//
//    public Criteria createCriteria() {
//        Criteria criteria = createCriteriaInternal();
//        if (oredCriteria.size() == 0) {
//            oredCriteria.add(criteria);
//        }
//        return criteria;
//    }
//
//    protected Criteria createCriteriaInternal() {
//        Criteria criteria = new Criteria();
//        return criteria;
//    }
//
//    public void clear() {
//        oredCriteria.clear();
//        orderByClause = null;
//        distinct = false;
//    }
//
//    protected abstract static class GeneratedCriteria {
//        protected List<Criterion> criteria;
//
//        protected GeneratedCriteria() {
//            super();
//            criteria = new ArrayList<Criterion>();
//        }
//
//        public boolean isValid() {
//            return criteria.size() > 0;
//        }
//
//        public List<Criterion> getAllCriteria() {
//            return criteria;
//        }
//
//        public List<Criterion> getCriteria() {
//            return criteria;
//        }
//
//        protected void addCriterion(String condition) {
//            if (condition == null) {
//                throw new RuntimeException("Value for condition cannot be null");
//            }
//            criteria.add(new Criterion(condition));
//        }
//
//        protected void addCriterion(String condition, Object value, String property) {
//            if (value == null) {
//                throw new RuntimeException("Value for " + property + " cannot be null");
//            }
//            criteria.add(new Criterion(condition, value));
//        }
//
//        protected void addCriterion(String condition, Object value1, Object value2, String property) {
//            if (value1 == null || value2 == null) {
//                throw new RuntimeException("Between values for " + property + " cannot be null");
//            }
//            criteria.add(new Criterion(condition, value1, value2));
//        }
//
//        public Criteria andIdIsNull() {
//            addCriterion("id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdIsNotNull() {
//            addCriterion("id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdEqualTo(Long value) {
//            addCriterion("id =", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotEqualTo(Long value) {
//            addCriterion("id <>", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdGreaterThan(Long value) {
//            addCriterion("id >", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdGreaterThanOrEqualTo(Long value) {
//            addCriterion("id >=", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLessThan(Long value) {
//            addCriterion("id <", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLessThanOrEqualTo(Long value) {
//            addCriterion("id <=", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdIn(List<Long> values) {
//            addCriterion("id in", values, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotIn(List<Long> values) {
//            addCriterion("id not in", values, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdBetween(Long value1, Long value2) {
//            addCriterion("id between", value1, value2, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotBetween(Long value1, Long value2) {
//            addCriterion("id not between", value1, value2, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdIsNull() {
//            addCriterion("city_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdIsNotNull() {
//            addCriterion("city_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdEqualTo(Integer value) {
//            addCriterion("city_id =", value, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdNotEqualTo(Integer value) {
//            addCriterion("city_id <>", value, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdGreaterThan(Integer value) {
//            addCriterion("city_id >", value, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("city_id >=", value, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdLessThan(Integer value) {
//            addCriterion("city_id <", value, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
//            addCriterion("city_id <=", value, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdIn(List<Integer> values) {
//            addCriterion("city_id in", values, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdNotIn(List<Integer> values) {
//            addCriterion("city_id not in", values, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdBetween(Integer value1, Integer value2) {
//            addCriterion("city_id between", value1, value2, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("city_id not between", value1, value2, "cityId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdIsNull() {
//            addCriterion("rider_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdIsNotNull() {
//            addCriterion("rider_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdEqualTo(Integer value) {
//            addCriterion("rider_id =", value, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdNotEqualTo(Integer value) {
//            addCriterion("rider_id <>", value, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdGreaterThan(Integer value) {
//            addCriterion("rider_id >", value, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("rider_id >=", value, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdLessThan(Integer value) {
//            addCriterion("rider_id <", value, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdLessThanOrEqualTo(Integer value) {
//            addCriterion("rider_id <=", value, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdIn(List<Integer> values) {
//            addCriterion("rider_id in", values, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdNotIn(List<Integer> values) {
//            addCriterion("rider_id not in", values, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdBetween(Integer value1, Integer value2) {
//            addCriterion("rider_id between", value1, value2, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("rider_id not between", value1, value2, "riderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeIsNull() {
//            addCriterion("type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeIsNotNull() {
//            addCriterion("type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeEqualTo(Byte value) {
//            addCriterion("type =", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeNotEqualTo(Byte value) {
//            addCriterion("type <>", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeGreaterThan(Byte value) {
//            addCriterion("type >", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("type >=", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeLessThan(Byte value) {
//            addCriterion("type <", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("type <=", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeIn(List<Byte> values) {
//            addCriterion("type in", values, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeNotIn(List<Byte> values) {
//            addCriterion("type not in", values, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeBetween(Byte value1, Byte value2) {
//            addCriterion("type between", value1, value2, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("type not between", value1, value2, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedIsNull() {
//            addCriterion("blocked is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedIsNotNull() {
//            addCriterion("blocked is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedEqualTo(Byte value) {
//            addCriterion("blocked =", value, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedNotEqualTo(Byte value) {
//            addCriterion("blocked <>", value, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedGreaterThan(Byte value) {
//            addCriterion("blocked >", value, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedGreaterThanOrEqualTo(Byte value) {
//            addCriterion("blocked >=", value, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedLessThan(Byte value) {
//            addCriterion("blocked <", value, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedLessThanOrEqualTo(Byte value) {
//            addCriterion("blocked <=", value, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedIn(List<Byte> values) {
//            addCriterion("blocked in", values, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedNotIn(List<Byte> values) {
//            addCriterion("blocked not in", values, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedBetween(Byte value1, Byte value2) {
//            addCriterion("blocked between", value1, value2, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andBlockedNotBetween(Byte value1, Byte value2) {
//            addCriterion("blocked not between", value1, value2, "blocked");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountIsNull() {
//            addCriterion("account is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountIsNotNull() {
//            addCriterion("account is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountEqualTo(String value) {
//            addCriterion("account =", value, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountNotEqualTo(String value) {
//            addCriterion("account <>", value, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountGreaterThan(String value) {
//            addCriterion("account >", value, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountGreaterThanOrEqualTo(String value) {
//            addCriterion("account >=", value, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountLessThan(String value) {
//            addCriterion("account <", value, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountLessThanOrEqualTo(String value) {
//            addCriterion("account <=", value, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountLike(String value) {
//            addCriterion("account like", value, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountNotLike(String value) {
//            addCriterion("account not like", value, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountIn(List<String> values) {
//            addCriterion("account in", values, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountNotIn(List<String> values) {
//            addCriterion("account not in", values, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountBetween(String value1, String value2) {
//            addCriterion("account between", value1, value2, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccountNotBetween(String value1, String value2) {
//            addCriterion("account not between", value1, value2, "account");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidIsNull() {
//            addCriterion("paid is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidIsNotNull() {
//            addCriterion("paid is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidEqualTo(Byte value) {
//            addCriterion("paid =", value, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidNotEqualTo(Byte value) {
//            addCriterion("paid <>", value, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidGreaterThan(Byte value) {
//            addCriterion("paid >", value, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidGreaterThanOrEqualTo(Byte value) {
//            addCriterion("paid >=", value, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidLessThan(Byte value) {
//            addCriterion("paid <", value, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidLessThanOrEqualTo(Byte value) {
//            addCriterion("paid <=", value, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidIn(List<Byte> values) {
//            addCriterion("paid in", values, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidNotIn(List<Byte> values) {
//            addCriterion("paid not in", values, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidBetween(Byte value1, Byte value2) {
//            addCriterion("paid between", value1, value2, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPaidNotBetween(Byte value1, Byte value2) {
//            addCriterion("paid not between", value1, value2, "paid");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameIsNull() {
//            addCriterion("name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameIsNotNull() {
//            addCriterion("name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameEqualTo(String value) {
//            addCriterion("name =", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameNotEqualTo(String value) {
//            addCriterion("name <>", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameGreaterThan(String value) {
//            addCriterion("name >", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameGreaterThanOrEqualTo(String value) {
//            addCriterion("name >=", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameLessThan(String value) {
//            addCriterion("name <", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameLessThanOrEqualTo(String value) {
//            addCriterion("name <=", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameLike(String value) {
//            addCriterion("name like", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameNotLike(String value) {
//            addCriterion("name not like", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameIn(List<String> values) {
//            addCriterion("name in", values, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameNotIn(List<String> values) {
//            addCriterion("name not in", values, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameBetween(String value1, String value2) {
//            addCriterion("name between", value1, value2, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameNotBetween(String value1, String value2) {
//            addCriterion("name not between", value1, value2, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostIsNull() {
//            addCriterion("cost is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostIsNotNull() {
//            addCriterion("cost is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostEqualTo(BigDecimal value) {
//            addCriterion("cost =", value, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostNotEqualTo(BigDecimal value) {
//            addCriterion("cost <>", value, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostGreaterThan(BigDecimal value) {
//            addCriterion("cost >", value, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
//            addCriterion("cost >=", value, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostLessThan(BigDecimal value) {
//            addCriterion("cost <", value, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
//            addCriterion("cost <=", value, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostIn(List<BigDecimal> values) {
//            addCriterion("cost in", values, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostNotIn(List<BigDecimal> values) {
//            addCriterion("cost not in", values, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("cost between", value1, value2, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("cost not between", value1, value2, "cost");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageIsNull() {
//            addCriterion("factorage is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageIsNotNull() {
//            addCriterion("factorage is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageEqualTo(BigDecimal value) {
//            addCriterion("factorage =", value, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageNotEqualTo(BigDecimal value) {
//            addCriterion("factorage <>", value, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageGreaterThan(BigDecimal value) {
//            addCriterion("factorage >", value, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageGreaterThanOrEqualTo(BigDecimal value) {
//            addCriterion("factorage >=", value, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageLessThan(BigDecimal value) {
//            addCriterion("factorage <", value, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageLessThanOrEqualTo(BigDecimal value) {
//            addCriterion("factorage <=", value, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageIn(List<BigDecimal> values) {
//            addCriterion("factorage in", values, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageNotIn(List<BigDecimal> values) {
//            addCriterion("factorage not in", values, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("factorage between", value1, value2, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andFactorageNotBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("factorage not between", value1, value2, "factorage");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmIsNull() {
//            addCriterion("ins_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmIsNotNull() {
//            addCriterion("ins_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmEqualTo(Date value) {
//            addCriterion("ins_tm =", value, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmNotEqualTo(Date value) {
//            addCriterion("ins_tm <>", value, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmGreaterThan(Date value) {
//            addCriterion("ins_tm >", value, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("ins_tm >=", value, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmLessThan(Date value) {
//            addCriterion("ins_tm <", value, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmLessThanOrEqualTo(Date value) {
//            addCriterion("ins_tm <=", value, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmIn(List<Date> values) {
//            addCriterion("ins_tm in", values, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmNotIn(List<Date> values) {
//            addCriterion("ins_tm not in", values, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmBetween(Date value1, Date value2) {
//            addCriterion("ins_tm between", value1, value2, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andInsTmNotBetween(Date value1, Date value2) {
//            addCriterion("ins_tm not between", value1, value2, "insTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmIsNull() {
//            addCriterion("verify_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmIsNotNull() {
//            addCriterion("verify_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmEqualTo(Date value) {
//            addCriterion("verify_tm =", value, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmNotEqualTo(Date value) {
//            addCriterion("verify_tm <>", value, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmGreaterThan(Date value) {
//            addCriterion("verify_tm >", value, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("verify_tm >=", value, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmLessThan(Date value) {
//            addCriterion("verify_tm <", value, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmLessThanOrEqualTo(Date value) {
//            addCriterion("verify_tm <=", value, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmIn(List<Date> values) {
//            addCriterion("verify_tm in", values, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmNotIn(List<Date> values) {
//            addCriterion("verify_tm not in", values, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmBetween(Date value1, Date value2) {
//            addCriterion("verify_tm between", value1, value2, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andVerifyTmNotBetween(Date value1, Date value2) {
//            addCriterion("verify_tm not between", value1, value2, "verifyTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmIsNull() {
//            addCriterion("finish_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmIsNotNull() {
//            addCriterion("finish_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmEqualTo(Date value) {
//            addCriterion("finish_tm =", value, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmNotEqualTo(Date value) {
//            addCriterion("finish_tm <>", value, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmGreaterThan(Date value) {
//            addCriterion("finish_tm >", value, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("finish_tm >=", value, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmLessThan(Date value) {
//            addCriterion("finish_tm <", value, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmLessThanOrEqualTo(Date value) {
//            addCriterion("finish_tm <=", value, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmIn(List<Date> values) {
//            addCriterion("finish_tm in", values, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmNotIn(List<Date> values) {
//            addCriterion("finish_tm not in", values, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmBetween(Date value1, Date value2) {
//            addCriterion("finish_tm between", value1, value2, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andFinishTmNotBetween(Date value1, Date value2) {
//            addCriterion("finish_tm not between", value1, value2, "finishTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonIsNull() {
//            addCriterion("reason is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonIsNotNull() {
//            addCriterion("reason is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonEqualTo(String value) {
//            addCriterion("reason =", value, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonNotEqualTo(String value) {
//            addCriterion("reason <>", value, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonGreaterThan(String value) {
//            addCriterion("reason >", value, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonGreaterThanOrEqualTo(String value) {
//            addCriterion("reason >=", value, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonLessThan(String value) {
//            addCriterion("reason <", value, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonLessThanOrEqualTo(String value) {
//            addCriterion("reason <=", value, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonLike(String value) {
//            addCriterion("reason like", value, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonNotLike(String value) {
//            addCriterion("reason not like", value, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonIn(List<String> values) {
//            addCriterion("reason in", values, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonNotIn(List<String> values) {
//            addCriterion("reason not in", values, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonBetween(String value1, String value2) {
//            addCriterion("reason between", value1, value2, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonNotBetween(String value1, String value2) {
//            addCriterion("reason not between", value1, value2, "reason");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoIsNull() {
//            addCriterion("trade_no is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoIsNotNull() {
//            addCriterion("trade_no is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoEqualTo(String value) {
//            addCriterion("trade_no =", value, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoNotEqualTo(String value) {
//            addCriterion("trade_no <>", value, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoGreaterThan(String value) {
//            addCriterion("trade_no >", value, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
//            addCriterion("trade_no >=", value, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoLessThan(String value) {
//            addCriterion("trade_no <", value, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoLessThanOrEqualTo(String value) {
//            addCriterion("trade_no <=", value, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoLike(String value) {
//            addCriterion("trade_no like", value, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoNotLike(String value) {
//            addCriterion("trade_no not like", value, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoIn(List<String> values) {
//            addCriterion("trade_no in", values, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoNotIn(List<String> values) {
//            addCriterion("trade_no not in", values, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoBetween(String value1, String value2) {
//            addCriterion("trade_no between", value1, value2, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeNoNotBetween(String value1, String value2) {
//            addCriterion("trade_no not between", value1, value2, "tradeNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayIsNull() {
//            addCriterion("trade_way is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayIsNotNull() {
//            addCriterion("trade_way is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayEqualTo(Byte value) {
//            addCriterion("trade_way =", value, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayNotEqualTo(Byte value) {
//            addCriterion("trade_way <>", value, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayGreaterThan(Byte value) {
//            addCriterion("trade_way >", value, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayGreaterThanOrEqualTo(Byte value) {
//            addCriterion("trade_way >=", value, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayLessThan(Byte value) {
//            addCriterion("trade_way <", value, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayLessThanOrEqualTo(Byte value) {
//            addCriterion("trade_way <=", value, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayIn(List<Byte> values) {
//            addCriterion("trade_way in", values, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayNotIn(List<Byte> values) {
//            addCriterion("trade_way not in", values, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayBetween(Byte value1, Byte value2) {
//            addCriterion("trade_way between", value1, value2, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeWayNotBetween(Byte value1, Byte value2) {
//            addCriterion("trade_way not between", value1, value2, "tradeWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedIsNull() {
//            addCriterion("risk_checked is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedIsNotNull() {
//            addCriterion("risk_checked is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedEqualTo(Byte value) {
//            addCriterion("risk_checked =", value, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedNotEqualTo(Byte value) {
//            addCriterion("risk_checked <>", value, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedGreaterThan(Byte value) {
//            addCriterion("risk_checked >", value, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedGreaterThanOrEqualTo(Byte value) {
//            addCriterion("risk_checked >=", value, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedLessThan(Byte value) {
//            addCriterion("risk_checked <", value, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedLessThanOrEqualTo(Byte value) {
//            addCriterion("risk_checked <=", value, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedIn(List<Byte> values) {
//            addCriterion("risk_checked in", values, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedNotIn(List<Byte> values) {
//            addCriterion("risk_checked not in", values, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedBetween(Byte value1, Byte value2) {
//            addCriterion("risk_checked between", value1, value2, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiskCheckedNotBetween(Byte value1, Byte value2) {
//            addCriterion("risk_checked not between", value1, value2, "riskChecked");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeIsNull() {
//            addCriterion("current_service_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeIsNotNull() {
//            addCriterion("current_service_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeEqualTo(Byte value) {
//            addCriterion("current_service_type =", value, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeNotEqualTo(Byte value) {
//            addCriterion("current_service_type <>", value, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeGreaterThan(Byte value) {
//            addCriterion("current_service_type >", value, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("current_service_type >=", value, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeLessThan(Byte value) {
//            addCriterion("current_service_type <", value, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("current_service_type <=", value, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeIn(List<Byte> values) {
//            addCriterion("current_service_type in", values, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeNotIn(List<Byte> values) {
//            addCriterion("current_service_type not in", values, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeBetween(Byte value1, Byte value2) {
//            addCriterion("current_service_type between", value1, value2, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andCurrentServiceTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("current_service_type not between", value1, value2, "currentServiceType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameIsNull() {
//            addCriterion("bank_name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameIsNotNull() {
//            addCriterion("bank_name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameEqualTo(Byte value) {
//            addCriterion("bank_name =", value, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameNotEqualTo(Byte value) {
//            addCriterion("bank_name <>", value, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameGreaterThan(Byte value) {
//            addCriterion("bank_name >", value, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameGreaterThanOrEqualTo(Byte value) {
//            addCriterion("bank_name >=", value, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameLessThan(Byte value) {
//            addCriterion("bank_name <", value, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameLessThanOrEqualTo(Byte value) {
//            addCriterion("bank_name <=", value, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameIn(List<Byte> values) {
//            addCriterion("bank_name in", values, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameNotIn(List<Byte> values) {
//            addCriterion("bank_name not in", values, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameBetween(Byte value1, Byte value2) {
//            addCriterion("bank_name between", value1, value2, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankNameNotBetween(Byte value1, Byte value2) {
//            addCriterion("bank_name not between", value1, value2, "bankName");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardIsNull() {
//            addCriterion("bank_card is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardIsNotNull() {
//            addCriterion("bank_card is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardEqualTo(String value) {
//            addCriterion("bank_card =", value, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardNotEqualTo(String value) {
//            addCriterion("bank_card <>", value, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardGreaterThan(String value) {
//            addCriterion("bank_card >", value, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
//            addCriterion("bank_card >=", value, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardLessThan(String value) {
//            addCriterion("bank_card <", value, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardLessThanOrEqualTo(String value) {
//            addCriterion("bank_card <=", value, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardLike(String value) {
//            addCriterion("bank_card like", value, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardNotLike(String value) {
//            addCriterion("bank_card not like", value, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardIn(List<String> values) {
//            addCriterion("bank_card in", values, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardNotIn(List<String> values) {
//            addCriterion("bank_card not in", values, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardBetween(String value1, String value2) {
//            addCriterion("bank_card between", value1, value2, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardNotBetween(String value1, String value2) {
//            addCriterion("bank_card not between", value1, value2, "bankCard");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeIsNull() {
//            addCriterion("bank_card_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeIsNotNull() {
//            addCriterion("bank_card_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeEqualTo(Byte value) {
//            addCriterion("bank_card_type =", value, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeNotEqualTo(Byte value) {
//            addCriterion("bank_card_type <>", value, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeGreaterThan(Byte value) {
//            addCriterion("bank_card_type >", value, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("bank_card_type >=", value, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeLessThan(Byte value) {
//            addCriterion("bank_card_type <", value, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("bank_card_type <=", value, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeIn(List<Byte> values) {
//            addCriterion("bank_card_type in", values, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeNotIn(List<Byte> values) {
//            addCriterion("bank_card_type not in", values, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeBetween(Byte value1, Byte value2) {
//            addCriterion("bank_card_type between", value1, value2, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBankCardTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("bank_card_type not between", value1, value2, "bankCardType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeIsNull() {
//            addCriterion("pay_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeIsNotNull() {
//            addCriterion("pay_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeEqualTo(Byte value) {
//            addCriterion("pay_type =", value, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeNotEqualTo(Byte value) {
//            addCriterion("pay_type <>", value, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeGreaterThan(Byte value) {
//            addCriterion("pay_type >", value, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("pay_type >=", value, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeLessThan(Byte value) {
//            addCriterion("pay_type <", value, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("pay_type <=", value, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeIn(List<Byte> values) {
//            addCriterion("pay_type in", values, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeNotIn(List<Byte> values) {
//            addCriterion("pay_type not in", values, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeBetween(Byte value1, Byte value2) {
//            addCriterion("pay_type between", value1, value2, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("pay_type not between", value1, value2, "payType");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdIsNull() {
//            addCriterion("batch_record_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdIsNotNull() {
//            addCriterion("batch_record_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdEqualTo(Long value) {
//            addCriterion("batch_record_id =", value, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdNotEqualTo(Long value) {
//            addCriterion("batch_record_id <>", value, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdGreaterThan(Long value) {
//            addCriterion("batch_record_id >", value, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdGreaterThanOrEqualTo(Long value) {
//            addCriterion("batch_record_id >=", value, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdLessThan(Long value) {
//            addCriterion("batch_record_id <", value, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdLessThanOrEqualTo(Long value) {
//            addCriterion("batch_record_id <=", value, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdIn(List<Long> values) {
//            addCriterion("batch_record_id in", values, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdNotIn(List<Long> values) {
//            addCriterion("batch_record_id not in", values, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdBetween(Long value1, Long value2) {
//            addCriterion("batch_record_id between", value1, value2, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchRecordIdNotBetween(Long value1, Long value2) {
//            addCriterion("batch_record_id not between", value1, value2, "batchRecordId");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoIsNull() {
//            addCriterion("batch_no is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoIsNotNull() {
//            addCriterion("batch_no is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoEqualTo(String value) {
//            addCriterion("batch_no =", value, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoNotEqualTo(String value) {
//            addCriterion("batch_no <>", value, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoGreaterThan(String value) {
//            addCriterion("batch_no >", value, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
//            addCriterion("batch_no >=", value, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoLessThan(String value) {
//            addCriterion("batch_no <", value, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoLessThanOrEqualTo(String value) {
//            addCriterion("batch_no <=", value, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoLike(String value) {
//            addCriterion("batch_no like", value, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoNotLike(String value) {
//            addCriterion("batch_no not like", value, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoIn(List<String> values) {
//            addCriterion("batch_no in", values, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoNotIn(List<String> values) {
//            addCriterion("batch_no not in", values, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoBetween(String value1, String value2) {
//            addCriterion("batch_no between", value1, value2, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andBatchNoNotBetween(String value1, String value2) {
//            addCriterion("batch_no not between", value1, value2, "batchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxIsNull() {
//            addCriterion("shardx is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxIsNotNull() {
//            addCriterion("shardx is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxEqualTo(Integer value) {
//            addCriterion("shardx =", value, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxNotEqualTo(Integer value) {
//            addCriterion("shardx <>", value, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxGreaterThan(Integer value) {
//            addCriterion("shardx >", value, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxGreaterThanOrEqualTo(Integer value) {
//            addCriterion("shardx >=", value, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxLessThan(Integer value) {
//            addCriterion("shardx <", value, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxLessThanOrEqualTo(Integer value) {
//            addCriterion("shardx <=", value, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxIn(List<Integer> values) {
//            addCriterion("shardx in", values, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxNotIn(List<Integer> values) {
//            addCriterion("shardx not in", values, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxBetween(Integer value1, Integer value2) {
//            addCriterion("shardx between", value1, value2, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardxNotBetween(Integer value1, Integer value2) {
//            addCriterion("shardx not between", value1, value2, "shardx");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmIsNull() {
//            addCriterion("withdraw_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmIsNotNull() {
//            addCriterion("withdraw_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmEqualTo(Date value) {
//            addCriterion("withdraw_tm =", value, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmNotEqualTo(Date value) {
//            addCriterion("withdraw_tm <>", value, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmGreaterThan(Date value) {
//            addCriterion("withdraw_tm >", value, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("withdraw_tm >=", value, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmLessThan(Date value) {
//            addCriterion("withdraw_tm <", value, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmLessThanOrEqualTo(Date value) {
//            addCriterion("withdraw_tm <=", value, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmIn(List<Date> values) {
//            addCriterion("withdraw_tm in", values, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmNotIn(List<Date> values) {
//            addCriterion("withdraw_tm not in", values, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmBetween(Date value1, Date value2) {
//            addCriterion("withdraw_tm between", value1, value2, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andWithdrawTmNotBetween(Date value1, Date value2) {
//            addCriterion("withdraw_tm not between", value1, value2, "withdrawTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeIsNull() {
//            addCriterion("modify_time is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeIsNotNull() {
//            addCriterion("modify_time is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeEqualTo(Date value) {
//            addCriterion("modify_time =", value, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeNotEqualTo(Date value) {
//            addCriterion("modify_time <>", value, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeGreaterThan(Date value) {
//            addCriterion("modify_time >", value, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
//            addCriterion("modify_time >=", value, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeLessThan(Date value) {
//            addCriterion("modify_time <", value, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
//            addCriterion("modify_time <=", value, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeIn(List<Date> values) {
//            addCriterion("modify_time in", values, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeNotIn(List<Date> values) {
//            addCriterion("modify_time not in", values, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeBetween(Date value1, Date value2) {
//            addCriterion("modify_time between", value1, value2, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
//            addCriterion("modify_time not between", value1, value2, "modifyTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceIsNull() {
//            addCriterion("effective_balance is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceIsNotNull() {
//            addCriterion("effective_balance is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceEqualTo(BigDecimal value) {
//            addCriterion("effective_balance =", value, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceNotEqualTo(BigDecimal value) {
//            addCriterion("effective_balance <>", value, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceGreaterThan(BigDecimal value) {
//            addCriterion("effective_balance >", value, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceGreaterThanOrEqualTo(BigDecimal value) {
//            addCriterion("effective_balance >=", value, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceLessThan(BigDecimal value) {
//            addCriterion("effective_balance <", value, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceLessThanOrEqualTo(BigDecimal value) {
//            addCriterion("effective_balance <=", value, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceIn(List<BigDecimal> values) {
//            addCriterion("effective_balance in", values, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceNotIn(List<BigDecimal> values) {
//            addCriterion("effective_balance not in", values, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("effective_balance between", value1, value2, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andEffectiveBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("effective_balance not between", value1, value2, "effectiveBalance");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyIsNull() {
//            addCriterion("auditing_money is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyIsNotNull() {
//            addCriterion("auditing_money is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyEqualTo(BigDecimal value) {
//            addCriterion("auditing_money =", value, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyNotEqualTo(BigDecimal value) {
//            addCriterion("auditing_money <>", value, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyGreaterThan(BigDecimal value) {
//            addCriterion("auditing_money >", value, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyGreaterThanOrEqualTo(BigDecimal value) {
//            addCriterion("auditing_money >=", value, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyLessThan(BigDecimal value) {
//            addCriterion("auditing_money <", value, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyLessThanOrEqualTo(BigDecimal value) {
//            addCriterion("auditing_money <=", value, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyIn(List<BigDecimal> values) {
//            addCriterion("auditing_money in", values, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyNotIn(List<BigDecimal> values) {
//            addCriterion("auditing_money not in", values, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("auditing_money between", value1, value2, "auditingMoney");
//            return (Criteria) this;
//        }
//
//        public Criteria andAuditingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("auditing_money not between", value1, value2, "auditingMoney");
//            return (Criteria) this;
//        }
//    }
//
//    public static class Criteria extends GeneratedCriteria {
//
//        protected Criteria() {
//            super();
//        }
//    }
//
//    public static class Criterion {
//        private String condition;
//
//        private Object value;
//
//        private Object secondValue;
//
//        private boolean noValue;
//
//        private boolean singleValue;
//
//        private boolean betweenValue;
//
//        private boolean listValue;
//
//        private String typeHandler;
//
//        public String getCondition() {
//            return condition;
//        }
//
//        public Object getValue() {
//            return value;
//        }
//
//        public Object getSecondValue() {
//            return secondValue;
//        }
//
//        public boolean isNoValue() {
//            return noValue;
//        }
//
//        public boolean isSingleValue() {
//            return singleValue;
//        }
//
//        public boolean isBetweenValue() {
//            return betweenValue;
//        }
//
//        public boolean isListValue() {
//            return listValue;
//        }
//
//        public String getTypeHandler() {
//            return typeHandler;
//        }
//
//        protected Criterion(String condition) {
//            super();
//            this.condition = condition;
//            this.typeHandler = null;
//            this.noValue = true;
//        }
//
//        protected Criterion(String condition, Object value, String typeHandler) {
//            super();
//            this.condition = condition;
//            this.value = value;
//            this.typeHandler = typeHandler;
//            if (value instanceof List<?>) {
//                this.listValue = true;
//            } else {
//                this.singleValue = true;
//            }
//        }
//
//        protected Criterion(String condition, Object value) {
//            this(condition, value, null);
//        }
//
//        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
//            super();
//            this.condition = condition;
//            this.value = value;
//            this.secondValue = secondValue;
//            this.typeHandler = typeHandler;
//            this.betweenValue = true;
//        }
//
//        protected Criterion(String condition, Object value, Object secondValue) {
//            this(condition, value, secondValue, null);
//        }
//    }
//}