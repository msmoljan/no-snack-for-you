package io.smoljan.apps.nosnackforyou.domain

import io.smoljan.apps.nosnackforyou.domain.events.DomainEvent

interface DomainEventSubscriber {
    fun onDomainEventReceived(event: DomainEvent)
}

class DomainEventBus {

    private val subscribers: MutableSet<DomainEventSubscriber> = mutableSetOf()

    fun subscribe(subscriber: DomainEventSubscriber) {
        subscribers.add(subscriber)
    }

    fun unsubscribe(subscriber: DomainEventSubscriber) {
        subscribers.remove(subscriber)
    }

    fun publish(event: DomainEvent) {
        subscribers.forEach { subscriber ->
            subscriber.onDomainEventReceived(event)
        }
    }
}