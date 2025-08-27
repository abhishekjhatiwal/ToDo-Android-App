package com.example.todoapp.db

import androidx.room.TypeConverter
import java.util.Date

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}


//    @TypeConverter
//    fun fromDate(date: Date): Long{
//        return date.time
//    }
//
//    @TypeConverter
//    fun toDate(Id: Long): Date {
//        return Date(Id)
//    }
//}