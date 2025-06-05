package com.menna.tomkitchen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.tomkitchen.R
import com.menna.tomkitchen.composable.AddToCartBar
import com.menna.tomkitchen.composable.DetailsColumn
import com.menna.tomkitchen.composable.PreparationMethod
import com.menna.tomkitchen.composable.Product
import com.menna.tomkitchen.composable.TopBackground

@Composable
fun Test() {
    Box(Modifier.fillMaxSize().background(color = Color(0xFFEEF4F6))) {
        Box(Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
            TopBackground()
            Box(
                Modifier
                    .fillMaxHeight()

            ) {
                Box(
                    Modifier
                        .fillMaxWidth().fillMaxHeight().offset(y=202.dp)
                        .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                        .background(color = Color(0xFFEEF4F6))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(
                                vertical = 32.dp,
                                horizontal = 16.dp
                            ),
                        verticalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Product()
                        DetailsColumn()
                        PreparationMethod()
                    }


                }
                Image(
                    painter = painterResource(id = R.drawable.pasta),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 18.dp, end = 24.19.dp)
                        .size(width = 187.61422729492188.dp, height = 168.dp).offset(y=58.dp)
                        .align(Alignment.TopEnd), contentScale = ContentScale.Crop
                )

            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(86.dp)
                .align(Alignment.BottomCenter)
                .border(width = 1.dp, color = Color(0x1F1F1F1E))
                .background(Color.White)
                .padding(vertical = 15.dp, horizontal = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            AddToCartBar(3, 5)
        }
    }
}


@Preview(device = "spec:width=411dp,height=891dp", showSystemUi = true)
@Composable
fun View() {
    Test()
}