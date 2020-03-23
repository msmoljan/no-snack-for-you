package io.smoljan.apps.nosnackforyou.domain

import io.smoljan.apps.nosnackforyou.domain.ports.FastingIntervalRepository
import io.smoljan.apps.nosnackforyou.domain.ports.FastingIntervalUpdater

class FastingScheduler(
    private val fastingIntervalRepository: FastingIntervalRepository
): FastingIntervalUpdater {
    override fun update(fastingInterval: FastingInterval) {
        // Remove already scheduled messages
        // Store new notification time
        // Notify about new interval on the event bus
    }
}
