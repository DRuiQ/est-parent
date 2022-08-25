package com.team.est.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintainOrderFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainOrderFlowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andOrderNoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("orderNo <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("orderNo like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("orderStatus =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("orderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("orderStatus >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("orderStatus <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("orderStatus in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("orderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescIsNull() {
            addCriterion("orderStatusDesc is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescIsNotNull() {
            addCriterion("orderStatusDesc is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescEqualTo(String value) {
            addCriterion("orderStatusDesc =", value, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescNotEqualTo(String value) {
            addCriterion("orderStatusDesc <>", value, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescGreaterThan(String value) {
            addCriterion("orderStatusDesc >", value, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("orderStatusDesc >=", value, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescLessThan(String value) {
            addCriterion("orderStatusDesc <", value, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescLessThanOrEqualTo(String value) {
            addCriterion("orderStatusDesc <=", value, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescLike(String value) {
            addCriterion("orderStatusDesc like", value, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescNotLike(String value) {
            addCriterion("orderStatusDesc not like", value, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescIn(List<String> values) {
            addCriterion("orderStatusDesc in", values, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescNotIn(List<String> values) {
            addCriterion("orderStatusDesc not in", values, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescBetween(String value1, String value2) {
            addCriterion("orderStatusDesc between", value1, value2, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusDescNotBetween(String value1, String value2) {
            addCriterion("orderStatusDesc not between", value1, value2, "orderStatusDesc");
            return (Criteria) this;
        }

        public Criteria andOperationUIdIsNull() {
            addCriterion("operationUId is null");
            return (Criteria) this;
        }

        public Criteria andOperationUIdIsNotNull() {
            addCriterion("operationUId is not null");
            return (Criteria) this;
        }

        public Criteria andOperationUIdEqualTo(Long value) {
            addCriterion("operationUId =", value, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdNotEqualTo(Long value) {
            addCriterion("operationUId <>", value, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdGreaterThan(Long value) {
            addCriterion("operationUId >", value, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operationUId >=", value, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdLessThan(Long value) {
            addCriterion("operationUId <", value, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdLessThanOrEqualTo(Long value) {
            addCriterion("operationUId <=", value, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdIn(List<Long> values) {
            addCriterion("operationUId in", values, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdNotIn(List<Long> values) {
            addCriterion("operationUId not in", values, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdBetween(Long value1, Long value2) {
            addCriterion("operationUId between", value1, value2, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationUIdNotBetween(Long value1, Long value2) {
            addCriterion("operationUId not between", value1, value2, "operationUId");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNull() {
            addCriterion("operationName is null");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNotNull() {
            addCriterion("operationName is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNameEqualTo(String value) {
            addCriterion("operationName =", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotEqualTo(String value) {
            addCriterion("operationName <>", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThan(String value) {
            addCriterion("operationName >", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("operationName >=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThan(String value) {
            addCriterion("operationName <", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThanOrEqualTo(String value) {
            addCriterion("operationName <=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLike(String value) {
            addCriterion("operationName like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotLike(String value) {
            addCriterion("operationName not like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameIn(List<String> values) {
            addCriterion("operationName in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotIn(List<String> values) {
            addCriterion("operationName not in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameBetween(String value1, String value2) {
            addCriterion("operationName between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotBetween(String value1, String value2) {
            addCriterion("operationName not between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNull() {
            addCriterion("createdUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNotNull() {
            addCriterion("createdUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdEqualTo(Long value) {
            addCriterion("createdUserId =", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotEqualTo(Long value) {
            addCriterion("createdUserId <>", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThan(Long value) {
            addCriterion("createdUserId >", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("createdUserId >=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThan(Long value) {
            addCriterion("createdUserId <", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("createdUserId <=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIn(List<Long> values) {
            addCriterion("createdUserId in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotIn(List<Long> values) {
            addCriterion("createdUserId not in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdBetween(Long value1, Long value2) {
            addCriterion("createdUserId between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("createdUserId not between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIsNull() {
            addCriterion("updatedUserId is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIsNotNull() {
            addCriterion("updatedUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdEqualTo(Long value) {
            addCriterion("updatedUserId =", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotEqualTo(Long value) {
            addCriterion("updatedUserId <>", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdGreaterThan(Long value) {
            addCriterion("updatedUserId >", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("updatedUserId >=", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLessThan(Long value) {
            addCriterion("updatedUserId <", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("updatedUserId <=", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIn(List<Long> values) {
            addCriterion("updatedUserId in", values, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotIn(List<Long> values) {
            addCriterion("updatedUserId not in", values, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdBetween(Long value1, Long value2) {
            addCriterion("updatedUserId between", value1, value2, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("updatedUserId not between", value1, value2, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeIsNull() {
            addCriterion("creatdTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeIsNotNull() {
            addCriterion("creatdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeEqualTo(Date value) {
            addCriterion("creatdTime =", value, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeNotEqualTo(Date value) {
            addCriterion("creatdTime <>", value, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeGreaterThan(Date value) {
            addCriterion("creatdTime >", value, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatdTime >=", value, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeLessThan(Date value) {
            addCriterion("creatdTime <", value, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeLessThanOrEqualTo(Date value) {
            addCriterion("creatdTime <=", value, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeIn(List<Date> values) {
            addCriterion("creatdTime in", values, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeNotIn(List<Date> values) {
            addCriterion("creatdTime not in", values, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeBetween(Date value1, Date value2) {
            addCriterion("creatdTime between", value1, value2, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andCreatdTimeNotBetween(Date value1, Date value2) {
            addCriterion("creatdTime not between", value1, value2, "creatdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updatedTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updatedTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updatedTime =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updatedTime <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updatedTime >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedTime >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updatedTime <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updatedTime <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updatedTime in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updatedTime not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updatedTime between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updatedTime not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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