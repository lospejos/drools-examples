package net.spantree.examples.drools.dynamic

import java.time.ZonedDateTime

class Event {
    ZonedDateTime timestamp
    EventType type
    IEventData eventData
}
