package com.jackfrank.springbootinit.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Grade {
    @Id
    @Column(name = "studentNo")
    private String studentno;

    @Id
    @Column(name = "courseNo")
    private String courseno;

    private Integer score;

    public Grade(String studentno, String courseno, Integer score) {
        this.studentno = studentno;
        this.courseno = courseno;
        this.score = score;
    }

    public Grade() {
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
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }
}