package com.example.compose_unlimited

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_unlimited.Compose_Foundation.Text.Basic_Text
import com.example.compose_unlimited.Compose_Foundation.Text.Basic_Text_Field

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var value by rememberSaveable { mutableStateOf("") }
            var scaleCheck by rememberSaveable {mutableStateOf(3f)}
            Greeting(
                textValue = value,
                onValueChange = { value = it },
                modifier = Modifier,
                onClick = {
                    if (scaleCheck <= 1){
                        scaleCheck += 2f
                    }else{
                        scaleCheck -= 0.5f
                    }
                },
                scaleCheck = scaleCheck
            )

        }
    }
}

@Composable
fun Greeting(
    modifier: Modifier,
    textValue:String,
    onValueChange:(String) -> Unit,
    onClick:()-> Unit,
    scaleCheck: Float
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(top = 64.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        Basic_Text(onClick = { onClick() }, scaleF = scaleCheck)
        Basic_Text_Field(text = textValue, onValueChange = onValueChange)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
}