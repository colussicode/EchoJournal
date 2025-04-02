package com.example.echojournal.ui.components.Buttons

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NoOutlineButton(
    modifier: Modifier = Modifier,
    action: () -> Unit,
    buttonState: ButtonFormat,
    enabled: Boolean = false
) {
    val clickStatus = remember {
        MutableInteractionSource()
    }
    val isPressed = clickStatus.collectIsPressedAsState().value
    val brush = buttonState.getStateBrush()?.pressedState(isPressed)
    val color = buttonState.getStateColor()?.pressedState(isPressed)
    val enabledModifier: Modifier
    val disabledModifier: Modifier
    val tintColor = if (enabled) {
        buttonState.tintColorState.pressedState(isPressed)
    } else {
        buttonState.tintColorState.disabledColor
    }
    if (color != null) {
        enabledModifier = Modifier.background(
            color = color,
        )
        disabledModifier = Modifier.background(
            color = buttonState.getStateColor()!!.disabledColor,
        )
    } else {
        enabledModifier = Modifier.background(
            brush = brush!!,
        )
        disabledModifier = Modifier.background(
            color = buttonState.getStateBrush()!!.disabledColor,
        )
    }

    Row(
        modifier = modifier
            .then(if (enabled) enabledModifier else disabledModifier)
            .height(44.dp)
            .width(180.dp)
            .clickable(
                interactionSource = clickStatus,
                null,
                enabled = enabled
            ) {
                action()
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {

        buttonState.icon?.let {
            Icon(
                painter = painterResource(it),
                contentDescription = "",
                modifier = Modifier.size(18.dp),
                tint = tintColor
            )

            Spacer(Modifier.width(6.dp))
        }
        Text(
            text = buttonState.titleText,
            style = buttonState.textStyle.copy(tintColor)
        )
    }
}

@Preview
@Composable
fun PreviewNoOutlineButton() {
    MaterialTheme {
        val context = LocalContext.current
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NoOutlineButton(
                enabled = true,
                action = { Toast.makeText(context, "Pressed", Toast.LENGTH_LONG).show() },
                buttonState = NoOutlineButton(titleText = "Confirm", icon = null)
            )
            Spacer(Modifier.height(50.dp))

            NoOutlineButton(
                enabled = false,
                action = { Toast.makeText(context, "Pressed", Toast.LENGTH_LONG).show() },
                buttonState = NoOutlineButton(titleText = "Create ´Jack´")
            )
            Spacer(Modifier.height(50.dp))

            NoOutlineButton(
                enabled = true,
                action = { Toast.makeText(context, "Pressed", Toast.LENGTH_LONG).show() },
                buttonState = NoOutlineButton(titleText = "Create ´Jack´")
            )
        }
    }
}