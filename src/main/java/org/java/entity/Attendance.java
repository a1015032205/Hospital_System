package org.java.entity;

import java.util.Date;

public class Attendance {
    private Integer attendanceId;

    private String attendanceStaff;

    private Date attendanceStartTime;

    private Date attendanceEndTime;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getAttendanceStaff() {
        return attendanceStaff;
    }

    public void setAttendanceStaff(String attendanceStaff) {
        this.attendanceStaff = attendanceStaff == null ? null : attendanceStaff.trim();
    }

    public Date getAttendanceStartTime() {
        return attendanceStartTime;
    }

    public void setAttendanceStartTime(Date attendanceStartTime) {
        this.attendanceStartTime = attendanceStartTime;
    }

    public Date getAttendanceEndTime() {
        return attendanceEndTime;
    }

    public void setAttendanceEndTime(Date attendanceEndTime) {
        this.attendanceEndTime = attendanceEndTime;
    }
}