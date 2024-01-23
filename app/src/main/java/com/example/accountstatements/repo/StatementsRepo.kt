package com.example.accountstatements.repo

import com.example.accountstatements.models.Statement
import com.example.accountstatements.models.Type

class StatementsRepo {
    companion object{
        var dummyStatementsList = listOf<Statement>(
            Statement(type = Type.DEPOSIT, amount = 55.2, balance = 199.9, accountNumber = 1234, date = "1/1/2024"),
            Statement(type = Type.WITHDRAW, amount = 431.2, balance = 654.9, accountNumber = 1234, date = "1/1/2024"),
            Statement(type = Type.DEPOSIT, amount = 12.2, balance = 43.9, accountNumber = 1234, date = "1/1/2024"),
            Statement(type = Type.DEPOSIT, amount = 99.2, balance = 421.9, accountNumber = 1234, date = "1/1/2024"),
            )
    }
}