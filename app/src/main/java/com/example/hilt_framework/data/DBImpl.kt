package com.example.hilt_framework.data

import javax.inject.Inject

class DBImpl @Inject constructor(): DB {

    override fun getData(): String {
        return "Data from DB \nDB: $this"
    }
}