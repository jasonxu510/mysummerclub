package com.example.mysummerclub.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
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

        public Criteria andGivenNameIsNull() {
            addCriterion("given_name is null");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNotNull() {
            addCriterion("given_name is not null");
            return (Criteria) this;
        }

        public Criteria andGivenNameEqualTo(String value) {
            addCriterion("given_name =", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotEqualTo(String value) {
            addCriterion("given_name <>", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThan(String value) {
            addCriterion("given_name >", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThanOrEqualTo(String value) {
            addCriterion("given_name >=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThan(String value) {
            addCriterion("given_name <", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThanOrEqualTo(String value) {
            addCriterion("given_name <=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLike(String value) {
            addCriterion("given_name like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotLike(String value) {
            addCriterion("given_name not like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIn(List<String> values) {
            addCriterion("given_name in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotIn(List<String> values) {
            addCriterion("given_name not in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameBetween(String value1, String value2) {
            addCriterion("given_name between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotBetween(String value1, String value2) {
            addCriterion("given_name not between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolIsNull() {
            addCriterion("grammer_school is null");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolIsNotNull() {
            addCriterion("grammer_school is not null");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolEqualTo(String value) {
            addCriterion("grammer_school =", value, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolNotEqualTo(String value) {
            addCriterion("grammer_school <>", value, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolGreaterThan(String value) {
            addCriterion("grammer_school >", value, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("grammer_school >=", value, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolLessThan(String value) {
            addCriterion("grammer_school <", value, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolLessThanOrEqualTo(String value) {
            addCriterion("grammer_school <=", value, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolLike(String value) {
            addCriterion("grammer_school like", value, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolNotLike(String value) {
            addCriterion("grammer_school not like", value, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolIn(List<String> values) {
            addCriterion("grammer_school in", values, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolNotIn(List<String> values) {
            addCriterion("grammer_school not in", values, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolBetween(String value1, String value2) {
            addCriterion("grammer_school between", value1, value2, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andGrammerSchoolNotBetween(String value1, String value2) {
            addCriterion("grammer_school not between", value1, value2, "grammerSchool");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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