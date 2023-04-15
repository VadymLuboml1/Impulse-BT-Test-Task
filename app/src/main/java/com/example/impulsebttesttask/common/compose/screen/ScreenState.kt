package com.example.impulsebttesttask.common.compose.screen

import androidx.compose.runtime.Stable

@Stable
data class ScreenState<out CONTENT, out ERROR>(
    val content: CONTENT? = null,
    val isLoading: Boolean = false,
    val error: ERROR? = null,
) {

    fun content(contentChanging: CONTENT.() -> @UnsafeVariance CONTENT): ScreenState<CONTENT, ERROR> =
        copy(
            content = content?.contentChanging(),
            isLoading = false,
            error = null,
        )

    fun loading(show: Boolean = true): ScreenState<CONTENT, ERROR> =
        copy(
            isLoading = show,
            error = null,
        )

    fun error(errorChanging: ERROR.() -> @UnsafeVariance ERROR): ScreenState<CONTENT, ERROR> =
        copy(
            isLoading = false,
            error = error?.errorChanging(),
        )

    companion object {
        fun <C, E> initialWithLoading() = ScreenState<C, E>(isLoading = true)
    }
}
