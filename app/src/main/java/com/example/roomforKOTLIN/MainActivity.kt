package com.example.roomforKOTLIN

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.example.roomforKOTLIN.model.Task
import com.example.roomforKOTLIN.presenter.IView
import com.example.roomforKOTLIN.presenter.TaskPresenter

class MainActivity : AppCompatActivity(), IView {
    lateinit var mpresenter:TaskPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mpresenter= TaskPresenter(application,this)
        var task0=Task(0,"PLAYvideogames","19.08.2020","20.08.2020")
        mpresenter.insertTASK(task0)
        mpresenter.getAlltask()

    }

    override fun showAllTask(list: LiveData<List<Task>>) {
        list.observe(this, Observer {     //Observador para manejar los posibles cambios en la DDBB
            Log.e("TEsT", it.toString()) })
    }

    override fun showToast(toastList: List<Task>) {
    }
    override fun showToastMessage(toasito: String) {
        //Toast.makeText(this,toasito,Toast.LENGTH_LONG).show()
    }
}