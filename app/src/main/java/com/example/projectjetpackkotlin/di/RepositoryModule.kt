package com.example.projectjetpackkotlin.di

import com.example.projectjetpackkotlin.model.User
import com.example.projectjetpackkotlin.respository.UserRepository
import com.example.projectjetpackkotlin.respository.UserRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Provides
    abstract fun userRepository(repo: UserRepositoryImp):UserRepository
}

