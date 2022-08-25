package com.team.est.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MalfunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MalfunctionExample() {
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

        public Criteria andModelIdIsNull() {
            addCriterion("modelId is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("modelId is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("modelId =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("modelId <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("modelId >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("modelId >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("modelId <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("modelId <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("modelId in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("modelId not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("modelId between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
            addCriterion("modelId not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIsHintIsNull() {
            addCriterion("isHint is null");
            return (Criteria) this;
        }

        public Criteria andIsHintIsNotNull() {
            addCriterion("isHint is not null");
            return (Criteria) this;
        }

        public Criteria andIsHintEqualTo(Integer value) {
            addCriterion("isHint =", value, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintNotEqualTo(Integer value) {
            addCriterion("isHint <>", value, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintGreaterThan(Integer value) {
            addCriterion("isHint >", value, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintGreaterThanOrEqualTo(Integer value) {
            addCriterion("isHint >=", value, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintLessThan(Integer value) {
            addCriterion("isHint <", value, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintLessThanOrEqualTo(Integer value) {
            addCriterion("isHint <=", value, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintIn(List<Integer> values) {
            addCriterion("isHint in", values, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintNotIn(List<Integer> values) {
            addCriterion("isHint not in", values, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintBetween(Integer value1, Integer value2) {
            addCriterion("isHint between", value1, value2, "isHint");
            return (Criteria) this;
        }

        public Criteria andIsHintNotBetween(Integer value1, Integer value2) {
            addCriterion("isHint not between", value1, value2, "isHint");
            return (Criteria) this;
        }

        public Criteria andHintTitleIsNull() {
            addCriterion("hintTitle is null");
            return (Criteria) this;
        }

        public Criteria andHintTitleIsNotNull() {
            addCriterion("hintTitle is not null");
            return (Criteria) this;
        }

        public Criteria andHintTitleEqualTo(String value) {
            addCriterion("hintTitle =", value, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleNotEqualTo(String value) {
            addCriterion("hintTitle <>", value, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleGreaterThan(String value) {
            addCriterion("hintTitle >", value, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleGreaterThanOrEqualTo(String value) {
            addCriterion("hintTitle >=", value, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleLessThan(String value) {
            addCriterion("hintTitle <", value, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleLessThanOrEqualTo(String value) {
            addCriterion("hintTitle <=", value, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleLike(String value) {
            addCriterion("hintTitle like", value, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleNotLike(String value) {
            addCriterion("hintTitle not like", value, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleIn(List<String> values) {
            addCriterion("hintTitle in", values, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleNotIn(List<String> values) {
            addCriterion("hintTitle not in", values, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleBetween(String value1, String value2) {
            addCriterion("hintTitle between", value1, value2, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintTitleNotBetween(String value1, String value2) {
            addCriterion("hintTitle not between", value1, value2, "hintTitle");
            return (Criteria) this;
        }

        public Criteria andHintInfoIsNull() {
            addCriterion("hintInfo is null");
            return (Criteria) this;
        }

        public Criteria andHintInfoIsNotNull() {
            addCriterion("hintInfo is not null");
            return (Criteria) this;
        }

        public Criteria andHintInfoEqualTo(String value) {
            addCriterion("hintInfo =", value, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoNotEqualTo(String value) {
            addCriterion("hintInfo <>", value, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoGreaterThan(String value) {
            addCriterion("hintInfo >", value, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoGreaterThanOrEqualTo(String value) {
            addCriterion("hintInfo >=", value, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoLessThan(String value) {
            addCriterion("hintInfo <", value, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoLessThanOrEqualTo(String value) {
            addCriterion("hintInfo <=", value, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoLike(String value) {
            addCriterion("hintInfo like", value, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoNotLike(String value) {
            addCriterion("hintInfo not like", value, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoIn(List<String> values) {
            addCriterion("hintInfo in", values, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoNotIn(List<String> values) {
            addCriterion("hintInfo not in", values, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoBetween(String value1, String value2) {
            addCriterion("hintInfo between", value1, value2, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintInfoNotBetween(String value1, String value2) {
            addCriterion("hintInfo not between", value1, value2, "hintInfo");
            return (Criteria) this;
        }

        public Criteria andHintImgIsNull() {
            addCriterion("hintImg is null");
            return (Criteria) this;
        }

        public Criteria andHintImgIsNotNull() {
            addCriterion("hintImg is not null");
            return (Criteria) this;
        }

        public Criteria andHintImgEqualTo(String value) {
            addCriterion("hintImg =", value, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgNotEqualTo(String value) {
            addCriterion("hintImg <>", value, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgGreaterThan(String value) {
            addCriterion("hintImg >", value, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgGreaterThanOrEqualTo(String value) {
            addCriterion("hintImg >=", value, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgLessThan(String value) {
            addCriterion("hintImg <", value, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgLessThanOrEqualTo(String value) {
            addCriterion("hintImg <=", value, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgLike(String value) {
            addCriterion("hintImg like", value, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgNotLike(String value) {
            addCriterion("hintImg not like", value, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgIn(List<String> values) {
            addCriterion("hintImg in", values, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgNotIn(List<String> values) {
            addCriterion("hintImg not in", values, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgBetween(String value1, String value2) {
            addCriterion("hintImg between", value1, value2, "hintImg");
            return (Criteria) this;
        }

        public Criteria andHintImgNotBetween(String value1, String value2) {
            addCriterion("hintImg not between", value1, value2, "hintImg");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceIsNull() {
            addCriterion("maintainTopPrice is null");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceIsNotNull() {
            addCriterion("maintainTopPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceEqualTo(BigDecimal value) {
            addCriterion("maintainTopPrice =", value, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceNotEqualTo(BigDecimal value) {
            addCriterion("maintainTopPrice <>", value, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceGreaterThan(BigDecimal value) {
            addCriterion("maintainTopPrice >", value, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maintainTopPrice >=", value, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceLessThan(BigDecimal value) {
            addCriterion("maintainTopPrice <", value, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maintainTopPrice <=", value, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceIn(List<BigDecimal> values) {
            addCriterion("maintainTopPrice in", values, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceNotIn(List<BigDecimal> values) {
            addCriterion("maintainTopPrice not in", values, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintainTopPrice between", value1, value2, "maintainTopPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainTopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintainTopPrice not between", value1, value2, "maintainTopPrice");
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