package com.example.compose_unlimited.Compose_Foundation.Post

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_unlimited.R

@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    profilePinter: Painter
){
    Image(
        modifier = modifier
            .size(48.dp)
            .clip(RoundedCornerShape(12.dp)),
        painter = profilePinter,
        contentDescription = "profileImage"
    )
}



@Preview
@Composable
fun Preview(){
    Avatar(
        modifier = Modifier,
        profilePinter = painterResource(R.drawable.profile)
    )
}