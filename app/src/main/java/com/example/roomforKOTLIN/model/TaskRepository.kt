package com.example.roomforKOTLIN.model

import androidx.lifecycle.LiveData
import com.example.roomforKOTLIN.dB.TaskDAO

class TaskRepository(private val mTaskDAO :TaskDAO) {

// LIVE DATA
//1. Este value va a contener todos los task desde la base de datos

    val mAllTask: LiveData<List<Task>> = mTaskDAO.getAllTask()


//CORRUTINA
//2. Esta función va a comunicarse con el DAO y va a insertar la base de datos
    suspend fun inserTask(task:Task){
    mTaskDAO.insertTask(task)
    }

}