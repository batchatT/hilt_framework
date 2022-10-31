package com.example.hilt_framework.data

import com.example.hilt_framework.di.AnotherAPI
import com.example.hilt_framework.di.MainAPI
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val db: DB,
    @MainAPI
    private val api: API,
    @AnotherAPI
    private val anotherApi: API
) : Repository {
    override fun getDataFromDB(): String {
        return db.getData() + "\nrepo: $this"
    }

    override fun getDataFromNetwork(): String {
        return api.getDataFromNetwork() + "\nrepo: $this"
    }

    override fun getDataFromAnotherNetwork(): String {
        return anotherApi.getDataFromNetwork() + "\nrepo: $this"
    }
}