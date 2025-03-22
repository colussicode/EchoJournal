package com.example.echojournal.domain

import java.sql.Timestamp

data class Entry(
    val id: Int,
    val title: String,
    val topics: List<Topic>?,
    val description: String,
    val moods: Mood,
    val duration: Long,
    val timeStamp: Timestamp,
)