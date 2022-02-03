package com.jason.test01

class A {
    String name
    def ac = {
        "name = ${name}"
    }

    String toString() {
        ac.call()
    }
}

class B {
    String name
}

def a = new A(name: "丽丽")
def b = new B(name: "菲菲")

a.ac.delegate = b
a.ac.resolveStrategy = Closure.DELEGATE_FIRST
println a.toString()