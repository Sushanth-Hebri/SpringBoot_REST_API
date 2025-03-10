package com.example.demo.studentapi.repository;

import com.example.demo.studentapi.model.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface StudentRepository extends CassandraRepository<Student, UUID> {
}
