package com.example.hilt_framework.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class APIImpl @Inject constructor(): API {
    override fun getDataFromNetwork(): String {
        return "Data from network \napi: $this"
    }
}