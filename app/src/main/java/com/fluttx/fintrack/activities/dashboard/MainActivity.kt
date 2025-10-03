package com.fluttx.fintrack.activities.dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.fluttx.fintrack.activities.dashboard.screens.MainScreen
import com.fluttx.fintrack.ui.theme.FinTrackTheme
import com.fluttx.fintrack.viewModel.MainViewModel

class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinTrackTheme {
                MainScreen(
                    expenses = mainViewModel.loadData(),
                    onCardClick = {},
                )
            }
        }
    }
}
