package io.smoljan.apps.nosnackforyou.domain.ports

import io.smoljan.apps.nosnackforyou.domain.FastingInterval

interface FastingIntervalUpdater {
    fun update(fastingInterval: FastingInterval)
}