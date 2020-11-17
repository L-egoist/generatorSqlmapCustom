package com.ly.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Og001Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Og001Example() {
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andJgdmIsNull() {
            addCriterion("JGDM is null");
            return (Criteria) this;
        }

        public Criteria andJgdmIsNotNull() {
            addCriterion("JGDM is not null");
            return (Criteria) this;
        }

        public Criteria andJgdmEqualTo(String value) {
            addCriterion("JGDM =", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmNotEqualTo(String value) {
            addCriterion("JGDM <>", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmGreaterThan(String value) {
            addCriterion("JGDM >", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmGreaterThanOrEqualTo(String value) {
            addCriterion("JGDM >=", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmLessThan(String value) {
            addCriterion("JGDM <", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmLessThanOrEqualTo(String value) {
            addCriterion("JGDM <=", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmLike(String value) {
            addCriterion("JGDM like", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmNotLike(String value) {
            addCriterion("JGDM not like", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmIn(List<String> values) {
            addCriterion("JGDM in", values, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmNotIn(List<String> values) {
            addCriterion("JGDM not in", values, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmBetween(String value1, String value2) {
            addCriterion("JGDM between", value1, value2, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmNotBetween(String value1, String value2) {
            addCriterion("JGDM not between", value1, value2, "jgdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmIsNull() {
            addCriterion("CSZXDM is null");
            return (Criteria) this;
        }

        public Criteria andCszxdmIsNotNull() {
            addCriterion("CSZXDM is not null");
            return (Criteria) this;
        }

        public Criteria andCszxdmEqualTo(String value) {
            addCriterion("CSZXDM =", value, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmNotEqualTo(String value) {
            addCriterion("CSZXDM <>", value, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmGreaterThan(String value) {
            addCriterion("CSZXDM >", value, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmGreaterThanOrEqualTo(String value) {
            addCriterion("CSZXDM >=", value, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmLessThan(String value) {
            addCriterion("CSZXDM <", value, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmLessThanOrEqualTo(String value) {
            addCriterion("CSZXDM <=", value, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmLike(String value) {
            addCriterion("CSZXDM like", value, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmNotLike(String value) {
            addCriterion("CSZXDM not like", value, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmIn(List<String> values) {
            addCriterion("CSZXDM in", values, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmNotIn(List<String> values) {
            addCriterion("CSZXDM not in", values, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmBetween(String value1, String value2) {
            addCriterion("CSZXDM between", value1, value2, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andCszxdmNotBetween(String value1, String value2) {
            addCriterion("CSZXDM not between", value1, value2, "cszxdm");
            return (Criteria) this;
        }

        public Criteria andJgmcIsNull() {
            addCriterion("JGMC is null");
            return (Criteria) this;
        }

        public Criteria andJgmcIsNotNull() {
            addCriterion("JGMC is not null");
            return (Criteria) this;
        }

        public Criteria andJgmcEqualTo(String value) {
            addCriterion("JGMC =", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotEqualTo(String value) {
            addCriterion("JGMC <>", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcGreaterThan(String value) {
            addCriterion("JGMC >", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcGreaterThanOrEqualTo(String value) {
            addCriterion("JGMC >=", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLessThan(String value) {
            addCriterion("JGMC <", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLessThanOrEqualTo(String value) {
            addCriterion("JGMC <=", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLike(String value) {
            addCriterion("JGMC like", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotLike(String value) {
            addCriterion("JGMC not like", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcIn(List<String> values) {
            addCriterion("JGMC in", values, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotIn(List<String> values) {
            addCriterion("JGMC not in", values, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcBetween(String value1, String value2) {
            addCriterion("JGMC between", value1, value2, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotBetween(String value1, String value2) {
            addCriterion("JGMC not between", value1, value2, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgjcIsNull() {
            addCriterion("JGJC is null");
            return (Criteria) this;
        }

        public Criteria andJgjcIsNotNull() {
            addCriterion("JGJC is not null");
            return (Criteria) this;
        }

        public Criteria andJgjcEqualTo(String value) {
            addCriterion("JGJC =", value, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcNotEqualTo(String value) {
            addCriterion("JGJC <>", value, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcGreaterThan(String value) {
            addCriterion("JGJC >", value, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcGreaterThanOrEqualTo(String value) {
            addCriterion("JGJC >=", value, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcLessThan(String value) {
            addCriterion("JGJC <", value, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcLessThanOrEqualTo(String value) {
            addCriterion("JGJC <=", value, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcLike(String value) {
            addCriterion("JGJC like", value, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcNotLike(String value) {
            addCriterion("JGJC not like", value, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcIn(List<String> values) {
            addCriterion("JGJC in", values, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcNotIn(List<String> values) {
            addCriterion("JGJC not in", values, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcBetween(String value1, String value2) {
            addCriterion("JGJC between", value1, value2, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjcNotBetween(String value1, String value2) {
            addCriterion("JGJC not between", value1, value2, "jgjc");
            return (Criteria) this;
        }

        public Criteria andJgjceIsNull() {
            addCriterion("JGJCE is null");
            return (Criteria) this;
        }

        public Criteria andJgjceIsNotNull() {
            addCriterion("JGJCE is not null");
            return (Criteria) this;
        }

        public Criteria andJgjceEqualTo(String value) {
            addCriterion("JGJCE =", value, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceNotEqualTo(String value) {
            addCriterion("JGJCE <>", value, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceGreaterThan(String value) {
            addCriterion("JGJCE >", value, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceGreaterThanOrEqualTo(String value) {
            addCriterion("JGJCE >=", value, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceLessThan(String value) {
            addCriterion("JGJCE <", value, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceLessThanOrEqualTo(String value) {
            addCriterion("JGJCE <=", value, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceLike(String value) {
            addCriterion("JGJCE like", value, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceNotLike(String value) {
            addCriterion("JGJCE not like", value, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceIn(List<String> values) {
            addCriterion("JGJCE in", values, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceNotIn(List<String> values) {
            addCriterion("JGJCE not in", values, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceBetween(String value1, String value2) {
            addCriterion("JGJCE between", value1, value2, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgjceNotBetween(String value1, String value2) {
            addCriterion("JGJCE not between", value1, value2, "jgjce");
            return (Criteria) this;
        }

        public Criteria andJgdzIsNull() {
            addCriterion("JGDZ is null");
            return (Criteria) this;
        }

        public Criteria andJgdzIsNotNull() {
            addCriterion("JGDZ is not null");
            return (Criteria) this;
        }

        public Criteria andJgdzEqualTo(String value) {
            addCriterion("JGDZ =", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzNotEqualTo(String value) {
            addCriterion("JGDZ <>", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzGreaterThan(String value) {
            addCriterion("JGDZ >", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzGreaterThanOrEqualTo(String value) {
            addCriterion("JGDZ >=", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzLessThan(String value) {
            addCriterion("JGDZ <", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzLessThanOrEqualTo(String value) {
            addCriterion("JGDZ <=", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzLike(String value) {
            addCriterion("JGDZ like", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzNotLike(String value) {
            addCriterion("JGDZ not like", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzIn(List<String> values) {
            addCriterion("JGDZ in", values, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzNotIn(List<String> values) {
            addCriterion("JGDZ not in", values, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzBetween(String value1, String value2) {
            addCriterion("JGDZ between", value1, value2, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzNotBetween(String value1, String value2) {
            addCriterion("JGDZ not between", value1, value2, "jgdz");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNull() {
            addCriterion("YOUBIAN is null");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNotNull() {
            addCriterion("YOUBIAN is not null");
            return (Criteria) this;
        }

        public Criteria andYoubianEqualTo(String value) {
            addCriterion("YOUBIAN =", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotEqualTo(String value) {
            addCriterion("YOUBIAN <>", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThan(String value) {
            addCriterion("YOUBIAN >", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThanOrEqualTo(String value) {
            addCriterion("YOUBIAN >=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThan(String value) {
            addCriterion("YOUBIAN <", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThanOrEqualTo(String value) {
            addCriterion("YOUBIAN <=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLike(String value) {
            addCriterion("YOUBIAN like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotLike(String value) {
            addCriterion("YOUBIAN not like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianIn(List<String> values) {
            addCriterion("YOUBIAN in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotIn(List<String> values) {
            addCriterion("YOUBIAN not in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianBetween(String value1, String value2) {
            addCriterion("YOUBIAN between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotBetween(String value1, String value2) {
            addCriterion("YOUBIAN not between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andJglxIsNull() {
            addCriterion("JGLX is null");
            return (Criteria) this;
        }

        public Criteria andJglxIsNotNull() {
            addCriterion("JGLX is not null");
            return (Criteria) this;
        }

        public Criteria andJglxEqualTo(String value) {
            addCriterion("JGLX =", value, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxNotEqualTo(String value) {
            addCriterion("JGLX <>", value, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxGreaterThan(String value) {
            addCriterion("JGLX >", value, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxGreaterThanOrEqualTo(String value) {
            addCriterion("JGLX >=", value, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxLessThan(String value) {
            addCriterion("JGLX <", value, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxLessThanOrEqualTo(String value) {
            addCriterion("JGLX <=", value, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxLike(String value) {
            addCriterion("JGLX like", value, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxNotLike(String value) {
            addCriterion("JGLX not like", value, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxIn(List<String> values) {
            addCriterion("JGLX in", values, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxNotIn(List<String> values) {
            addCriterion("JGLX not in", values, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxBetween(String value1, String value2) {
            addCriterion("JGLX between", value1, value2, "jglx");
            return (Criteria) this;
        }

        public Criteria andJglxNotBetween(String value1, String value2) {
            addCriterion("JGLX not between", value1, value2, "jglx");
            return (Criteria) this;
        }

        public Criteria andJgxzIsNull() {
            addCriterion("JGXZ is null");
            return (Criteria) this;
        }

        public Criteria andJgxzIsNotNull() {
            addCriterion("JGXZ is not null");
            return (Criteria) this;
        }

        public Criteria andJgxzEqualTo(String value) {
            addCriterion("JGXZ =", value, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzNotEqualTo(String value) {
            addCriterion("JGXZ <>", value, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzGreaterThan(String value) {
            addCriterion("JGXZ >", value, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzGreaterThanOrEqualTo(String value) {
            addCriterion("JGXZ >=", value, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzLessThan(String value) {
            addCriterion("JGXZ <", value, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzLessThanOrEqualTo(String value) {
            addCriterion("JGXZ <=", value, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzLike(String value) {
            addCriterion("JGXZ like", value, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzNotLike(String value) {
            addCriterion("JGXZ not like", value, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzIn(List<String> values) {
            addCriterion("JGXZ in", values, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzNotIn(List<String> values) {
            addCriterion("JGXZ not in", values, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzBetween(String value1, String value2) {
            addCriterion("JGXZ between", value1, value2, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgxzNotBetween(String value1, String value2) {
            addCriterion("JGXZ not between", value1, value2, "jgxz");
            return (Criteria) this;
        }

        public Criteria andJgsxIsNull() {
            addCriterion("JGSX is null");
            return (Criteria) this;
        }

        public Criteria andJgsxIsNotNull() {
            addCriterion("JGSX is not null");
            return (Criteria) this;
        }

        public Criteria andJgsxEqualTo(String value) {
            addCriterion("JGSX =", value, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxNotEqualTo(String value) {
            addCriterion("JGSX <>", value, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxGreaterThan(String value) {
            addCriterion("JGSX >", value, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxGreaterThanOrEqualTo(String value) {
            addCriterion("JGSX >=", value, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxLessThan(String value) {
            addCriterion("JGSX <", value, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxLessThanOrEqualTo(String value) {
            addCriterion("JGSX <=", value, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxLike(String value) {
            addCriterion("JGSX like", value, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxNotLike(String value) {
            addCriterion("JGSX not like", value, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxIn(List<String> values) {
            addCriterion("JGSX in", values, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxNotIn(List<String> values) {
            addCriterion("JGSX not in", values, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxBetween(String value1, String value2) {
            addCriterion("JGSX between", value1, value2, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgsxNotBetween(String value1, String value2) {
            addCriterion("JGSX not between", value1, value2, "jgsx");
            return (Criteria) this;
        }

        public Criteria andJgztIsNull() {
            addCriterion("JGZT is null");
            return (Criteria) this;
        }

        public Criteria andJgztIsNotNull() {
            addCriterion("JGZT is not null");
            return (Criteria) this;
        }

        public Criteria andJgztEqualTo(String value) {
            addCriterion("JGZT =", value, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztNotEqualTo(String value) {
            addCriterion("JGZT <>", value, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztGreaterThan(String value) {
            addCriterion("JGZT >", value, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztGreaterThanOrEqualTo(String value) {
            addCriterion("JGZT >=", value, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztLessThan(String value) {
            addCriterion("JGZT <", value, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztLessThanOrEqualTo(String value) {
            addCriterion("JGZT <=", value, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztLike(String value) {
            addCriterion("JGZT like", value, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztNotLike(String value) {
            addCriterion("JGZT not like", value, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztIn(List<String> values) {
            addCriterion("JGZT in", values, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztNotIn(List<String> values) {
            addCriterion("JGZT not in", values, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztBetween(String value1, String value2) {
            addCriterion("JGZT between", value1, value2, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgztNotBetween(String value1, String value2) {
            addCriterion("JGZT not between", value1, value2, "jgzt");
            return (Criteria) this;
        }

        public Criteria andJgkyrqIsNull() {
            addCriterion("JGKYRQ is null");
            return (Criteria) this;
        }

        public Criteria andJgkyrqIsNotNull() {
            addCriterion("JGKYRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJgkyrqEqualTo(Date value) {
            addCriterionForJDBCDate("JGKYRQ =", value, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("JGKYRQ <>", value, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqGreaterThan(Date value) {
            addCriterionForJDBCDate("JGKYRQ >", value, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JGKYRQ >=", value, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqLessThan(Date value) {
            addCriterionForJDBCDate("JGKYRQ <", value, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JGKYRQ <=", value, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqIn(List<Date> values) {
            addCriterionForJDBCDate("JGKYRQ in", values, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("JGKYRQ not in", values, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JGKYRQ between", value1, value2, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgkyrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JGKYRQ not between", value1, value2, "jgkyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqIsNull() {
            addCriterion("JGJYRQ is null");
            return (Criteria) this;
        }

        public Criteria andJgjyrqIsNotNull() {
            addCriterion("JGJYRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJgjyrqEqualTo(Date value) {
            addCriterionForJDBCDate("JGJYRQ =", value, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("JGJYRQ <>", value, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqGreaterThan(Date value) {
            addCriterionForJDBCDate("JGJYRQ >", value, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JGJYRQ >=", value, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqLessThan(Date value) {
            addCriterionForJDBCDate("JGJYRQ <", value, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JGJYRQ <=", value, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqIn(List<Date> values) {
            addCriterionForJDBCDate("JGJYRQ in", values, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("JGJYRQ not in", values, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JGJYRQ between", value1, value2, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andJgjyrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JGJYRQ not between", value1, value2, "jgjyrq");
            return (Criteria) this;
        }

        public Criteria andSxhIsNull() {
            addCriterion("SXH is null");
            return (Criteria) this;
        }

        public Criteria andSxhIsNotNull() {
            addCriterion("SXH is not null");
            return (Criteria) this;
        }

        public Criteria andSxhEqualTo(BigDecimal value) {
            addCriterion("SXH =", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotEqualTo(BigDecimal value) {
            addCriterion("SXH <>", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThan(BigDecimal value) {
            addCriterion("SXH >", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SXH >=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThan(BigDecimal value) {
            addCriterion("SXH <", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SXH <=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhIn(List<BigDecimal> values) {
            addCriterion("SXH in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotIn(List<BigDecimal> values) {
            addCriterion("SXH not in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SXH between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SXH not between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andJbjgdmIsNull() {
            addCriterion("JBJGDM is null");
            return (Criteria) this;
        }

        public Criteria andJbjgdmIsNotNull() {
            addCriterion("JBJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andJbjgdmEqualTo(String value) {
            addCriterion("JBJGDM =", value, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmNotEqualTo(String value) {
            addCriterion("JBJGDM <>", value, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmGreaterThan(String value) {
            addCriterion("JBJGDM >", value, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("JBJGDM >=", value, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmLessThan(String value) {
            addCriterion("JBJGDM <", value, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmLessThanOrEqualTo(String value) {
            addCriterion("JBJGDM <=", value, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmLike(String value) {
            addCriterion("JBJGDM like", value, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmNotLike(String value) {
            addCriterion("JBJGDM not like", value, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmIn(List<String> values) {
            addCriterion("JBJGDM in", values, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmNotIn(List<String> values) {
            addCriterion("JBJGDM not in", values, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmBetween(String value1, String value2) {
            addCriterion("JBJGDM between", value1, value2, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbjgdmNotBetween(String value1, String value2) {
            addCriterion("JBJGDM not between", value1, value2, "jbjgdm");
            return (Criteria) this;
        }

        public Criteria andJbgydmIsNull() {
            addCriterion("JBGYDM is null");
            return (Criteria) this;
        }

        public Criteria andJbgydmIsNotNull() {
            addCriterion("JBGYDM is not null");
            return (Criteria) this;
        }

        public Criteria andJbgydmEqualTo(String value) {
            addCriterion("JBGYDM =", value, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmNotEqualTo(String value) {
            addCriterion("JBGYDM <>", value, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmGreaterThan(String value) {
            addCriterion("JBGYDM >", value, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmGreaterThanOrEqualTo(String value) {
            addCriterion("JBGYDM >=", value, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmLessThan(String value) {
            addCriterion("JBGYDM <", value, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmLessThanOrEqualTo(String value) {
            addCriterion("JBGYDM <=", value, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmLike(String value) {
            addCriterion("JBGYDM like", value, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmNotLike(String value) {
            addCriterion("JBGYDM not like", value, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmIn(List<String> values) {
            addCriterion("JBGYDM in", values, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmNotIn(List<String> values) {
            addCriterion("JBGYDM not in", values, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmBetween(String value1, String value2) {
            addCriterion("JBGYDM between", value1, value2, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbgydmNotBetween(String value1, String value2) {
            addCriterion("JBGYDM not between", value1, value2, "jbgydm");
            return (Criteria) this;
        }

        public Criteria andJbrqIsNull() {
            addCriterion("JBRQ is null");
            return (Criteria) this;
        }

        public Criteria andJbrqIsNotNull() {
            addCriterion("JBRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJbrqEqualTo(Date value) {
            addCriterionForJDBCDate("JBRQ =", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("JBRQ <>", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqGreaterThan(Date value) {
            addCriterionForJDBCDate("JBRQ >", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JBRQ >=", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqLessThan(Date value) {
            addCriterionForJDBCDate("JBRQ <", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JBRQ <=", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqIn(List<Date> values) {
            addCriterionForJDBCDate("JBRQ in", values, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("JBRQ not in", values, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JBRQ between", value1, value2, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JBRQ not between", value1, value2, "jbrq");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNull() {
            addCriterion("YXBZ is null");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNotNull() {
            addCriterion("YXBZ is not null");
            return (Criteria) this;
        }

        public Criteria andYxbzEqualTo(String value) {
            addCriterion("YXBZ =", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotEqualTo(String value) {
            addCriterion("YXBZ <>", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThan(String value) {
            addCriterion("YXBZ >", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThanOrEqualTo(String value) {
            addCriterion("YXBZ >=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThan(String value) {
            addCriterion("YXBZ <", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThanOrEqualTo(String value) {
            addCriterion("YXBZ <=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLike(String value) {
            addCriterion("YXBZ like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotLike(String value) {
            addCriterion("YXBZ not like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzIn(List<String> values) {
            addCriterion("YXBZ in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotIn(List<String> values) {
            addCriterion("YXBZ not in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzBetween(String value1, String value2) {
            addCriterion("YXBZ between", value1, value2, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotBetween(String value1, String value2) {
            addCriterion("YXBZ not between", value1, value2, "yxbz");
            return (Criteria) this;
        }

        public Criteria andByzd1IsNull() {
            addCriterion("BYZD1 is null");
            return (Criteria) this;
        }

        public Criteria andByzd1IsNotNull() {
            addCriterion("BYZD1 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd1EqualTo(String value) {
            addCriterion("BYZD1 =", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotEqualTo(String value) {
            addCriterion("BYZD1 <>", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1GreaterThan(String value) {
            addCriterion("BYZD1 >", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1GreaterThanOrEqualTo(String value) {
            addCriterion("BYZD1 >=", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1LessThan(String value) {
            addCriterion("BYZD1 <", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1LessThanOrEqualTo(String value) {
            addCriterion("BYZD1 <=", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1Like(String value) {
            addCriterion("BYZD1 like", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotLike(String value) {
            addCriterion("BYZD1 not like", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1In(List<String> values) {
            addCriterion("BYZD1 in", values, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotIn(List<String> values) {
            addCriterion("BYZD1 not in", values, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1Between(String value1, String value2) {
            addCriterion("BYZD1 between", value1, value2, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotBetween(String value1, String value2) {
            addCriterion("BYZD1 not between", value1, value2, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd2IsNull() {
            addCriterion("BYZD2 is null");
            return (Criteria) this;
        }

        public Criteria andByzd2IsNotNull() {
            addCriterion("BYZD2 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd2EqualTo(BigDecimal value) {
            addCriterion("BYZD2 =", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotEqualTo(BigDecimal value) {
            addCriterion("BYZD2 <>", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2GreaterThan(BigDecimal value) {
            addCriterion("BYZD2 >", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BYZD2 >=", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2LessThan(BigDecimal value) {
            addCriterion("BYZD2 <", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BYZD2 <=", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2In(List<BigDecimal> values) {
            addCriterion("BYZD2 in", values, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotIn(List<BigDecimal> values) {
            addCriterion("BYZD2 not in", values, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BYZD2 between", value1, value2, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BYZD2 not between", value1, value2, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd3IsNull() {
            addCriterion("BYZD3 is null");
            return (Criteria) this;
        }

        public Criteria andByzd3IsNotNull() {
            addCriterion("BYZD3 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd3EqualTo(Date value) {
            addCriterionForJDBCDate("BYZD3 =", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotEqualTo(Date value) {
            addCriterionForJDBCDate("BYZD3 <>", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3GreaterThan(Date value) {
            addCriterionForJDBCDate("BYZD3 >", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BYZD3 >=", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3LessThan(Date value) {
            addCriterionForJDBCDate("BYZD3 <", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BYZD3 <=", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3In(List<Date> values) {
            addCriterionForJDBCDate("BYZD3 in", values, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotIn(List<Date> values) {
            addCriterionForJDBCDate("BYZD3 not in", values, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3Between(Date value1, Date value2) {
            addCriterionForJDBCDate("BYZD3 between", value1, value2, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BYZD3 not between", value1, value2, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd4IsNull() {
            addCriterion("BYZD4 is null");
            return (Criteria) this;
        }

        public Criteria andByzd4IsNotNull() {
            addCriterion("BYZD4 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd4EqualTo(String value) {
            addCriterion("BYZD4 =", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4NotEqualTo(String value) {
            addCriterion("BYZD4 <>", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4GreaterThan(String value) {
            addCriterion("BYZD4 >", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4GreaterThanOrEqualTo(String value) {
            addCriterion("BYZD4 >=", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4LessThan(String value) {
            addCriterion("BYZD4 <", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4LessThanOrEqualTo(String value) {
            addCriterion("BYZD4 <=", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4Like(String value) {
            addCriterion("BYZD4 like", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4NotLike(String value) {
            addCriterion("BYZD4 not like", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4In(List<String> values) {
            addCriterion("BYZD4 in", values, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4NotIn(List<String> values) {
            addCriterion("BYZD4 not in", values, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4Between(String value1, String value2) {
            addCriterion("BYZD4 between", value1, value2, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4NotBetween(String value1, String value2) {
            addCriterion("BYZD4 not between", value1, value2, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd5IsNull() {
            addCriterion("BYZD5 is null");
            return (Criteria) this;
        }

        public Criteria andByzd5IsNotNull() {
            addCriterion("BYZD5 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd5EqualTo(BigDecimal value) {
            addCriterion("BYZD5 =", value, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5NotEqualTo(BigDecimal value) {
            addCriterion("BYZD5 <>", value, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5GreaterThan(BigDecimal value) {
            addCriterion("BYZD5 >", value, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BYZD5 >=", value, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5LessThan(BigDecimal value) {
            addCriterion("BYZD5 <", value, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BYZD5 <=", value, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5In(List<BigDecimal> values) {
            addCriterion("BYZD5 in", values, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5NotIn(List<BigDecimal> values) {
            addCriterion("BYZD5 not in", values, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BYZD5 between", value1, value2, "byzd5");
            return (Criteria) this;
        }

        public Criteria andByzd5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BYZD5 not between", value1, value2, "byzd5");
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