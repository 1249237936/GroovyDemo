package com.jason.test05

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def p = new Person(name: "lucy", age: 19)
println JsonOutput.toJson(p) //{"age":19,"name":"lucy"}

def list = [new Person(name: "lucy", age: 19), new Person(name: "lilei", age: 21), new Person(name: "lulu", age: 17)]
println JsonOutput.toJson(list) //[{"age":19,"name":"lucy"},{"age":21,"name":"lilei"},{"age":17,"name":"lulu"}]

def jsonStr = JsonOutput.toJson(list)
println JsonOutput.prettyPrint(jsonStr)

def str = '{"age":19,"name":"lucy"}'
def js = new JsonSlurper()
def p2 = (Person) (js.parseText(str))
println p2

def list2 = js.parseText('[{"age":19,"name":"lucy"},{"age":21,"name":"lilei"},{"age":17,"name":"lulu"}]')
println list2.class