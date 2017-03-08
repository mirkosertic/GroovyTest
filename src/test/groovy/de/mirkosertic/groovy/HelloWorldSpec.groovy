package de.mirkosertic.groovy

import spock.lang.Specification

class HelloWorldSpec extends Specification {

    def "Get the same name from the object"() {
        setup:
            def to = new HelloWorld("Name")
        expect:
            to.getName() == "Name"
    }
}
