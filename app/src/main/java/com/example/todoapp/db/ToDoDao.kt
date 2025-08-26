package com.example.todoapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.todoapp.ToDo

@Dao
interface ToDoDao {
    @Query("SELECT * FROM todo")
    fun getAllTodo(): LiveData<List<ToDo>>

    @Insert
    suspend fun addTodo(todo: ToDo)

    @Query("DELETE FROM todo WHERE id = :id")
    suspend fun deleteTodo(id: Long)
}