package com.kafka.consumerexample.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class User {

    private String name;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return department;
    }

    public void setDept(String dept) {
        this.department = dept;
    }

    public User() {
    }

    public User(String name, String dept) {

        this.name = name;
        this.department = dept;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dept='").append(department).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
