package com.example.compose_unlimited.Compose_Foundation.Text

import androidx.compose.foundation.clickable
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.example.compose_unlimited.myStyle
import com.example.compose_unlimited.myStyleTextTitle

@Composable
fun Basic_Text(onClick:()-> Unit, scaleF: Float ) {

    BasicText(
        style = myStyleTextTitle,
        modifier = Modifier
            .rotate(scaleF)
            .scale(scaleF)
            .clickable {
                onClick()
            },
        text = buildAnnotatedString {
            withStyle(SpanStyle(color = Color.Blue)) {
                append("@Majid")
            }
            withStyle(SpanStyle(color = Color.Black)) {
                append(" Ibrahim")
            }
        },


    )
}

