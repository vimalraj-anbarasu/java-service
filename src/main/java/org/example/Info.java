package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {

    @JsonProperty("NAME")
    private String name;
    @JsonProperty("LAST_NAME")
    private String lastName;
    @JsonProperty("AGE")
    private int age;
    @JsonProperty("GENDER")
    private String gender;

    public Info() {
    }

    public Info(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
