//package com.dwd.www.db.cobarc_shard3.domain;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class OrderPackageExample {
//    protected String orderByClause;
//
//    protected boolean distinct;
//
//    protected List<Criteria> oredCriteria;
//
//    public OrderPackageExample() {
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
//        public Criteria andStatusEqualTo(Integer value) {
//            addCriterion("status =", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusNotEqualTo(Integer value) {
//            addCriterion("status <>", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusGreaterThan(Integer value) {
//            addCriterion("status >", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
//            addCriterion("status >=", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusLessThan(Integer value) {
//            addCriterion("status <", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusLessThanOrEqualTo(Integer value) {
//            addCriterion("status <=", value, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusIn(List<Integer> values) {
//            addCriterion("status in", values, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusNotIn(List<Integer> values) {
//            addCriterion("status not in", values, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusBetween(Integer value1, Integer value2) {
//            addCriterion("status between", value1, value2, "status");
//            return (Criteria) this;
//        }
//
//        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
//            addCriterion("status not between", value1, value2, "status");
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
//        public Criteria andSerialIdEqualTo(Integer value) {
//            addCriterion("serial_id =", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdNotEqualTo(Integer value) {
//            addCriterion("serial_id <>", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdGreaterThan(Integer value) {
//            addCriterion("serial_id >", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("serial_id >=", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdLessThan(Integer value) {
//            addCriterion("serial_id <", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdLessThanOrEqualTo(Integer value) {
//            addCriterion("serial_id <=", value, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdIn(List<Integer> values) {
//            addCriterion("serial_id in", values, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdNotIn(List<Integer> values) {
//            addCriterion("serial_id not in", values, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdBetween(Integer value1, Integer value2) {
//            addCriterion("serial_id between", value1, value2, "serialId");
//            return (Criteria) this;
//        }
//
//        public Criteria andSerialIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("serial_id not between", value1, value2, "serialId");
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
//        public Criteria andDelieveredTmIsNull() {
//            addCriterion("delievered_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmIsNotNull() {
//            addCriterion("delievered_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmEqualTo(Date value) {
//            addCriterion("delievered_tm =", value, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmNotEqualTo(Date value) {
//            addCriterion("delievered_tm <>", value, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmGreaterThan(Date value) {
//            addCriterion("delievered_tm >", value, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("delievered_tm >=", value, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmLessThan(Date value) {
//            addCriterion("delievered_tm <", value, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmLessThanOrEqualTo(Date value) {
//            addCriterion("delievered_tm <=", value, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmIn(List<Date> values) {
//            addCriterion("delievered_tm in", values, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmNotIn(List<Date> values) {
//            addCriterion("delievered_tm not in", values, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmBetween(Date value1, Date value2) {
//            addCriterion("delievered_tm between", value1, value2, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andDelieveredTmNotBetween(Date value1, Date value2) {
//            addCriterion("delievered_tm not between", value1, value2, "delieveredTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmIsNull() {
//            addCriterion("leave_shop_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmIsNotNull() {
//            addCriterion("leave_shop_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmEqualTo(Date value) {
//            addCriterion("leave_shop_tm =", value, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmNotEqualTo(Date value) {
//            addCriterion("leave_shop_tm <>", value, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmGreaterThan(Date value) {
//            addCriterion("leave_shop_tm >", value, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("leave_shop_tm >=", value, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmLessThan(Date value) {
//            addCriterion("leave_shop_tm <", value, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmLessThanOrEqualTo(Date value) {
//            addCriterion("leave_shop_tm <=", value, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmIn(List<Date> values) {
//            addCriterion("leave_shop_tm in", values, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmNotIn(List<Date> values) {
//            addCriterion("leave_shop_tm not in", values, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmBetween(Date value1, Date value2) {
//            addCriterion("leave_shop_tm between", value1, value2, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andLeaveShopTmNotBetween(Date value1, Date value2) {
//            addCriterion("leave_shop_tm not between", value1, value2, "leaveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmIsNull() {
//            addCriterion("arrive_shop_tm is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmIsNotNull() {
//            addCriterion("arrive_shop_tm is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmEqualTo(Date value) {
//            addCriterion("arrive_shop_tm =", value, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmNotEqualTo(Date value) {
//            addCriterion("arrive_shop_tm <>", value, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmGreaterThan(Date value) {
//            addCriterion("arrive_shop_tm >", value, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmGreaterThanOrEqualTo(Date value) {
//            addCriterion("arrive_shop_tm >=", value, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmLessThan(Date value) {
//            addCriterion("arrive_shop_tm <", value, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmLessThanOrEqualTo(Date value) {
//            addCriterion("arrive_shop_tm <=", value, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmIn(List<Date> values) {
//            addCriterion("arrive_shop_tm in", values, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmNotIn(List<Date> values) {
//            addCriterion("arrive_shop_tm not in", values, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmBetween(Date value1, Date value2) {
//            addCriterion("arrive_shop_tm between", value1, value2, "arriveShopTm");
//            return (Criteria) this;
//        }
//
//        public Criteria andArriveShopTmNotBetween(Date value1, Date value2) {
//            addCriterion("arrive_shop_tm not between", value1, value2, "arriveShopTm");
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
//        public Criteria andOrderCountIsNull() {
//            addCriterion("order_count is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountIsNotNull() {
//            addCriterion("order_count is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountEqualTo(Integer value) {
//            addCriterion("order_count =", value, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountNotEqualTo(Integer value) {
//            addCriterion("order_count <>", value, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountGreaterThan(Integer value) {
//            addCriterion("order_count >", value, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
//            addCriterion("order_count >=", value, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountLessThan(Integer value) {
//            addCriterion("order_count <", value, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
//            addCriterion("order_count <=", value, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountIn(List<Integer> values) {
//            addCriterion("order_count in", values, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountNotIn(List<Integer> values) {
//            addCriterion("order_count not in", values, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
//            addCriterion("order_count between", value1, value2, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
//            addCriterion("order_count not between", value1, value2, "orderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountIsNull() {
//            addCriterion("init_order_count is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountIsNotNull() {
//            addCriterion("init_order_count is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountEqualTo(Integer value) {
//            addCriterion("init_order_count =", value, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountNotEqualTo(Integer value) {
//            addCriterion("init_order_count <>", value, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountGreaterThan(Integer value) {
//            addCriterion("init_order_count >", value, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountGreaterThanOrEqualTo(Integer value) {
//            addCriterion("init_order_count >=", value, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountLessThan(Integer value) {
//            addCriterion("init_order_count <", value, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountLessThanOrEqualTo(Integer value) {
//            addCriterion("init_order_count <=", value, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountIn(List<Integer> values) {
//            addCriterion("init_order_count in", values, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountNotIn(List<Integer> values) {
//            addCriterion("init_order_count not in", values, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountBetween(Integer value1, Integer value2) {
//            addCriterion("init_order_count between", value1, value2, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andInitOrderCountNotBetween(Integer value1, Integer value2) {
//            addCriterion("init_order_count not between", value1, value2, "initOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountIsNull() {
//            addCriterion("abnormal_order_count is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountIsNotNull() {
//            addCriterion("abnormal_order_count is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountEqualTo(Integer value) {
//            addCriterion("abnormal_order_count =", value, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountNotEqualTo(Integer value) {
//            addCriterion("abnormal_order_count <>", value, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountGreaterThan(Integer value) {
//            addCriterion("abnormal_order_count >", value, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountGreaterThanOrEqualTo(Integer value) {
//            addCriterion("abnormal_order_count >=", value, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountLessThan(Integer value) {
//            addCriterion("abnormal_order_count <", value, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountLessThanOrEqualTo(Integer value) {
//            addCriterion("abnormal_order_count <=", value, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountIn(List<Integer> values) {
//            addCriterion("abnormal_order_count in", values, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountNotIn(List<Integer> values) {
//            addCriterion("abnormal_order_count not in", values, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountBetween(Integer value1, Integer value2) {
//            addCriterion("abnormal_order_count between", value1, value2, "abnormalOrderCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andAbnormalOrderCountNotBetween(Integer value1, Integer value2) {
//            addCriterion("abnormal_order_count not between", value1, value2, "abnormalOrderCount");
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
//        public Criteria andPlatformIdIsNull() {
//            addCriterion("platform_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdIsNotNull() {
//            addCriterion("platform_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdEqualTo(Integer value) {
//            addCriterion("platform_id =", value, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdNotEqualTo(Integer value) {
//            addCriterion("platform_id <>", value, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdGreaterThan(Integer value) {
//            addCriterion("platform_id >", value, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("platform_id >=", value, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdLessThan(Integer value) {
//            addCriterion("platform_id <", value, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdLessThanOrEqualTo(Integer value) {
//            addCriterion("platform_id <=", value, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdIn(List<Integer> values) {
//            addCriterion("platform_id in", values, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdNotIn(List<Integer> values) {
//            addCriterion("platform_id not in", values, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdBetween(Integer value1, Integer value2) {
//            addCriterion("platform_id between", value1, value2, "platformId");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("platform_id not between", value1, value2, "platformId");
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
//        public Criteria andPlatformNameIsNull() {
//            addCriterion("platform_name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameIsNotNull() {
//            addCriterion("platform_name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameEqualTo(String value) {
//            addCriterion("platform_name =", value, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameNotEqualTo(String value) {
//            addCriterion("platform_name <>", value, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameGreaterThan(String value) {
//            addCriterion("platform_name >", value, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameGreaterThanOrEqualTo(String value) {
//            addCriterion("platform_name >=", value, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameLessThan(String value) {
//            addCriterion("platform_name <", value, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameLessThanOrEqualTo(String value) {
//            addCriterion("platform_name <=", value, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameLike(String value) {
//            addCriterion("platform_name like", value, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameNotLike(String value) {
//            addCriterion("platform_name not like", value, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameIn(List<String> values) {
//            addCriterion("platform_name in", values, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameNotIn(List<String> values) {
//            addCriterion("platform_name not in", values, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameBetween(String value1, String value2) {
//            addCriterion("platform_name between", value1, value2, "platformName");
//            return (Criteria) this;
//        }
//
//        public Criteria andPlatformNameNotBetween(String value1, String value2) {
//            addCriterion("platform_name not between", value1, value2, "platformName");
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
//        public Criteria andTipIsNull() {
//            addCriterion("tip is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipIsNotNull() {
//            addCriterion("tip is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipEqualTo(BigDecimal value) {
//            addCriterion("tip =", value, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipNotEqualTo(BigDecimal value) {
//            addCriterion("tip <>", value, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipGreaterThan(BigDecimal value) {
//            addCriterion("tip >", value, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipGreaterThanOrEqualTo(BigDecimal value) {
//            addCriterion("tip >=", value, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipLessThan(BigDecimal value) {
//            addCriterion("tip <", value, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipLessThanOrEqualTo(BigDecimal value) {
//            addCriterion("tip <=", value, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipIn(List<BigDecimal> values) {
//            addCriterion("tip in", values, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipNotIn(List<BigDecimal> values) {
//            addCriterion("tip not in", values, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("tip between", value1, value2, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andTipNotBetween(BigDecimal value1, BigDecimal value2) {
//            addCriterion("tip not between", value1, value2, "tip");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionIsNull() {
//            addCriterion("version is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionIsNotNull() {
//            addCriterion("version is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionEqualTo(Integer value) {
//            addCriterion("version =", value, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionNotEqualTo(Integer value) {
//            addCriterion("version <>", value, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionGreaterThan(Integer value) {
//            addCriterion("version >", value, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
//            addCriterion("version >=", value, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionLessThan(Integer value) {
//            addCriterion("version <", value, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionLessThanOrEqualTo(Integer value) {
//            addCriterion("version <=", value, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionIn(List<Integer> values) {
//            addCriterion("version in", values, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionNotIn(List<Integer> values) {
//            addCriterion("version not in", values, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionBetween(Integer value1, Integer value2) {
//            addCriterion("version between", value1, value2, "version");
//            return (Criteria) this;
//        }
//
//        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
//            addCriterion("version not between", value1, value2, "version");
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
//        public Criteria andReasonCodeIsNull() {
//            addCriterion("reason_code is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeIsNotNull() {
//            addCriterion("reason_code is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeEqualTo(Integer value) {
//            addCriterion("reason_code =", value, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeNotEqualTo(Integer value) {
//            addCriterion("reason_code <>", value, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeGreaterThan(Integer value) {
//            addCriterion("reason_code >", value, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeGreaterThanOrEqualTo(Integer value) {
//            addCriterion("reason_code >=", value, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeLessThan(Integer value) {
//            addCriterion("reason_code <", value, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeLessThanOrEqualTo(Integer value) {
//            addCriterion("reason_code <=", value, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeIn(List<Integer> values) {
//            addCriterion("reason_code in", values, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeNotIn(List<Integer> values) {
//            addCriterion("reason_code not in", values, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeBetween(Integer value1, Integer value2) {
//            addCriterion("reason_code between", value1, value2, "reasonCode");
//            return (Criteria) this;
//        }
//
//        public Criteria andReasonCodeNotBetween(Integer value1, Integer value2) {
//            addCriterion("reason_code not between", value1, value2, "reasonCode");
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
//        public Criteria andOrderTypeEqualTo(Integer value) {
//            addCriterion("order_type =", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeNotEqualTo(Integer value) {
//            addCriterion("order_type <>", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeGreaterThan(Integer value) {
//            addCriterion("order_type >", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
//            addCriterion("order_type >=", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeLessThan(Integer value) {
//            addCriterion("order_type <", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
//            addCriterion("order_type <=", value, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeIn(List<Integer> values) {
//            addCriterion("order_type in", values, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeNotIn(List<Integer> values) {
//            addCriterion("order_type not in", values, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
//            addCriterion("order_type between", value1, value2, "orderType");
//            return (Criteria) this;
//        }
//
//        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
//            addCriterion("order_type not between", value1, value2, "orderType");
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