package com.joggingapp.di

import android.content.Context
import androidx.room.Room
import com.joggingapp.db.JoggingDatabase
import com.joggingapp.other.Constants.JOGGING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        JoggingDatabase::class.java,
        JOGGING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: JoggingDatabase) = db.getRunDao()
}