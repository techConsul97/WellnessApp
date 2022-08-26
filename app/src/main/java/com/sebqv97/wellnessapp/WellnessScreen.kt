package com.sebqv97.wellnessapp

import android.system.Os.remove
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    viewModel: WellnessViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {

    Column(modifier = modifier) {
        StatefulCounter(modifier = modifier)

        val list = remember {viewModel.tasks.toMutableStateList() }
        WellnessTasksList(list = list, onCloseTask = { task -> viewModel.remove(task) })
    }
}


