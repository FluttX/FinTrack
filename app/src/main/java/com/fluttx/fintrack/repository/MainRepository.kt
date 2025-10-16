package com.fluttx.fintrack.repository

import com.fluttx.fintrack.domain.BudgetDomain
import com.fluttx.fintrack.domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Breakfast", 220.0, "restaurant", "17th June 2025, 08:00 AM"),
        ExpenseDomain("Burger", 220.0, "mcdonald", "18th June 2025, 09:30 AM"),
        ExpenseDomain("Movie Ticket", 220.0, "cinema", "20th June 2025, 01:34 PM"),
        ExpenseDomain("Restaurant", 220.0, "restaurant", "25th June 2025, 05:43 PM"),
        ExpenseDomain("Dinner", 220.0, "mcdonald", "30th June 2025, 10:00 PM"),
    )

    val budgets = mutableListOf(
        BudgetDomain("Food", 1000.0, 50.0),
        BudgetDomain("Food", 1000.0, 50.0),
        BudgetDomain("Food", 1000.0, 50.0),
        BudgetDomain("Food", 1000.0, 50.0),
    )
}