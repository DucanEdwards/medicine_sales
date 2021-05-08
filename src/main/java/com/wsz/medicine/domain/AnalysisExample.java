package com.wsz.medicine.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnalysisExample() {
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

        public Criteria andAnalysisIdIsNull() {
            addCriterion("analysis_id is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdIsNotNull() {
            addCriterion("analysis_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdEqualTo(Long value) {
            addCriterion("analysis_id =", value, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdNotEqualTo(Long value) {
            addCriterion("analysis_id <>", value, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdGreaterThan(Long value) {
            addCriterion("analysis_id >", value, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdGreaterThanOrEqualTo(Long value) {
            addCriterion("analysis_id >=", value, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdLessThan(Long value) {
            addCriterion("analysis_id <", value, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdLessThanOrEqualTo(Long value) {
            addCriterion("analysis_id <=", value, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdIn(List<Long> values) {
            addCriterion("analysis_id in", values, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdNotIn(List<Long> values) {
            addCriterion("analysis_id not in", values, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdBetween(Long value1, Long value2) {
            addCriterion("analysis_id between", value1, value2, "analysisId");
            return (Criteria) this;
        }

        public Criteria andAnalysisIdNotBetween(Long value1, Long value2) {
            addCriterion("analysis_id not between", value1, value2, "analysisId");
            return (Criteria) this;
        }

        public Criteria andTodayIsNull() {
            addCriterion("today is null");
            return (Criteria) this;
        }

        public Criteria andTodayIsNotNull() {
            addCriterion("today is not null");
            return (Criteria) this;
        }

        public Criteria andTodayEqualTo(Date value) {
            addCriterionForJDBCDate("today =", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotEqualTo(Date value) {
            addCriterionForJDBCDate("today <>", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayGreaterThan(Date value) {
            addCriterionForJDBCDate("today >", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("today >=", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayLessThan(Date value) {
            addCriterionForJDBCDate("today <", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("today <=", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayIn(List<Date> values) {
            addCriterionForJDBCDate("today in", values, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotIn(List<Date> values) {
            addCriterionForJDBCDate("today not in", values, "today");
            return (Criteria) this;
        }

        public Criteria andTodayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("today between", value1, value2, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("today not between", value1, value2, "today");
            return (Criteria) this;
        }

        public Criteria andOrderSumIsNull() {
            addCriterion("order_sum is null");
            return (Criteria) this;
        }

        public Criteria andOrderSumIsNotNull() {
            addCriterion("order_sum is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSumEqualTo(Long value) {
            addCriterion("order_sum =", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotEqualTo(Long value) {
            addCriterion("order_sum <>", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumGreaterThan(Long value) {
            addCriterion("order_sum >", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumGreaterThanOrEqualTo(Long value) {
            addCriterion("order_sum >=", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumLessThan(Long value) {
            addCriterion("order_sum <", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumLessThanOrEqualTo(Long value) {
            addCriterion("order_sum <=", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumIn(List<Long> values) {
            addCriterion("order_sum in", values, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotIn(List<Long> values) {
            addCriterion("order_sum not in", values, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumBetween(Long value1, Long value2) {
            addCriterion("order_sum between", value1, value2, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotBetween(Long value1, Long value2) {
            addCriterion("order_sum not between", value1, value2, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSum30IsNull() {
            addCriterion("order_sum_30 is null");
            return (Criteria) this;
        }

        public Criteria andOrderSum30IsNotNull() {
            addCriterion("order_sum_30 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSum30EqualTo(Long value) {
            addCriterion("order_sum_30 =", value, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30NotEqualTo(Long value) {
            addCriterion("order_sum_30 <>", value, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30GreaterThan(Long value) {
            addCriterion("order_sum_30 >", value, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30GreaterThanOrEqualTo(Long value) {
            addCriterion("order_sum_30 >=", value, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30LessThan(Long value) {
            addCriterion("order_sum_30 <", value, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30LessThanOrEqualTo(Long value) {
            addCriterion("order_sum_30 <=", value, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30In(List<Long> values) {
            addCriterion("order_sum_30 in", values, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30NotIn(List<Long> values) {
            addCriterion("order_sum_30 not in", values, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30Between(Long value1, Long value2) {
            addCriterion("order_sum_30 between", value1, value2, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andOrderSum30NotBetween(Long value1, Long value2) {
            addCriterion("order_sum_30 not between", value1, value2, "orderSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSumIsNull() {
            addCriterion("sales_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalesSumIsNotNull() {
            addCriterion("sales_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalesSumEqualTo(String value) {
            addCriterion("sales_sum =", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumNotEqualTo(String value) {
            addCriterion("sales_sum <>", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumGreaterThan(String value) {
            addCriterion("sales_sum >", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumGreaterThanOrEqualTo(String value) {
            addCriterion("sales_sum >=", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumLessThan(String value) {
            addCriterion("sales_sum <", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumLessThanOrEqualTo(String value) {
            addCriterion("sales_sum <=", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumLike(String value) {
            addCriterion("sales_sum like", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumNotLike(String value) {
            addCriterion("sales_sum not like", value, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumIn(List<String> values) {
            addCriterion("sales_sum in", values, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumNotIn(List<String> values) {
            addCriterion("sales_sum not in", values, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumBetween(String value1, String value2) {
            addCriterion("sales_sum between", value1, value2, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSumNotBetween(String value1, String value2) {
            addCriterion("sales_sum not between", value1, value2, "salesSum");
            return (Criteria) this;
        }

        public Criteria andSalesSum30IsNull() {
            addCriterion("sales_sum_30 is null");
            return (Criteria) this;
        }

        public Criteria andSalesSum30IsNotNull() {
            addCriterion("sales_sum_30 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesSum30EqualTo(String value) {
            addCriterion("sales_sum_30 =", value, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30NotEqualTo(String value) {
            addCriterion("sales_sum_30 <>", value, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30GreaterThan(String value) {
            addCriterion("sales_sum_30 >", value, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30GreaterThanOrEqualTo(String value) {
            addCriterion("sales_sum_30 >=", value, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30LessThan(String value) {
            addCriterion("sales_sum_30 <", value, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30LessThanOrEqualTo(String value) {
            addCriterion("sales_sum_30 <=", value, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30Like(String value) {
            addCriterion("sales_sum_30 like", value, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30NotLike(String value) {
            addCriterion("sales_sum_30 not like", value, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30In(List<String> values) {
            addCriterion("sales_sum_30 in", values, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30NotIn(List<String> values) {
            addCriterion("sales_sum_30 not in", values, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30Between(String value1, String value2) {
            addCriterion("sales_sum_30 between", value1, value2, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andSalesSum30NotBetween(String value1, String value2) {
            addCriterion("sales_sum_30 not between", value1, value2, "salesSum30");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerIsNull() {
            addCriterion("loyal_customer is null");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerIsNotNull() {
            addCriterion("loyal_customer is not null");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerEqualTo(String value) {
            addCriterion("loyal_customer =", value, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerNotEqualTo(String value) {
            addCriterion("loyal_customer <>", value, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerGreaterThan(String value) {
            addCriterion("loyal_customer >", value, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("loyal_customer >=", value, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerLessThan(String value) {
            addCriterion("loyal_customer <", value, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerLessThanOrEqualTo(String value) {
            addCriterion("loyal_customer <=", value, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerLike(String value) {
            addCriterion("loyal_customer like", value, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerNotLike(String value) {
            addCriterion("loyal_customer not like", value, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerIn(List<String> values) {
            addCriterion("loyal_customer in", values, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerNotIn(List<String> values) {
            addCriterion("loyal_customer not in", values, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerBetween(String value1, String value2) {
            addCriterion("loyal_customer between", value1, value2, "loyalCustomer");
            return (Criteria) this;
        }

        public Criteria andLoyalCustomerNotBetween(String value1, String value2) {
            addCriterion("loyal_customer not between", value1, value2, "loyalCustomer");
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