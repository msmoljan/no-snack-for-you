package io.smoljan.apps.nosnackforyou.domain

typealias Hour = Int
typealias Minute = Int

data class Time(
    val hour: Hour,
    val minute: Minute
)