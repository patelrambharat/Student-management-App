package com.example.studentmanagementapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service   //to tell it is service class
public class StudentService {
   //busingess logic will be here
//    @Autowired
   StudentRepository studentRepository = new StudentRepository();
   public Student getStudent(int regNo){
        System.out.println("Repo bean called in service : " + studentRepository);
       Student student = studentRepository.getStudent(regNo);
       return student;

   }


    public String addStudent(Student student) {
        System.out.println("Repo bean called in service : " + studentRepository);
       studentRepository.addStudent(student);
       return "Student added successfully";
    }

    public Student getStudentUsingPath(int regNo) {

       return studentRepository.getStudentUsingPath(regNo);
    }

    public Student updateAge(int regNo,int newAge) {
       return studentRepository.updateAge(regNo, newAge);
    }
}
