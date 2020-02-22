package com.example.androidtodoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter: RecyclerView.Adapter<TaskViewHolder>() {

    private var tasks: List<Task> = emptyList()

    fun set(tasks: List<Task>) {
        this.tasks = tasks
        notifyDataSetChanged() // tells the adapter to re-draw the data (reload the view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val context = parent.context
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.view_task, parent, false)
        val taskViewHolder = TaskViewHolder(view)
        return taskViewHolder
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]
        holder.bind(task)
    }
}