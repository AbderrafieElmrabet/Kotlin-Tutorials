package com.example.cartedevisiteinteractive

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartedevisiteinteractive.ui.theme.CarteDeVisiteInteractiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteDeVisiteInteractiveTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CarteDeVisite() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Nom et profession
        Text(
            text = "John Doe",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Développeur Android",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Coordonnées
        ContactInfo(
            label = "Téléphone :",
            value = "+33 6 12 34 56 78",
            onClick = { /* Appeler */ }
        )
        ContactInfo(
            label = "Email :",
            value = "johndoe@example.com",
            onClick = { /* Envoyer un email */ }
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Bouton pour site web
        Button(onClick = { /* Ouvrir le site */ }) {
            Text("Visiter mon site")
        }
    }
}

@Composable
fun ContactInfo(label: String, value: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(vertical = 4.dp)
    ) {
        Text(text = "$label ", fontWeight = FontWeight.Bold)
        Text(text = value, color = Color.Blue)
    }

    val context = LocalContext.current
    val callIntent = Intent(Intent.ACTION_DIAL).apply {
        data = Uri.parse("tel:+33612345678")
    }
    ContactInfo(
        label = "Téléphone :",
        value = "+33 6 12 34 56 78",
        onClick = { context.startActivity(callIntent) }
    )

    val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("mailto:johndoe@example.com")
    }
    ContactInfo(
        label = "Email :",
        value = "johndoe@example.com",
        onClick = { context.startActivity(emailIntent) }
    )

    val websiteIntent = Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse("https://www.johndoe.com")
    }
    Button(onClick = { context.startActivity(websiteIntent) }) {
        Text("Visiter mon site")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun CarteDeVisitePreview() {
    CarteDeVisite()
}