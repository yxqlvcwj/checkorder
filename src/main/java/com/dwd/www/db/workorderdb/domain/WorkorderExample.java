//package com.dwd.www.db.workorderdb.domain;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class WorkorderExample {
//    protected String orderByClause;
//
//    protected boolean distinct;
//
//    protected List<Criteria> oredCriteria;
//
//    public WorkorderExample() {
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
//        public Criteria andPrimarykeyIsNull() {
//            addCriterion("primarykey is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyIsNotNull() {
//            addCriterion("primarykey is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyEqualTo(Long value) {
//            addCriterion("primarykey =", value, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyNotEqualTo(Long value) {
//            addCriterion("primarykey <>", value, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyGreaterThan(Long value) {
//            addCriterion("primarykey >", value, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyGreaterThanOrEqualTo(Long value) {
//            addCriterion("primarykey >=", value, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyLessThan(Long value) {
//            addCriterion("primarykey <", value, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyLessThanOrEqualTo(Long value) {
//            addCriterion("primarykey <=", value, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyIn(List<Long> values) {
//            addCriterion("primarykey in", values, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyNotIn(List<Long> values) {
//            addCriterion("primarykey not in", values, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyBetween(Long value1, Long value2) {
//            addCriterion("primarykey between", value1, value2, "primarykey");
//            return (Criteria) this;
//        }
//
//        public Criteria andPrimarykeyNotBetween(Long value1, Long value2) {
//            addCriterion("primarykey not between", value1, value2, "primarykey");
//            return (Criteria) this;
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
//        public Criteria andIdEqualTo(String value) {
//            addCriterion("id =", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotEqualTo(String value) {
//            addCriterion("id <>", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdGreaterThan(String value) {
//            addCriterion("id >", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdGreaterThanOrEqualTo(String value) {
//            addCriterion("id >=", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLessThan(String value) {
//            addCriterion("id <", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLessThanOrEqualTo(String value) {
//            addCriterion("id <=", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLike(String value) {
//            addCriterion("id like", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotLike(String value) {
//            addCriterion("id not like", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdIn(List<String> values) {
//            addCriterion("id in", values, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotIn(List<String> values) {
//            addCriterion("id not in", values, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdBetween(String value1, String value2) {
//            addCriterion("id between", value1, value2, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotBetween(String value1, String value2) {
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
//        public Criteria andSourceIsNull() {
//            addCriterion("source is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIsNotNull() {
//            addCriterion("source is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceEqualTo(Byte value) {
//            addCriterion("source =", value, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNotEqualTo(Byte value) {
//            addCriterion("source <>", value, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceGreaterThan(Byte value) {
//            addCriterion("source >", value, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceGreaterThanOrEqualTo(Byte value) {
//            addCriterion("source >=", value, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceLessThan(Byte value) {
//            addCriterion("source <", value, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceLessThanOrEqualTo(Byte value) {
//            addCriterion("source <=", value, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIn(List<Byte> values) {
//            addCriterion("source in", values, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNotIn(List<Byte> values) {
//            addCriterion("source not in", values, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceBetween(Byte value1, Byte value2) {
//            addCriterion("source between", value1, value2, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNotBetween(Byte value1, Byte value2) {
//            addCriterion("source not between", value1, value2, "source");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdIsNull() {
//            addCriterion("source_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdIsNotNull() {
//            addCriterion("source_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdEqualTo(Integer value) {
//            addCriterion("source_id =", value, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdNotEqualTo(Integer value) {
//            addCriterion("source_id <>", value, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdGreaterThan(Integer value) {
//            addCriterion("source_id >", value, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("source_id >=", value, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdLessThan(Integer value) {
//            addCriterion("source_id <", value, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdLessThanOrEqualTo(Integer value) {
//            addCriterion("source_id <=", value, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdIn(List<Integer> values) {
//            addCriterion("source_id in", values, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdNotIn(List<Integer> values) {
//            addCriterion("source_id not in", values, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdBetween(Integer value1, Integer value2) {
//            addCriterion("source_id between", value1, value2, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("source_id not between", value1, value2, "sourceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileIsNull() {
//            addCriterion("source_mobile is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileIsNotNull() {
//            addCriterion("source_mobile is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileEqualTo(String value) {
//            addCriterion("source_mobile =", value, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileNotEqualTo(String value) {
//            addCriterion("source_mobile <>", value, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileGreaterThan(String value) {
//            addCriterion("source_mobile >", value, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileGreaterThanOrEqualTo(String value) {
//            addCriterion("source_mobile >=", value, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileLessThan(String value) {
//            addCriterion("source_mobile <", value, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileLessThanOrEqualTo(String value) {
//            addCriterion("source_mobile <=", value, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileLike(String value) {
//            addCriterion("source_mobile like", value, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileNotLike(String value) {
//            addCriterion("source_mobile not like", value, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileIn(List<String> values) {
//            addCriterion("source_mobile in", values, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileNotIn(List<String> values) {
//            addCriterion("source_mobile not in", values, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileBetween(String value1, String value2) {
//            addCriterion("source_mobile between", value1, value2, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceMobileNotBetween(String value1, String value2) {
//            addCriterion("source_mobile not between", value1, value2, "sourceMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameIsNull() {
//            addCriterion("source_name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameIsNotNull() {
//            addCriterion("source_name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameEqualTo(String value) {
//            addCriterion("source_name =", value, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameNotEqualTo(String value) {
//            addCriterion("source_name <>", value, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameGreaterThan(String value) {
//            addCriterion("source_name >", value, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameGreaterThanOrEqualTo(String value) {
//            addCriterion("source_name >=", value, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameLessThan(String value) {
//            addCriterion("source_name <", value, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameLessThanOrEqualTo(String value) {
//            addCriterion("source_name <=", value, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameLike(String value) {
//            addCriterion("source_name like", value, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameNotLike(String value) {
//            addCriterion("source_name not like", value, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameIn(List<String> values) {
//            addCriterion("source_name in", values, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameNotIn(List<String> values) {
//            addCriterion("source_name not in", values, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameBetween(String value1, String value2) {
//            addCriterion("source_name between", value1, value2, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andSourceNameNotBetween(String value1, String value2) {
//            addCriterion("source_name not between", value1, value2, "sourceName");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyIsNull() {
//            addCriterion("classify is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyIsNotNull() {
//            addCriterion("classify is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyEqualTo(Integer value) {
//            addCriterion("classify =", value, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyNotEqualTo(Integer value) {
//            addCriterion("classify <>", value, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyGreaterThan(Integer value) {
//            addCriterion("classify >", value, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyGreaterThanOrEqualTo(Integer value) {
//            addCriterion("classify >=", value, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyLessThan(Integer value) {
//            addCriterion("classify <", value, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyLessThanOrEqualTo(Integer value) {
//            addCriterion("classify <=", value, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyIn(List<Integer> values) {
//            addCriterion("classify in", values, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyNotIn(List<Integer> values) {
//            addCriterion("classify not in", values, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyBetween(Integer value1, Integer value2) {
//            addCriterion("classify between", value1, value2, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andClassifyNotBetween(Integer value1, Integer value2) {
//            addCriterion("classify not between", value1, value2, "classify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyIsNull() {
//            addCriterion("subclassify is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyIsNotNull() {
//            addCriterion("subclassify is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyEqualTo(Integer value) {
//            addCriterion("subclassify =", value, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyNotEqualTo(Integer value) {
//            addCriterion("subclassify <>", value, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyGreaterThan(Integer value) {
//            addCriterion("subclassify >", value, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyGreaterThanOrEqualTo(Integer value) {
//            addCriterion("subclassify >=", value, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyLessThan(Integer value) {
//            addCriterion("subclassify <", value, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyLessThanOrEqualTo(Integer value) {
//            addCriterion("subclassify <=", value, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyIn(List<Integer> values) {
//            addCriterion("subclassify in", values, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyNotIn(List<Integer> values) {
//            addCriterion("subclassify not in", values, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyBetween(Integer value1, Integer value2) {
//            addCriterion("subclassify between", value1, value2, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andSubclassifyNotBetween(Integer value1, Integer value2) {
//            addCriterion("subclassify not between", value1, value2, "subclassify");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeIsNull() {
//            addCriterion("item_code is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeIsNotNull() {
//            addCriterion("item_code is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeEqualTo(String value) {
//            addCriterion("item_code =", value, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeNotEqualTo(String value) {
//            addCriterion("item_code <>", value, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeGreaterThan(String value) {
//            addCriterion("item_code >", value, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
//            addCriterion("item_code >=", value, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeLessThan(String value) {
//            addCriterion("item_code <", value, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeLessThanOrEqualTo(String value) {
//            addCriterion("item_code <=", value, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeLike(String value) {
//            addCriterion("item_code like", value, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeNotLike(String value) {
//            addCriterion("item_code not like", value, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeIn(List<String> values) {
//            addCriterion("item_code in", values, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeNotIn(List<String> values) {
//            addCriterion("item_code not in", values, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeBetween(String value1, String value2) {
//            addCriterion("item_code between", value1, value2, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andItemCodeNotBetween(String value1, String value2) {
//            addCriterion("item_code not between", value1, value2, "itemCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIsNull() {
//            addCriterion("target is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIsNotNull() {
//            addCriterion("target is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetEqualTo(Byte value) {
//            addCriterion("target =", value, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNotEqualTo(Byte value) {
//            addCriterion("target <>", value, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetGreaterThan(Byte value) {
//            addCriterion("target >", value, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetGreaterThanOrEqualTo(Byte value) {
//            addCriterion("target >=", value, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetLessThan(Byte value) {
//            addCriterion("target <", value, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetLessThanOrEqualTo(Byte value) {
//            addCriterion("target <=", value, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIn(List<Byte> values) {
//            addCriterion("target in", values, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNotIn(List<Byte> values) {
//            addCriterion("target not in", values, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetBetween(Byte value1, Byte value2) {
//            addCriterion("target between", value1, value2, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNotBetween(Byte value1, Byte value2) {
//            addCriterion("target not between", value1, value2, "target");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdIsNull() {
//            addCriterion("target_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdIsNotNull() {
//            addCriterion("target_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdEqualTo(Integer value) {
//            addCriterion("target_id =", value, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdNotEqualTo(Integer value) {
//            addCriterion("target_id <>", value, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdGreaterThan(Integer value) {
//            addCriterion("target_id >", value, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("target_id >=", value, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdLessThan(Integer value) {
//            addCriterion("target_id <", value, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdLessThanOrEqualTo(Integer value) {
//            addCriterion("target_id <=", value, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdIn(List<Integer> values) {
//            addCriterion("target_id in", values, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdNotIn(List<Integer> values) {
//            addCriterion("target_id not in", values, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdBetween(Integer value1, Integer value2) {
//            addCriterion("target_id between", value1, value2, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("target_id not between", value1, value2, "targetId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameIsNull() {
//            addCriterion("target_name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameIsNotNull() {
//            addCriterion("target_name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameEqualTo(String value) {
//            addCriterion("target_name =", value, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameNotEqualTo(String value) {
//            addCriterion("target_name <>", value, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameGreaterThan(String value) {
//            addCriterion("target_name >", value, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameGreaterThanOrEqualTo(String value) {
//            addCriterion("target_name >=", value, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameLessThan(String value) {
//            addCriterion("target_name <", value, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameLessThanOrEqualTo(String value) {
//            addCriterion("target_name <=", value, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameLike(String value) {
//            addCriterion("target_name like", value, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameNotLike(String value) {
//            addCriterion("target_name not like", value, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameIn(List<String> values) {
//            addCriterion("target_name in", values, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameNotIn(List<String> values) {
//            addCriterion("target_name not in", values, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameBetween(String value1, String value2) {
//            addCriterion("target_name between", value1, value2, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetNameNotBetween(String value1, String value2) {
//            addCriterion("target_name not between", value1, value2, "targetName");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileIsNull() {
//            addCriterion("target_mobile is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileIsNotNull() {
//            addCriterion("target_mobile is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileEqualTo(String value) {
//            addCriterion("target_mobile =", value, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileNotEqualTo(String value) {
//            addCriterion("target_mobile <>", value, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileGreaterThan(String value) {
//            addCriterion("target_mobile >", value, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileGreaterThanOrEqualTo(String value) {
//            addCriterion("target_mobile >=", value, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileLessThan(String value) {
//            addCriterion("target_mobile <", value, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileLessThanOrEqualTo(String value) {
//            addCriterion("target_mobile <=", value, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileLike(String value) {
//            addCriterion("target_mobile like", value, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileNotLike(String value) {
//            addCriterion("target_mobile not like", value, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileIn(List<String> values) {
//            addCriterion("target_mobile in", values, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileNotIn(List<String> values) {
//            addCriterion("target_mobile not in", values, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileBetween(String value1, String value2) {
//            addCriterion("target_mobile between", value1, value2, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetMobileNotBetween(String value1, String value2) {
//            addCriterion("target_mobile not between", value1, value2, "targetMobile");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdIsNull() {
//            addCriterion("target_region_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdIsNotNull() {
//            addCriterion("target_region_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdEqualTo(Integer value) {
//            addCriterion("target_region_id =", value, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdNotEqualTo(Integer value) {
//            addCriterion("target_region_id <>", value, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdGreaterThan(Integer value) {
//            addCriterion("target_region_id >", value, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("target_region_id >=", value, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdLessThan(Integer value) {
//            addCriterion("target_region_id <", value, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdLessThanOrEqualTo(Integer value) {
//            addCriterion("target_region_id <=", value, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdIn(List<Integer> values) {
//            addCriterion("target_region_id in", values, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdNotIn(List<Integer> values) {
//            addCriterion("target_region_id not in", values, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdBetween(Integer value1, Integer value2) {
//            addCriterion("target_region_id between", value1, value2, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetRegionIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("target_region_id not between", value1, value2, "targetRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdIsNull() {
//            addCriterion("service_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdIsNotNull() {
//            addCriterion("service_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdEqualTo(String value) {
//            addCriterion("service_id =", value, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdNotEqualTo(String value) {
//            addCriterion("service_id <>", value, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdGreaterThan(String value) {
//            addCriterion("service_id >", value, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
//            addCriterion("service_id >=", value, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdLessThan(String value) {
//            addCriterion("service_id <", value, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdLessThanOrEqualTo(String value) {
//            addCriterion("service_id <=", value, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdLike(String value) {
//            addCriterion("service_id like", value, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdNotLike(String value) {
//            addCriterion("service_id not like", value, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdIn(List<String> values) {
//            addCriterion("service_id in", values, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdNotIn(List<String> values) {
//            addCriterion("service_id not in", values, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdBetween(String value1, String value2) {
//            addCriterion("service_id between", value1, value2, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andServiceIdNotBetween(String value1, String value2) {
//            addCriterion("service_id not between", value1, value2, "serviceId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdIsNull() {
//            addCriterion("channel_work_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdIsNotNull() {
//            addCriterion("channel_work_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdEqualTo(String value) {
//            addCriterion("channel_work_id =", value, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdNotEqualTo(String value) {
//            addCriterion("channel_work_id <>", value, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdGreaterThan(String value) {
//            addCriterion("channel_work_id >", value, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdGreaterThanOrEqualTo(String value) {
//            addCriterion("channel_work_id >=", value, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdLessThan(String value) {
//            addCriterion("channel_work_id <", value, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdLessThanOrEqualTo(String value) {
//            addCriterion("channel_work_id <=", value, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdLike(String value) {
//            addCriterion("channel_work_id like", value, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdNotLike(String value) {
//            addCriterion("channel_work_id not like", value, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdIn(List<String> values) {
//            addCriterion("channel_work_id in", values, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdNotIn(List<String> values) {
//            addCriterion("channel_work_id not in", values, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdBetween(String value1, String value2) {
//            addCriterion("channel_work_id between", value1, value2, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelWorkIdNotBetween(String value1, String value2) {
//            addCriterion("channel_work_id not between", value1, value2, "channelWorkId");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleIsNull() {
//            addCriterion("receive_role is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleIsNotNull() {
//            addCriterion("receive_role is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleEqualTo(String value) {
//            addCriterion("receive_role =", value, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleNotEqualTo(String value) {
//            addCriterion("receive_role <>", value, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleGreaterThan(String value) {
//            addCriterion("receive_role >", value, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleGreaterThanOrEqualTo(String value) {
//            addCriterion("receive_role >=", value, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleLessThan(String value) {
//            addCriterion("receive_role <", value, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleLessThanOrEqualTo(String value) {
//            addCriterion("receive_role <=", value, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleLike(String value) {
//            addCriterion("receive_role like", value, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleNotLike(String value) {
//            addCriterion("receive_role not like", value, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleIn(List<String> values) {
//            addCriterion("receive_role in", values, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleNotIn(List<String> values) {
//            addCriterion("receive_role not in", values, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleBetween(String value1, String value2) {
//            addCriterion("receive_role between", value1, value2, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiveRoleNotBetween(String value1, String value2) {
//            addCriterion("receive_role not between", value1, value2, "receiveRole");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverIsNull() {
//            addCriterion("receiver is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverIsNotNull() {
//            addCriterion("receiver is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverEqualTo(String value) {
//            addCriterion("receiver =", value, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverNotEqualTo(String value) {
//            addCriterion("receiver <>", value, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverGreaterThan(String value) {
//            addCriterion("receiver >", value, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
//            addCriterion("receiver >=", value, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverLessThan(String value) {
//            addCriterion("receiver <", value, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverLessThanOrEqualTo(String value) {
//            addCriterion("receiver <=", value, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverLike(String value) {
//            addCriterion("receiver like", value, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverNotLike(String value) {
//            addCriterion("receiver not like", value, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverIn(List<String> values) {
//            addCriterion("receiver in", values, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverNotIn(List<String> values) {
//            addCriterion("receiver not in", values, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverBetween(String value1, String value2) {
//            addCriterion("receiver between", value1, value2, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andReceiverNotBetween(String value1, String value2) {
//            addCriterion("receiver not between", value1, value2, "receiver");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterIsNull() {
//            addCriterion("accepter is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterIsNotNull() {
//            addCriterion("accepter is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterEqualTo(String value) {
//            addCriterion("accepter =", value, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterNotEqualTo(String value) {
//            addCriterion("accepter <>", value, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterGreaterThan(String value) {
//            addCriterion("accepter >", value, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterGreaterThanOrEqualTo(String value) {
//            addCriterion("accepter >=", value, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterLessThan(String value) {
//            addCriterion("accepter <", value, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterLessThanOrEqualTo(String value) {
//            addCriterion("accepter <=", value, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterLike(String value) {
//            addCriterion("accepter like", value, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterNotLike(String value) {
//            addCriterion("accepter not like", value, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterIn(List<String> values) {
//            addCriterion("accepter in", values, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterNotIn(List<String> values) {
//            addCriterion("accepter not in", values, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterBetween(String value1, String value2) {
//            addCriterion("accepter between", value1, value2, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andAccepterNotBetween(String value1, String value2) {
//            addCriterion("accepter not between", value1, value2, "accepter");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusIsNull() {
//            addCriterion("status is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusIsNotNull() {
//            addCriterion("status is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusEqualTo(Byte value) {
//            addCriterion("status =", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusNotEqualTo(Byte value) {
//            addCriterion("status <>", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusGreaterThan(Byte value) {
//            addCriterion("status >", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
//            addCriterion("status >=", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusLessThan(Byte value) {
//            addCriterion("status <", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusLessThanOrEqualTo(Byte value) {
//            addCriterion("status <=", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusIn(List<Byte> values) {
//            addCriterion("status in", values, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusNotIn(List<Byte> values) {
//            addCriterion("status not in", values, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusBetween(Byte value1, Byte value2) {
//            addCriterion("status between", value1, value2, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
//            addCriterion("status not between", value1, value2, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityIsNull() {
//            addCriterion("priority is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityIsNotNull() {
//            addCriterion("priority is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityEqualTo(Byte value) {
//            addCriterion("priority =", value, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityNotEqualTo(Byte value) {
//            addCriterion("priority <>", value, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityGreaterThan(Byte value) {
//            addCriterion("priority >", value, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityGreaterThanOrEqualTo(Byte value) {
//            addCriterion("priority >=", value, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityLessThan(Byte value) {
//            addCriterion("priority <", value, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityLessThanOrEqualTo(Byte value) {
//            addCriterion("priority <=", value, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityIn(List<Byte> values) {
//            addCriterion("priority in", values, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityNotIn(List<Byte> values) {
//            addCriterion("priority not in", values, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityBetween(Byte value1, Byte value2) {
//            addCriterion("priority between", value1, value2, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andPriorityNotBetween(Byte value1, Byte value2) {
//            addCriterion("priority not between", value1, value2, "priority");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentIsNull() {
//            addCriterion("attachment is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentIsNotNull() {
//            addCriterion("attachment is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentEqualTo(String value) {
//            addCriterion("attachment =", value, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentNotEqualTo(String value) {
//            addCriterion("attachment <>", value, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentGreaterThan(String value) {
//            addCriterion("attachment >", value, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
//            addCriterion("attachment >=", value, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentLessThan(String value) {
//            addCriterion("attachment <", value, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentLessThanOrEqualTo(String value) {
//            addCriterion("attachment <=", value, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentLike(String value) {
//            addCriterion("attachment like", value, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentNotLike(String value) {
//            addCriterion("attachment not like", value, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentIn(List<String> values) {
//            addCriterion("attachment in", values, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentNotIn(List<String> values) {
//            addCriterion("attachment not in", values, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentBetween(String value1, String value2) {
//            addCriterion("attachment between", value1, value2, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andAttachmentNotBetween(String value1, String value2) {
//            addCriterion("attachment not between", value1, value2, "attachment");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataIsNull() {
//            addCriterion("wdata is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataIsNotNull() {
//            addCriterion("wdata is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataEqualTo(String value) {
//            addCriterion("wdata =", value, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataNotEqualTo(String value) {
//            addCriterion("wdata <>", value, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataGreaterThan(String value) {
//            addCriterion("wdata >", value, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataGreaterThanOrEqualTo(String value) {
//            addCriterion("wdata >=", value, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataLessThan(String value) {
//            addCriterion("wdata <", value, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataLessThanOrEqualTo(String value) {
//            addCriterion("wdata <=", value, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataLike(String value) {
//            addCriterion("wdata like", value, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataNotLike(String value) {
//            addCriterion("wdata not like", value, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataIn(List<String> values) {
//            addCriterion("wdata in", values, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataNotIn(List<String> values) {
//            addCriterion("wdata not in", values, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataBetween(String value1, String value2) {
//            addCriterion("wdata between", value1, value2, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andWdataNotBetween(String value1, String value2) {
//            addCriterion("wdata not between", value1, value2, "wdata");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultIsNull() {
//            addCriterion("result is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultIsNotNull() {
//            addCriterion("result is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultEqualTo(Byte value) {
//            addCriterion("result =", value, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultNotEqualTo(Byte value) {
//            addCriterion("result <>", value, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultGreaterThan(Byte value) {
//            addCriterion("result >", value, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultGreaterThanOrEqualTo(Byte value) {
//            addCriterion("result >=", value, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultLessThan(Byte value) {
//            addCriterion("result <", value, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultLessThanOrEqualTo(Byte value) {
//            addCriterion("result <=", value, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultIn(List<Byte> values) {
//            addCriterion("result in", values, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultNotIn(List<Byte> values) {
//            addCriterion("result not in", values, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultBetween(Byte value1, Byte value2) {
//            addCriterion("result between", value1, value2, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultNotBetween(Byte value1, Byte value2) {
//            addCriterion("result not between", value1, value2, "result");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentIsNull() {
//            addCriterion("result_content is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentIsNotNull() {
//            addCriterion("result_content is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentEqualTo(String value) {
//            addCriterion("result_content =", value, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentNotEqualTo(String value) {
//            addCriterion("result_content <>", value, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentGreaterThan(String value) {
//            addCriterion("result_content >", value, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentGreaterThanOrEqualTo(String value) {
//            addCriterion("result_content >=", value, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentLessThan(String value) {
//            addCriterion("result_content <", value, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentLessThanOrEqualTo(String value) {
//            addCriterion("result_content <=", value, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentLike(String value) {
//            addCriterion("result_content like", value, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentNotLike(String value) {
//            addCriterion("result_content not like", value, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentIn(List<String> values) {
//            addCriterion("result_content in", values, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentNotIn(List<String> values) {
//            addCriterion("result_content not in", values, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentBetween(String value1, String value2) {
//            addCriterion("result_content between", value1, value2, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andResultContentNotBetween(String value1, String value2) {
//            addCriterion("result_content not between", value1, value2, "resultContent");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceIsNull() {
//            addCriterion("create_source is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceIsNotNull() {
//            addCriterion("create_source is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceEqualTo(Byte value) {
//            addCriterion("create_source =", value, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceNotEqualTo(Byte value) {
//            addCriterion("create_source <>", value, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceGreaterThan(Byte value) {
//            addCriterion("create_source >", value, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceGreaterThanOrEqualTo(Byte value) {
//            addCriterion("create_source >=", value, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceLessThan(Byte value) {
//            addCriterion("create_source <", value, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceLessThanOrEqualTo(Byte value) {
//            addCriterion("create_source <=", value, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceIn(List<Byte> values) {
//            addCriterion("create_source in", values, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceNotIn(List<Byte> values) {
//            addCriterion("create_source not in", values, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceBetween(Byte value1, Byte value2) {
//            addCriterion("create_source between", value1, value2, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateSourceNotBetween(Byte value1, Byte value2) {
//            addCriterion("create_source not between", value1, value2, "createSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeIsNull() {
//            addCriterion("create_time is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeIsNotNull() {
//            addCriterion("create_time is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeEqualTo(Date value) {
//            addCriterion("create_time =", value, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeNotEqualTo(Date value) {
//            addCriterion("create_time <>", value, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeGreaterThan(Date value) {
//            addCriterion("create_time >", value, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
//            addCriterion("create_time >=", value, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeLessThan(Date value) {
//            addCriterion("create_time <", value, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
//            addCriterion("create_time <=", value, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeIn(List<Date> values) {
//            addCriterion("create_time in", values, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeNotIn(List<Date> values) {
//            addCriterion("create_time not in", values, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeBetween(Date value1, Date value2) {
//            addCriterion("create_time between", value1, value2, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
//            addCriterion("create_time not between", value1, value2, "createTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeIsNull() {
//            addCriterion("accept_time is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeIsNotNull() {
//            addCriterion("accept_time is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeEqualTo(Date value) {
//            addCriterion("accept_time =", value, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeNotEqualTo(Date value) {
//            addCriterion("accept_time <>", value, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeGreaterThan(Date value) {
//            addCriterion("accept_time >", value, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeGreaterThanOrEqualTo(Date value) {
//            addCriterion("accept_time >=", value, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeLessThan(Date value) {
//            addCriterion("accept_time <", value, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeLessThanOrEqualTo(Date value) {
//            addCriterion("accept_time <=", value, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeIn(List<Date> values) {
//            addCriterion("accept_time in", values, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeNotIn(List<Date> values) {
//            addCriterion("accept_time not in", values, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeBetween(Date value1, Date value2) {
//            addCriterion("accept_time between", value1, value2, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTimeNotBetween(Date value1, Date value2) {
//            addCriterion("accept_time not between", value1, value2, "acceptTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeIsNull() {
//            addCriterion("require_time is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeIsNotNull() {
//            addCriterion("require_time is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeEqualTo(Date value) {
//            addCriterion("require_time =", value, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeNotEqualTo(Date value) {
//            addCriterion("require_time <>", value, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeGreaterThan(Date value) {
//            addCriterion("require_time >", value, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeGreaterThanOrEqualTo(Date value) {
//            addCriterion("require_time >=", value, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeLessThan(Date value) {
//            addCriterion("require_time <", value, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeLessThanOrEqualTo(Date value) {
//            addCriterion("require_time <=", value, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeIn(List<Date> values) {
//            addCriterion("require_time in", values, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeNotIn(List<Date> values) {
//            addCriterion("require_time not in", values, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeBetween(Date value1, Date value2) {
//            addCriterion("require_time between", value1, value2, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTimeNotBetween(Date value1, Date value2) {
//            addCriterion("require_time not between", value1, value2, "requireTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeIsNull() {
//            addCriterion("resolved_time is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeIsNotNull() {
//            addCriterion("resolved_time is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeEqualTo(Date value) {
//            addCriterion("resolved_time =", value, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeNotEqualTo(Date value) {
//            addCriterion("resolved_time <>", value, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeGreaterThan(Date value) {
//            addCriterion("resolved_time >", value, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeGreaterThanOrEqualTo(Date value) {
//            addCriterion("resolved_time >=", value, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeLessThan(Date value) {
//            addCriterion("resolved_time <", value, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeLessThanOrEqualTo(Date value) {
//            addCriterion("resolved_time <=", value, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeIn(List<Date> values) {
//            addCriterion("resolved_time in", values, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeNotIn(List<Date> values) {
//            addCriterion("resolved_time not in", values, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeBetween(Date value1, Date value2) {
//            addCriterion("resolved_time between", value1, value2, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andResolvedTimeNotBetween(Date value1, Date value2) {
//            addCriterion("resolved_time not between", value1, value2, "resolvedTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeIsNull() {
//            addCriterion("action_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeIsNotNull() {
//            addCriterion("action_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeEqualTo(Byte value) {
//            addCriterion("action_type =", value, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeNotEqualTo(Byte value) {
//            addCriterion("action_type <>", value, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeGreaterThan(Byte value) {
//            addCriterion("action_type >", value, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("action_type >=", value, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeLessThan(Byte value) {
//            addCriterion("action_type <", value, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("action_type <=", value, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeIn(List<Byte> values) {
//            addCriterion("action_type in", values, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeNotIn(List<Byte> values) {
//            addCriterion("action_type not in", values, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeBetween(Byte value1, Byte value2) {
//            addCriterion("action_type between", value1, value2, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("action_type not between", value1, value2, "actionType");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueIsNull() {
//            addCriterion("action_value is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueIsNotNull() {
//            addCriterion("action_value is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueEqualTo(BigDecimal value) {
//            addCriterion("action_value =", value, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueNotEqualTo(BigDecimal value) {
//            addCriterion("action_value <>", value, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueGreaterThan(BigDecimal value) {
//            addCriterion("action_value >", value, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueGreaterThanOrEqualTo(BigDecimal value) {
//            addCriterion("action_value >=", value, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueLessThan(BigDecimal value) {
//            addCriterion("action_value <", value, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueLessThanOrEqualTo(BigDecimal value) {
//            addCriterion("action_value <=", value, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueIn(List<BigDecimal> values) {
//            addCriterion("action_value in", values, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueNotIn(List<BigDecimal> values) {
//            addCriterion("action_value not in", values, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("action_value between", value1, value2, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionValueNotBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("action_value not between", value1, value2, "actionValue");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultIsNull() {
//            addCriterion("action_result is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultIsNotNull() {
//            addCriterion("action_result is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultEqualTo(Byte value) {
//            addCriterion("action_result =", value, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultNotEqualTo(Byte value) {
//            addCriterion("action_result <>", value, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultGreaterThan(Byte value) {
//            addCriterion("action_result >", value, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultGreaterThanOrEqualTo(Byte value) {
//            addCriterion("action_result >=", value, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultLessThan(Byte value) {
//            addCriterion("action_result <", value, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultLessThanOrEqualTo(Byte value) {
//            addCriterion("action_result <=", value, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultIn(List<Byte> values) {
//            addCriterion("action_result in", values, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultNotIn(List<Byte> values) {
//            addCriterion("action_result not in", values, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultBetween(Byte value1, Byte value2) {
//            addCriterion("action_result between", value1, value2, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionResultNotBetween(Byte value1, Byte value2) {
//            addCriterion("action_result not between", value1, value2, "actionResult");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeIsNull() {
//            addCriterion("action_time is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeIsNotNull() {
//            addCriterion("action_time is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeEqualTo(Date value) {
//            addCriterion("action_time =", value, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeNotEqualTo(Date value) {
//            addCriterion("action_time <>", value, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeGreaterThan(Date value) {
//            addCriterion("action_time >", value, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeGreaterThanOrEqualTo(Date value) {
//            addCriterion("action_time >=", value, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeLessThan(Date value) {
//            addCriterion("action_time <", value, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeLessThanOrEqualTo(Date value) {
//            addCriterion("action_time <=", value, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeIn(List<Date> values) {
//            addCriterion("action_time in", values, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeNotIn(List<Date> values) {
//            addCriterion("action_time not in", values, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeBetween(Date value1, Date value2) {
//            addCriterion("action_time between", value1, value2, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andActionTimeNotBetween(Date value1, Date value2) {
//            addCriterion("action_time not between", value1, value2, "actionTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountIsNull() {
//            addCriterion("refund_account is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountIsNotNull() {
//            addCriterion("refund_account is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountEqualTo(String value) {
//            addCriterion("refund_account =", value, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNotEqualTo(String value) {
//            addCriterion("refund_account <>", value, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountGreaterThan(String value) {
//            addCriterion("refund_account >", value, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountGreaterThanOrEqualTo(String value) {
//            addCriterion("refund_account >=", value, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountLessThan(String value) {
//            addCriterion("refund_account <", value, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountLessThanOrEqualTo(String value) {
//            addCriterion("refund_account <=", value, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountLike(String value) {
//            addCriterion("refund_account like", value, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNotLike(String value) {
//            addCriterion("refund_account not like", value, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountIn(List<String> values) {
//            addCriterion("refund_account in", values, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNotIn(List<String> values) {
//            addCriterion("refund_account not in", values, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountBetween(String value1, String value2) {
//            addCriterion("refund_account between", value1, value2, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNotBetween(String value1, String value2) {
//            addCriterion("refund_account not between", value1, value2, "refundAccount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameIsNull() {
//            addCriterion("refund_account_name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameIsNotNull() {
//            addCriterion("refund_account_name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameEqualTo(String value) {
//            addCriterion("refund_account_name =", value, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameNotEqualTo(String value) {
//            addCriterion("refund_account_name <>", value, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameGreaterThan(String value) {
//            addCriterion("refund_account_name >", value, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameGreaterThanOrEqualTo(String value) {
//            addCriterion("refund_account_name >=", value, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameLessThan(String value) {
//            addCriterion("refund_account_name <", value, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameLessThanOrEqualTo(String value) {
//            addCriterion("refund_account_name <=", value, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameLike(String value) {
//            addCriterion("refund_account_name like", value, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameNotLike(String value) {
//            addCriterion("refund_account_name not like", value, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameIn(List<String> values) {
//            addCriterion("refund_account_name in", values, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameNotIn(List<String> values) {
//            addCriterion("refund_account_name not in", values, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameBetween(String value1, String value2) {
//            addCriterion("refund_account_name between", value1, value2, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andRefundAccountNameNotBetween(String value1, String value2) {
//            addCriterion("refund_account_name not between", value1, value2, "refundAccountName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdIsNull() {
//            addCriterion("platform_shop_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdIsNotNull() {
//            addCriterion("platform_shop_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdEqualTo(Integer value) {
//            addCriterion("platform_shop_id =", value, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdNotEqualTo(Integer value) {
//            addCriterion("platform_shop_id <>", value, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdGreaterThan(Integer value) {
//            addCriterion("platform_shop_id >", value, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("platform_shop_id >=", value, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdLessThan(Integer value) {
//            addCriterion("platform_shop_id <", value, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdLessThanOrEqualTo(Integer value) {
//            addCriterion("platform_shop_id <=", value, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdIn(List<Integer> values) {
//            addCriterion("platform_shop_id in", values, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdNotIn(List<Integer> values) {
//            addCriterion("platform_shop_id not in", values, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdBetween(Integer value1, Integer value2) {
//            addCriterion("platform_shop_id between", value1, value2, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("platform_shop_id not between", value1, value2, "platformShopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1IsNull() {
//            addCriterion("extra1 is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1IsNotNull() {
//            addCriterion("extra1 is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1EqualTo(String value) {
//            addCriterion("extra1 =", value, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1NotEqualTo(String value) {
//            addCriterion("extra1 <>", value, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1GreaterThan(String value) {
//            addCriterion("extra1 >", value, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1GreaterThanOrEqualTo(String value) {
//            addCriterion("extra1 >=", value, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1LessThan(String value) {
//            addCriterion("extra1 <", value, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1LessThanOrEqualTo(String value) {
//            addCriterion("extra1 <=", value, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1Like(String value) {
//            addCriterion("extra1 like", value, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1NotLike(String value) {
//            addCriterion("extra1 not like", value, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1In(List<String> values) {
//            addCriterion("extra1 in", values, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1NotIn(List<String> values) {
//            addCriterion("extra1 not in", values, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1Between(String value1, String value2) {
//            addCriterion("extra1 between", value1, value2, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andExtra1NotBetween(String value1, String value2) {
//            addCriterion("extra1 not between", value1, value2, "extra1");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoIsNull() {
//            addCriterion("creator_no is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoIsNotNull() {
//            addCriterion("creator_no is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoEqualTo(String value) {
//            addCriterion("creator_no =", value, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoNotEqualTo(String value) {
//            addCriterion("creator_no <>", value, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoGreaterThan(String value) {
//            addCriterion("creator_no >", value, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoGreaterThanOrEqualTo(String value) {
//            addCriterion("creator_no >=", value, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoLessThan(String value) {
//            addCriterion("creator_no <", value, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoLessThanOrEqualTo(String value) {
//            addCriterion("creator_no <=", value, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoLike(String value) {
//            addCriterion("creator_no like", value, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoNotLike(String value) {
//            addCriterion("creator_no not like", value, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoIn(List<String> values) {
//            addCriterion("creator_no in", values, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoNotIn(List<String> values) {
//            addCriterion("creator_no not in", values, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoBetween(String value1, String value2) {
//            addCriterion("creator_no between", value1, value2, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNoNotBetween(String value1, String value2) {
//            addCriterion("creator_no not between", value1, value2, "creatorNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameIsNull() {
//            addCriterion("creator_name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameIsNotNull() {
//            addCriterion("creator_name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameEqualTo(String value) {
//            addCriterion("creator_name =", value, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameNotEqualTo(String value) {
//            addCriterion("creator_name <>", value, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameGreaterThan(String value) {
//            addCriterion("creator_name >", value, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
//            addCriterion("creator_name >=", value, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameLessThan(String value) {
//            addCriterion("creator_name <", value, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
//            addCriterion("creator_name <=", value, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameLike(String value) {
//            addCriterion("creator_name like", value, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameNotLike(String value) {
//            addCriterion("creator_name not like", value, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameIn(List<String> values) {
//            addCriterion("creator_name in", values, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameNotIn(List<String> values) {
//            addCriterion("creator_name not in", values, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameBetween(String value1, String value2) {
//            addCriterion("creator_name between", value1, value2, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreatorNameNotBetween(String value1, String value2) {
//            addCriterion("creator_name not between", value1, value2, "creatorName");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountIsNull() {
//            addCriterion("urge_count is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountIsNotNull() {
//            addCriterion("urge_count is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountEqualTo(Integer value) {
//            addCriterion("urge_count =", value, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountNotEqualTo(Integer value) {
//            addCriterion("urge_count <>", value, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountGreaterThan(Integer value) {
//            addCriterion("urge_count >", value, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountGreaterThanOrEqualTo(Integer value) {
//            addCriterion("urge_count >=", value, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountLessThan(Integer value) {
//            addCriterion("urge_count <", value, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountLessThanOrEqualTo(Integer value) {
//            addCriterion("urge_count <=", value, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountIn(List<Integer> values) {
//            addCriterion("urge_count in", values, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountNotIn(List<Integer> values) {
//            addCriterion("urge_count not in", values, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountBetween(Integer value1, Integer value2) {
//            addCriterion("urge_count between", value1, value2, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andUrgeCountNotBetween(Integer value1, Integer value2) {
//            addCriterion("urge_count not between", value1, value2, "urgeCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceIsNull() {
//            addCriterion("relevance is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceIsNotNull() {
//            addCriterion("relevance is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceEqualTo(String value) {
//            addCriterion("relevance =", value, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceNotEqualTo(String value) {
//            addCriterion("relevance <>", value, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceGreaterThan(String value) {
//            addCriterion("relevance >", value, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceGreaterThanOrEqualTo(String value) {
//            addCriterion("relevance >=", value, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceLessThan(String value) {
//            addCriterion("relevance <", value, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceLessThanOrEqualTo(String value) {
//            addCriterion("relevance <=", value, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceLike(String value) {
//            addCriterion("relevance like", value, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceNotLike(String value) {
//            addCriterion("relevance not like", value, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceIn(List<String> values) {
//            addCriterion("relevance in", values, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceNotIn(List<String> values) {
//            addCriterion("relevance not in", values, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceBetween(String value1, String value2) {
//            addCriterion("relevance between", value1, value2, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelevanceNotBetween(String value1, String value2) {
//            addCriterion("relevance not between", value1, value2, "relevance");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealIsNull() {
//            addCriterion("can_appeal is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealIsNotNull() {
//            addCriterion("can_appeal is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealEqualTo(Byte value) {
//            addCriterion("can_appeal =", value, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealNotEqualTo(Byte value) {
//            addCriterion("can_appeal <>", value, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealGreaterThan(Byte value) {
//            addCriterion("can_appeal >", value, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealGreaterThanOrEqualTo(Byte value) {
//            addCriterion("can_appeal >=", value, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealLessThan(Byte value) {
//            addCriterion("can_appeal <", value, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealLessThanOrEqualTo(Byte value) {
//            addCriterion("can_appeal <=", value, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealIn(List<Byte> values) {
//            addCriterion("can_appeal in", values, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealNotIn(List<Byte> values) {
//            addCriterion("can_appeal not in", values, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealBetween(Byte value1, Byte value2) {
//            addCriterion("can_appeal between", value1, value2, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andCanAppealNotBetween(Byte value1, Byte value2) {
//            addCriterion("can_appeal not between", value1, value2, "canAppeal");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdIsNull() {
//            addCriterion("third_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdIsNotNull() {
//            addCriterion("third_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdEqualTo(String value) {
//            addCriterion("third_id =", value, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdNotEqualTo(String value) {
//            addCriterion("third_id <>", value, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdGreaterThan(String value) {
//            addCriterion("third_id >", value, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdGreaterThanOrEqualTo(String value) {
//            addCriterion("third_id >=", value, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdLessThan(String value) {
//            addCriterion("third_id <", value, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdLessThanOrEqualTo(String value) {
//            addCriterion("third_id <=", value, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdLike(String value) {
//            addCriterion("third_id like", value, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdNotLike(String value) {
//            addCriterion("third_id not like", value, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdIn(List<String> values) {
//            addCriterion("third_id in", values, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdNotIn(List<String> values) {
//            addCriterion("third_id not in", values, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdBetween(String value1, String value2) {
//            addCriterion("third_id between", value1, value2, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIdNotBetween(String value1, String value2) {
//            addCriterion("third_id not between", value1, value2, "thirdId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceIsNull() {
//            addCriterion("relate_source is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceIsNotNull() {
//            addCriterion("relate_source is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceEqualTo(Byte value) {
//            addCriterion("relate_source =", value, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceNotEqualTo(Byte value) {
//            addCriterion("relate_source <>", value, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceGreaterThan(Byte value) {
//            addCriterion("relate_source >", value, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceGreaterThanOrEqualTo(Byte value) {
//            addCriterion("relate_source >=", value, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceLessThan(Byte value) {
//            addCriterion("relate_source <", value, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceLessThanOrEqualTo(Byte value) {
//            addCriterion("relate_source <=", value, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceIn(List<Byte> values) {
//            addCriterion("relate_source in", values, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceNotIn(List<Byte> values) {
//            addCriterion("relate_source not in", values, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceBetween(Byte value1, Byte value2) {
//            addCriterion("relate_source between", value1, value2, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelateSourceNotBetween(Byte value1, Byte value2) {
//            addCriterion("relate_source not between", value1, value2, "relateSource");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleIsNull() {
//            addCriterion("pending_visible is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleIsNotNull() {
//            addCriterion("pending_visible is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleEqualTo(Byte value) {
//            addCriterion("pending_visible =", value, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleNotEqualTo(Byte value) {
//            addCriterion("pending_visible <>", value, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleGreaterThan(Byte value) {
//            addCriterion("pending_visible >", value, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleGreaterThanOrEqualTo(Byte value) {
//            addCriterion("pending_visible >=", value, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleLessThan(Byte value) {
//            addCriterion("pending_visible <", value, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleLessThanOrEqualTo(Byte value) {
//            addCriterion("pending_visible <=", value, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleIn(List<Byte> values) {
//            addCriterion("pending_visible in", values, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleNotIn(List<Byte> values) {
//            addCriterion("pending_visible not in", values, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleBetween(Byte value1, Byte value2) {
//            addCriterion("pending_visible between", value1, value2, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andPendingVisibleNotBetween(Byte value1, Byte value2) {
//            addCriterion("pending_visible not between", value1, value2, "pendingVisible");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoIsNull() {
//            addCriterion("related_batch_no is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoIsNotNull() {
//            addCriterion("related_batch_no is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoEqualTo(String value) {
//            addCriterion("related_batch_no =", value, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoNotEqualTo(String value) {
//            addCriterion("related_batch_no <>", value, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoGreaterThan(String value) {
//            addCriterion("related_batch_no >", value, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoGreaterThanOrEqualTo(String value) {
//            addCriterion("related_batch_no >=", value, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoLessThan(String value) {
//            addCriterion("related_batch_no <", value, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoLessThanOrEqualTo(String value) {
//            addCriterion("related_batch_no <=", value, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoLike(String value) {
//            addCriterion("related_batch_no like", value, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoNotLike(String value) {
//            addCriterion("related_batch_no not like", value, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoIn(List<String> values) {
//            addCriterion("related_batch_no in", values, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoNotIn(List<String> values) {
//            addCriterion("related_batch_no not in", values, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoBetween(String value1, String value2) {
//            addCriterion("related_batch_no between", value1, value2, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andRelatedBatchNoNotBetween(String value1, String value2) {
//            addCriterion("related_batch_no not between", value1, value2, "relatedBatchNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseIsNull() {
//            addCriterion("appraise is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseIsNotNull() {
//            addCriterion("appraise is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseEqualTo(Byte value) {
//            addCriterion("appraise =", value, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseNotEqualTo(Byte value) {
//            addCriterion("appraise <>", value, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseGreaterThan(Byte value) {
//            addCriterion("appraise >", value, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseGreaterThanOrEqualTo(Byte value) {
//            addCriterion("appraise >=", value, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseLessThan(Byte value) {
//            addCriterion("appraise <", value, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseLessThanOrEqualTo(Byte value) {
//            addCriterion("appraise <=", value, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseIn(List<Byte> values) {
//            addCriterion("appraise in", values, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseNotIn(List<Byte> values) {
//            addCriterion("appraise not in", values, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseBetween(Byte value1, Byte value2) {
//            addCriterion("appraise between", value1, value2, "appraise");
//            return (Criteria) this;
//        }
//
//        public Criteria andAppraiseNotBetween(Byte value1, Byte value2) {
//            addCriterion("appraise not between", value1, value2, "appraise");
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