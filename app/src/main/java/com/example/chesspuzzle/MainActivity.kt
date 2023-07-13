package com.example.chesspuzzle


import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material.Surface


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.chesspuzzle.ui.theme.ChessPuzzleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChessPuzzleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),

                ) {

                }
            }
        }
    }
}

@Composable
fun ChessBoard(modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = R.drawable.chessboard) ,
          contentDescription = null ,
          modifier = Modifier.fillMaxSize())
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChessPuzzleTheme {
        ChessBoard()
    }
}