package com.example.accountstatements.models

data class Statement(
    var type: Type,
    var amount: Double,
    var balance: Double,
    val accountNumber: Int,
    val date: String
)
