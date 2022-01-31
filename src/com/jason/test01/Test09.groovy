package com.jason.test01

def s = "hi groovy 2023"
println s.each{ println it}

println s.find {it.isNumber()}

def list = s.findAll {it.isNumber()}
println list.toListString()

println s.any {it.isNumber()}

println s.every {it.isNumber()}

def list2 = s.collect {it.toUpperCase()}
println list2.toListString()