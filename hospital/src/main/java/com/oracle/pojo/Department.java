package com.oracle.pojo;

//+------------------------+--------------+------+-----+---------+----------------+
//| Field                  | Type         | Null | Key | Default | Extra          |
//+------------------------+--------------+------+-----+---------+----------------+
//| department_id          | int(11)      | NO   | PRI | NULL    | auto_increment |
//| department_name        | varchar(255) | YES  |     | NULL    |                |
//| department_pid         | int(11)      | YES  | MUL | NULL    |                |
//| department_level       | int(11)      | YES  |     | NULL    |                |
//| department_description | varchar(500) | YES  |     | NULL    |                |
//+------------------------+--------------+------+-----+---------+----------------+
import java.io.Serializable;

public class Department implements Serializable {
    private Integer departmentId;
    private String departmentName;
    private String departmentDescription;
    private Integer departmentLevel;
    private Integer departmentPid;
    public Department() {
    }


    public Integer getDepartmentPid() {
        return departmentPid;
    }

    public void setDepartmentPid(Integer departmentPid) {
        this.departmentPid = departmentPid;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public Integer getDepartmentLevel() {
        return departmentLevel;
    }

    public void setDepartmentLevel(Integer departmentLevel) {
        this.departmentLevel = departmentLevel;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentDescription='" + departmentDescription + '\'' +
                ", departmentLevel=" + departmentLevel +
                ", departmentPid=" + departmentPid +
                '}';
    }
}
