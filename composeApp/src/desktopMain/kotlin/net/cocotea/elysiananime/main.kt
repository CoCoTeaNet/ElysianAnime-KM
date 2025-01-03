package net.cocotea.elysiananime

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ElysianAnime-KM",
    ) {
        App()
    }
}