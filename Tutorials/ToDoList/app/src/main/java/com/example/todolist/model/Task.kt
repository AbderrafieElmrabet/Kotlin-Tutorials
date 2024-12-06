package com.example.todolist.model

data class Task(
    val id: Int,
    val description: String,
    var isCompleted: Boolean = false
)