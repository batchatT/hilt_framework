package com.example.hilt_framework.di

import com.example.hilt_framework.data.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
interface MainModule {

    @Binds
    @ViewModelScoped
    fun provideRepository(repo: RepositoryImpl): Repository
}