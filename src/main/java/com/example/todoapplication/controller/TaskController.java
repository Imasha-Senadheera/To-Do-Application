package com.example.todoapplication.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.example.todoapplication.service.TaskService;
import com.example.todoapplication.Task;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@Api(tags = "Tasks", value = "APIs for managing tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    @ApiOperation("Get all tasks")
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    @ApiOperation("Get a task by ID")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    @ApiOperation("Add a new task")
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete a task by ID")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTaskById(id);
    }
}
