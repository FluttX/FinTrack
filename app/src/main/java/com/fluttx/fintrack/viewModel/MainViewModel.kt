package com.fluttx.fintrack.viewModel

import androidx.lifecycle.ViewModel
import com.fluttx.fintrack.repository.MainRepository

class  MainViewModel(val repository: MainRepository): ViewModel() {
    constructor(): this(MainRepository())

    fun loadData() = repository.items
}