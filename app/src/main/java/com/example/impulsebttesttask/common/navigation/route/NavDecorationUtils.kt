package com.example.impulsebttesttask.common.navigation.route

fun String.decorateWithArgument(argName: String, argValue: Any): String =
    buildString {
        append(
            this@decorateWithArgument,
            ARG_NAME_PREFIX,
            argName,
            ARG_NAME_SUFFIX,
            ARGUMENT_VALUE_START_SYMBOML,
            argValue,
            ARGUMENT_VALUE_END_SYMBOML
        )
    }

fun Screen.decorateWithArgument(argName: String, argValue: Any) =
    routeId.decorateWithArgument(argName, argValue)

private const val ARG_NAME_PREFIX = "?"
private const val ARG_NAME_SUFFIX = "="
private const val ARGUMENT_VALUE_START_SYMBOML = "{"
private const val ARGUMENT_VALUE_END_SYMBOML = "}"
