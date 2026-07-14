package com.example.compose_unlimited.Compose_Foundation.Post

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_unlimited.R
import com.example.compose_unlimited.myStyleDatePost
import com.example.compose_unlimited.myStyleNameProfile

@Composable
fun PostHeader(
    modifier: Modifier = Modifier,
    profileImage: Painter,
    nameProfile: String,
    datePost: String,
){
    Row(
        modifier = modifier
            .fillMaxWidth()
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Avatar(profilePinter = profileImage)
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            BasicText(
                text = nameProfile,
                style = myStyleNameProfile
            )
            BasicText(
                text = datePost,
                style = myStyleDatePost
            )
        }
    }//end Row

}

@Preview
@Composable
fun Preview_PostHeader(){
    PostHeader(
        Modifier,
        painterResource(R.drawable.profile),
        "Dark Roast",
        "12 Jun 2026, 11:30 PM"
    )
}