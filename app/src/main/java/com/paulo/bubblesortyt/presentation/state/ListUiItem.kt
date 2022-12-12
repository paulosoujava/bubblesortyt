package com.paulo.bubblesortyt.presentation.state

import androidx.compose.ui.graphics.Color

data class ListUiItem(
    val id: Int,
    val isCurrentCompared:Boolean,
    val value:Int,
    val color:Color
)