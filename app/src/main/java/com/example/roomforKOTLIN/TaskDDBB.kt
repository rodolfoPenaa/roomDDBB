package com.example.roomforKOTLIN

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskDDBB:RoomDatabase() {
    abstract fun getTaskDAO(): TaskDAO
    companion object{
        @Volatile
        private var INSTANCE:TaskDDBB?=null

        fun getDDBB(context: Context): TaskDDBB{
            val tempInstance = INSTANCE
            if(tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                val instanceBUILDddbb=Room.databaseBuilder(
                    context.applicationContext,
                    TaskDDBB::class.java,
                    "task_ddbb").build()
                INSTANCE =instanceBUILDddbb
                return instanceBUILDddbb
            }
        }
    }
}