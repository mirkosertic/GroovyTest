package de.mirkosertic.groovy

class HelloWorld {

    final String name;

    HelloWorld(aName) {
        this.name = aName
    }

    static void main(String[] args) {

        def test = new HelloWorld("Mirko")

        println test.getName()
    }
}
