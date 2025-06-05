package com.menna.tomkitchen.reuseable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.tomkitchen.ui.theme.ibmPlexSans

@Composable
fun StepContainer(stepNumber: Int,stepText: String){
    Column {
        Box(
            Modifier
                .fillMaxWidth()
                .height(39.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(37.dp)
                    .fillMaxWidth().padding(start = 20.dp)
                    .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                    .background(Color.White)
                    .padding(start=25.dp,top=8.dp, end = 10.dp),
            ){
                Text(
                    text=stepText,
                    modifier = Modifier,
                    fontFamily = ibmPlexSans,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    letterSpacing = 0.5.sp,
                    color = Color(0x99121212)
                )
            }
            Box(
                Modifier
                    .size(37.dp)
                    .align(Alignment.TopStart)
                    .clip(CircleShape)
                    .background(Color(0xFFFFFFFF))
                    .border(width = 1.dp, color = Color(0xFFD0E5F0), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = stepNumber.toString(),
                    fontFamily = ibmPlexSans,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    lineHeight = 12.sp,
                    letterSpacing = 0.5.sp,
                    color = Color(0xFF035587)

                )
            }

        }
    }
}

@Preview
@Composable
fun ViewStepContainer(){
    StepContainer(1,"dssddddeedddss")
}