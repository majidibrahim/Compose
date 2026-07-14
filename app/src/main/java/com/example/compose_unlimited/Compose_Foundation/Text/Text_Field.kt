package com.example.compose_unlimited.Compose_Foundation.Text

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.compose_unlimited.myStyle
import kotlin.math.log


@Composable
fun Basic_Text_Field(text:String, onValueChange:(String)-> Unit){
    BasicTextField(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(50))
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(50))
            .padding(vertical = 4.dp, horizontal = 16.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
        ),
        keyboardActions = KeyboardActions(onDone = null),
        textStyle = myStyle,
        value = text,
        onValueChange = onValueChange,
        maxLines = 1,
        visualTransformation = PasswordVisualTransformation()

        )


}//end Basic_Text_Field()

class EvinOdd : VisualTransformation {

    override fun filter(text: AnnotatedString): TransformedText {
        return TransformedText(
            buildAnnotatedString {}
        ,offsetMapping = OffsetMapping.Identity
        )
    }
}

