//package com.dwd.www.db.cobarc_shard3.domain;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class OrderExample {
//    protected String orderByClause;
//
//    protected boolean distinct;
//
//    protected List<Criteria> oredCriteria;
//
//    public OrderExample() {
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
//        public Criteria andCodeIsNull() {
//            addCriterion("code is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeIsNotNull() {
//            addCriterion("code is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeEqualTo(String value) {
//            addCriterion("code =", value, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeNotEqualTo(String value) {
//            addCriterion("code <>", value, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeGreaterThan(String value) {
//            addCriterion("code >", value, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeGreaterThanOrEqualTo(String value) {
//            addCriterion("code >=", value, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeLessThan(String value) {
//            addCriterion("code <", value, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeLessThanOrEqualTo(String value) {
//            addCriterion("code <=", value, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeLike(String value) {
//            addCriterion("code like", value, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeNotLike(String value) {
//            addCriterion("code not like", value, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeIn(List<String> values) {
//            addCriterion("code in", values, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeNotIn(List<String> values) {
//            addCriterion("code not in", values, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeBetween(String value1, String value2) {
//            addCriterion("code between", value1, value2, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andCodeNotBetween(String value1, String value2) {
//            addCriterion("code not between", value1, value2, "code");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdIsNull() {
//            addCriterion("shop_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdIsNotNull() {
//            addCriterion("shop_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdEqualTo(Integer value) {
//            addCriterion("shop_id =", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdNotEqualTo(Integer value) {
//            addCriterion("shop_id <>", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdGreaterThan(Integer value) {
//            addCriterion("shop_id >", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("shop_id >=", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdLessThan(Integer value) {
//            addCriterion("shop_id <", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
//            addCriterion("shop_id <=", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdIn(List<Integer> values) {
//            addCriterion("shop_id in", values, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdNotIn(List<Integer> values) {
//            addCriterion("shop_id not in", values, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdBetween(Integer value1, Integer value2) {
//            addCriterion("shop_id between", value1, value2, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("shop_id not between", value1, value2, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleIsNull() {
//            addCriterion("shop_title is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleIsNotNull() {
//            addCriterion("shop_title is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleEqualTo(String value) {
//            addCriterion("shop_title =", value, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleNotEqualTo(String value) {
//            addCriterion("shop_title <>", value, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleGreaterThan(String value) {
//            addCriterion("shop_title >", value, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleGreaterThanOrEqualTo(String value) {
//            addCriterion("shop_title >=", value, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleLessThan(String value) {
//            addCriterion("shop_title <", value, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleLessThanOrEqualTo(String value) {
//            addCriterion("shop_title <=", value, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleLike(String value) {
//            addCriterion("shop_title like", value, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleNotLike(String value) {
//            addCriterion("shop_title not like", value, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleIn(List<String> values) {
//            addCriterion("shop_title in", values, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleNotIn(List<String> values) {
//            addCriterion("shop_title not in", values, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleBetween(String value1, String value2) {
//            addCriterion("shop_title between", value1, value2, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopTitleNotBetween(String value1, String value2) {
//            addCriterion("shop_title not between", value1, value2, "shopTitle");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidIsNull() {
//            addCriterion("platform_shopid is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidIsNotNull() {
//            addCriterion("platform_shopid is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidEqualTo(Integer value) {
//            addCriterion("platform_shopid =", value, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidNotEqualTo(Integer value) {
//            addCriterion("platform_shopid <>", value, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidGreaterThan(Integer value) {
//            addCriterion("platform_shopid >", value, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidGreaterThanOrEqualTo(Integer value) {
//            addCriterion("platform_shopid >=", value, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidLessThan(Integer value) {
//            addCriterion("platform_shopid <", value, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidLessThanOrEqualTo(Integer value) {
//            addCriterion("platform_shopid <=", value, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidIn(List<Integer> values) {
//            addCriterion("platform_shopid in", values, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidNotIn(List<Integer> values) {
//            addCriterion("platform_shopid not in", values, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidBetween(Integer value1, Integer value2) {
//            addCriterion("platform_shopid between", value1, value2, "platformShopid");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformShopidNotBetween(Integer value1, Integer value2) {
//            addCriterion("platform_shopid not between", value1, value2, "platformShopid");
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
//        public Criteria andFromAddrIsNull() {
//            addCriterion("from_addr is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrIsNotNull() {
//            addCriterion("from_addr is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrEqualTo(String value) {
//            addCriterion("from_addr =", value, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrNotEqualTo(String value) {
//            addCriterion("from_addr <>", value, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrGreaterThan(String value) {
//            addCriterion("from_addr >", value, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrGreaterThanOrEqualTo(String value) {
//            addCriterion("from_addr >=", value, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrLessThan(String value) {
//            addCriterion("from_addr <", value, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrLessThanOrEqualTo(String value) {
//            addCriterion("from_addr <=", value, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrLike(String value) {
//            addCriterion("from_addr like", value, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrNotLike(String value) {
//            addCriterion("from_addr not like", value, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrIn(List<String> values) {
//            addCriterion("from_addr in", values, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrNotIn(List<String> values) {
//            addCriterion("from_addr not in", values, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrBetween(String value1, String value2) {
//            addCriterion("from_addr between", value1, value2, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromAddrNotBetween(String value1, String value2) {
//            addCriterion("from_addr not between", value1, value2, "fromAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngIsNull() {
//            addCriterion("from_lng is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngIsNotNull() {
//            addCriterion("from_lng is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngEqualTo(Integer value) {
//            addCriterion("from_lng =", value, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngNotEqualTo(Integer value) {
//            addCriterion("from_lng <>", value, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngGreaterThan(Integer value) {
//            addCriterion("from_lng >", value, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngGreaterThanOrEqualTo(Integer value) {
//            addCriterion("from_lng >=", value, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngLessThan(Integer value) {
//            addCriterion("from_lng <", value, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngLessThanOrEqualTo(Integer value) {
//            addCriterion("from_lng <=", value, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngIn(List<Integer> values) {
//            addCriterion("from_lng in", values, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngNotIn(List<Integer> values) {
//            addCriterion("from_lng not in", values, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngBetween(Integer value1, Integer value2) {
//            addCriterion("from_lng between", value1, value2, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLngNotBetween(Integer value1, Integer value2) {
//            addCriterion("from_lng not between", value1, value2, "fromLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatIsNull() {
//            addCriterion("from_lat is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatIsNotNull() {
//            addCriterion("from_lat is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatEqualTo(Integer value) {
//            addCriterion("from_lat =", value, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatNotEqualTo(Integer value) {
//            addCriterion("from_lat <>", value, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatGreaterThan(Integer value) {
//            addCriterion("from_lat >", value, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatGreaterThanOrEqualTo(Integer value) {
//            addCriterion("from_lat >=", value, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatLessThan(Integer value) {
//            addCriterion("from_lat <", value, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatLessThanOrEqualTo(Integer value) {
//            addCriterion("from_lat <=", value, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatIn(List<Integer> values) {
//            addCriterion("from_lat in", values, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatNotIn(List<Integer> values) {
//            addCriterion("from_lat not in", values, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatBetween(Integer value1, Integer value2) {
//            addCriterion("from_lat between", value1, value2, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromLatNotBetween(Integer value1, Integer value2) {
//            addCriterion("from_lat not between", value1, value2, "fromLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelIsNull() {
//            addCriterion("from_tel is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelIsNotNull() {
//            addCriterion("from_tel is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelEqualTo(String value) {
//            addCriterion("from_tel =", value, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelNotEqualTo(String value) {
//            addCriterion("from_tel <>", value, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelGreaterThan(String value) {
//            addCriterion("from_tel >", value, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelGreaterThanOrEqualTo(String value) {
//            addCriterion("from_tel >=", value, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelLessThan(String value) {
//            addCriterion("from_tel <", value, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelLessThanOrEqualTo(String value) {
//            addCriterion("from_tel <=", value, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelLike(String value) {
//            addCriterion("from_tel like", value, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelNotLike(String value) {
//            addCriterion("from_tel not like", value, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelIn(List<String> values) {
//            addCriterion("from_tel in", values, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelNotIn(List<String> values) {
//            addCriterion("from_tel not in", values, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelBetween(String value1, String value2) {
//            addCriterion("from_tel between", value1, value2, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andFromTelNotBetween(String value1, String value2) {
//            addCriterion("from_tel not between", value1, value2, "fromTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrIsNull() {
//            addCriterion("to_addr is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrIsNotNull() {
//            addCriterion("to_addr is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrEqualTo(String value) {
//            addCriterion("to_addr =", value, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrNotEqualTo(String value) {
//            addCriterion("to_addr <>", value, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrGreaterThan(String value) {
//            addCriterion("to_addr >", value, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrGreaterThanOrEqualTo(String value) {
//            addCriterion("to_addr >=", value, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrLessThan(String value) {
//            addCriterion("to_addr <", value, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrLessThanOrEqualTo(String value) {
//            addCriterion("to_addr <=", value, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrLike(String value) {
//            addCriterion("to_addr like", value, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrNotLike(String value) {
//            addCriterion("to_addr not like", value, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrIn(List<String> values) {
//            addCriterion("to_addr in", values, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrNotIn(List<String> values) {
//            addCriterion("to_addr not in", values, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrBetween(String value1, String value2) {
//            addCriterion("to_addr between", value1, value2, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToAddrNotBetween(String value1, String value2) {
//            addCriterion("to_addr not between", value1, value2, "toAddr");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngIsNull() {
//            addCriterion("to_lng is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngIsNotNull() {
//            addCriterion("to_lng is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngEqualTo(Integer value) {
//            addCriterion("to_lng =", value, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngNotEqualTo(Integer value) {
//            addCriterion("to_lng <>", value, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngGreaterThan(Integer value) {
//            addCriterion("to_lng >", value, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngGreaterThanOrEqualTo(Integer value) {
//            addCriterion("to_lng >=", value, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngLessThan(Integer value) {
//            addCriterion("to_lng <", value, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngLessThanOrEqualTo(Integer value) {
//            addCriterion("to_lng <=", value, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngIn(List<Integer> values) {
//            addCriterion("to_lng in", values, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngNotIn(List<Integer> values) {
//            addCriterion("to_lng not in", values, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngBetween(Integer value1, Integer value2) {
//            addCriterion("to_lng between", value1, value2, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLngNotBetween(Integer value1, Integer value2) {
//            addCriterion("to_lng not between", value1, value2, "toLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatIsNull() {
//            addCriterion("to_lat is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatIsNotNull() {
//            addCriterion("to_lat is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatEqualTo(Integer value) {
//            addCriterion("to_lat =", value, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatNotEqualTo(Integer value) {
//            addCriterion("to_lat <>", value, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatGreaterThan(Integer value) {
//            addCriterion("to_lat >", value, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatGreaterThanOrEqualTo(Integer value) {
//            addCriterion("to_lat >=", value, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatLessThan(Integer value) {
//            addCriterion("to_lat <", value, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatLessThanOrEqualTo(Integer value) {
//            addCriterion("to_lat <=", value, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatIn(List<Integer> values) {
//            addCriterion("to_lat in", values, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatNotIn(List<Integer> values) {
//            addCriterion("to_lat not in", values, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatBetween(Integer value1, Integer value2) {
//            addCriterion("to_lat between", value1, value2, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToLatNotBetween(Integer value1, Integer value2) {
//            addCriterion("to_lat not between", value1, value2, "toLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelIsNull() {
//            addCriterion("to_tel is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelIsNotNull() {
//            addCriterion("to_tel is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelEqualTo(String value) {
//            addCriterion("to_tel =", value, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelNotEqualTo(String value) {
//            addCriterion("to_tel <>", value, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelGreaterThan(String value) {
//            addCriterion("to_tel >", value, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelGreaterThanOrEqualTo(String value) {
//            addCriterion("to_tel >=", value, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelLessThan(String value) {
//            addCriterion("to_tel <", value, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelLessThanOrEqualTo(String value) {
//            addCriterion("to_tel <=", value, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelLike(String value) {
//            addCriterion("to_tel like", value, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelNotLike(String value) {
//            addCriterion("to_tel not like", value, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelIn(List<String> values) {
//            addCriterion("to_tel in", values, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelNotIn(List<String> values) {
//            addCriterion("to_tel not in", values, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelBetween(String value1, String value2) {
//            addCriterion("to_tel between", value1, value2, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToTelNotBetween(String value1, String value2) {
//            addCriterion("to_tel not between", value1, value2, "toTel");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameIsNull() {
//            addCriterion("to_name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameIsNotNull() {
//            addCriterion("to_name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameEqualTo(String value) {
//            addCriterion("to_name =", value, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameNotEqualTo(String value) {
//            addCriterion("to_name <>", value, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameGreaterThan(String value) {
//            addCriterion("to_name >", value, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameGreaterThanOrEqualTo(String value) {
//            addCriterion("to_name >=", value, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameLessThan(String value) {
//            addCriterion("to_name <", value, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameLessThanOrEqualTo(String value) {
//            addCriterion("to_name <=", value, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameLike(String value) {
//            addCriterion("to_name like", value, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameNotLike(String value) {
//            addCriterion("to_name not like", value, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameIn(List<String> values) {
//            addCriterion("to_name in", values, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameNotIn(List<String> values) {
//            addCriterion("to_name not in", values, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameBetween(String value1, String value2) {
//            addCriterion("to_name between", value1, value2, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andToNameNotBetween(String value1, String value2) {
//            addCriterion("to_name not between", value1, value2, "toName");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceIsNull() {
//            addCriterion("distance is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceIsNotNull() {
//            addCriterion("distance is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceEqualTo(Integer value) {
//            addCriterion("distance =", value, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceNotEqualTo(Integer value) {
//            addCriterion("distance <>", value, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceGreaterThan(Integer value) {
//            addCriterion("distance >", value, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceGreaterThanOrEqualTo(Integer value) {
//            addCriterion("distance >=", value, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceLessThan(Integer value) {
//            addCriterion("distance <", value, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceLessThanOrEqualTo(Integer value) {
//            addCriterion("distance <=", value, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceIn(List<Integer> values) {
//            addCriterion("distance in", values, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceNotIn(List<Integer> values) {
//            addCriterion("distance not in", values, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceBetween(Integer value1, Integer value2) {
//            addCriterion("distance between", value1, value2, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andDistanceNotBetween(Integer value1, Integer value2) {
//            addCriterion("distance not between", value1, value2, "distance");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmIsNull() {
//            addCriterion("place_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmIsNotNull() {
//            addCriterion("place_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmEqualTo(Date value) {
//            addCriterion("place_tm =", value, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmNotEqualTo(Date value) {
//            addCriterion("place_tm <>", value, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmGreaterThan(Date value) {
//            addCriterion("place_tm >", value, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("place_tm >=", value, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmLessThan(Date value) {
//            addCriterion("place_tm <", value, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmLessThanOrEqualTo(Date value) {
//            addCriterion("place_tm <=", value, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmIn(List<Date> values) {
//            addCriterion("place_tm in", values, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmNotIn(List<Date> values) {
//            addCriterion("place_tm not in", values, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmBetween(Date value1, Date value2) {
//            addCriterion("place_tm between", value1, value2, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlaceTmNotBetween(Date value1, Date value2) {
//            addCriterion("place_tm not between", value1, value2, "placeTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmIsNull() {
//            addCriterion("record_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmIsNotNull() {
//            addCriterion("record_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmEqualTo(Date value) {
//            addCriterion("record_tm =", value, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmNotEqualTo(Date value) {
//            addCriterion("record_tm <>", value, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmGreaterThan(Date value) {
//            addCriterion("record_tm >", value, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("record_tm >=", value, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmLessThan(Date value) {
//            addCriterion("record_tm <", value, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmLessThanOrEqualTo(Date value) {
//            addCriterion("record_tm <=", value, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmIn(List<Date> values) {
//            addCriterion("record_tm in", values, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmNotIn(List<Date> values) {
//            addCriterion("record_tm not in", values, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmBetween(Date value1, Date value2) {
//            addCriterion("record_tm between", value1, value2, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecordTmNotBetween(Date value1, Date value2) {
//            addCriterion("record_tm not between", value1, value2, "recordTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmIsNull() {
//            addCriterion("dispatch_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmIsNotNull() {
//            addCriterion("dispatch_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmEqualTo(Date value) {
//            addCriterion("dispatch_tm =", value, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmNotEqualTo(Date value) {
//            addCriterion("dispatch_tm <>", value, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmGreaterThan(Date value) {
//            addCriterion("dispatch_tm >", value, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("dispatch_tm >=", value, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmLessThan(Date value) {
//            addCriterion("dispatch_tm <", value, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmLessThanOrEqualTo(Date value) {
//            addCriterion("dispatch_tm <=", value, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmIn(List<Date> values) {
//            addCriterion("dispatch_tm in", values, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmNotIn(List<Date> values) {
//            addCriterion("dispatch_tm not in", values, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmBetween(Date value1, Date value2) {
//            addCriterion("dispatch_tm between", value1, value2, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchTmNotBetween(Date value1, Date value2) {
//            addCriterion("dispatch_tm not between", value1, value2, "dispatchTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmIsNull() {
//            addCriterion("arrive_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmIsNotNull() {
//            addCriterion("arrive_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmEqualTo(Date value) {
//            addCriterion("arrive_tm =", value, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmNotEqualTo(Date value) {
//            addCriterion("arrive_tm <>", value, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmGreaterThan(Date value) {
//            addCriterion("arrive_tm >", value, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("arrive_tm >=", value, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmLessThan(Date value) {
//            addCriterion("arrive_tm <", value, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmLessThanOrEqualTo(Date value) {
//            addCriterion("arrive_tm <=", value, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmIn(List<Date> values) {
//            addCriterion("arrive_tm in", values, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmNotIn(List<Date> values) {
//            addCriterion("arrive_tm not in", values, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmBetween(Date value1, Date value2) {
//            addCriterion("arrive_tm between", value1, value2, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveTmNotBetween(Date value1, Date value2) {
//            addCriterion("arrive_tm not between", value1, value2, "arriveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmIsNull() {
//            addCriterion("accept_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmIsNotNull() {
//            addCriterion("accept_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmEqualTo(Date value) {
//            addCriterion("accept_tm =", value, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmNotEqualTo(Date value) {
//            addCriterion("accept_tm <>", value, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmGreaterThan(Date value) {
//            addCriterion("accept_tm >", value, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("accept_tm >=", value, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmLessThan(Date value) {
//            addCriterion("accept_tm <", value, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmLessThanOrEqualTo(Date value) {
//            addCriterion("accept_tm <=", value, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmIn(List<Date> values) {
//            addCriterion("accept_tm in", values, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmNotIn(List<Date> values) {
//            addCriterion("accept_tm not in", values, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmBetween(Date value1, Date value2) {
//            addCriterion("accept_tm between", value1, value2, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andAcceptTmNotBetween(Date value1, Date value2) {
//            addCriterion("accept_tm not between", value1, value2, "acceptTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmIsNull() {
//            addCriterion("leave_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmIsNotNull() {
//            addCriterion("leave_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmEqualTo(Date value) {
//            addCriterion("leave_tm =", value, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmNotEqualTo(Date value) {
//            addCriterion("leave_tm <>", value, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmGreaterThan(Date value) {
//            addCriterion("leave_tm >", value, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("leave_tm >=", value, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmLessThan(Date value) {
//            addCriterion("leave_tm <", value, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmLessThanOrEqualTo(Date value) {
//            addCriterion("leave_tm <=", value, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmIn(List<Date> values) {
//            addCriterion("leave_tm in", values, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmNotIn(List<Date> values) {
//            addCriterion("leave_tm not in", values, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmBetween(Date value1, Date value2) {
//            addCriterion("leave_tm between", value1, value2, "leaveTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveTmNotBetween(Date value1, Date value2) {
//            addCriterion("leave_tm not between", value1, value2, "leaveTm");
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
//        public Criteria andRequireTmIsNull() {
//            addCriterion("require_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmIsNotNull() {
//            addCriterion("require_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmEqualTo(Date value) {
//            addCriterion("require_tm =", value, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmNotEqualTo(Date value) {
//            addCriterion("require_tm <>", value, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmGreaterThan(Date value) {
//            addCriterion("require_tm >", value, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("require_tm >=", value, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmLessThan(Date value) {
//            addCriterion("require_tm <", value, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmLessThanOrEqualTo(Date value) {
//            addCriterion("require_tm <=", value, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmIn(List<Date> values) {
//            addCriterion("require_tm in", values, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmNotIn(List<Date> values) {
//            addCriterion("require_tm not in", values, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmBetween(Date value1, Date value2) {
//            addCriterion("require_tm between", value1, value2, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTmNotBetween(Date value1, Date value2) {
//            addCriterion("require_tm not between", value1, value2, "requireTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmIsNull() {
//            addCriterion("arriveable_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmIsNotNull() {
//            addCriterion("arriveable_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmEqualTo(Date value) {
//            addCriterion("arriveable_tm =", value, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmNotEqualTo(Date value) {
//            addCriterion("arriveable_tm <>", value, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmGreaterThan(Date value) {
//            addCriterion("arriveable_tm >", value, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("arriveable_tm >=", value, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmLessThan(Date value) {
//            addCriterion("arriveable_tm <", value, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmLessThanOrEqualTo(Date value) {
//            addCriterion("arriveable_tm <=", value, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmIn(List<Date> values) {
//            addCriterion("arriveable_tm in", values, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmNotIn(List<Date> values) {
//            addCriterion("arriveable_tm not in", values, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmBetween(Date value1, Date value2) {
//            addCriterion("arriveable_tm between", value1, value2, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveableTmNotBetween(Date value1, Date value2) {
//            addCriterion("arriveable_tm not between", value1, value2, "arriveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmIsNull() {
//            addCriterion("leaveable_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmIsNotNull() {
//            addCriterion("leaveable_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmEqualTo(Date value) {
//            addCriterion("leaveable_tm =", value, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmNotEqualTo(Date value) {
//            addCriterion("leaveable_tm <>", value, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmGreaterThan(Date value) {
//            addCriterion("leaveable_tm >", value, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("leaveable_tm >=", value, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmLessThan(Date value) {
//            addCriterion("leaveable_tm <", value, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmLessThanOrEqualTo(Date value) {
//            addCriterion("leaveable_tm <=", value, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmIn(List<Date> values) {
//            addCriterion("leaveable_tm in", values, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmNotIn(List<Date> values) {
//            addCriterion("leaveable_tm not in", values, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmBetween(Date value1, Date value2) {
//            addCriterion("leaveable_tm between", value1, value2, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveableTmNotBetween(Date value1, Date value2) {
//            addCriterion("leaveable_tm not between", value1, value2, "leaveableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmIsNull() {
//            addCriterion("dispatchable_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmIsNotNull() {
//            addCriterion("dispatchable_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmEqualTo(Date value) {
//            addCriterion("dispatchable_tm =", value, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmNotEqualTo(Date value) {
//            addCriterion("dispatchable_tm <>", value, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmGreaterThan(Date value) {
//            addCriterion("dispatchable_tm >", value, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("dispatchable_tm >=", value, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmLessThan(Date value) {
//            addCriterion("dispatchable_tm <", value, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmLessThanOrEqualTo(Date value) {
//            addCriterion("dispatchable_tm <=", value, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmIn(List<Date> values) {
//            addCriterion("dispatchable_tm in", values, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmNotIn(List<Date> values) {
//            addCriterion("dispatchable_tm not in", values, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmBetween(Date value1, Date value2) {
//            addCriterion("dispatchable_tm between", value1, value2, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchableTmNotBetween(Date value1, Date value2) {
//            addCriterion("dispatchable_tm not between", value1, value2, "dispatchableTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurIsNull() {
//            addCriterion("take_dur is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurIsNotNull() {
//            addCriterion("take_dur is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurEqualTo(Integer value) {
//            addCriterion("take_dur =", value, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurNotEqualTo(Integer value) {
//            addCriterion("take_dur <>", value, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurGreaterThan(Integer value) {
//            addCriterion("take_dur >", value, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurGreaterThanOrEqualTo(Integer value) {
//            addCriterion("take_dur >=", value, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurLessThan(Integer value) {
//            addCriterion("take_dur <", value, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurLessThanOrEqualTo(Integer value) {
//            addCriterion("take_dur <=", value, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurIn(List<Integer> values) {
//            addCriterion("take_dur in", values, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurNotIn(List<Integer> values) {
//            addCriterion("take_dur not in", values, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurBetween(Integer value1, Integer value2) {
//            addCriterion("take_dur between", value1, value2, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andTakeDurNotBetween(Integer value1, Integer value2) {
//            addCriterion("take_dur not between", value1, value2, "takeDur");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyIsNull() {
//            addCriterion("why is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyIsNotNull() {
//            addCriterion("why is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyEqualTo(String value) {
//            addCriterion("why =", value, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyNotEqualTo(String value) {
//            addCriterion("why <>", value, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyGreaterThan(String value) {
//            addCriterion("why >", value, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyGreaterThanOrEqualTo(String value) {
//            addCriterion("why >=", value, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyLessThan(String value) {
//            addCriterion("why <", value, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyLessThanOrEqualTo(String value) {
//            addCriterion("why <=", value, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyLike(String value) {
//            addCriterion("why like", value, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyNotLike(String value) {
//            addCriterion("why not like", value, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyIn(List<String> values) {
//            addCriterion("why in", values, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyNotIn(List<String> values) {
//            addCriterion("why not in", values, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyBetween(String value1, String value2) {
//            addCriterion("why between", value1, value2, "why");
//            return (Criteria) this;
//        }
//
//        public Criteria andWhyNotBetween(String value1, String value2) {
//            addCriterion("why not between", value1, value2, "why");
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
//        public Criteria andRequireRiderTypeIsNull() {
//            addCriterion("require_rider_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeIsNotNull() {
//            addCriterion("require_rider_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeEqualTo(Byte value) {
//            addCriterion("require_rider_type =", value, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeNotEqualTo(Byte value) {
//            addCriterion("require_rider_type <>", value, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeGreaterThan(Byte value) {
//            addCriterion("require_rider_type >", value, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("require_rider_type >=", value, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeLessThan(Byte value) {
//            addCriterion("require_rider_type <", value, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("require_rider_type <=", value, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeIn(List<Byte> values) {
//            addCriterion("require_rider_type in", values, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeNotIn(List<Byte> values) {
//            addCriterion("require_rider_type not in", values, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeBetween(Byte value1, Byte value2) {
//            addCriterion("require_rider_type between", value1, value2, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireRiderTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("require_rider_type not between", value1, value2, "requireRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeIsNull() {
//            addCriterion("real_rider_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeIsNotNull() {
//            addCriterion("real_rider_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeEqualTo(Byte value) {
//            addCriterion("real_rider_type =", value, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeNotEqualTo(Byte value) {
//            addCriterion("real_rider_type <>", value, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeGreaterThan(Byte value) {
//            addCriterion("real_rider_type >", value, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("real_rider_type >=", value, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeLessThan(Byte value) {
//            addCriterion("real_rider_type <", value, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("real_rider_type <=", value, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeIn(List<Byte> values) {
//            addCriterion("real_rider_type in", values, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeNotIn(List<Byte> values) {
//            addCriterion("real_rider_type not in", values, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeBetween(Byte value1, Byte value2) {
//            addCriterion("real_rider_type between", value1, value2, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRealRiderTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("real_rider_type not between", value1, value2, "realRiderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayIsNull() {
//            addCriterion("pay_way is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayIsNotNull() {
//            addCriterion("pay_way is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayEqualTo(Byte value) {
//            addCriterion("pay_way =", value, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayNotEqualTo(Byte value) {
//            addCriterion("pay_way <>", value, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayGreaterThan(Byte value) {
//            addCriterion("pay_way >", value, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayGreaterThanOrEqualTo(Byte value) {
//            addCriterion("pay_way >=", value, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayLessThan(Byte value) {
//            addCriterion("pay_way <", value, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayLessThanOrEqualTo(Byte value) {
//            addCriterion("pay_way <=", value, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayIn(List<Byte> values) {
//            addCriterion("pay_way in", values, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayNotIn(List<Byte> values) {
//            addCriterion("pay_way not in", values, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayBetween(Byte value1, Byte value2) {
//            addCriterion("pay_way between", value1, value2, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andPayWayNotBetween(Byte value1, Byte value2) {
//            addCriterion("pay_way not between", value1, value2, "payWay");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonIsNull() {
//            addCriterion("cancel_reason is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonIsNotNull() {
//            addCriterion("cancel_reason is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonEqualTo(Integer value) {
//            addCriterion("cancel_reason =", value, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonNotEqualTo(Integer value) {
//            addCriterion("cancel_reason <>", value, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonGreaterThan(Integer value) {
//            addCriterion("cancel_reason >", value, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonGreaterThanOrEqualTo(Integer value) {
//            addCriterion("cancel_reason >=", value, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonLessThan(Integer value) {
//            addCriterion("cancel_reason <", value, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonLessThanOrEqualTo(Integer value) {
//            addCriterion("cancel_reason <=", value, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonIn(List<Integer> values) {
//            addCriterion("cancel_reason in", values, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonNotIn(List<Integer> values) {
//            addCriterion("cancel_reason not in", values, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonBetween(Integer value1, Integer value2) {
//            addCriterion("cancel_reason between", value1, value2, "cancelReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andCancelReasonNotBetween(Integer value1, Integer value2) {
//            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
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
//        public Criteria andChannelIdIsNull() {
//            addCriterion("channel_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdIsNotNull() {
//            addCriterion("channel_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdEqualTo(String value) {
//            addCriterion("channel_id =", value, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdNotEqualTo(String value) {
//            addCriterion("channel_id <>", value, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdGreaterThan(String value) {
//            addCriterion("channel_id >", value, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
//            addCriterion("channel_id >=", value, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdLessThan(String value) {
//            addCriterion("channel_id <", value, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdLessThanOrEqualTo(String value) {
//            addCriterion("channel_id <=", value, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdLike(String value) {
//            addCriterion("channel_id like", value, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdNotLike(String value) {
//            addCriterion("channel_id not like", value, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdIn(List<String> values) {
//            addCriterion("channel_id in", values, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdNotIn(List<String> values) {
//            addCriterion("channel_id not in", values, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdBetween(String value1, String value2) {
//            addCriterion("channel_id between", value1, value2, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andChannelIdNotBetween(String value1, String value2) {
//            addCriterion("channel_id not between", value1, value2, "channelId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdIsNull() {
//            addCriterion("serial_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdIsNotNull() {
//            addCriterion("serial_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdEqualTo(String value) {
//            addCriterion("serial_id =", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdNotEqualTo(String value) {
//            addCriterion("serial_id <>", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdGreaterThan(String value) {
//            addCriterion("serial_id >", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdGreaterThanOrEqualTo(String value) {
//            addCriterion("serial_id >=", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdLessThan(String value) {
//            addCriterion("serial_id <", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdLessThanOrEqualTo(String value) {
//            addCriterion("serial_id <=", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdLike(String value) {
//            addCriterion("serial_id like", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdNotLike(String value) {
//            addCriterion("serial_id not like", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdIn(List<String> values) {
//            addCriterion("serial_id in", values, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdNotIn(List<String> values) {
//            addCriterion("serial_id not in", values, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdBetween(String value1, String value2) {
//            addCriterion("serial_id between", value1, value2, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdNotBetween(String value1, String value2) {
//            addCriterion("serial_id not between", value1, value2, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdIsNull() {
//            addCriterion("trade_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdIsNotNull() {
//            addCriterion("trade_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdEqualTo(String value) {
//            addCriterion("trade_id =", value, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdNotEqualTo(String value) {
//            addCriterion("trade_id <>", value, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdGreaterThan(String value) {
//            addCriterion("trade_id >", value, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdGreaterThanOrEqualTo(String value) {
//            addCriterion("trade_id >=", value, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdLessThan(String value) {
//            addCriterion("trade_id <", value, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdLessThanOrEqualTo(String value) {
//            addCriterion("trade_id <=", value, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdLike(String value) {
//            addCriterion("trade_id like", value, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdNotLike(String value) {
//            addCriterion("trade_id not like", value, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdIn(List<String> values) {
//            addCriterion("trade_id in", values, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdNotIn(List<String> values) {
//            addCriterion("trade_id not in", values, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdBetween(String value1, String value2) {
//            addCriterion("trade_id between", value1, value2, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradeIdNotBetween(String value1, String value2) {
//            addCriterion("trade_id not between", value1, value2, "tradeId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdIsNull() {
//            addCriterion("trading_area_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdIsNotNull() {
//            addCriterion("trading_area_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdEqualTo(Integer value) {
//            addCriterion("trading_area_id =", value, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdNotEqualTo(Integer value) {
//            addCriterion("trading_area_id <>", value, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdGreaterThan(Integer value) {
//            addCriterion("trading_area_id >", value, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("trading_area_id >=", value, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdLessThan(Integer value) {
//            addCriterion("trading_area_id <", value, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdLessThanOrEqualTo(Integer value) {
//            addCriterion("trading_area_id <=", value, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdIn(List<Integer> values) {
//            addCriterion("trading_area_id in", values, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdNotIn(List<Integer> values) {
//            addCriterion("trading_area_id not in", values, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdBetween(Integer value1, Integer value2) {
//            addCriterion("trading_area_id between", value1, value2, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andTradingAreaIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("trading_area_id not between", value1, value2, "tradingAreaId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdIsNull() {
//            addCriterion("shop_region_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdIsNotNull() {
//            addCriterion("shop_region_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdEqualTo(Integer value) {
//            addCriterion("shop_region_id =", value, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdNotEqualTo(Integer value) {
//            addCriterion("shop_region_id <>", value, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdGreaterThan(Integer value) {
//            addCriterion("shop_region_id >", value, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("shop_region_id >=", value, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdLessThan(Integer value) {
//            addCriterion("shop_region_id <", value, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdLessThanOrEqualTo(Integer value) {
//            addCriterion("shop_region_id <=", value, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdIn(List<Integer> values) {
//            addCriterion("shop_region_id in", values, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdNotIn(List<Integer> values) {
//            addCriterion("shop_region_id not in", values, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdBetween(Integer value1, Integer value2) {
//            addCriterion("shop_region_id between", value1, value2, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopRegionIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("shop_region_id not between", value1, value2, "shopRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdIsNull() {
//            addCriterion("rider_region_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdIsNotNull() {
//            addCriterion("rider_region_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdEqualTo(Integer value) {
//            addCriterion("rider_region_id =", value, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdNotEqualTo(Integer value) {
//            addCriterion("rider_region_id <>", value, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdGreaterThan(Integer value) {
//            addCriterion("rider_region_id >", value, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("rider_region_id >=", value, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdLessThan(Integer value) {
//            addCriterion("rider_region_id <", value, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdLessThanOrEqualTo(Integer value) {
//            addCriterion("rider_region_id <=", value, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdIn(List<Integer> values) {
//            addCriterion("rider_region_id in", values, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdNotIn(List<Integer> values) {
//            addCriterion("rider_region_id not in", values, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdBetween(Integer value1, Integer value2) {
//            addCriterion("rider_region_id between", value1, value2, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderRegionIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("rider_region_id not between", value1, value2, "riderRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeIsNull() {
//            addCriterion("order_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeIsNotNull() {
//            addCriterion("order_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeEqualTo(Byte value) {
//            addCriterion("order_type =", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeNotEqualTo(Byte value) {
//            addCriterion("order_type <>", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeGreaterThan(Byte value) {
//            addCriterion("order_type >", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("order_type >=", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeLessThan(Byte value) {
//            addCriterion("order_type <", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("order_type <=", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeIn(List<Byte> values) {
//            addCriterion("order_type in", values, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeNotIn(List<Byte> values) {
//            addCriterion("order_type not in", values, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
//            addCriterion("order_type between", value1, value2, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("order_type not between", value1, value2, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksIsNull() {
//            addCriterion("remarks is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksIsNotNull() {
//            addCriterion("remarks is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksEqualTo(String value) {
//            addCriterion("remarks =", value, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksNotEqualTo(String value) {
//            addCriterion("remarks <>", value, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksGreaterThan(String value) {
//            addCriterion("remarks >", value, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
//            addCriterion("remarks >=", value, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksLessThan(String value) {
//            addCriterion("remarks <", value, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksLessThanOrEqualTo(String value) {
//            addCriterion("remarks <=", value, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksLike(String value) {
//            addCriterion("remarks like", value, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksNotLike(String value) {
//            addCriterion("remarks not like", value, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksIn(List<String> values) {
//            addCriterion("remarks in", values, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksNotIn(List<String> values) {
//            addCriterion("remarks not in", values, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksBetween(String value1, String value2) {
//            addCriterion("remarks between", value1, value2, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarksNotBetween(String value1, String value2) {
//            addCriterion("remarks not between", value1, value2, "remarks");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesIsNull() {
//            addCriterion("switch_times is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesIsNotNull() {
//            addCriterion("switch_times is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesEqualTo(Byte value) {
//            addCriterion("switch_times =", value, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesNotEqualTo(Byte value) {
//            addCriterion("switch_times <>", value, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesGreaterThan(Byte value) {
//            addCriterion("switch_times >", value, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesGreaterThanOrEqualTo(Byte value) {
//            addCriterion("switch_times >=", value, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesLessThan(Byte value) {
//            addCriterion("switch_times <", value, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesLessThanOrEqualTo(Byte value) {
//            addCriterion("switch_times <=", value, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesIn(List<Byte> values) {
//            addCriterion("switch_times in", values, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesNotIn(List<Byte> values) {
//            addCriterion("switch_times not in", values, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesBetween(Byte value1, Byte value2) {
//            addCriterion("switch_times between", value1, value2, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andSwitchTimesNotBetween(Byte value1, Byte value2) {
//            addCriterion("switch_times not between", value1, value2, "switchTimes");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeIsNull() {
//            addCriterion("over_time is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeIsNotNull() {
//            addCriterion("over_time is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeEqualTo(Byte value) {
//            addCriterion("over_time =", value, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeNotEqualTo(Byte value) {
//            addCriterion("over_time <>", value, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeGreaterThan(Byte value) {
//            addCriterion("over_time >", value, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("over_time >=", value, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeLessThan(Byte value) {
//            addCriterion("over_time <", value, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeLessThanOrEqualTo(Byte value) {
//            addCriterion("over_time <=", value, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeIn(List<Byte> values) {
//            addCriterion("over_time in", values, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeNotIn(List<Byte> values) {
//            addCriterion("over_time not in", values, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeBetween(Byte value1, Byte value2) {
//            addCriterion("over_time between", value1, value2, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andOverTimeNotBetween(Byte value1, Byte value2) {
//            addCriterion("over_time not between", value1, value2, "overTime");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedIsNull() {
//            addCriterion("modified is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedIsNotNull() {
//            addCriterion("modified is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedEqualTo(Byte value) {
//            addCriterion("modified =", value, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedNotEqualTo(Byte value) {
//            addCriterion("modified <>", value, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedGreaterThan(Byte value) {
//            addCriterion("modified >", value, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedGreaterThanOrEqualTo(Byte value) {
//            addCriterion("modified >=", value, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedLessThan(Byte value) {
//            addCriterion("modified <", value, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedLessThanOrEqualTo(Byte value) {
//            addCriterion("modified <=", value, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedIn(List<Byte> values) {
//            addCriterion("modified in", values, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedNotIn(List<Byte> values) {
//            addCriterion("modified not in", values, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedBetween(Byte value1, Byte value2) {
//            addCriterion("modified between", value1, value2, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andModifiedNotBetween(Byte value1, Byte value2) {
//            addCriterion("modified not between", value1, value2, "modified");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeIsNull() {
//            addCriterion("dispatch_mode is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeIsNotNull() {
//            addCriterion("dispatch_mode is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeEqualTo(Byte value) {
//            addCriterion("dispatch_mode =", value, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeNotEqualTo(Byte value) {
//            addCriterion("dispatch_mode <>", value, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeGreaterThan(Byte value) {
//            addCriterion("dispatch_mode >", value, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("dispatch_mode >=", value, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeLessThan(Byte value) {
//            addCriterion("dispatch_mode <", value, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeLessThanOrEqualTo(Byte value) {
//            addCriterion("dispatch_mode <=", value, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeIn(List<Byte> values) {
//            addCriterion("dispatch_mode in", values, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeNotIn(List<Byte> values) {
//            addCriterion("dispatch_mode not in", values, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeBetween(Byte value1, Byte value2) {
//            addCriterion("dispatch_mode between", value1, value2, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andDispatchModeNotBetween(Byte value1, Byte value2) {
//            addCriterion("dispatch_mode not between", value1, value2, "dispatchMode");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureIsNull() {
//            addCriterion("feature is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureIsNotNull() {
//            addCriterion("feature is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureEqualTo(String value) {
//            addCriterion("feature =", value, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureNotEqualTo(String value) {
//            addCriterion("feature <>", value, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureGreaterThan(String value) {
//            addCriterion("feature >", value, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
//            addCriterion("feature >=", value, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureLessThan(String value) {
//            addCriterion("feature <", value, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureLessThanOrEqualTo(String value) {
//            addCriterion("feature <=", value, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureLike(String value) {
//            addCriterion("feature like", value, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureNotLike(String value) {
//            addCriterion("feature not like", value, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureIn(List<String> values) {
//            addCriterion("feature in", values, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureNotIn(List<String> values) {
//            addCriterion("feature not in", values, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureBetween(String value1, String value2) {
//            addCriterion("feature between", value1, value2, "feature");
//            return (Criteria) this;
//        }
//
//        public Criteria andFeatureNotBetween(String value1, String value2) {
//            addCriterion("feature not between", value1, value2, "feature");
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
//        public Criteria andShardyIsNull() {
//            addCriterion("shardy is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyIsNotNull() {
//            addCriterion("shardy is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyEqualTo(Integer value) {
//            addCriterion("shardy =", value, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyNotEqualTo(Integer value) {
//            addCriterion("shardy <>", value, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyGreaterThan(Integer value) {
//            addCriterion("shardy >", value, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyGreaterThanOrEqualTo(Integer value) {
//            addCriterion("shardy >=", value, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyLessThan(Integer value) {
//            addCriterion("shardy <", value, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyLessThanOrEqualTo(Integer value) {
//            addCriterion("shardy <=", value, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyIn(List<Integer> values) {
//            addCriterion("shardy in", values, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyNotIn(List<Integer> values) {
//            addCriterion("shardy not in", values, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyBetween(Integer value1, Integer value2) {
//            addCriterion("shardy between", value1, value2, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardyNotBetween(Integer value1, Integer value2) {
//            addCriterion("shardy not between", value1, value2, "shardy");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzIsNull() {
//            addCriterion("shardz is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzIsNotNull() {
//            addCriterion("shardz is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzEqualTo(Integer value) {
//            addCriterion("shardz =", value, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzNotEqualTo(Integer value) {
//            addCriterion("shardz <>", value, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzGreaterThan(Integer value) {
//            addCriterion("shardz >", value, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzGreaterThanOrEqualTo(Integer value) {
//            addCriterion("shardz >=", value, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzLessThan(Integer value) {
//            addCriterion("shardz <", value, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzLessThanOrEqualTo(Integer value) {
//            addCriterion("shardz <=", value, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzIn(List<Integer> values) {
//            addCriterion("shardz in", values, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzNotIn(List<Integer> values) {
//            addCriterion("shardz not in", values, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzBetween(Integer value1, Integer value2) {
//            addCriterion("shardz between", value1, value2, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andShardzNotBetween(Integer value1, Integer value2) {
//            addCriterion("shardz not between", value1, value2, "shardz");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdIsNull() {
//            addCriterion("group_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdIsNotNull() {
//            addCriterion("group_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdEqualTo(Integer value) {
//            addCriterion("group_id =", value, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdNotEqualTo(Integer value) {
//            addCriterion("group_id <>", value, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdGreaterThan(Integer value) {
//            addCriterion("group_id >", value, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("group_id >=", value, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdLessThan(Integer value) {
//            addCriterion("group_id <", value, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
//            addCriterion("group_id <=", value, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdIn(List<Integer> values) {
//            addCriterion("group_id in", values, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdNotIn(List<Integer> values) {
//            addCriterion("group_id not in", values, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
//            addCriterion("group_id between", value1, value2, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("group_id not between", value1, value2, "groupId");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeIsNull() {
//            addCriterion("contract_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeIsNotNull() {
//            addCriterion("contract_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeEqualTo(Byte value) {
//            addCriterion("contract_type =", value, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeNotEqualTo(Byte value) {
//            addCriterion("contract_type <>", value, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeGreaterThan(Byte value) {
//            addCriterion("contract_type >", value, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("contract_type >=", value, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeLessThan(Byte value) {
//            addCriterion("contract_type <", value, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("contract_type <=", value, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeIn(List<Byte> values) {
//            addCriterion("contract_type in", values, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeNotIn(List<Byte> values) {
//            addCriterion("contract_type not in", values, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeBetween(Byte value1, Byte value2) {
//            addCriterion("contract_type between", value1, value2, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andContractTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("contract_type not between", value1, value2, "contractType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeIsNull() {
//            addCriterion("goods_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeIsNotNull() {
//            addCriterion("goods_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeEqualTo(String value) {
//            addCriterion("goods_type =", value, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeNotEqualTo(String value) {
//            addCriterion("goods_type <>", value, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeGreaterThan(String value) {
//            addCriterion("goods_type >", value, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
//            addCriterion("goods_type >=", value, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeLessThan(String value) {
//            addCriterion("goods_type <", value, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
//            addCriterion("goods_type <=", value, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeLike(String value) {
//            addCriterion("goods_type like", value, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeNotLike(String value) {
//            addCriterion("goods_type not like", value, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeIn(List<String> values) {
//            addCriterion("goods_type in", values, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeNotIn(List<String> values) {
//            addCriterion("goods_type not in", values, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeBetween(String value1, String value2) {
//            addCriterion("goods_type between", value1, value2, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
//            addCriterion("goods_type not between", value1, value2, "goodsType");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightIsNull() {
//            addCriterion("weight is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightIsNotNull() {
//            addCriterion("weight is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightEqualTo(Integer value) {
//            addCriterion("weight =", value, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightNotEqualTo(Integer value) {
//            addCriterion("weight <>", value, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightGreaterThan(Integer value) {
//            addCriterion("weight >", value, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
//            addCriterion("weight >=", value, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightLessThan(Integer value) {
//            addCriterion("weight <", value, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightLessThanOrEqualTo(Integer value) {
//            addCriterion("weight <=", value, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightIn(List<Integer> values) {
//            addCriterion("weight in", values, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightNotIn(List<Integer> values) {
//            addCriterion("weight not in", values, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightBetween(Integer value1, Integer value2) {
//            addCriterion("weight between", value1, value2, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
//            addCriterion("weight not between", value1, value2, "weight");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagIsNull() {
//            addCriterion("require_tag is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagIsNotNull() {
//            addCriterion("require_tag is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagEqualTo(String value) {
//            addCriterion("require_tag =", value, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagNotEqualTo(String value) {
//            addCriterion("require_tag <>", value, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagGreaterThan(String value) {
//            addCriterion("require_tag >", value, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagGreaterThanOrEqualTo(String value) {
//            addCriterion("require_tag >=", value, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagLessThan(String value) {
//            addCriterion("require_tag <", value, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagLessThanOrEqualTo(String value) {
//            addCriterion("require_tag <=", value, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagLike(String value) {
//            addCriterion("require_tag like", value, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagNotLike(String value) {
//            addCriterion("require_tag not like", value, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagIn(List<String> values) {
//            addCriterion("require_tag in", values, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagNotIn(List<String> values) {
//            addCriterion("require_tag not in", values, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagBetween(String value1, String value2) {
//            addCriterion("require_tag between", value1, value2, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireTagNotBetween(String value1, String value2) {
//            addCriterion("require_tag not between", value1, value2, "requireTag");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelIsNull() {
//            addCriterion("require_level is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelIsNotNull() {
//            addCriterion("require_level is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelEqualTo(String value) {
//            addCriterion("require_level =", value, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelNotEqualTo(String value) {
//            addCriterion("require_level <>", value, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelGreaterThan(String value) {
//            addCriterion("require_level >", value, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelGreaterThanOrEqualTo(String value) {
//            addCriterion("require_level >=", value, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelLessThan(String value) {
//            addCriterion("require_level <", value, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelLessThanOrEqualTo(String value) {
//            addCriterion("require_level <=", value, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelLike(String value) {
//            addCriterion("require_level like", value, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelNotLike(String value) {
//            addCriterion("require_level not like", value, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelIn(List<String> values) {
//            addCriterion("require_level in", values, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelNotIn(List<String> values) {
//            addCriterion("require_level not in", values, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelBetween(String value1, String value2) {
//            addCriterion("require_level between", value1, value2, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andRequireLevelNotBetween(String value1, String value2) {
//            addCriterion("require_level not between", value1, value2, "requireLevel");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupIsNull() {
//            addCriterion("outter_group is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupIsNotNull() {
//            addCriterion("outter_group is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupEqualTo(String value) {
//            addCriterion("outter_group =", value, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupNotEqualTo(String value) {
//            addCriterion("outter_group <>", value, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupGreaterThan(String value) {
//            addCriterion("outter_group >", value, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupGreaterThanOrEqualTo(String value) {
//            addCriterion("outter_group >=", value, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupLessThan(String value) {
//            addCriterion("outter_group <", value, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupLessThanOrEqualTo(String value) {
//            addCriterion("outter_group <=", value, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupLike(String value) {
//            addCriterion("outter_group like", value, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupNotLike(String value) {
//            addCriterion("outter_group not like", value, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupIn(List<String> values) {
//            addCriterion("outter_group in", values, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupNotIn(List<String> values) {
//            addCriterion("outter_group not in", values, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupBetween(String value1, String value2) {
//            addCriterion("outter_group between", value1, value2, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andOutterGroupNotBetween(String value1, String value2) {
//            addCriterion("outter_group not between", value1, value2, "outterGroup");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdIsNull() {
//            addCriterion("recruit_task_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdIsNotNull() {
//            addCriterion("recruit_task_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdEqualTo(Integer value) {
//            addCriterion("recruit_task_id =", value, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdNotEqualTo(Integer value) {
//            addCriterion("recruit_task_id <>", value, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdGreaterThan(Integer value) {
//            addCriterion("recruit_task_id >", value, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("recruit_task_id >=", value, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdLessThan(Integer value) {
//            addCriterion("recruit_task_id <", value, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdLessThanOrEqualTo(Integer value) {
//            addCriterion("recruit_task_id <=", value, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdIn(List<Integer> values) {
//            addCriterion("recruit_task_id in", values, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdNotIn(List<Integer> values) {
//            addCriterion("recruit_task_id not in", values, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdBetween(Integer value1, Integer value2) {
//            addCriterion("recruit_task_id between", value1, value2, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andRecruitTaskIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("recruit_task_id not between", value1, value2, "recruitTaskId");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoIsNull() {
//            addCriterion("waybill_no is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoIsNotNull() {
//            addCriterion("waybill_no is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoEqualTo(String value) {
//            addCriterion("waybill_no =", value, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoNotEqualTo(String value) {
//            addCriterion("waybill_no <>", value, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoGreaterThan(String value) {
//            addCriterion("waybill_no >", value, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoGreaterThanOrEqualTo(String value) {
//            addCriterion("waybill_no >=", value, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoLessThan(String value) {
//            addCriterion("waybill_no <", value, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoLessThanOrEqualTo(String value) {
//            addCriterion("waybill_no <=", value, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoLike(String value) {
//            addCriterion("waybill_no like", value, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoNotLike(String value) {
//            addCriterion("waybill_no not like", value, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoIn(List<String> values) {
//            addCriterion("waybill_no in", values, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoNotIn(List<String> values) {
//            addCriterion("waybill_no not in", values, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoBetween(String value1, String value2) {
//            addCriterion("waybill_no between", value1, value2, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoNotBetween(String value1, String value2) {
//            addCriterion("waybill_no not between", value1, value2, "waybillNo");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixIsNull() {
//            addCriterion("waybill_no_suffix is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixIsNotNull() {
//            addCriterion("waybill_no_suffix is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixEqualTo(String value) {
//            addCriterion("waybill_no_suffix =", value, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixNotEqualTo(String value) {
//            addCriterion("waybill_no_suffix <>", value, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixGreaterThan(String value) {
//            addCriterion("waybill_no_suffix >", value, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixGreaterThanOrEqualTo(String value) {
//            addCriterion("waybill_no_suffix >=", value, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixLessThan(String value) {
//            addCriterion("waybill_no_suffix <", value, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixLessThanOrEqualTo(String value) {
//            addCriterion("waybill_no_suffix <=", value, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixLike(String value) {
//            addCriterion("waybill_no_suffix like", value, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixNotLike(String value) {
//            addCriterion("waybill_no_suffix not like", value, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixIn(List<String> values) {
//            addCriterion("waybill_no_suffix in", values, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixNotIn(List<String> values) {
//            addCriterion("waybill_no_suffix not in", values, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixBetween(String value1, String value2) {
//            addCriterion("waybill_no_suffix between", value1, value2, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andWaybillNoSuffixNotBetween(String value1, String value2) {
//            addCriterion("waybill_no_suffix not between", value1, value2, "waybillNoSuffix");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdIsNull() {
//            addCriterion("platform_region_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdIsNotNull() {
//            addCriterion("platform_region_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdEqualTo(Integer value) {
//            addCriterion("platform_region_id =", value, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdNotEqualTo(Integer value) {
//            addCriterion("platform_region_id <>", value, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdGreaterThan(Integer value) {
//            addCriterion("platform_region_id >", value, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("platform_region_id >=", value, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdLessThan(Integer value) {
//            addCriterion("platform_region_id <", value, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdLessThanOrEqualTo(Integer value) {
//            addCriterion("platform_region_id <=", value, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdIn(List<Integer> values) {
//            addCriterion("platform_region_id in", values, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdNotIn(List<Integer> values) {
//            addCriterion("platform_region_id not in", values, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdBetween(Integer value1, Integer value2) {
//            addCriterion("platform_region_id between", value1, value2, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformRegionIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("platform_region_id not between", value1, value2, "platformRegionId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdIsNull() {
//            addCriterion("company_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdIsNotNull() {
//            addCriterion("company_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdEqualTo(Long value) {
//            addCriterion("company_id =", value, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdNotEqualTo(Long value) {
//            addCriterion("company_id <>", value, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdGreaterThan(Long value) {
//            addCriterion("company_id >", value, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
//            addCriterion("company_id >=", value, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdLessThan(Long value) {
//            addCriterion("company_id <", value, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
//            addCriterion("company_id <=", value, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdIn(List<Long> values) {
//            addCriterion("company_id in", values, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdNotIn(List<Long> values) {
//            addCriterion("company_id not in", values, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdBetween(Long value1, Long value2) {
//            addCriterion("company_id between", value1, value2, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
//            addCriterion("company_id not between", value1, value2, "companyId");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardIsNull() {
//            addCriterion("standard is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardIsNotNull() {
//            addCriterion("standard is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardEqualTo(Integer value) {
//            addCriterion("standard =", value, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardNotEqualTo(Integer value) {
//            addCriterion("standard <>", value, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardGreaterThan(Integer value) {
//            addCriterion("standard >", value, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardGreaterThanOrEqualTo(Integer value) {
//            addCriterion("standard >=", value, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardLessThan(Integer value) {
//            addCriterion("standard <", value, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardLessThanOrEqualTo(Integer value) {
//            addCriterion("standard <=", value, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardIn(List<Integer> values) {
//            addCriterion("standard in", values, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardNotIn(List<Integer> values) {
//            addCriterion("standard not in", values, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardBetween(Integer value1, Integer value2) {
//            addCriterion("standard between", value1, value2, "standard");
//            return (Criteria) this;
//        }
//
//        public Criteria andStandardNotBetween(Integer value1, Integer value2) {
//            addCriterion("standard not between", value1, value2, "standard");
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