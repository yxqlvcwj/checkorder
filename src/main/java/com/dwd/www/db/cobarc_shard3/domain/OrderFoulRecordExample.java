//package com.dwd.www.db.cobarc_shard3.domain;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class OrderFoulRecordExample {
//    protected String orderByClause;
//
//    protected boolean distinct;
//
//    protected List<Criteria> oredCriteria;
//
//    public OrderFoulRecordExample() {
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
//        public Criteria andOrderIdIsNull() {
//            addCriterion("order_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdIsNotNull() {
//            addCriterion("order_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdEqualTo(Long value) {
//            addCriterion("order_id =", value, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdNotEqualTo(Long value) {
//            addCriterion("order_id <>", value, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdGreaterThan(Long value) {
//            addCriterion("order_id >", value, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
//            addCriterion("order_id >=", value, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdLessThan(Long value) {
//            addCriterion("order_id <", value, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
//            addCriterion("order_id <=", value, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdIn(List<Long> values) {
//            addCriterion("order_id in", values, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdNotIn(List<Long> values) {
//            addCriterion("order_id not in", values, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdBetween(Long value1, Long value2) {
//            addCriterion("order_id between", value1, value2, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
//            addCriterion("order_id not between", value1, value2, "orderId");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseIsNull() {
//            addCriterion("order_phase is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseIsNotNull() {
//            addCriterion("order_phase is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseEqualTo(Byte value) {
//            addCriterion("order_phase =", value, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseNotEqualTo(Byte value) {
//            addCriterion("order_phase <>", value, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseGreaterThan(Byte value) {
//            addCriterion("order_phase >", value, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseGreaterThanOrEqualTo(Byte value) {
//            addCriterion("order_phase >=", value, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseLessThan(Byte value) {
//            addCriterion("order_phase <", value, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseLessThanOrEqualTo(Byte value) {
//            addCriterion("order_phase <=", value, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseIn(List<Byte> values) {
//            addCriterion("order_phase in", values, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseNotIn(List<Byte> values) {
//            addCriterion("order_phase not in", values, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseBetween(Byte value1, Byte value2) {
//            addCriterion("order_phase between", value1, value2, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderPhaseNotBetween(Byte value1, Byte value2) {
//            addCriterion("order_phase not between", value1, value2, "orderPhase");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonIsNull() {
//            addCriterion("foul_reason is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonIsNotNull() {
//            addCriterion("foul_reason is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonEqualTo(Byte value) {
//            addCriterion("foul_reason =", value, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonNotEqualTo(Byte value) {
//            addCriterion("foul_reason <>", value, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonGreaterThan(Byte value) {
//            addCriterion("foul_reason >", value, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonGreaterThanOrEqualTo(Byte value) {
//            addCriterion("foul_reason >=", value, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonLessThan(Byte value) {
//            addCriterion("foul_reason <", value, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonLessThanOrEqualTo(Byte value) {
//            addCriterion("foul_reason <=", value, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonIn(List<Byte> values) {
//            addCriterion("foul_reason in", values, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonNotIn(List<Byte> values) {
//            addCriterion("foul_reason not in", values, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonBetween(Byte value1, Byte value2) {
//            addCriterion("foul_reason between", value1, value2, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andFoulReasonNotBetween(Byte value1, Byte value2) {
//            addCriterion("foul_reason not between", value1, value2, "foulReason");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkIsNull() {
//            addCriterion("remark is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkIsNotNull() {
//            addCriterion("remark is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkEqualTo(String value) {
//            addCriterion("remark =", value, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkNotEqualTo(String value) {
//            addCriterion("remark <>", value, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkGreaterThan(String value) {
//            addCriterion("remark >", value, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
//            addCriterion("remark >=", value, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkLessThan(String value) {
//            addCriterion("remark <", value, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkLessThanOrEqualTo(String value) {
//            addCriterion("remark <=", value, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkLike(String value) {
//            addCriterion("remark like", value, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkNotLike(String value) {
//            addCriterion("remark not like", value, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkIn(List<String> values) {
//            addCriterion("remark in", values, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkNotIn(List<String> values) {
//            addCriterion("remark not in", values, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkBetween(String value1, String value2) {
//            addCriterion("remark between", value1, value2, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRemarkNotBetween(String value1, String value2) {
//            addCriterion("remark not between", value1, value2, "remark");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngIsNull() {
//            addCriterion("rider_lng is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngIsNotNull() {
//            addCriterion("rider_lng is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngEqualTo(Integer value) {
//            addCriterion("rider_lng =", value, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngNotEqualTo(Integer value) {
//            addCriterion("rider_lng <>", value, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngGreaterThan(Integer value) {
//            addCriterion("rider_lng >", value, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngGreaterThanOrEqualTo(Integer value) {
//            addCriterion("rider_lng >=", value, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngLessThan(Integer value) {
//            addCriterion("rider_lng <", value, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngLessThanOrEqualTo(Integer value) {
//            addCriterion("rider_lng <=", value, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngIn(List<Integer> values) {
//            addCriterion("rider_lng in", values, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngNotIn(List<Integer> values) {
//            addCriterion("rider_lng not in", values, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngBetween(Integer value1, Integer value2) {
//            addCriterion("rider_lng between", value1, value2, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLngNotBetween(Integer value1, Integer value2) {
//            addCriterion("rider_lng not between", value1, value2, "riderLng");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatIsNull() {
//            addCriterion("rider_lat is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatIsNotNull() {
//            addCriterion("rider_lat is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatEqualTo(Integer value) {
//            addCriterion("rider_lat =", value, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatNotEqualTo(Integer value) {
//            addCriterion("rider_lat <>", value, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatGreaterThan(Integer value) {
//            addCriterion("rider_lat >", value, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatGreaterThanOrEqualTo(Integer value) {
//            addCriterion("rider_lat >=", value, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatLessThan(Integer value) {
//            addCriterion("rider_lat <", value, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatLessThanOrEqualTo(Integer value) {
//            addCriterion("rider_lat <=", value, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatIn(List<Integer> values) {
//            addCriterion("rider_lat in", values, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatNotIn(List<Integer> values) {
//            addCriterion("rider_lat not in", values, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatBetween(Integer value1, Integer value2) {
//            addCriterion("rider_lat between", value1, value2, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andRiderLatNotBetween(Integer value1, Integer value2) {
//            addCriterion("rider_lat not between", value1, value2, "riderLat");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeIsNull() {
//            addCriterion("deal_type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeIsNotNull() {
//            addCriterion("deal_type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeEqualTo(Byte value) {
//            addCriterion("deal_type =", value, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeNotEqualTo(Byte value) {
//            addCriterion("deal_type <>", value, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeGreaterThan(Byte value) {
//            addCriterion("deal_type >", value, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeGreaterThanOrEqualTo(Byte value) {
//            addCriterion("deal_type >=", value, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeLessThan(Byte value) {
//            addCriterion("deal_type <", value, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeLessThanOrEqualTo(Byte value) {
//            addCriterion("deal_type <=", value, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeIn(List<Byte> values) {
//            addCriterion("deal_type in", values, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeNotIn(List<Byte> values) {
//            addCriterion("deal_type not in", values, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeBetween(Byte value1, Byte value2) {
//            addCriterion("deal_type between", value1, value2, "dealType");
//            return (Criteria) this;
//        }
//
//        public Criteria andDealTypeNotBetween(Byte value1, Byte value2) {
//            addCriterion("deal_type not between", value1, value2, "dealType");
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
//        public Criteria andUpdTmIsNull() {
//            addCriterion("upd_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmIsNotNull() {
//            addCriterion("upd_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmEqualTo(Date value) {
//            addCriterion("upd_tm =", value, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmNotEqualTo(Date value) {
//            addCriterion("upd_tm <>", value, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmGreaterThan(Date value) {
//            addCriterion("upd_tm >", value, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("upd_tm >=", value, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmLessThan(Date value) {
//            addCriterion("upd_tm <", value, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmLessThanOrEqualTo(Date value) {
//            addCriterion("upd_tm <=", value, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmIn(List<Date> values) {
//            addCriterion("upd_tm in", values, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmNotIn(List<Date> values) {
//            addCriterion("upd_tm not in", values, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmBetween(Date value1, Date value2) {
//            addCriterion("upd_tm between", value1, value2, "updTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andUpdTmNotBetween(Date value1, Date value2) {
//            addCriterion("upd_tm not between", value1, value2, "updTm");
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