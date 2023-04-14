package com.example.impulsebttesttask.common.compose.elements.gab

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.impulsebttesttask.common.theme.Dimens
import com.example.impulsebttesttask.common.theme.TextSizes

@Composable
fun GameActionButton(
    @StringRes text: Int,
    modifier: Modifier,
    type: GabType,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(Dimens.gabHeight)
            .padding(horizontal = type.horizontalPaddings),
        shape = RoundedCornerShape(Dimens.gabRound),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.onPrimary),
        onClick = onClick,
    ) {
        Text(
            text = stringResource(text),
            fontSize = TextSizes.gabSize,
        )
    }
}
