package com.example.impulsebttesttask.common.compose.background

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.impulsebttesttask.R

@Composable
fun MainBackgroundContainer(content: @Composable BoxScope.() -> Unit) {
    Image(
        painter = painterResource(R.drawable.main_background),
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.FillHeight,
        contentDescription = null
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        content()
    }
}
