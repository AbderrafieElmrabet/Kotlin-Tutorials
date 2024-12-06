package com.example.tuto6v11

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class AsyncDataLoaderScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AsyncDataLoader()
        }
    }
}

@Composable
fun AsyncDataLoader(modifier: Modifier = Modifier)  {
    var data by remember { mutableStateOf("Loading...") }

    LaunchedEffect(Unit) {
        data = fetchData()
    }

    Text(
        text = data,
        style = MaterialTheme.typography.headlineSmall
    )
}

@SuppressLint("NewApi")
suspend fun fetchData(): String {
    delay(5000) // Simulates a delay
    val currentTime = LocalTime.now()
    val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
    return "Date et heure actuelles : ${currentTime.format(formatter)}"
}

@Preview(showBackground = true, name = "AsyncDataLoader Preview")
@Composable
fun AsyncDataLoaderPreview() {
    AsyncDataLoader()
}