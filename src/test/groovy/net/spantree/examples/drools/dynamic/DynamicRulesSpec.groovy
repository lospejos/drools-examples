package net.spantree.examples.drools.dynamic

import org.drools.core.definitions.rule.impl.RuleImpl
import org.kie.api.KieServices
import org.kie.api.definition.rule.Rule
import spock.lang.Specification

import java.awt.Color
import java.time.ZonedDateTime

class DynamicRulesSpec extends Specification {


    def "Should add points for order"() {
        setup: "Dynamically create rules and test data"

        // TODO: setup rules
        KieServices kieServices = KieServices.Factory.get()


        Rule rule = new RuleImpl("Add points for Order")


        // TODO setup common
        Prod samsungGalaxyS2Black = new Prod(brand: Brand.SAMSUNG, name: "Galaxy S2", color: Color.BLACK)
        Prod samsungGalaxyS2White = new Prod(brand: Brand.SAMSUNG, name: "Galaxy S2", color: Color.WHITE)
        Prod lgG4Gray = new Prod(brand: Brand.LG, name: "G4", color: Color.GRAY)

        // TODO: prepare order
        Customer customer = new Customer(name: "Customer")
        IEventData orderEventData = new OrderEventData(
                customer: customer,
                dateTime: ZonedDateTime.now(),
                orderItems: [
                        new OrderItem(id: 1, product: samsungGalaxyS2Black, price: 1_000, count: 2, amount: 1_000*2),
                        new OrderItem(id: 2, product: samsungGalaxyS2White, price: 1_100, count: 1, amount: 1_100*1)
                ]
        )

        Event orderEvent = new Event(
                timestamp: ZonedDateTime.now(),
                type: EventType.ORDER,
                eventData: orderEventData
        )

        when: "Test order is processed"



        then: "Customer has correct points and tier"



    }
}
