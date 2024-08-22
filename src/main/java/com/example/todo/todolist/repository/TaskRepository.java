package com.example.todo.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.todolist.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
