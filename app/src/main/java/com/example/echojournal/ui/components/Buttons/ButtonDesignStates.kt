package com.example.echojournal.ui.components.Buttons

import androidx.compose.ui.graphics.Color

data class ButtonDesignStates<T>(
    var pressedBrush: T,
    var defaultBrush: T,
    var disabledColor: Color,
) {
    fun pressedState(isPressed: Boolean): T = if (isPressed) pressedBrush else defaultBrush
}