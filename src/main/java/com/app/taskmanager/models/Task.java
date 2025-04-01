package com.app.taskmanager.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto-generated id field
    private Long id;
    private String title;
    private boolean isCompleted;

}
