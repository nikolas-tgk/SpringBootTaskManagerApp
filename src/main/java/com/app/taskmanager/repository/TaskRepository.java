package com.app.taskmanager.repository;

import com.app.taskmanager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
