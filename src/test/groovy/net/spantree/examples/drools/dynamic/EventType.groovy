package net.spantree.examples.drools.dynamic

enum EventType {

    ORDER("Order"),
    CUSTOMER_REGISTERED("CustomerRegistered"),
    WEB_LIKE("WebLike")

    private final String value
    private static Map<String, EventType> constants = new HashMap<>()



    private EventType(final String value) {
        this.value = value
    }

    @Override
    String toString() {
        return this.value
    }

    static EventType fromValue(String value) {
        EventType constant = constants.get(value)
        if (constant == null) {
            throw new IllegalArgumentException(value)
        } else {
            return constant
        }
    }

    static {
        for (EventType c : values()) {
            constants.put(c.value, c)
        }
    }

}