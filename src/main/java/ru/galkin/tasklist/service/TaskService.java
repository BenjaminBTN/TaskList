package ru.galkin.tasklist.service;

import ru.galkin.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);
    List<Task> getAllByUserId(Long id);
    Task update(Task task);
    Task create(Task task);

}
