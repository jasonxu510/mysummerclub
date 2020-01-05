package com.example.mysummerclub.pojo;

import java.util.ArrayList;
import java.util.List;

public class CampExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CampExample() {
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

        public Criteria andBlanckSpaceOneIsNull() {
            addCriterion("blanck_space_one is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneIsNotNull() {
            addCriterion("blanck_space_one is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneEqualTo(String value) {
            addCriterion("blanck_space_one =", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotEqualTo(String value) {
            addCriterion("blanck_space_one <>", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneGreaterThan(String value) {
            addCriterion("blanck_space_one >", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_one >=", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLessThan(String value) {
            addCriterion("blanck_space_one <", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_one <=", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLike(String value) {
            addCriterion("blanck_space_one like", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotLike(String value) {
            addCriterion("blanck_space_one not like", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneIn(List<String> values) {
            addCriterion("blanck_space_one in", values, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotIn(List<String> values) {
            addCriterion("blanck_space_one not in", values, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneBetween(String value1, String value2) {
            addCriterion("blanck_space_one between", value1, value2, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotBetween(String value1, String value2) {
            addCriterion("blanck_space_one not between", value1, value2, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIsNull() {
            addCriterion("blanck_space_three is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIsNotNull() {
            addCriterion("blanck_space_three is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeEqualTo(String value) {
            addCriterion("blanck_space_three =", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotEqualTo(String value) {
            addCriterion("blanck_space_three <>", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeGreaterThan(String value) {
            addCriterion("blanck_space_three >", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_three >=", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLessThan(String value) {
            addCriterion("blanck_space_three <", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_three <=", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLike(String value) {
            addCriterion("blanck_space_three like", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotLike(String value) {
            addCriterion("blanck_space_three not like", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIn(List<String> values) {
            addCriterion("blanck_space_three in", values, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotIn(List<String> values) {
            addCriterion("blanck_space_three not in", values, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeBetween(String value1, String value2) {
            addCriterion("blanck_space_three between", value1, value2, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotBetween(String value1, String value2) {
            addCriterion("blanck_space_three not between", value1, value2, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIsNull() {
            addCriterion("blanck_space_two is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIsNotNull() {
            addCriterion("blanck_space_two is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoEqualTo(String value) {
            addCriterion("blanck_space_two =", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotEqualTo(String value) {
            addCriterion("blanck_space_two <>", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoGreaterThan(String value) {
            addCriterion("blanck_space_two >", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_two >=", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLessThan(String value) {
            addCriterion("blanck_space_two <", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_two <=", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLike(String value) {
            addCriterion("blanck_space_two like", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotLike(String value) {
            addCriterion("blanck_space_two not like", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIn(List<String> values) {
            addCriterion("blanck_space_two in", values, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotIn(List<String> values) {
            addCriterion("blanck_space_two not in", values, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoBetween(String value1, String value2) {
            addCriterion("blanck_space_two between", value1, value2, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotBetween(String value1, String value2) {
            addCriterion("blanck_space_two not between", value1, value2, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlIsNull() {
            addCriterion("camp_file_url is null");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlIsNotNull() {
            addCriterion("camp_file_url is not null");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlEqualTo(String value) {
            addCriterion("camp_file_url =", value, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlNotEqualTo(String value) {
            addCriterion("camp_file_url <>", value, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlGreaterThan(String value) {
            addCriterion("camp_file_url >", value, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("camp_file_url >=", value, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlLessThan(String value) {
            addCriterion("camp_file_url <", value, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlLessThanOrEqualTo(String value) {
            addCriterion("camp_file_url <=", value, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlLike(String value) {
            addCriterion("camp_file_url like", value, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlNotLike(String value) {
            addCriterion("camp_file_url not like", value, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlIn(List<String> values) {
            addCriterion("camp_file_url in", values, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlNotIn(List<String> values) {
            addCriterion("camp_file_url not in", values, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlBetween(String value1, String value2) {
            addCriterion("camp_file_url between", value1, value2, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampFileUrlNotBetween(String value1, String value2) {
            addCriterion("camp_file_url not between", value1, value2, "campFileUrl");
            return (Criteria) this;
        }

        public Criteria andCampNameIsNull() {
            addCriterion("camp_name is null");
            return (Criteria) this;
        }

        public Criteria andCampNameIsNotNull() {
            addCriterion("camp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCampNameEqualTo(String value) {
            addCriterion("camp_name =", value, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameNotEqualTo(String value) {
            addCriterion("camp_name <>", value, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameGreaterThan(String value) {
            addCriterion("camp_name >", value, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameGreaterThanOrEqualTo(String value) {
            addCriterion("camp_name >=", value, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameLessThan(String value) {
            addCriterion("camp_name <", value, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameLessThanOrEqualTo(String value) {
            addCriterion("camp_name <=", value, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameLike(String value) {
            addCriterion("camp_name like", value, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameNotLike(String value) {
            addCriterion("camp_name not like", value, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameIn(List<String> values) {
            addCriterion("camp_name in", values, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameNotIn(List<String> values) {
            addCriterion("camp_name not in", values, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameBetween(String value1, String value2) {
            addCriterion("camp_name between", value1, value2, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNameNotBetween(String value1, String value2) {
            addCriterion("camp_name not between", value1, value2, "campName");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoIsNull() {
            addCriterion("camp_news_ifo is null");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoIsNotNull() {
            addCriterion("camp_news_ifo is not null");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoEqualTo(String value) {
            addCriterion("camp_news_ifo =", value, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoNotEqualTo(String value) {
            addCriterion("camp_news_ifo <>", value, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoGreaterThan(String value) {
            addCriterion("camp_news_ifo >", value, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoGreaterThanOrEqualTo(String value) {
            addCriterion("camp_news_ifo >=", value, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoLessThan(String value) {
            addCriterion("camp_news_ifo <", value, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoLessThanOrEqualTo(String value) {
            addCriterion("camp_news_ifo <=", value, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoLike(String value) {
            addCriterion("camp_news_ifo like", value, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoNotLike(String value) {
            addCriterion("camp_news_ifo not like", value, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoIn(List<String> values) {
            addCriterion("camp_news_ifo in", values, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoNotIn(List<String> values) {
            addCriterion("camp_news_ifo not in", values, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoBetween(String value1, String value2) {
            addCriterion("camp_news_ifo between", value1, value2, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsIfoNotBetween(String value1, String value2) {
            addCriterion("camp_news_ifo not between", value1, value2, "campNewsIfo");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleIsNull() {
            addCriterion("camp_news_title is null");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleIsNotNull() {
            addCriterion("camp_news_title is not null");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleEqualTo(String value) {
            addCriterion("camp_news_title =", value, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleNotEqualTo(String value) {
            addCriterion("camp_news_title <>", value, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleGreaterThan(String value) {
            addCriterion("camp_news_title >", value, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("camp_news_title >=", value, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleLessThan(String value) {
            addCriterion("camp_news_title <", value, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("camp_news_title <=", value, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleLike(String value) {
            addCriterion("camp_news_title like", value, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleNotLike(String value) {
            addCriterion("camp_news_title not like", value, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleIn(List<String> values) {
            addCriterion("camp_news_title in", values, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleNotIn(List<String> values) {
            addCriterion("camp_news_title not in", values, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleBetween(String value1, String value2) {
            addCriterion("camp_news_title between", value1, value2, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsTitleNotBetween(String value1, String value2) {
            addCriterion("camp_news_title not between", value1, value2, "campNewsTitle");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlIsNull() {
            addCriterion("camp_news_url is null");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlIsNotNull() {
            addCriterion("camp_news_url is not null");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlEqualTo(String value) {
            addCriterion("camp_news_url =", value, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlNotEqualTo(String value) {
            addCriterion("camp_news_url <>", value, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlGreaterThan(String value) {
            addCriterion("camp_news_url >", value, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("camp_news_url >=", value, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlLessThan(String value) {
            addCriterion("camp_news_url <", value, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlLessThanOrEqualTo(String value) {
            addCriterion("camp_news_url <=", value, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlLike(String value) {
            addCriterion("camp_news_url like", value, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlNotLike(String value) {
            addCriterion("camp_news_url not like", value, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlIn(List<String> values) {
            addCriterion("camp_news_url in", values, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlNotIn(List<String> values) {
            addCriterion("camp_news_url not in", values, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlBetween(String value1, String value2) {
            addCriterion("camp_news_url between", value1, value2, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampNewsUrlNotBetween(String value1, String value2) {
            addCriterion("camp_news_url not between", value1, value2, "campNewsUrl");
            return (Criteria) this;
        }

        public Criteria andCampStatusIsNull() {
            addCriterion("camp_status is null");
            return (Criteria) this;
        }

        public Criteria andCampStatusIsNotNull() {
            addCriterion("camp_status is not null");
            return (Criteria) this;
        }

        public Criteria andCampStatusEqualTo(String value) {
            addCriterion("camp_status =", value, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusNotEqualTo(String value) {
            addCriterion("camp_status <>", value, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusGreaterThan(String value) {
            addCriterion("camp_status >", value, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusGreaterThanOrEqualTo(String value) {
            addCriterion("camp_status >=", value, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusLessThan(String value) {
            addCriterion("camp_status <", value, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusLessThanOrEqualTo(String value) {
            addCriterion("camp_status <=", value, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusLike(String value) {
            addCriterion("camp_status like", value, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusNotLike(String value) {
            addCriterion("camp_status not like", value, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusIn(List<String> values) {
            addCriterion("camp_status in", values, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusNotIn(List<String> values) {
            addCriterion("camp_status not in", values, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusBetween(String value1, String value2) {
            addCriterion("camp_status between", value1, value2, "campStatus");
            return (Criteria) this;
        }

        public Criteria andCampStatusNotBetween(String value1, String value2) {
            addCriterion("camp_status not between", value1, value2, "campStatus");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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