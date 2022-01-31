package com.jason.test01

def c1 = {
    println "c1-this: " + this
    println "c1-owner: " + owner
    println "c1-delegate: " + delegate
}

c1.call()

class Person {
    def static c2 = {
        println "c2-this: " + this
        println "c2-owner: " + owner
        println "c2-delegate: " + delegate
    }

    def static test() {
        def c3 = {
            println "c3-this: " + this
            println "c3-owner: " + owner
            println "c3-delegate: " + delegate
        }
        c3.call()
    }
}

Person.c2.call()

Person.test()

Person p = new Person()
def c4 = {
    def c5 = {
        println "c5-this: " + this
        println "c5-owner: " + owner
        println "c5-delegate: " + delegate
    }
    c5.delegate = p
    c5.call()
}

c4.call()