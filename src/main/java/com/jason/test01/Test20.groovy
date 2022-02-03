package com.jason.test01

def r = 2..5
println r.size()

def r2 = 3..<8
println r2.size()

println r[1]

println r.contains(4)

println r2.from
println r2.to

println "==============="
r.each {println it}
println "==============="

for (ele in r2) {
    println ele
}