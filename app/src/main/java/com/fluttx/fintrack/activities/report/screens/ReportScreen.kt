package com.fluttx.fintrack.activities.report.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.fluttx.fintrack.activities.report.components.CenterStatsCard
import com.fluttx.fintrack.activities.report.components.GradientHeader
import com.fluttx.fintrack.domain.BudgetDomain

@Composable
fun ReportScreen(
    budgets: List<BudgetDomain>,
    onBack: () -> Unit,
) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (scrollRef, bottomBarRef) = createRefs()
        ReportContent(
            budgets = budgets,
            modifier = Modifier.constrainAs(scrollRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            onBack = onBack,
        )
    }
}

@Composable
fun ReportContent(
    budgets: List<BudgetDomain>,
    modifier: Modifier = Modifier,
    onBack: () -> Unit,
) {
    LazyColumn(
        modifier = modifier.background(Color.White)
    ) {
        item {
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(420.dp)
            ) {
                val (header, card) = createRefs()

                GradientHeader(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .constrainAs(header) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        },
                    onBack = onBack,
                )

                CenterStatsCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(horizontal = 24.dp)
                        .constrainAs(card) {
                            top.linkTo(header.bottom)
                            bottom.linkTo(header.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                )
            }
        }
    }
}

@Preview
@Composable
fun ReportScreenPreview() {
    val budgets = listOf(
        BudgetDomain(title = "Groceries", price = 150.0, percent = 30.0),
        BudgetDomain(title = "Entertainment", price = 100.0, percent = 20.0),
        BudgetDomain(title = "Utilities", price = 75.0, percent = 15.0)
    )
    ReportScreen(
        budgets = budgets,
        onBack = {}
    )
}