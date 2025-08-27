package com.example.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.Date


class ToDoViewModel : ViewModel() {
    private val todoDao = MainApplication.todoDatabase.getTodoDao()

    val todoList: LiveData<List<ToDo>> = todoDao.getAllTodo()

    fun addTodo(title: String) {
        viewModelScope.launch(Dispatchers.IO) {
            todoDao.addTodo(
                ToDo(
                    title = title,
                    createAt = Date(System.currentTimeMillis())
                )
            )
        }
    }

    //    fun deleteTodo(todo: ToDo) {
//        viewModelScope.launch(Dispatchers.IO) {
//            todoDao.deleteTodo(todo) // pass whole object (if @Delete in DAO)
//        }
//    }
    fun deleteTodo(todo: ToDo) {
        viewModelScope.launch(Dispatchers.IO) {
            todoDao.deleteTodo(todo)
        }
    }
}


/*
class ToDoViewModel : ViewModel() {
    // private val _todoList = MutableLiveData<List<ToDo>>()
    val todoDao = MainApplication.todoDatabase.getTodoDao()


    val todoList: LiveData<List<ToDo>> = todoDao.getAllTodo()

    //        fun getAllTodo() {
//        _todoList.value = ToDoManager.getAllTodo().reversed()
//    }
    @OptIn(DelicateCoroutinesApi::class)
    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title: String) {
        GlobalScope.launch(Dispatchers.IO) {
            todoDao.addTodo(
                ToDo(
                    title = title,
                    createAt = Date.from(Instant.now())
                )
            )
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    fun deleteTodo(todo: ToDo) {
        GlobalScope.launch(Dispatchers.IO) {
            todoDao.deleteTodo(todo.id)
        }
    }
}

 */
