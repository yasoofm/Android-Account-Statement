package com.example.accountstatements

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.accountstatements.repo.StatementsRepo
import com.example.accountstatements.ui.theme.AccountStatementsTheme

class MainActivity : ComponentActivity() {
    val statementsList = StatementsRepo.dummyStatementsList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccountStatementsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn(){
                        items(statementsList){
                            AccountStatement(
                                type = it.type,
                                amount = it.amount,
                                balance = it.balance,
                                accountNumber = it.accountNumber,
                                date = it.date
                            )
                            Divider(color = Color.Black)
                        }
                    }
                }
            }
        }
    }
}

