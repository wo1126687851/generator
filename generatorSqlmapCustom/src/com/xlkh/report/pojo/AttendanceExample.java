package com.xlkh.report.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIsNull() {
            addCriterion("attendance_date is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIsNotNull() {
            addCriterion("attendance_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("attendance_date =", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("attendance_date <>", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("attendance_date >", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attendance_date >=", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLessThan(Date value) {
            addCriterionForJDBCDate("attendance_date <", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attendance_date <=", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("attendance_date in", values, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("attendance_date not in", values, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attendance_date between", value1, value2, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attendance_date not between", value1, value2, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andComeTimeIsNull() {
            addCriterion("come_time is null");
            return (Criteria) this;
        }

        public Criteria andComeTimeIsNotNull() {
            addCriterion("come_time is not null");
            return (Criteria) this;
        }

        public Criteria andComeTimeEqualTo(String value) {
            addCriterion("come_time =", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotEqualTo(String value) {
            addCriterion("come_time <>", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeGreaterThan(String value) {
            addCriterion("come_time >", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("come_time >=", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLessThan(String value) {
            addCriterion("come_time <", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLessThanOrEqualTo(String value) {
            addCriterion("come_time <=", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLike(String value) {
            addCriterion("come_time like", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotLike(String value) {
            addCriterion("come_time not like", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeIn(List<String> values) {
            addCriterion("come_time in", values, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotIn(List<String> values) {
            addCriterion("come_time not in", values, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeBetween(String value1, String value2) {
            addCriterion("come_time between", value1, value2, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotBetween(String value1, String value2) {
            addCriterion("come_time not between", value1, value2, "comeTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeIsNull() {
            addCriterion("go_time is null");
            return (Criteria) this;
        }

        public Criteria andGoTimeIsNotNull() {
            addCriterion("go_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoTimeEqualTo(String value) {
            addCriterion("go_time =", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeNotEqualTo(String value) {
            addCriterion("go_time <>", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeGreaterThan(String value) {
            addCriterion("go_time >", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("go_time >=", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeLessThan(String value) {
            addCriterion("go_time <", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeLessThanOrEqualTo(String value) {
            addCriterion("go_time <=", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeLike(String value) {
            addCriterion("go_time like", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeNotLike(String value) {
            addCriterion("go_time not like", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeIn(List<String> values) {
            addCriterion("go_time in", values, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeNotIn(List<String> values) {
            addCriterion("go_time not in", values, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeBetween(String value1, String value2) {
            addCriterion("go_time between", value1, value2, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeNotBetween(String value1, String value2) {
            addCriterion("go_time not between", value1, value2, "goTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeIsNull() {
            addCriterion("update_come_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeIsNotNull() {
            addCriterion("update_come_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeEqualTo(String value) {
            addCriterion("update_come_time =", value, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeNotEqualTo(String value) {
            addCriterion("update_come_time <>", value, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeGreaterThan(String value) {
            addCriterion("update_come_time >", value, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_come_time >=", value, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeLessThan(String value) {
            addCriterion("update_come_time <", value, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeLessThanOrEqualTo(String value) {
            addCriterion("update_come_time <=", value, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeLike(String value) {
            addCriterion("update_come_time like", value, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeNotLike(String value) {
            addCriterion("update_come_time not like", value, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeIn(List<String> values) {
            addCriterion("update_come_time in", values, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeNotIn(List<String> values) {
            addCriterion("update_come_time not in", values, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeBetween(String value1, String value2) {
            addCriterion("update_come_time between", value1, value2, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateComeTimeNotBetween(String value1, String value2) {
            addCriterion("update_come_time not between", value1, value2, "updateComeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeIsNull() {
            addCriterion("update_go_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeIsNotNull() {
            addCriterion("update_go_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeEqualTo(String value) {
            addCriterion("update_go_time =", value, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeNotEqualTo(String value) {
            addCriterion("update_go_time <>", value, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeGreaterThan(String value) {
            addCriterion("update_go_time >", value, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_go_time >=", value, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeLessThan(String value) {
            addCriterion("update_go_time <", value, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeLessThanOrEqualTo(String value) {
            addCriterion("update_go_time <=", value, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeLike(String value) {
            addCriterion("update_go_time like", value, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeNotLike(String value) {
            addCriterion("update_go_time not like", value, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeIn(List<String> values) {
            addCriterion("update_go_time in", values, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeNotIn(List<String> values) {
            addCriterion("update_go_time not in", values, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeBetween(String value1, String value2) {
            addCriterion("update_go_time between", value1, value2, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateGoTimeNotBetween(String value1, String value2) {
            addCriterion("update_go_time not between", value1, value2, "updateGoTime");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonIsNull() {
            addCriterion("update_reason is null");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonIsNotNull() {
            addCriterion("update_reason is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonEqualTo(Integer value) {
            addCriterion("update_reason =", value, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonNotEqualTo(Integer value) {
            addCriterion("update_reason <>", value, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonGreaterThan(Integer value) {
            addCriterion("update_reason >", value, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_reason >=", value, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonLessThan(Integer value) {
            addCriterion("update_reason <", value, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonLessThanOrEqualTo(Integer value) {
            addCriterion("update_reason <=", value, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonIn(List<Integer> values) {
            addCriterion("update_reason in", values, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonNotIn(List<Integer> values) {
            addCriterion("update_reason not in", values, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonBetween(Integer value1, Integer value2) {
            addCriterion("update_reason between", value1, value2, "updateReason");
            return (Criteria) this;
        }

        public Criteria andUpdateReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("update_reason not between", value1, value2, "updateReason");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(String value) {
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(String value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(String value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(String value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLike(String value) {
            addCriterion("work_time like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotLike(String value) {
            addCriterion("work_time not like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<String> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<String> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(String value1, String value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(String value1, String value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Integer value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Integer value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Integer value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Integer value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Integer value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Integer> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Integer> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Integer value1, Integer value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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