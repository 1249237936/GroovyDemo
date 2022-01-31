package com.jason.test01

def list = [-3, -1, 4, 0, 5, 2, -6]

println list.find { it % 2 == 0 }
println list.findAll { it % 2 == 0 }
println list.any { it % 2 == 0 }
println list.every { it % 2 == 0 }

println list.min()
println list.max()

println list.count {return it >= 0}