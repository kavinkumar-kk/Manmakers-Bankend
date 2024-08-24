package com.example.manmakers.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class membership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private BigDecimal weight;
    private Integer height;
    private BigDecimal hipsize;
    private String address;
    private String contactnumber;
    private String duration;
    private Date feespaiddate;
    private String mode;
    private String feespaid;
    private String feespending;
    private String referredby;
    private String timing;
    private String goal;
    private String snacks;

    public membership(){
        
    }
    
    public membership(Integer id, String name, String gender, Integer age, BigDecimal weight, Integer height, BigDecimal hipsize,
            String address, String contactnumber, String duration, Date feespaiddate, String mode, String feespaid,
            String feespending, String referredby, String timing, String goal, String snacks) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hipsize = hipsize;
        this.address = address;
        this.contactnumber = contactnumber;
        this.duration = duration;
        this.feespaiddate = feespaiddate;
        this.mode = mode;
        this.feespaid = feespaid;
        this.feespending = feespending;
        this.referredby = referredby;
        this.timing = timing;
        this.goal = goal;
        this.snacks = snacks;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public Integer getAge() {
        return age;
    }
    public BigDecimal getWeight() {
        return weight;
    }
    public Integer getHeight() {
        return height;
    }
    public BigDecimal getHipsize() {
        return hipsize;
    }
    public String getAddress() {
        return address;
    }
    public String getContactnumber() {
        return contactnumber;
    }
    public String getDuration() {
        return duration;
    }
    public Date getFeespaiddate() {
        return feespaiddate;
    }
    public String getMode() {
        return mode;
    }
    public String getFeespaid() {
        return feespaid;
    }
    public String getFeespending() {
        return feespending;
    }
    public String getReferredby() {
        return referredby;
    }
    public String getTiming() {
        return timing;
    }
    public String getGoal() {
        return goal;
    }
    public String getSnacks() {
        return snacks;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public void setHipsize(BigDecimal hipsize) {
        this.hipsize = hipsize;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setFeespaiddate(Date feespaiddate) {
        this.feespaiddate = feespaiddate;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public void setFeespaid(String feespaid) {
        this.feespaid = feespaid;
    }
    public void setFeespending(String feespending) {
        this.feespending = feespending;
    }
    public void setReferredby(String referredby) {
        this.referredby = referredby;
    }
    public void setTiming(String timing) {
        this.timing = timing;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }
    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
}
