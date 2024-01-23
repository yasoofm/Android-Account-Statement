package com.example.accountstatements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.accountstatements.models.Type
import com.example.accountstatements.ui.theme.AccountStatementsTheme

@Composable
fun AccountStatement(amount: Double, balance: Double, accountNumber: Int,
                     date: String, type: Type,modifier: Modifier = Modifier
                     ) {
    Column(modifier = modifier
        .fillMaxWidth()
        .background(Color.Cyan)
        .padding(8.dp),
        ) {
        Text(text = "Type: $type")
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Amount: $amount")
            Text(text = "Balance: $balance")
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Account Number: $accountNumber")
            Text(text = "Date: $date")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun AccountStatementPreview() {
    AccountStatementsTheme {
        AccountStatement(type = Type.DEPOSIT, amount = 50.5, balance = 999.9, accountNumber = 1234, date = "1/1/2023")
    }
}