package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;

public class UwrExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public UwrExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
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

		public Criteria andUwridIsNull() {
			addCriterion("uwrid is null");
			return (Criteria) this;
		}

		public Criteria andUwridIsNotNull() {
			addCriterion("uwrid is not null");
			return (Criteria) this;
		}

		public Criteria andUwridEqualTo(Integer value) {
			addCriterion("uwrid =", value, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridNotEqualTo(Integer value) {
			addCriterion("uwrid <>", value, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridGreaterThan(Integer value) {
			addCriterion("uwrid >", value, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridGreaterThanOrEqualTo(Integer value) {
			addCriterion("uwrid >=", value, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridLessThan(Integer value) {
			addCriterion("uwrid <", value, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridLessThanOrEqualTo(Integer value) {
			addCriterion("uwrid <=", value, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridIn(List<Integer> values) {
			addCriterion("uwrid in", values, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridNotIn(List<Integer> values) {
			addCriterion("uwrid not in", values, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridBetween(Integer value1, Integer value2) {
			addCriterion("uwrid between", value1, value2, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUwridNotBetween(Integer value1, Integer value2) {
			addCriterion("uwrid not between", value1, value2, "uwrid");
			return (Criteria) this;
		}

		public Criteria andUiddIsNull() {
			addCriterion("uidd is null");
			return (Criteria) this;
		}

		public Criteria andUiddIsNotNull() {
			addCriterion("uidd is not null");
			return (Criteria) this;
		}

		public Criteria andUiddEqualTo(Integer value) {
			addCriterion("uidd =", value, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddNotEqualTo(Integer value) {
			addCriterion("uidd <>", value, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddGreaterThan(Integer value) {
			addCriterion("uidd >", value, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddGreaterThanOrEqualTo(Integer value) {
			addCriterion("uidd >=", value, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddLessThan(Integer value) {
			addCriterion("uidd <", value, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddLessThanOrEqualTo(Integer value) {
			addCriterion("uidd <=", value, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddIn(List<Integer> values) {
			addCriterion("uidd in", values, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddNotIn(List<Integer> values) {
			addCriterion("uidd not in", values, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddBetween(Integer value1, Integer value2) {
			addCriterion("uidd between", value1, value2, "uidd");
			return (Criteria) this;
		}

		public Criteria andUiddNotBetween(Integer value1, Integer value2) {
			addCriterion("uidd not between", value1, value2, "uidd");
			return (Criteria) this;
		}

		public Criteria andRiddIsNull() {
			addCriterion("ridd is null");
			return (Criteria) this;
		}

		public Criteria andRiddIsNotNull() {
			addCriterion("ridd is not null");
			return (Criteria) this;
		}

		public Criteria andRiddEqualTo(Integer value) {
			addCriterion("ridd =", value, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddNotEqualTo(Integer value) {
			addCriterion("ridd <>", value, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddGreaterThan(Integer value) {
			addCriterion("ridd >", value, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddGreaterThanOrEqualTo(Integer value) {
			addCriterion("ridd >=", value, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddLessThan(Integer value) {
			addCriterion("ridd <", value, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddLessThanOrEqualTo(Integer value) {
			addCriterion("ridd <=", value, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddIn(List<Integer> values) {
			addCriterion("ridd in", values, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddNotIn(List<Integer> values) {
			addCriterion("ridd not in", values, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddBetween(Integer value1, Integer value2) {
			addCriterion("ridd between", value1, value2, "ridd");
			return (Criteria) this;
		}

		public Criteria andRiddNotBetween(Integer value1, Integer value2) {
			addCriterion("ridd not between", value1, value2, "ridd");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table uwr
	 * @mbg.generated  Tue Jun 09 11:11:57 CST 2020
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table uwr
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 09 10:38:00 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}