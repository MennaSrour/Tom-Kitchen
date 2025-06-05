package com.menna.tomkitchen.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.tomkitchen.reuseable.StepContainer
import com.menna.tomkitchen.ui.theme.ibmPlexSans

@Composable
fun PreparationMethod() {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Preparation method",
            fontFamily = ibmPlexSans,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.5.sp,
            color = Color(0xDE1F1F1E)
        )
        Column(
            Modifier.wrapContentHeight(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            StepContainer(1, "Put the pasta in a toaster.")
            StepContainer(2, "Pour battery juice over it.")
            StepContainer(3, "Wait for the spark to ignite.")
            StepContainer(4, "Pour battery juice over it.")
        }

    }
}

@Preview
@Composable
fun ViewPreparationMethod() {
    PreparationMethod()
}