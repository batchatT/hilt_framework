package com.example.hilt_framework.data

interface Repository {

    fun getDataFromDB(): String

    fun getDataFromNetwork(): String

    fun getDataFromAnotherNetwork(): String
}