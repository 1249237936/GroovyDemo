package com.jason.test05

import com.google.gson.Gson

def p = new Person(name:"lili",age: 19)

def gson = new Gson()
println gson.toJson(p)

def p2 = gson.fromJson('{"name":"lili","age":19}', Person.class)
println p2