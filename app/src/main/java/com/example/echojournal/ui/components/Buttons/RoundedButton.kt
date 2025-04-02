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
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.echojournal.R

@Composable
fun RoundedButton(
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
            shape = RoundedCornerShape(100.dp)
        )
        disabledModifier = Modifier.background(
            color = buttonState.getStateColor()!!.disabledColor,
            shape = RoundedCornerShape(100.dp)
        )
    } else {
        enabledModifier = Modifier.background(
            brush = brush!!,
            shape = RoundedCornerShape(100.dp)
        )
        disabledModifier = Modifier.background(
            color = buttonState.getStateBrush()!!.disabledColor,
            shape = RoundedCornerShape(100.dp)
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
        horizontalArrangement = Arrangement.Center
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
        buttonState.titleText?.let {
            Text(
                text = it,
                style = buttonState.textStyle.copy(tintColor)
            )
        }
    }
}

@Preview
@Composable
fun PreviewRoundedButton() {
    MaterialTheme {
        val context = LocalContext.current
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            RoundedButton(
                enabled = false,
                action = { Toast.makeText(context, "Pressed", Toast.LENGTH_LONG).show() },
                buttonState = IconRoundedButton(titleText = "Confirm")
            )
            Spacer(Modifier.height(50.dp))
            RoundedButton(
                buttonState = NormalRoundedButton(titleText = "Confirm"),
                action = { Toast.makeText(context, "Pressed", Toast.LENGTH_LONG).show() },
                enabled = false
            )
            Spacer(Modifier.height(50.dp))

            RoundedButton(
                action = { Toast.makeText(context, "Pressed", Toast.LENGTH_LONG).show() },
                buttonState = IconRoundedButton(titleText = "Cancel"),
                enabled = true
            )
            Spacer(Modifier.height(50.dp))

            RoundedButton(
                action = { Toast.makeText(context, "Pressed", Toast.LENGTH_LONG).show() },
                buttonState = IconRoundedButton(icon = R.drawable.icon_settings),
                enabled = true
            )
            Spacer(Modifier.height(50.dp))
        }
    }
}