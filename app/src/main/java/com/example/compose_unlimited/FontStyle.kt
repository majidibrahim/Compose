package com.example.compose_unlimited

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp

private val fontFamily = FontFamily( Font(resId = R.font.delius_regular, style = FontStyle.Italic) )

val myStyle = TextStyle(
    color = Color.Red,
    fontSize = 32.sp,
    fontFamily = fontFamily
)