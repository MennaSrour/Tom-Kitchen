package com.menna.tomkitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.tomkitchen.R
import com.menna.tomkitchen.reuseable.DetailsContainer
import com.menna.tomkitchen.ui.theme.ibmPlexSans

@Composable
fun DetailsColumn(){


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(149.dp)
        ) {
            Text(
                text = "Details",
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize(),
                fontFamily = ibmPlexSans,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                lineHeight = 32.sp,
                letterSpacing = 0.5.sp,
                color = Color(0xDE1F1F1E),
            )
            Row(
                Modifier.align(Alignment.BottomCenter).height(109.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = Color(0xFFD0E5F0))
                        .height(109.dp)
                        .weight(1f),
                    contentAlignment = Alignment.Center

                ) {
                    DetailsContainer(
                        "1000 V",
                        "Temperature",
                        painterResource(id = R.drawable.temperature)
                    )

                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = Color(0xFFD0E5F0))
                        .height(109.dp)
                        .weight(1f),
                    contentAlignment = Alignment.Center

                ) {
                    DetailsContainer(
                        "3 sparks",
                        "Time",
                        painterResource(id = R.drawable.timer)
                    )


                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = Color(0xFFD0E5F0))
                        .height(109.dp)
                        .weight(1f),
                    contentAlignment = Alignment.Center

                ) {
                    DetailsContainer(
                        "1M 12K",
                        "No. of deaths",
                        painterResource(id = R.drawable.evil)
                    )

                }
            }
        }

    }
@Preview
@Composable
fun ViewDetailsColumn(){
    DetailsColumn()
}

