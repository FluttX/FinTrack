package com.fluttx.fintrack.activities.dashboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fluttx.fintrack.R
import com.fluttx.fintrack.domain.ExpenseDomain

@Composable
fun ExpenseItem(
    item: ExpenseDomain
) {
    Row (
       modifier = Modifier
           .padding(vertical = 4.dp)
           .fillMaxWidth()
           .height(70.dp)
           .padding(horizontal = 16.dp)
           .clip(RoundedCornerShape(12.dp))
           .background(Color.White)
           .border(
               width = 1.dp,
               color = Color.LightGray,
               shape = RoundedCornerShape(12.dp),
           ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val context = LocalContext.current
        val resId = context.resources.getIdentifier(
            item.picture,"drawable",context.packageName
        )

        Image(
            painter = painterResource(id = resId),
            contentDescription = null,
            modifier = Modifier
                .padding(8.dp)
                .size(55.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(colorResource(R.color.lightBlue))
                .padding(12.dp)
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 8.dp)
        ) {
            Text(
                text = item.title,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(R.color.darkBlue),
            )
            Text(
                text = item.time,
                color = colorResource(R.color.darkBlue),
            )
        }
        Text(
            text = "$${item.price}",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = colorResource(R.color.darkBlue),
            modifier = Modifier.padding(end = 16.dp)
        )
    }
}

@Composable
@Preview
fun ExpenseItemPreview() {
    val expense = ExpenseDomain("Coffee",120.0,"restaurant", "10 Nov 2025, 10:00 AM")
    ExpenseItem(expense)
}