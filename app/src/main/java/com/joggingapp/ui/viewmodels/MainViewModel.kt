package com.joggingapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.joggingapp.repositories.MainRepository

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
}