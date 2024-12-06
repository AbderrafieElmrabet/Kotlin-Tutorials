package com.example.todolist.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todolist.model.Task

@Composable
fun TaskItem(task: Task, onToggleComplete: (Task) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(task.description)
        }
        Checkbox(
            checked = task.isCompleted,
            onCheckedChange = { onToggleComplete(task) }
        )
    }
}