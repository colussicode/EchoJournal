package com.example.echojournal.di

import com.example.echojournal.repository.EntriesRepository
import com.example.echojournal.repository.IEntriesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class IoDispatcher

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class MainDispatcher

@Module
@InstallIn(SingletonComponent::class)
object Singleton {
    @Provides
    @IoDispatcher
    fun providesIODispatcher(): CoroutineDispatcher = Dispatchers.IO

    @Provides
    @MainDispatcher
    fun providesMainDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @Provides
    fun bindEntriesRepository(impl: EntriesRepository): IEntriesRepository = impl
}

//TODO Quando estiver operacional neste caso gostaria de testar ambos os casos
/**
@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class DiModule {
@Binds
abstract fun bindEntriesRepository(impl: EntriesRepository): IEntriesRepository
} */