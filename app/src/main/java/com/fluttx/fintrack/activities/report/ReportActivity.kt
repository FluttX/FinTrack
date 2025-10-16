package com.fluttx.fintrack.activities.report

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.fluttx.fintrack.activities.report.screens.ReportScreen
import com.fluttx.fintrack.viewModel.MainViewModel

class ReportActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReportScreen(
                budgets = mainViewModel.loadBudgets(),
                onBack = { finish() }
            )
        }
    }
}