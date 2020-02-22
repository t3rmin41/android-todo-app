package com.example.androidtodoapp

object Database { // Kotlin creates classes with keyword "object" as a singleton under the hood
    private val tasks: MutableList<Task> = mutableListOf()

    fun add(task: Task) {
        tasks.add(task)
    }

    fun get(): List<Task> { // List<Task> means the returned list is immutable
        return tasks
    }
}