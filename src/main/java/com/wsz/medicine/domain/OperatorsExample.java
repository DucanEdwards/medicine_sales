package com.wsz.medicine.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OperatorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperatorsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOprIdIsNull() {
            addCriterion("opr_id is null");
            return (Criteria) this;
        }

        public Criteria andOprIdIsNotNull() {
            addCriterion("opr_id is not null");
            return (Criteria) this;
        }

        public Criteria andOprIdEqualTo(Long value) {
            addCriterion("opr_id =", value, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdNotEqualTo(Long value) {
            addCriterion("opr_id <>", value, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdGreaterThan(Long value) {
            addCriterion("opr_id >", value, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdGreaterThanOrEqualTo(Long value) {
            addCriterion("opr_id >=", value, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdLessThan(Long value) {
            addCriterion("opr_id <", value, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdLessThanOrEqualTo(Long value) {
            addCriterion("opr_id <=", value, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdIn(List<Long> values) {
            addCriterion("opr_id in", values, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdNotIn(List<Long> values) {
            addCriterion("opr_id not in", values, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdBetween(Long value1, Long value2) {
            addCriterion("opr_id between", value1, value2, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprIdNotBetween(Long value1, Long value2) {
            addCriterion("opr_id not between", value1, value2, "oprId");
            return (Criteria) this;
        }

        public Criteria andOprNameIsNull() {
            addCriterion("opr_name is null");
            return (Criteria) this;
        }

        public Criteria andOprNameIsNotNull() {
            addCriterion("opr_name is not null");
            return (Criteria) this;
        }

        public Criteria andOprNameEqualTo(String value) {
            addCriterion("opr_name =", value, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameNotEqualTo(String value) {
            addCriterion("opr_name <>", value, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameGreaterThan(String value) {
            addCriterion("opr_name >", value, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameGreaterThanOrEqualTo(String value) {
            addCriterion("opr_name >=", value, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameLessThan(String value) {
            addCriterion("opr_name <", value, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameLessThanOrEqualTo(String value) {
            addCriterion("opr_name <=", value, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameLike(String value) {
            addCriterion("opr_name like", value, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameNotLike(String value) {
            addCriterion("opr_name not like", value, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameIn(List<String> values) {
            addCriterion("opr_name in", values, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameNotIn(List<String> values) {
            addCriterion("opr_name not in", values, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameBetween(String value1, String value2) {
            addCriterion("opr_name between", value1, value2, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprNameNotBetween(String value1, String value2) {
            addCriterion("opr_name not between", value1, value2, "oprName");
            return (Criteria) this;
        }

        public Criteria andOprTelIsNull() {
            addCriterion("opr_tel is null");
            return (Criteria) this;
        }

        public Criteria andOprTelIsNotNull() {
            addCriterion("opr_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOprTelEqualTo(String value) {
            addCriterion("opr_tel =", value, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelNotEqualTo(String value) {
            addCriterion("opr_tel <>", value, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelGreaterThan(String value) {
            addCriterion("opr_tel >", value, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelGreaterThanOrEqualTo(String value) {
            addCriterion("opr_tel >=", value, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelLessThan(String value) {
            addCriterion("opr_tel <", value, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelLessThanOrEqualTo(String value) {
            addCriterion("opr_tel <=", value, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelLike(String value) {
            addCriterion("opr_tel like", value, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelNotLike(String value) {
            addCriterion("opr_tel not like", value, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelIn(List<String> values) {
            addCriterion("opr_tel in", values, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelNotIn(List<String> values) {
            addCriterion("opr_tel not in", values, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelBetween(String value1, String value2) {
            addCriterion("opr_tel between", value1, value2, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprTelNotBetween(String value1, String value2) {
            addCriterion("opr_tel not between", value1, value2, "oprTel");
            return (Criteria) this;
        }

        public Criteria andOprSexIsNull() {
            addCriterion("opr_sex is null");
            return (Criteria) this;
        }

        public Criteria andOprSexIsNotNull() {
            addCriterion("opr_sex is not null");
            return (Criteria) this;
        }

        public Criteria andOprSexEqualTo(String value) {
            addCriterion("opr_sex =", value, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexNotEqualTo(String value) {
            addCriterion("opr_sex <>", value, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexGreaterThan(String value) {
            addCriterion("opr_sex >", value, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexGreaterThanOrEqualTo(String value) {
            addCriterion("opr_sex >=", value, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexLessThan(String value) {
            addCriterion("opr_sex <", value, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexLessThanOrEqualTo(String value) {
            addCriterion("opr_sex <=", value, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexLike(String value) {
            addCriterion("opr_sex like", value, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexNotLike(String value) {
            addCriterion("opr_sex not like", value, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexIn(List<String> values) {
            addCriterion("opr_sex in", values, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexNotIn(List<String> values) {
            addCriterion("opr_sex not in", values, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexBetween(String value1, String value2) {
            addCriterion("opr_sex between", value1, value2, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprSexNotBetween(String value1, String value2) {
            addCriterion("opr_sex not between", value1, value2, "oprSex");
            return (Criteria) this;
        }

        public Criteria andOprPayIsNull() {
            addCriterion("opr_pay is null");
            return (Criteria) this;
        }

        public Criteria andOprPayIsNotNull() {
            addCriterion("opr_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOprPayEqualTo(String value) {
            addCriterion("opr_pay =", value, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayNotEqualTo(String value) {
            addCriterion("opr_pay <>", value, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayGreaterThan(String value) {
            addCriterion("opr_pay >", value, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayGreaterThanOrEqualTo(String value) {
            addCriterion("opr_pay >=", value, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayLessThan(String value) {
            addCriterion("opr_pay <", value, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayLessThanOrEqualTo(String value) {
            addCriterion("opr_pay <=", value, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayLike(String value) {
            addCriterion("opr_pay like", value, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayNotLike(String value) {
            addCriterion("opr_pay not like", value, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayIn(List<String> values) {
            addCriterion("opr_pay in", values, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayNotIn(List<String> values) {
            addCriterion("opr_pay not in", values, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayBetween(String value1, String value2) {
            addCriterion("opr_pay between", value1, value2, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPayNotBetween(String value1, String value2) {
            addCriterion("opr_pay not between", value1, value2, "oprPay");
            return (Criteria) this;
        }

        public Criteria andOprPasswordIsNull() {
            addCriterion("opr_password is null");
            return (Criteria) this;
        }

        public Criteria andOprPasswordIsNotNull() {
            addCriterion("opr_password is not null");
            return (Criteria) this;
        }

        public Criteria andOprPasswordEqualTo(String value) {
            addCriterion("opr_password =", value, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordNotEqualTo(String value) {
            addCriterion("opr_password <>", value, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordGreaterThan(String value) {
            addCriterion("opr_password >", value, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("opr_password >=", value, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordLessThan(String value) {
            addCriterion("opr_password <", value, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordLessThanOrEqualTo(String value) {
            addCriterion("opr_password <=", value, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordLike(String value) {
            addCriterion("opr_password like", value, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordNotLike(String value) {
            addCriterion("opr_password not like", value, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordIn(List<String> values) {
            addCriterion("opr_password in", values, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordNotIn(List<String> values) {
            addCriterion("opr_password not in", values, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordBetween(String value1, String value2) {
            addCriterion("opr_password between", value1, value2, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprPasswordNotBetween(String value1, String value2) {
            addCriterion("opr_password not between", value1, value2, "oprPassword");
            return (Criteria) this;
        }

        public Criteria andOprHiredateIsNull() {
            addCriterion("opr_hiredate is null");
            return (Criteria) this;
        }

        public Criteria andOprHiredateIsNotNull() {
            addCriterion("opr_hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andOprHiredateEqualTo(Date value) {
            addCriterionForJDBCDate("opr_hiredate =", value, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("opr_hiredate <>", value, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateGreaterThan(Date value) {
            addCriterionForJDBCDate("opr_hiredate >", value, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opr_hiredate >=", value, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateLessThan(Date value) {
            addCriterionForJDBCDate("opr_hiredate <", value, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opr_hiredate <=", value, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateIn(List<Date> values) {
            addCriterionForJDBCDate("opr_hiredate in", values, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("opr_hiredate not in", values, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opr_hiredate between", value1, value2, "oprHiredate");
            return (Criteria) this;
        }

        public Criteria andOprHiredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opr_hiredate not between", value1, value2, "oprHiredate");
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