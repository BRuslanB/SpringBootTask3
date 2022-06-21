package com.example.springboottask3.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    Long id;
    String name;
    String description;
    String deadlineDate;
    boolean isCompleted;
}