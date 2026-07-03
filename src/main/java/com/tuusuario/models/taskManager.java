package com.tuusuario.models;

import java.util.ArrayList;
import java.util.List;

public class taskManager {

    private  List<task> tasks;

    public taskManager() {
        tasks = new ArrayList<>();
    }

    public List<task> getTasks() {
        return this.tasks;
    }

    public task getTaskById(int id){

        List<task> allTasks = getTasks();
        task chosenTask = null;
        
        return chosenTask;
    } 


}
