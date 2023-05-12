package com.chris.myapplication.ToDoApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chris.myapplication.R

class TasksAdapter(var tasks: List<Task>, private val onTaskSelected: (Int) -> Unit) :
    RecyclerView.Adapter<TaskViewHolder>() {

    //LLAMA EL LAYOUT DEL CARDVIEW ITEM_TODO_TASK
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.render(tasks[position])
        holder.itemView.setOnClickListener{ onTaskSelected(position)}

    }

    //EL TAMAÑO QUE TENDRA EL RECICLER VIEW DEPENDERA DEL TAMAÑO DEL  TASKS
    override fun getItemCount() = tasks.size
}
