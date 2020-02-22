package com.example.androidtodoapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity: AppCompatActivity() {

    private val taskAdapter: TaskAdapter = TaskAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        add.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }

        list.adapter = taskAdapter
        list.layoutManager = LinearLayoutManager(this)
    }

    override fun onStart() {
        super.onStart()

        val tasks = Database.get()
        taskAdapter.set(tasks)
    }
}