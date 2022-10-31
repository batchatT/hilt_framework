package com.example.hilt_framework.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hilt_framework.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondFragmentViewModel @Inject constructor(
    private val repo: Repository
    ): ViewModel() {

    val dataText: LiveData<String>
        get() = _dataText
    private val _dataText = MutableLiveData("Initial data")

    fun getDataFromNetwork() {
        _dataText.value = repo.getDataFromNetwork()
    }

    fun getDataFromDB() {
        _dataText.value = repo.getDataFromDB()
    }
}