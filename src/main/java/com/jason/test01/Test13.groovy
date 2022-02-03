package com.jason.test01

def list = [1, 2, 3, 4, 5, 6]
list.add(7)
println list.toListString()
list.leftShift(8)
println list.toListString()
list << 9
println list.toListString()
def newList = list + 10
println newList.toListString()


def list2 = [1, 2, 3, 4, 5, 6]
list2.remove(3)
println list2.toListString()
list2.removeAt(0)
println list2.toListString()
list2.remove((Object) 5)
println list2.toListString()
list2.removeElement(6)
println list2.toListString()

def list3 = [1, 2, 3, 4, 5, 6]
list3.removeAll { it % 2 == 0 }
println list3.toListString()

def list4 = [1, 2, 3, 4, 5, 6]
def newlist = list4 - [4, 5, 6]
println newlist
