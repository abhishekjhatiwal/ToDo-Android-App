package com.example.todoapp.db

import androidx.room.TypeConverter
import java.util.Date

class Convertors {
    @TypeConverter
    fun fromDate(date: Date): Long{
        return date.time
    }

    @TypeConverter
    fun toDate(Id: Long): Date {
        return Date(Id)
    }
}