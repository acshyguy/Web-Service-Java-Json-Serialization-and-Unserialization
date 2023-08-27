package com.interswitch.webserviceJson.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.interswitch.webserviceJson.pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class JavaToJsonConverter {
    public static void main(String[] args) throws JsonProcessingException {
        Student s1 = new Student();
        s1.setId(001);
        s1.setName("Jude");
        s1.setSkill("Java");

        Student s2 = new Student();
        s2.setId(002);
        s2.setName("Mary");
        s2.setSkill("Python");

        Student s3 = new Student();
        s3.setId(003);
        s3.setName("Favour");
        s3.setSkill("CSS");

        Student s4 = new Student();
        s4.setId(004);
        s4.setName("Ike");
        s4.setSkill("Java");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        ObjectMapper mapper = new ObjectMapper();
        String studjson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentList);
        System.out.println(studjson);
    }
}
