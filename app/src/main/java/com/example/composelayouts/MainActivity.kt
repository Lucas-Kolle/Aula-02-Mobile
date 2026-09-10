package com.example.composelayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composelayouts.ui.theme.ComposeLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLayoutsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Box(
//                        modifier = Modifier
//                            .padding(innerPadding)
//                            .background(Color.Magenta)
//                            .size(200.dp, 300.dp),
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Text("Aula Android")
//                        Text("Com o Jatpack Compose", modifier = Modifier.align(Alignment.BottomCenter))
//                    }
                    LayoutScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun LayoutScreen(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .background(Color.Gray) // Muda a cor dofundo
                .fillMaxSize(), // Ocupa / Preenche o tamanho máximo
            horizontalAlignment = Alignment.CenterHorizontally // Organiza no centro (eixo horizontal "X")
        ) {
            Text("Texto 1")
            Text("Texto 2")
            Text("Texto 3")
        }
    }
}