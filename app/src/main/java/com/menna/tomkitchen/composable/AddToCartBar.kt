package com.menna.tomkitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.tomkitchen.ui.theme.ibmPlexSans

@Composable
fun AddToCartBar( actualPrice: Int,originalPrice: Int?=null) {

    Box(
        Modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color = Color(0xFF226993))
            .padding(horizontal = 84.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.wrapContentSize(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Add to cart",
                fontFamily = ibmPlexSans,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                color = Color(0xDEFFFFFF)
            )
            Box(
                Modifier
                    .size(5.dp)
                    .clip(CircleShape)
                    .background(Color(0x61FFFFFF))
            )
            Column(
                Modifier
                    .wrapContentHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                Text(
                    text = "$actualPrice cheeses",
                    fontFamily = ibmPlexSans,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    letterSpacing = 0.5.sp,
                    color = Color.White

                )
                originalPrice?.let {price->
                    Text(
                        text = "$price cheeses",
                        fontFamily = ibmPlexSans,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        lineHeight = 12.sp,
                        letterSpacing = 0.5.sp,
                        color = Color.White,
                        textDecoration = TextDecoration.LineThrough

                    )
                }
            }

        }
    }
}

        @Preview
        @Composable
        fun ViewAddToCartBar() {
            AddToCartBar(3,5)
        }