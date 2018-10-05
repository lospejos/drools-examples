package net.spantree.examples.drools.dynamic

enum Brand {

    SAMSUNG("Samsung"), LG("LG"), HITACHI("Hitachi")

    private final String value
    private static Map<String, Brand> constants = new HashMap<>()



    private Brand(final String value) {
        this.value = value
    }

    @Override
    String toString() {
        return this.value
    }

    static Brand fromValue(String value) {
        Brand constant = constants.get(value)
        if (constant == null) {
            throw new IllegalArgumentException(value)
        } else {
            return constant
        }
    }

    static {
        for (Brand c : values()) {
            constants.put(c.value, c)
        }
    }
}
