package com.menna.tomkitchen.reuseable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
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
fun IconTextBar(text: String,icon: Painter){
    Row(
        Modifier.wrapContentSize(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = icon,
            modifier = Modifier.size(24.dp),
            contentDescription = null,
            tint=Color(0xFFFFFFFF)
        )
        Text(
            text = text,
            fontFamily = ibmPlexSans,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp,
            color = Color(0xDEFFFFFF),
        )
    }
}