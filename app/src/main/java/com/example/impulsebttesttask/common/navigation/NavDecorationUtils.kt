package com.example.impulsebttesttask.common.navigation

fun String.decorateWithArgument(arg: String): String =
    buildString {
        append(
            this@decorateWithArgument,
            ROUTE_WITH_ARG_DIVIDER,
            ARGUMENT_FRAME_START_SYMBOML,
            arg,
            ARGUMENT_FRAME_END_SYMBOML
        )
    }

fun Screen.decorateWithArgument(arg: String) =
    routeId.decorateWithArgument(arg)

private const val ROUTE_WITH_ARG_DIVIDER = "/"
private const val ARGUMENT_FRAME_START_SYMBOML = "{"
private const val ARGUMENT_FRAME_END_SYMBOML = "}"
