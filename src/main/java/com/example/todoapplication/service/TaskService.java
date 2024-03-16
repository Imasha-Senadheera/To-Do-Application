package com.example.todoapplication.service;

import com.example.todoapplication.Task;
import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task addTask(Task task);
    void deleteTaskById(Long id);
}
