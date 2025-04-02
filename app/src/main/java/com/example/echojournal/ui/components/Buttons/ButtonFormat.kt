package com.example.echojournal.ui.components.Buttons

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

interface ButtonFormat {
    val titleText: String
    val tintColorState: ButtonDesignStates<Color>
    val textStyle: TextStyle
    val icon: Int?
    fun getStateBrush(): ButtonDesignStates<Brush>?
    fun getStateColor(): ButtonDesignStates<Color>?
}