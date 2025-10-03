package com.fluttx.fintrack.activities.intro.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.fluttx.fintrack.R

@Composable
@Preview
fun IntroScreen(
    onStartClick: ()-> Unit = {}
) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (image, button, title) = createRefs()
        Image(
            painter = painterResource(id = R.drawable.intro_pic),
            contentDescription = "Intro Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.constrainAs(image){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }.fillMaxSize()
        )
        Text(
            text = stringResource(R.string.intro_message),
            color = Color.White,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(title) {
                bottom.linkTo(button.top, margin = 32.dp)
                start.linkTo(button.start)
            }
        )
        Box(
            modifier = Modifier.constrainAs(button) {
                start.linkTo(parent.start, margin = 32.dp)
                bottom.linkTo(parent.bottom, margin = 78.dp)
            }
                .width(135.dp)
                .height(50.dp)
                .border(
                    width = 2.dp,
                    color = Color.White,
                    shape = RoundedCornerShape(12.dp)
                )
                .background(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(12.dp)
                )
                .clickable{onStartClick()},
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = stringResource(R.string.get_started),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 22.sp,
            )
        }
    }
}