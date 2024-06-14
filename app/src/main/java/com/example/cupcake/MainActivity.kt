
package com.example.cupcake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.cupcake.ui.theme.CupcakeTheme

//FRANCESCA A. LUGAY
//BSIT 22A3
//MOBILE COMPUTING
//JUNE 15, 2024
//ACTIVITY 8

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            CupcakeTheme {
                CupcakeApp()
            }
        }
    }
}
