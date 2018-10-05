package net.spantree.examples.drools.dynamic

class BaseEventData implements IEventData {
    String uid = UUID.randomUUID().toString()
}
