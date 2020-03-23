package io.smoljan.apps.nosnackforyou.domain.ports

import io.smoljan.apps.nosnackforyou.domain.FastingInterval

interface FastingIntervalRepository {
    fun set(interval: FastingInterval)
    fun get(): FastingInterval?
    fun clear()
}