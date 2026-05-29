package com.example.servlet.models;

public class Task {
    
    private int id;
    private String title;
    private String description;
    private boolean completed;

    public Task(int id, String title, String description, boolean completed) {
        this.title = title;
        this.completed = completed;
        this.description = description;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    } 

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}