package com.jackfrank.springbootinit.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Student {
    @Id
    @Column(name = "studentNo")
    private String studentno;

    @Column(name = "studentName")
    private String studentname;

    private String sex;

    public Student(String studentno, String studentname, String sex) {
        this.studentno = studentno;
        this.studentname = studentname;
        this.sex = sex;
    }

    public Student() {
        super();
    }

    /**
     * @return studentNo
     */
    public String getStudentno() {
        return studentno;
    }

    /**
     * @param studentno
     */
    public void setStudentno(String studentno) {
        this.studentno = studentno == null ? null : studentno.trim();
    }

    /**
     * @return studentName
     */
    public String getStudentname() {
        return studentname;
    }

    /**
     * @param studentname
     */
    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}