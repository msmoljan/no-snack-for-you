package io.smoljan.apps.nosnackforyou.domain

data class FastingInterval(
    val startTimeOfDay: Time,
    val endTimeOfDay: Time
)