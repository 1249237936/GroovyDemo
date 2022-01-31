package com.jason.test01

def list = [-3, -1, 4, 0, 5, 2, -6]

list.sort()
println list

list.sort { num1, num2 -> num2 == num1 ? 0 : Math.abs(num1) < Math.abs(num2) ? -1 : 1 }
println list

def strlist = ['a', 'abcdef', 'abc', 'ab']
strlist.sort {return it.size()}
println strlist