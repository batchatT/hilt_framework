package com.example.hilt_framework.data

import javax.inject.Inject

class AnotherAPIImpl @Inject constructor(): API {

    override fun getDataFromNetwork(): String {
        return "Data from another network\napi: $this"
    }
}