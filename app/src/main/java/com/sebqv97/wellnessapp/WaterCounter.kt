package com.sebqv97.wellnessapp

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun StatelessCounter(countValue:Int, onIncrement:()-> Unit,modifier: Modifier){
    Column(modifier = modifier.padding(30.dp)){
        if(countValue > 0) {

            Text("You've had $countValue glasses.")
        }
            Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = countValue< 10) {
                Text("Add one")

        }
    }
}

@Composable
fun StatefulCounter(modifier: Modifier){
    var count by rememberSaveable { mutableStateOf( 0 ) }
    var checked by rememberSaveable { mutableStateOf(false) }
    StatelessCounter(countValue = count, onIncrement = { ++count }, modifier = modifier)
}