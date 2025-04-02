package com.example.echojournal.ui.components.Buttons

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.example.echojournal.R
import com.example.echojournal.ui.theme.button
import com.example.echojournal.ui.theme.buttonPressed
import com.example.echojournal.ui.theme.buttonStyle
import com.example.echojournal.ui.theme.onPrimary
import com.example.echojournal.ui.theme.outline
import com.example.echojournal.ui.theme.surfaceVariant

data class IconRoundedButton(
    val buttonBrushState: ButtonDesignStates<Brush> = ButtonDesignStates(
        defaultBrush = button,
        pressedBrush = buttonPressed,
        disabledColor = surfaceVariant
    ),
    override val icon: Int = R.drawable.icon_check,
    override val tintColorState: ButtonDesignStates<Color> = ButtonDesignStates(
        defaultBrush = onPrimary,
        pressedBrush = onPrimary,
        disabledColor = outline
    ),
    override val titleText: String,
    override val textStyle: TextStyle = buttonStyle.labelLarge,
) : ButtonFormat {
    override fun getStateBrush(): ButtonDesignStates<Brush> = buttonBrushState

    override fun getStateColor(): ButtonDesignStates<Color>? = null
}