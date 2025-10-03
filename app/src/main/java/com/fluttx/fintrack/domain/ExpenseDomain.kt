package com.fluttx.fintrack.domain

import java.io.Serializable


data class ExpenseDomain(
    val title: String,
    val price: Double = 0.0,
    val picture: String = "",
    val time: String = "",
) : Serializable
