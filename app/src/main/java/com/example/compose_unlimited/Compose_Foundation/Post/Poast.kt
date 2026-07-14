package com.example.compose_unlimited.Compose_Foundation.Post

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_unlimited.R
import com.example.compose_unlimited.myStyleTextPost

@Composable
fun PostCard(
    modifier: Modifier = Modifier,
    profileImage: Painter,
    nameProfile: String,
    postImage: Painter,
    textPost: String,
    datePost: String
){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(color = Color.White)
            .border(width = 1.dp, color = Color.Gray.copy(alpha = 0.85f),RoundedCornerShape(24.dp))
    ) {
        PostHeader(
            modifier = Modifier.padding(12.dp),
            profileImage = profileImage,
            nameProfile = nameProfile,
            datePost = datePost
        )
        BasicText(
            text = textPost,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .padding(top = 4.dp, bottom = 12.dp),
            style = myStyleTextPost
        )
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = postImage,
            contentDescription = "imagePost",
            contentScale = ContentScale.Crop
        )
    }//end Column Home
}//end PostCard()



@Preview
@Composable
fun Preview_PostCard(){
    PostCard(
        modifier = Modifier,
        postImage = painterResource(R.drawable.post5),
        profileImage = painterResource(R.drawable.profile),
        textPost = "Not all heroes wear capes, Some just bring coffee",
        nameProfile = "Dark Roast",
        datePost = "12 Jun 2026, 11:30 PM"
    )

}


