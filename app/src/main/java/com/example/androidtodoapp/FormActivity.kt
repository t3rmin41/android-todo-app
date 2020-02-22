package com.example.androidtodoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        save.setOnClickListener {
            val text = task_text.text.toString()
            val task = Task(text)
            Database.add(task)
            finish() // finishes & closes the current screen
        }
    }
}