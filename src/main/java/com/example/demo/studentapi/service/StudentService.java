package com.example.demo.studentapi.service;

import com.example.demo.studentapi.model.Student;
import com.example.demo.studentapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Optional<Student> getStudentById(UUID id) {
        return repository.findById(id);
    }

    public Student createStudent(Student student) {
        student.setId(UUID.randomUUID());
        return repository.save(student);
    }

    public Student updateStudent(UUID id, Student student) {
        student.setId(id);
        return repository.save(student);
    }

    public void deleteStudent(UUID id) {
        repository.deleteById(id);
    }
}
