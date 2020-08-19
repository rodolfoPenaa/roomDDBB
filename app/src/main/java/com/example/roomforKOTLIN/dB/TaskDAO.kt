package com.example.roomforKOTLIN.dB

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.roomforKOTLIN.model.Task

@Dao
        interface TaskDAO {
        @Insert (onConflict = OnConflictStrategy.REPLACE)
        //CORRUTINA
         suspend fun insertTask(task: Task)
        @Insert
            fun insertMasiveTask(list: List<Task>)
        // @Update                          //OPCIONAL
           // fun updateTask(task:Task)
        @Delete
            fun deleteEspecificTask(task: Task)

        @Query("SELECT * FROM task_table ORDER BY idTask ASC")
            fun getAllTask():LiveData<List<Task>>

}