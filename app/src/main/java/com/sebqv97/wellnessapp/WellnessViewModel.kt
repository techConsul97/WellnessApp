package com.sebqv97.wellnessapp

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask> get() = _tasks

    fun remove(task: WellnessTask){
        _tasks.remove(task)
    }


    fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }
}