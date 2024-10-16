package com.example.basiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccomposable.ui.theme.BasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //  onCreate adalah tempat di mana kamu menginisialisasi komponen-komponen awal dari Activity, seperti layout, data, dan elemen-elemen lainnya yang akan digunakan di UI.
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> // Scaffold : menampilkan body
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding) // perlu parameter pada main activity. perlu modifier (akan mengubah padding (jarak kiri kanan atas bawah), bentuk, ukuran).
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable // anotasi jetpack Compose
fun BasicCompose(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,// agar element berada ditengah secara horizontal
        verticalArrangement = Arrangement.Center, //  Menempatkan elemen di tengah secara vertikal
        modifier = Modifier.fillMaxSize() // membuat elemen UI mengisi seluruh ruang yang tersedia dalam kontainer tempat elemen tersebut berada.
        ) {

        Text(
            text = "Pengembangan Aplikasi Mobile", // parameter Text untuk menampilkan Teks "Pengembangan Aplikasi Mobile"
            style = TextStyle( // objek TextStyle dengan atribut FontSize, FontWeight dan Color
                fontSize = 12.sp, // Digunakan khusus untuk ukuran teks dan disesuaikan berdasarkan pengaturan ukuran teks pengguna.
                fontWeight = FontWeight.Bold, // untuk Menentukan ketebalan font
                color = Color.Black, // untuk mengatur warna tulisan
                letterSpacing = 2.sp, // Jarak antar huruf
                lineHeight = 55.sp // Jarak antar baris
            ),
            modifier = Modifier
                .padding(80.dp) // Menambahkan padding 80 dp di semua sisi
        )

        Text(
            text = "Kelas B", // parameter Text untuk menampilkan Teks "Kelas B"
            style = TextStyle( // objek TextStyle dengan atribut FontSize, FontWeight dan Color
                fontSize = 20.sp, // Digunakan khusus untuk ukuran teks dan disesuaikan berdasarkan pengaturan ukuran teks pengguna.
                fontWeight = FontWeight.W300, // untuk Menentukan ketebalan font
                color = Color.Black, // untuk mengatur warna tulisan
                letterSpacing = 2.sp,
            )
        )

        Image(
            painter = painterResource(id = R.drawable.umy),  // Mengambil gambar dari resource
            contentDescription = "Logo UMY",  // Deskripsi gambar
            modifier = Modifier
                .size(180.dp)  // Mengatur ukuran gambar menjadi 160x160 dp : density-independent pixels. Digunakan untuk ukuran elemen UI (seperti margin, padding, dan ukuran tombol) dan tidak terpengaruh oleh pengaturan ukuran teks pengguna.
        )

        Text( // memiliki 2 parameter; text dan style
            text = "Nama",
            style = TextStyle(
                    fontSize = 16.sp, // mengatur ukuran font
                    fontWeight = FontWeight.SemiBold, // mengatur ketebalan font
                    color = Color.DarkGray, // mengatur warna font
            )
        )

        Text(
            text = "Muhajirah Ulfah",
            style = TextStyle(
                fontSize = 16.sp, // mengatur ukuran font
                fontWeight = FontWeight.Normal, // mengatur ketebalan font
                color = Color.Black, // mengatur warna font
            )
        )

        Text (
            text = "20220130093",
            style = TextStyle(
                fontSize = 16.sp, // mengatur ukuran font
                fontWeight = FontWeight.Normal, // mengatur ketebalan font
                color = Color.Black, // mengatur warna font
            )
        )

        Image(painter = painterResource(id =R.drawable.krs), // objek painter || R.drawable.(namafile) = resource/drawable
            contentDescription = "", // atau null. untuk memberikan deskripsi teks tentang gambar.
            modifier = Modifier
                .size(88.dp)  // Mengatur ukuran gambar menjadi 88x88 dp : density-independent pixels. Digunakan untuk ukuran elemen UI (seperti margin, padding, dan ukuran tombol) dan tidak terpengaruh oleh pengaturan ukuran teks pengguna.
        ) // fungsi untuk menambahkan gambar
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