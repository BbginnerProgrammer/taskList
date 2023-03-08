package com.example.tasklist.service;

import com.example.tasklist.domain.user.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long userId);

    Task update(Task task);

    Task create(Task task);

    void delete(Long id);

}
