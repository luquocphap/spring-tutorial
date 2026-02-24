package com.rungroup.web.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="students")
public class Student {
    @Id
    private long studentId;
    private String fullName;
    private String major;
    private String schoolYear;
    @CreationTimestamp
    private LocalDateTime createdOn;
}
