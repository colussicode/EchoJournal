package com.example.echojournal.repository

import com.example.echojournal.domain.Entry

interface IEntriesRepository {
    suspend fun getEntries(): List<Entry>
    suspend fun addEntry()
}