package com.example.hilt_framework.di

import com.example.hilt_framework.data.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface FragmentModule {

    @Binds
    @Singleton
    @MainAPI
    fun provideAPI(api: APIImpl): API

    @Binds
    @Singleton
    @AnotherAPI
    fun provideAnotherAPI(api: AnotherAPIImpl): API

    @Binds
    @Singleton
    fun provideDB(db: DBImpl): DB
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MainAPI

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AnotherAPI
