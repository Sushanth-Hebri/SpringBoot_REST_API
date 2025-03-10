package com.example.demo.studentapi.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@Table("students")
public class Student {

    @PrimaryKey
    private UUID id;  // Unique identifier

    private String name;
    private int age;
    private String department;

    // ✅ Manually add a setter for `id`
    public void setId(UUID id) {
        this.id = id;
    }
}
