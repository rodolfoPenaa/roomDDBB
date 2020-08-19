package com.example.roomforKOTLIN.presenter

import androidx.lifecycle.LiveData
import com.example.roomforKOTLIN.model.Task

// Para implementar en la vista mediante metodos del presentador, todos implementeados en la vista, también vicsceversa
interface IView {

   fun showAllTask(list: LiveData<List<Task>>)

   fun showToast(toastList: List<Task>)

   fun showToastMessage(toasito:String)
}