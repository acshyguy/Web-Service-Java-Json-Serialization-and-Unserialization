package com.interswitch.webserviceJson.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interswitch.webserviceJson.pojo.Student;

import java.io.File;
import java.io.IOException;

public class JsonToJavaConverter {
    public static void main(String[] args) throws IOException {
        convertJsonToJava();
        System.out.println(" ");//For space between 2 methods
        convertJsonToObjs();
    }
    public static void convertJsonToJava() throws IOException {
        File file = new File("student.json");
        ObjectMapper mapper = new ObjectMapper();

        Student student = mapper.readValue(file, Student.class);
        System.out.println(student);
    }

    public static void convertJsonToObjs() throws IOException {
        File file = new File("studentList.json");
        ObjectMapper mapper = new ObjectMapper();

        Student[] student = mapper.readValue(file, Student[].class);
        for (Student s: student){
            System.out.println(s);
        }
    }
}
