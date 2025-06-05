package com.menna.tomkitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.tomkitchen.R
import com.menna.tomkitchen.ui.theme.ibmPlexSans

@Composable
fun Product(){
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Electric Tom pasta",
                    modifier = Modifier
                        .padding(end = 18.dp)
                        .align(Alignment.Start),
                    fontFamily = ibmPlexSans,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    lineHeight = 32.sp,
                    letterSpacing = 0.sp,
                    color = Color(0xDE1F1F1E),
                )
                Row(
                    modifier = Modifier
                        .height(30.dp)
                        .wrapContentWidth()
                        .align(Alignment.Start)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFFD0E5F0))
                        .padding(vertical = 4.dp, horizontal = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)

                ) {
                    Box(
                        modifier = Modifier.size(16.dp)

                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.money_icon),
                            contentDescription = "Money Icon",
                            tint = Color(0xFF03578A)

                        )
                    }
                    Text(
                        text = buildAnnotatedString {
                            null
                                ?.let {
                                    withStyle(
                                        style = SpanStyle(
                                            textDecoration = TextDecoration.LineThrough
                                        )
                                    ) {
                                        append("$it ")
                                    }
                                }
                            append("5 cheeses")
                        },
                        modifier = Modifier
                            .wrapContentWidth()
                            .height(18.dp),
                        fontFamily = ibmPlexSans,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        lineHeight = 12.sp,
                        letterSpacing = 0.sp,
                        color = Color(0xFF03578A),

                        )
                }


            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.fav_icon),
                contentDescription = "fav Icon",
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.CenterVertically),
                tint = Color(0xFF03578A)
            )
        }
        Text(
            text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
            fontFamily = ibmPlexSans,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.5.sp,
            color = Color(0x99121212),
        )
    }
}