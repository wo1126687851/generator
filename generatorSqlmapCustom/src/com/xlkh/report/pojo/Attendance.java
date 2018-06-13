package com.xlkh.report.pojo;

import java.util.Date;

public class Attendance {
    private Integer id;

    private Integer userId;

    private Date attendanceDate;

    private String comeTime;

    private String goTime;

    private String updateComeTime;

    private String updateGoTime;

    private Integer updateReason;

    private String auditStatus;

    private String workTime;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getComeTime() {
        return comeTime;
    }

    public void setComeTime(String comeTime) {
        this.comeTime = comeTime == null ? null : comeTime.trim();
    }

    public String getGoTime() {
        return goTime;
    }

    public void setGoTime(String goTime) {
        this.goTime = goTime == null ? null : goTime.trim();
    }

    public String getUpdateComeTime() {
        return updateComeTime;
    }

    public void setUpdateComeTime(String updateComeTime) {
        this.updateComeTime = updateComeTime == null ? null : updateComeTime.trim();
    }

    public String getUpdateGoTime() {
        return updateGoTime;
    }

    public void setUpdateGoTime(String updateGoTime) {
        this.updateGoTime = updateGoTime == null ? null : updateGoTime.trim();
    }

    public Integer getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(Integer updateReason) {
        this.updateReason = updateReason;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}