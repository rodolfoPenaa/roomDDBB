package com.example.roomforKOTLIN

import androidx.room.*

@Dao
        interface TaskDAO {
        @Insert (onConflict = OnConflictStrategy.REPLACE)
            fun inserTask(task:Task)
        @Insert
            fun insertMasiveTask(list: List<Task>)
        // @Update                          //OPCIONAL
           // fun updateTask(task:Task)
        @Delete
            fun deleteEspecificTask(task: Task)
        @Query("SELECT * FROM task_table ORDER BY idTask ASC")
            fun getAllTask():List<Task>

}