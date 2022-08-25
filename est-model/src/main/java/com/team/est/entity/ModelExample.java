package com.team.est.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelExample() {
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

        public Criteria andModelNameIsNull() {
            addCriterion("modelName is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("modelName is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("modelName =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("modelName <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("modelName >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("modelName >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("modelName <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("modelName <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("modelName like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("modelName not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("modelName in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("modelName not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("modelName between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("modelName not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brandId =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brandId <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brandId >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brandId >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brandId <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brandId <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brandId in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brandId not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brandId between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brandId not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNull() {
            addCriterion("classifyId is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNotNull() {
            addCriterion("classifyId is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(Long value) {
            addCriterion("classifyId =", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotEqualTo(Long value) {
            addCriterion("classifyId <>", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThan(Long value) {
            addCriterion("classifyId >", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("classifyId >=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThan(Long value) {
            addCriterion("classifyId <", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThanOrEqualTo(Long value) {
            addCriterion("classifyId <=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIn(List<Long> values) {
            addCriterion("classifyId in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotIn(List<Long> values) {
            addCriterion("classifyId not in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdBetween(Long value1, Long value2) {
            addCriterion("classifyId between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotBetween(Long value1, Long value2) {
            addCriterion("classifyId not between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andExchangePriceIsNull() {
            addCriterion("exchangePrice is null");
            return (Criteria) this;
        }

        public Criteria andExchangePriceIsNotNull() {
            addCriterion("exchangePrice is not null");
            return (Criteria) this;
        }

        public Criteria andExchangePriceEqualTo(BigDecimal value) {
            addCriterion("exchangePrice =", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceNotEqualTo(BigDecimal value) {
            addCriterion("exchangePrice <>", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceGreaterThan(BigDecimal value) {
            addCriterion("exchangePrice >", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchangePrice >=", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceLessThan(BigDecimal value) {
            addCriterion("exchangePrice <", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchangePrice <=", value, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceIn(List<BigDecimal> values) {
            addCriterion("exchangePrice in", values, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceNotIn(List<BigDecimal> values) {
            addCriterion("exchangePrice not in", values, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchangePrice between", value1, value2, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andExchangePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchangePrice not between", value1, value2, "exchangePrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceIsNull() {
            addCriterion("topPrice is null");
            return (Criteria) this;
        }

        public Criteria andTopPriceIsNotNull() {
            addCriterion("topPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTopPriceEqualTo(BigDecimal value) {
            addCriterion("topPrice =", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotEqualTo(BigDecimal value) {
            addCriterion("topPrice <>", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceGreaterThan(BigDecimal value) {
            addCriterion("topPrice >", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("topPrice >=", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceLessThan(BigDecimal value) {
            addCriterion("topPrice <", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("topPrice <=", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceIn(List<BigDecimal> values) {
            addCriterion("topPrice in", values, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotIn(List<BigDecimal> values) {
            addCriterion("topPrice not in", values, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("topPrice between", value1, value2, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("topPrice not between", value1, value2, "topPrice");
            return (Criteria) this;
        }

        public Criteria andFaceImgIsNull() {
            addCriterion("faceImg is null");
            return (Criteria) this;
        }

        public Criteria andFaceImgIsNotNull() {
            addCriterion("faceImg is not null");
            return (Criteria) this;
        }

        public Criteria andFaceImgEqualTo(String value) {
            addCriterion("faceImg =", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgNotEqualTo(String value) {
            addCriterion("faceImg <>", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgGreaterThan(String value) {
            addCriterion("faceImg >", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgGreaterThanOrEqualTo(String value) {
            addCriterion("faceImg >=", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgLessThan(String value) {
            addCriterion("faceImg <", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgLessThanOrEqualTo(String value) {
            addCriterion("faceImg <=", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgLike(String value) {
            addCriterion("faceImg like", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgNotLike(String value) {
            addCriterion("faceImg not like", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgIn(List<String> values) {
            addCriterion("faceImg in", values, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgNotIn(List<String> values) {
            addCriterion("faceImg not in", values, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgBetween(String value1, String value2) {
            addCriterion("faceImg between", value1, value2, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgNotBetween(String value1, String value2) {
            addCriterion("faceImg not between", value1, value2, "faceImg");
            return (Criteria) this;
        }

        public Criteria andContentImgIsNull() {
            addCriterion("contentImg is null");
            return (Criteria) this;
        }

        public Criteria andContentImgIsNotNull() {
            addCriterion("contentImg is not null");
            return (Criteria) this;
        }

        public Criteria andContentImgEqualTo(String value) {
            addCriterion("contentImg =", value, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgNotEqualTo(String value) {
            addCriterion("contentImg <>", value, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgGreaterThan(String value) {
            addCriterion("contentImg >", value, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgGreaterThanOrEqualTo(String value) {
            addCriterion("contentImg >=", value, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgLessThan(String value) {
            addCriterion("contentImg <", value, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgLessThanOrEqualTo(String value) {
            addCriterion("contentImg <=", value, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgLike(String value) {
            addCriterion("contentImg like", value, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgNotLike(String value) {
            addCriterion("contentImg not like", value, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgIn(List<String> values) {
            addCriterion("contentImg in", values, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgNotIn(List<String> values) {
            addCriterion("contentImg not in", values, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgBetween(String value1, String value2) {
            addCriterion("contentImg between", value1, value2, "contentImg");
            return (Criteria) this;
        }

        public Criteria andContentImgNotBetween(String value1, String value2) {
            addCriterion("contentImg not between", value1, value2, "contentImg");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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