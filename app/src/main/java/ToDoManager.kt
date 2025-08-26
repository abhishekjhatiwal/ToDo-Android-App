/*
package com.example.todoapp



import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.System.currentTimeMillis
import java.time.Instant
import java.util.Date


object ToDoManager {
    private val todoList = mutableListOf<ToDo>()

    fun getAllTodo(): List<ToDo> {
        return todoList
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title: String) {
        todoList.add(ToDo(currentTimeMillis(), title=title,Date.from(Instant.now())))
    }

//    fun addTodo(title: String) {
//        todoList.add(ToDo(generateUniqueId(), title, Instant.now()))
//    }

    fun deleteTodo(todo: ToDo) {
        todoList.removeIf { it.id == todo.id }
    }
    fun updateTodo(todo: ToDo) {}
}

 */

