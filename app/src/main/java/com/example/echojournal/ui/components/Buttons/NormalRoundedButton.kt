package com.example.echojournal.ui.components.Buttons

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.example.echojournal.ui.theme.buttonStyle
import com.example.echojournal.ui.theme.onPrimaryVariant
import com.example.echojournal.ui.theme.primary
import com.example.echojournal.ui.theme.primary95

data class NormalRoundedButton(
    val state: ButtonDesignStates<Color> = ButtonDesignStates(
        primary95,
        primary95,
        primary95
    ),
    override val tintColorState: ButtonDesignStates<Color> = ButtonDesignStates(
        disabledColor = onPrimaryVariant,
        defaultBrush = primary,
        pressedBrush = onPrimaryVariant
    ),
    override val titleText: String? = null,
    override val textStyle: TextStyle = buttonStyle.labelMedium,
    override val icon: Int? = null,
) : ButtonFormat {
    override fun getStateBrush(): ButtonDesignStates<Brush>? = null

    override fun getStateColor(): ButtonDesignStates<Color> = state
}