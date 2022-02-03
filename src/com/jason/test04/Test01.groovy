package com.jason.test04

Person.metaClass.sex = "女"
def p = new Person(name: "丽丽", age: 19)
p.sex = "男"
println p.sex

Person.metaClass.setNameUpperCase = { -> name.toUpperCase() }
def p2 = new Person(name: "abcdef", age: 19)
println p2.setNameUpperCase()

Person.metaClass.static.setNameLowerCase = {String name -> name.toLowerCase() }
println Person.setNameLowerCase("ABCDEF")
