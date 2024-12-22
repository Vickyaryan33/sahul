package com.sahul.controller;

import com.sahul.Entity.Student;
import com.sahul.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentComntroller {

private StudentService studentService;

    public StudentComntroller(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> CreateStudent(@RequestBody Student student){
       Student student1 = studentService.createStudent(student);
       return  new ResponseEntity<>(student1, HttpStatus.CREATED);

    }
    @GetMapping("/student/{studentId}")
   public ResponseEntity<Student>GetSttudent(
           @PathVariable(name = "studentId") Integer studentId
    )
    {
        Student student = studentService.getStudent(studentId);
        return new ResponseEntity<>( student ,HttpStatus.OK);
    }

    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(
            @PathVariable (name = "studentId") int  studentId

    ){
      studentService.deleteStudent(studentId);
      return "delete Successfully";
    }
}
