package com.example.hilt_framework.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hilt_framework.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    val dataText: LiveData<String>
        get() = _dataText
    private val _dataText = MutableLiveData("Initial data")

    fun getDataFromDB() {
        _dataText.value = repository.getDataFromDB()
    }

    fun getDataFromNetwork() {
        _dataText.value = repository.getDataFromNetwork()
    }

    fun getDataFromAnotherNetwork() {
        _dataText.value = repository.getDataFromAnotherNetwork()
    }
}