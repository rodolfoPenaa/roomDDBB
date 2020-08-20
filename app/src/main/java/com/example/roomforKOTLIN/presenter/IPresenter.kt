package com.example.roomforKOTLIN.presenter

import androidx.lifecycle.LiveData
import com.example.roomforKOTLIN.model.Task

interface IPresenter {
    //Metodos para  ir a buscar las cosas

    fun insertTASK(anyTask:Task)

    fun getAlltask(allTaskCreated:LiveData<MutableList<Task>>)

}
