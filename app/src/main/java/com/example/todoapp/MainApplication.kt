package com.example.todoapp

import android.app.Application
import androidx.room.Room
import com.example.todoapp.db.ToDoDatabase

class MainApplication : Application() {
    companion object {
        lateinit var todoDatabase: ToDoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        todoDatabase =
            Room.databaseBuilder(applicationContext, ToDoDatabase::class.java, ToDoDatabase.DB_NAME)
                .build()
    }
}