package com.fluttx.fintrack.repository

import com.fluttx.fintrack.domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Air Ticket", 220.0, "img1", "17th June 2025, 08:00 AM"),
        ExpenseDomain("iPhone 17 Pro Max", 220.0, "img2", "18th June 2025, 09:30 AM"),
        ExpenseDomain("Bus Ticket", 220.0, "img3", "20th June 2025, 01:34 PM"),
        ExpenseDomain("Restaurant", 220.0, "img1", "25th June 2025, 05:43 PM"),
        ExpenseDomain("Dinner", 220.0, "img2", "30th June 2025, 10:00 PM"),
    )
}