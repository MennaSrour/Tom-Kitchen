package com.menna.tomkitchen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.tomkitchen.R
import com.menna.tomkitchen.reuseable.IconTextBar

@Composable
fun TopBackground(){
    Box(
        modifier = Modifier
            .height(400.dp)
            .fillMaxWidth()
            .background(color = Color(0x80035484)),
        contentAlignment = Alignment.TopStart
    ) {
        Column(
            Modifier.padding(top=80.dp,start=16.dp).wrapContentSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            IconTextBar("High tension",painterResource(id = R.drawable.ruler))
            IconTextBar("Shocking foods",painterResource(id = R.drawable.chef))
        }
        Image(
            painter = painterResource(id = R.drawable.tom_kitchen_background_ellipse),
            contentDescription = null,
            modifier = Modifier.align(Alignment.TopStart),
        )
    }
}

@Preview
@Composable
fun ViewTopBackground(){
    TopBackground()
}