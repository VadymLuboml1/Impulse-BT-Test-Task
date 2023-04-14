package com.example.impulsebttesttask.common.compose.elements.gab

import androidx.compose.ui.unit.Dp
import com.example.impulsebttesttask.common.theme.Dimens

enum class GabType(
    val horizontalPaddings: Dp,
) {
    SHORT(
        horizontalPaddings = Dimens.gabShortHorizontalPadding,
    ),
    LONG(
        horizontalPaddings = Dimens.gabLongHorizontalPadding,
    )
}
