package com.example.basiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiccomposable.ui.theme.BasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //  onCreate adalah tempat di mana kamu menginisialisasi komponen-komponen awal dari Activity, seperti layout, data, dan elemen-elemen lainnya yang akan digunakan di UI.
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> // Scaffold : menampilkan body
                    Greeting(
                        name = "Ulfah",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable // anotasi jetpack Compose
fun BasicCompose(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,// agar element berada ditengah secara horizontal
        verticalArrangement = Arrangement.Center, //  Menempatkan elemen di tengah secara vertikal
        modifier = Modifier.fillMaxSize() // membuat elemen UI mengisi seluruh ruang yang tersedia dalam kontainer tempat elemen tersebut berada.
        ) {
        Text(
            text = "Pengembangan Aplikasi Mobile",
            style = TextStyle(
                fontSize =,
                fontWeight =,
                color =,
            )
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) { // Modifier adalah objek yang memungkinkan kamu untuk mengubah atau memodifikasi tampilan dan perilaku komponen UI di Jetpack Compose, seperti mengatur ukuran, padding, margin, warna latar belakang, alignment, dan sebagainya.
    Text(
        text = "Hello $name!", // parameter text untuk menampilkan teks "Hello $name"
        modifier = modifier // agar dapat di modifikasi
    )
}

@Preview(showBackground = true) // anotasi untuk menampilkan preview tanpa running program
@Composable // anotasi jetpack compose
fun GreetingPreview() {
    BasicComposableTheme {
        Greeting("Ulfah ")
    }
}