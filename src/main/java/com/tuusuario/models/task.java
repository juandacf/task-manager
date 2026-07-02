package com.tuusuario.models;

public class task {

    private int taskId;
    private String taskName;
    private String taskDescription;
    public Boolean isCompleted;

    public task(int id, String name, String description) {
        this.taskId = id;
        this.taskName = name;
        this.taskDescription = description;
        this.isCompleted = false;
    }

    public int getTaskId() {
        return taskId;
    }

    
    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String name) {
        this.taskName = name;
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean getTaskStatus(){
        return this.isCompleted;
    }

    public void setTaskStatus(boolean status){
        
    }
}
