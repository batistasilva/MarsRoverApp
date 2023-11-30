package com.example.mainrover.di

import android.content.Context
import com.example.mainrover.db.MarsRoverSavedDatabase
import com.example.mainrover.db.MarsRoverSavedPhotoDao
import com.example.mainrover.service.MarsRoverManifestService
import com.example.mainrover.service.MarsRoverPhotoService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideMarsRoverManifestService():
            MarsRoverManifestService = MarsRoverManifestService.create()

    @Provides
    fun provideMarsRoverPhotoService(): MarsRoverPhotoService =
        MarsRoverPhotoService.create()

    @Provides
    fun provideMarsRoverSavedPhotoDao(@ApplicationContext context: Context): MarsRoverSavedPhotoDao =
        MarsRoverSavedDatabase.getInstance(context).marsRoverSavedPhotoDao()
}