package com.example.roomforKOTLIN.presenter

import com.example.roomforKOTLIN.model.Task

interface IPresenter {
    //Metodos para  ir a buscar las cosas

    fun insertTASK(interfaceTask:Task)

    fun getAlltask()
}
