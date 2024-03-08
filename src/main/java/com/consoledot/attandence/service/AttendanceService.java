package com.consoledot.attandence.service;
import com.consoledot.attandence.Entity.Attendance;

import java.util.List;

public interface AttendanceService {

    List<Attendance> getAllAttendances();

    Attendance getAttendanceById(Long id);

    Attendance createAttendance(Attendance attendance);

    Attendance updateAttendance(Long id, Attendance attendance);

    void deleteAttendance(Long id);
}
