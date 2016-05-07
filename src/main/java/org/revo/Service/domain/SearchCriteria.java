package org.revo.Service.domain;

import java.util.Date;

/**
 * Created by revo on 4/18/16.
 */
public class SearchCriteria {
    private String name;
    private String age1;
    private String age2;
    private String gender;
    private String state;
    private Date date1;
    private Date date2;
    private int page;

    public SearchCriteria() {
    }

    public SearchCriteria(String name, String age1, String age2, String gender, String state, Date date1, Date date2, int page) {
        this.name = name;
        this.age1 = age1;
        this.age2 = age2;
        this.gender = gender;
        this.state = state;
        this.date1 = date1;
        this.date2 = date2;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public SearchCriteria setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge1() {
        return age1;
    }

    public SearchCriteria setAge1(String age1) {
        this.age1 = age1;
        return this;
    }

    public String getAge2() {
        return age2;
    }

    public SearchCriteria setAge2(String age2) {
        this.age2 = age2;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public SearchCriteria setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getState() {
        return state;
    }

    public SearchCriteria setState(String state) {
        this.state = state;
        return this;
    }

    public Date getDate1() {
        return date1;
    }

    public SearchCriteria setDate1(Date date1) {
        this.date1 = date1;
        return this;
    }

    public Date getDate2() {
        return date2;
    }

    public SearchCriteria setDate2(Date date2) {
        this.date2 = date2;
        return this;
    }

    public int getPage() {
        return page;
    }

    public SearchCriteria setPage(int page) {
        this.page = page;
        return this;
    }

    @Override
    public String toString() {
        return "org.revo.model.SearchCriteria{" +
                "name='" + name + '\'' +
                ", age1='" + age1 + '\'' +
                ", age2='" + age2 + '\'' +
                ", gender='" + gender + '\'' +
                ", state='" + state + '\'' +
                ", date1=" + date1 +
                ", date2=" + date2 +
                ", page=" + page +
                '}';
    }
}
