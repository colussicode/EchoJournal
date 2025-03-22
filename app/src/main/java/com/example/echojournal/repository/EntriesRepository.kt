package com.example.echojournal.repository

import com.example.echojournal.di.IoDispatcher
import com.example.echojournal.domain.Entry
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class EntriesRepository @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    ): IEntriesRepository {
    override suspend fun getEntries(): List<Entry> {
        TODO("Not yet implemented")
    }

    override suspend fun addEntry() {

    }
}