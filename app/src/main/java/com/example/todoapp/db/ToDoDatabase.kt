package com.example.todoapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todoapp.ToDo


@Database(entities = [ToDo::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun getTodoDao(): ToDoDao

    companion object {
        @Volatile
        private var INSTANCE: ToDoDatabase? = null
        const val DB_NAME = "todo.db"

//        fun getDatabase(context: Context): ToDoDatabase {
//            return INSTANCE ?: synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    ToDoDatabase::class.java,
//                    "todo.db"
//                ).build()
//                INSTANCE = instance
//                instance
//            }
//        }
    }
}



























/*
@Database(entities = [ToDo::class], version = 1)
@TypeConverters(Convertors::class)
abstract class ToDoDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "todo.db"
    }

    abstract fun getTodoDao(): ToDoDao
}

 */