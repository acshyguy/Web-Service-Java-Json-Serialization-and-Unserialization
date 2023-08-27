package com.interswitch.webserviceJson.pojo;

public class Student {
    private int Id;
    private String name;
    private String skill;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, String skill) {
        Id = id;
        this.name = name;
        this.skill = skill;
    }
}
