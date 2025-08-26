package com.example.todoapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todoapp.ToDo

@Database(entities = [ToDo::class], version = 1)
@TypeConverters(Convertors::class)
abstract class ToDoDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "todo.db"
    }

    abstract fun getTodoDao(): ToDoDao
}