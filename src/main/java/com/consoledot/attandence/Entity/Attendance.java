package com.consoledot.attandence.Entity;


import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "check_in", nullable = false)
    private Date checkIn;

    @Column(name = "check_out")
    private Date checkOut;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "status", nullable = false)
    private String status;

    // Constructors, Getters, and Setters

    public Attendance() {
        // Default constructor
    }

    // Constructor without id
    public Attendance(Long employeeId, String employeeName, Date checkIn, String department, String status) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.checkIn = checkIn;
        this.department = department;
        this.status = status;
    }

    // Getters and Setters for all attributes
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
