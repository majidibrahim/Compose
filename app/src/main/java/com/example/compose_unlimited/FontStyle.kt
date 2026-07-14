package com.example.compose_unlimited

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val fontFamily = FontFamily( Font(resId = R.font.delius_regular, weight = FontWeight(50),style = FontStyle.Italic) )

val myStyle = TextStyle(
    color = Color.Red,
    fontSize = 18.sp,
    fontFamily = fontFamily
)
val myStyleTextTitle = TextStyle(
    color = Color.Red,
    fontSize = 24.sp,
    fontFamily = fontFamily
)


val myStyleNameProfile = TextStyle(
    color = Color.Black.copy(alpha = 0.87f),
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp,
)
val myStyleDatePost = TextStyle(
    color = Color.Black.copy(alpha = 0.60f),
    fontSize = 12.sp
)

val myStyleTextPost = TextStyle(
    color = Color.Black.copy(0.66f),
    fontSize = 14.sp
)