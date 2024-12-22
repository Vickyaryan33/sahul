package com.sahul.service;

import com.sahul.Entity.Student;
import com.sahul.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

   public  Student createStudent(Student student){
     return studentRepository.save(student);

   }

    public Student getStudent(Integer studentId) {
       Student student= studentRepository.findById(studentId).get();
       return student;
    }

    public void deleteStudent(int studentId) {
       studentRepository.deleteById(studentId);
    }
}
