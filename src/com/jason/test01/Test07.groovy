package com.jason.test01

def c = { return "hi ${it}" }
def result = c.call('groovy')
println result
//c()