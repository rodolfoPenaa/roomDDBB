package com.example.roomforKOTLIN

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task (
    @PrimaryKey(autoGenerate = true) @NonNull val idTask:Int,
    @ColumnInfo(name = "task_name") var nameTask:String,
                                    val initDataTask:String,
                                    val lastDayDateTask:String ){

}