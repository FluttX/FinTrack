package com.fluttx.fintrack.activities.report.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fluttx.fintrack.R


@Composable
fun SummaryColumns(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.height(IntrinsicSize.Min),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        SummaryColumn(
            title = "Total Balance",
            value = "$3,234.56",
            percent = "+20.5%",
            percentColor = Color(0xFF2D9738),
            modifier = Modifier.weight(1f)
        )
        VerticalDivider()
        SummaryColumn(
            title = "Income",
            value = "$1,234.56",
            percent = "-10.5%",
            percentColor = Color(0xFFEF2642),
            modifier = Modifier.weight(1f)
        )
        VerticalDivider()
        SummaryColumn(
            title = "Saving",
            value = "$1,34.56",
            percent = "+34.5%",
            percentColor = Color(0xFF2D9738),
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview
@Composable
fun SummaryColumnsPreview() {
    SummaryColumns()
}

@Composable
fun SummaryColumn(
    title: String,
    value: String,
    percent: String,
    percentColor: Color,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = title,
            color = colorResource(R.color.darkBlue)
        )
        Text(
            text = value,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 19.sp,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Text(
            text = percent,
            color = percentColor
        )
    }
}
