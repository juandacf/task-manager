package com.tuusuario.services;

import com.tuusuario.models.taskManager;

import java.util.List;

import com.tuusuario.models.task;

public class TaskService {

    public taskManager addTask(taskManager taskManager, task task) {

        taskManager.getTasks().add(task);
        return taskManager;
    }

    public List<task> getTasks(taskManager taskManager){

        return taskManager.getTasks();
    }
}
