package com.example.roomforKOTLIN.model

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomforKOTLIN.R
import kotlinx.android.synthetic.main.task_item_list.view.*

class TaskAdapter (private val listTASK:MutableList<Task>): RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    class TaskViewHolder(taskItemView:View):RecyclerView.ViewHolder(taskItemView){
        var cycloID : TextView =taskItemView.findViewById(R.id.task)
        var cycloTaskName: TextView=taskItemView.findViewById(R.id.task_name)
        var cycloTaskDate: TextView=taskItemView.task_init_date
        var cycloTaskFinishDate: TextView=taskItemView.task_finish_date

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val vista=LayoutInflater.from(parent.context).inflate(R.layout.task_item_list,parent,false)
        return TaskViewHolder(vista)
    }
    override fun getItemCount(): Int {
        return listTASK.size
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
       holder.cycloID.text= listTASK[position].idTask.toString()
        holder.cycloTaskName.text=listTASK[position].nameTask
        holder.cycloTaskDate.text=listTASK[position].initDataTask
        holder.cycloTaskFinishDate.text=listTASK[position].lastDayDateTask
    }

}