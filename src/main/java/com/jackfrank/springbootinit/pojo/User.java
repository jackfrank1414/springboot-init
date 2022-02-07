package com.jackfrank.springbootinit.pojo;

import javax.persistence.Column;

public class User {
    @Column(name = "userId")
    private Integer userid;

    @Column(name = "userName")
    private String username;

    @Column(name = "userPwd")
    private String userpwd;

    @Column(name = "useraAge")
    private Integer useraage;

    public User(Integer userid, String username, String userpwd, Integer useraage) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.useraage = useraage;
    }


    public User(String username,String userpwd){
        this.username = username;
        this.userpwd = userpwd;
    }

    public User() {
        super();
    }

    /**
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return userPwd
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * @param userpwd
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    /**
     * @return useraAge
     */
    public Integer getUseraage() {
        return useraage;
    }

    /**
     * @param useraage
     */
    public void setUseraage(Integer useraage) {
        this.useraage = useraage;
    }
}