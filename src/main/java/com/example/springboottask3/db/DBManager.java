package com.example.springboottask3.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Long id = 1L;

    public static ArrayList<Task> getAllTasks(){
        return tasks;
    }

    public static void addTask(Task task){
        task.setId(id);
        tasks.add(task);
        id++;
    }

    public static Task getTask(Long id){
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst().orElse(null);
    }

    public static void saveTask(Long id, Task task) {
        int i = 0;
        for (Task t : tasks) {
            if (t.getId() == id) {
                tasks.set(i, task);
                return;
            }
            i++;
        }
    }

    public static void deleteTask(Long id) {
        int i = 0;
        for (Task t : tasks) {
            if (t.getId() == id) {
                tasks.remove(i);
                return;
            }
            i++;
        }
    }
}