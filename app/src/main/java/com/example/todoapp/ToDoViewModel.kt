package com.example.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.Instant
import java.util.Date

class ToDoViewModel : ViewModel() {
    // private val _todoList = MutableLiveData<List<ToDo>>()
    val todoDao = MainApplication.todoDatabase.getTodoDao()


    val todoList: LiveData<List<ToDo>> = todoDao.getAllTodo()

    //        fun getAllTodo() {
//        _todoList.value = ToDoManager.getAllTodo().reversed()
//    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title: String) {
        viewModelScope.launch(Dispatchers.IO) {
            todoDao.addTodo(
                ToDo(
                    title = title,
                    createAt = Date.from(Instant.now())
                )
            )
        }
    }

    fun deleteTodo(todo: ToDo) {
        viewModelScope.launch(Dispatchers.IO) {
            todoDao.deleteTodo(todo.id)

        }
    }
}