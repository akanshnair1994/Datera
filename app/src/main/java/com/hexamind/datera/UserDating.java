package com.hexamind.datera;

import java.sql.Date;

public class UserDating {
    private int userId;
    private String fName;
    private String lName;
    private Long phone;
    private String address;
    private String email;
    private Date dateOfBirth;
    private int gender;
    private String status;
    private String password;
    private String role;
    private String subscriptionType;

    public UserDating(int userId, String fName, String lName, Long phone, String address, String email, Date dateOfBirth, int gender, String status, String password, String role, String subscriptionType) {
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.status = status;
        this.password = password;
        this.role = role;
        this.subscriptionType = subscriptionType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
}
