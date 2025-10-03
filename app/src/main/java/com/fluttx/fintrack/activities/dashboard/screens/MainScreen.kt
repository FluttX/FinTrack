package com.fluttx.fintrack.activities.dashboard.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fluttx.fintrack.activities.dashboard.components.ActionButtonRow
import com.fluttx.fintrack.activities.dashboard.components.CardSection
import com.fluttx.fintrack.activities.dashboard.components.ExpenseItem
import com.fluttx.fintrack.activities.dashboard.components.HeaderSection
import com.fluttx.fintrack.domain.ExpenseDomain

@Composable
@Preview(showBackground = true)
fun MainScreenPreview() {
    val expenses = listOf(
        ExpenseDomain("Coffee", 220.0, "restaurant", "17th June 2025, 08:00 AM"),
        ExpenseDomain("Movie", 220.0, "cinema", "18th June 2025, 09:30 AM"),
        ExpenseDomain("Burger", 220.0, "mcdonald", "25th June 2025, 05:43 PM"),
        ExpenseDomain("Cold Coffee", 220.0, "restaurant", "20th June 2025, 01:34 PM"),
    )
    MainScreen(expenses = expenses, onCardClick = {})
}

@Composable
fun MainScreen(
    onCardClick: ()-> Unit = {},
    expenses : List<ExpenseDomain>,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 70.dp),
            verticalArrangement =Arrangement.spacedBy(12.dp),
        ) {
            item { HeaderSection() }
            item { CardSection(onClick = onCardClick) }
            item { ActionButtonRow() }

            items(count = expenses.size) {
                index -> ExpenseItem(item = expenses[index])
            }
        }
    }
}