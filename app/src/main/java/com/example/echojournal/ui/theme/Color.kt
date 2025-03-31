package com.example.echojournal.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

const val longColor = 0xFF //for opacity purposes replace FF with number ex 0x80

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val surface = Color(0xFFFFFFFF)
val surfaceVariant = Color(0xFFE1E2EC)
val inverseOnSurface = Color(0xFFEEF0FF)
val onSurface = Color(0xFF191A20)
val onSurfaceVariant = Color(0xff40434F)
val outline = Color(0xff6C7085)
val outlineVariant = Color(0xffC1C3CE)
val primary = Color(0xff00419C)
val primaryContainer = Color(0xff1F70F5)
val onPrimary = surface
val onPrimaryFixed = Color(0xff001945)
val onInversePrimary = Color(0xffBAC6E9)
val onSecondary = Color(0xff3B4663)
val secondaryContainer = Color(0xff6B7796)
val surfaceTint12 = Color.hsl(222f, 0.35f, 0.43f, 0.12f)
val surfaceTint15 = Color.hsl(222f, 0.35f, 0.43f, 0.05f)
val background = Color(0xffFCFDFE)
val onErrorContainer = Color(0xff680014)
val errorContainer = Color(0xffFFEDEC)
val onError = surface

val primary10 = Color(0xff001945)
val primary30 = Color(0xff00419C)
val primary40 = Color(0XFF0057CC)
val primary50 = Color(0xff1F70F5)
val primary60 = Color(0xff578CFF)
val primary90 = Color(0xffD9E2FF)
val primary95 = Color(0xffEEF0FF)
val primary100 = surface
val secondary30 = Color(0xff3B4663)
val secondary50 = Color(0xff6B7796)
val secondary70 = Color(0xff9FABCD)
val secondary80 = Color(0xffBAC6E9)
val secondary90 = Color(0xffD9E2FF)
val secondary95 = Color(0xffEEF0FF)
val neutralVariant10 = Color(0xff191A20)
val neutralVariant30 = Color(0xff40434F)
val neutralVariant50 = Color(0xff6C7085)
val neutralVariant80 = Color(0xffC1C3CE)
val neutralVariant90 = Color(0xffE0E1E7)
val neutralVariant99 = Color(0xffFCFDFE)
val error20 = Color(0xff680014)
val error95 = Color(0xffFFEDEC)
val error100 = surface

// Moods

val stressed25 = Color(0xffF8EFEF)
val stressed35 = Color(0xffE9C5C5)
val stressed80 = Color(0xffDE3A3A)
val stressed95 = Color(0xff6B0303)
val sad25 = Color(0xffEFF4F8)
val sad35 = Color(0xffC5D8E9)
val sad80 = Color(0xff3A8EDE)
val sad95 = Color(0xff004585)
val neutral25 = Color(0xffEEF7F3)
val neutral35 =Color(0xffB9DDCB)
val neutral80 = Color(0xff41B278)
val neutral95 = Color(0xff0A5F33)
val peaceful25 = Color(0xffF6F2F5)
val peaceful35 = Color(0xffE1CEDB)
val peaceful80 = Color(0xffBE3294)
val peaceful95 = Color(0xff6C044D)
val excited25 = Color(0xffF5F2EF)
val excited35 = Color(0xffDDD2C8)
val excited80 = Color(0xffDB6C0B)
val excited95 = Color(0xff723602)

//Gradients
val bg = Brush.linearGradient(
    listOf(
        Color.White,
        secondary90,
        secondary95
    )
)

val button = Brush.linearGradient(
    listOf(
        primary60,
        primary50
    )
)

val buttonPressed = Brush.linearGradient(
    listOf(
        primary60,
        primary40
    )
)
val stressedGradient = Brush.linearGradient(
    listOf(
        Color(0xffF69193),
        stressed80
    )
)

val sadGradient = Brush.linearGradient(
    listOf(
        Color(0xff7BBCFA),
        Color(0xff2993F7)
    )
)

val neutralGradient = Brush.linearGradient(
    listOf(
        Color(0xffC4F3DB),
        Color(0xff71EBAC)
    )
)
val peacefulGradient = Brush.linearGradient(
    listOf(
        Color(0xffFCCDEE),
        Color(0xffF991E0)
    )
)
val excitedGradient = Brush.linearGradient(
    listOf(
        Color(0xffF5CB6F),
        Color(0xff)
    )
)