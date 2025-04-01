package com.app.taskmanager.services;

import com.app.taskmanager.models.Task;
import com.app.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String title){
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
    public void toggleTask(Long id){
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(("Invalid Task Id")));
        task.setCompleted(!task.isCompleted()); // reverse completion
        taskRepository.save(task);
    }
}
