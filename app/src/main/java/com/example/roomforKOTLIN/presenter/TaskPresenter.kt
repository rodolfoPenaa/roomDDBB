package com.example.roomforKOTLIN.presenter

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.roomforKOTLIN.dB.TaskDDBB
import com.example.roomforKOTLIN.model.Task
import com.example.roomforKOTLIN.model.TaskRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class TaskPresenter(application: Application, val iView:IView): IPresenter, CoroutineScope{ // Obliga pasar la interfaz IVIEW, es necesaria para enlazar junto a la interfaz del presentador
    private val mRepository:TaskRepository
    private val allLiveDataTaskDATA:LiveData<List<Task>>

    //CORRUTINA (JOB)
    private val mJOB:Job=Job()
    //CORRUTINA
    override val coroutineContext: CoroutineContext = mJOB+Dispatchers.IO

    init {
        val taskDAOinPresenter = TaskDDBB.getDDBB(application).getTaskDAO()
        mRepository = TaskRepository(taskDAOinPresenter)
        allLiveDataTaskDATA=mRepository.mAllTask
    }
    override fun insertTASK(anyTask: Task){
        launch {
            mRepository.inserTask(anyTask)
            //iView.showToastMessage("Saving")
        }
    }
 /*
    override fun getAlltask(allTaskCreated: LiveData<MutableList<Task>>) {
        lunch{
            allLiveDataTaskDATA
            iView.showAllTask(allLiveDataTaskDATA)
        }
    }
  */
}