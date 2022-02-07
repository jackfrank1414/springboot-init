package com.jackfrank.springbootinit.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Course {
    @Id
    @Column(name = "courseNo")
    private String courseno;

    @Column(name = "courseName")
    private String coursename;

    private Integer credit;

    public Course(String courseno, String coursename, Integer credit) {
        this.courseno = courseno;
        this.coursename = coursename;
        this.credit = credit;
    }

    public Course() {
        super();
    }

    /**
     * @return courseNo
     */
    public String getCourseno() {
        return courseno;
    }

    /**
     * @param courseno
     */
    public void setCourseno(String courseno) {
        this.courseno = courseno == null ? null : courseno.trim();
    }

    /**
     * @return courseName
     */
    public String getCoursename() {
        return coursename;
    }

    /**
     * @param coursename
     */
    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    /**
     * @return credit
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * @param credit
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}