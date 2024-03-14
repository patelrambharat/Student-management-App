package com.example.studentmanagementapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController   //tell the complirer that this is the class that very first come // we are going to make rest API
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    //make the function to get info
    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return studentService.getStudent(regNo);
    }
    //api means take some input and give the output

    //get all the attribute
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        String result = studentService.addStudent(student);
        return result;
    }
    @GetMapping("/getByPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo){

        return studentService.getStudentUsingPath(regNo);
    }

    //I'm updating something then mapping is
    @PutMapping("/update-age/{id}")
    public Student updateAge(@PathVariable("id") int regNo, @RequestParam("age") int newAge){
        return studentService.updateAge(regNo,newAge);

    }
}
