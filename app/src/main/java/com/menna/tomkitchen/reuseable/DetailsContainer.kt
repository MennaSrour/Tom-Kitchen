package com.menna.tomkitchen.reuseable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.tomkitchen.ui.theme.ibmPlexSans

@Composable
fun DetailsContainer(value:String,title: String,icon: Painter) {

        Column(
            modifier = Modifier.wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = icon,
                modifier = Modifier.size(32.dp),
                contentDescription = "$icon icon",
                tint = Color(0xFF035587)
            )
            Text(
                text = value,
                fontFamily = ibmPlexSans,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 14.sp,
                letterSpacing = 0.5.sp,
                color = Color(0x5E121212),
            )
            Text(
                text = title,
                fontFamily = ibmPlexSans,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                letterSpacing = 0.5.sp,
                color = Color(0x5E121212),
            )
        }
    }
