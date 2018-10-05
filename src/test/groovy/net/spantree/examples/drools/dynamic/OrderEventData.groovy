package net.spantree.examples.drools.dynamic

import java.time.ZonedDateTime

class OrderEventData extends BaseEventData {
    Customer customer
    ZonedDateTime dateTime
    List<OrderItem> orderItems
}
