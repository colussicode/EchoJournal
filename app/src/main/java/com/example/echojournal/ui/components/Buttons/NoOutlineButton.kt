package com.example.echojournal.ui.components.Buttons

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.example.echojournal.R
import com.example.echojournal.ui.theme.buttonStyle
import com.example.echojournal.ui.theme.onPrimaryVariant
import com.example.echojournal.ui.theme.primary

data class NoOutlineButton(
    val state: ButtonDesignStates<Color> = ButtonDesignStates(
        Color.Transparent,
        Color.Transparent,
        Color.Transparent
    ),
    override val tintColorState: ButtonDesignStates<Color> = ButtonDesignStates(
        primary,
        onPrimaryVariant,
        primary
    ),
    override val titleText: String? = null,
    override val textStyle: TextStyle = buttonStyle.labelSmall,
    override val icon: Int? = R.drawable.icon_add,
) : ButtonFormat {
    override fun getStateBrush(): ButtonDesignStates<Brush>? = null
    override fun getStateColor(): ButtonDesignStates<Color> = state
}