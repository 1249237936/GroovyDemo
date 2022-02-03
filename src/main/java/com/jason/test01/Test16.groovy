package com.jason.test01

//def hm = new HashMap()

def map = ['张三': 1001,
           '李四': 2003,
           '王五': 9006]
println map.toMapString()

map['朱六'] = 9005
println map.toMapString()

map.'刘七' = 7001
println map.toMapString()

map.'newMap' = ['x': 1, 'y': 2]
println map.toMapString()

def map2 = [张三: 1001,
           李四: 2003,
           王五: 9006]
println map2.toMapString()
println map2.getClass()

def map3 = [张三: 1001,
            李四: 2003,
            王五: 9006] as Hashtable
println map3.getClass()

Hashtable map4 = [张三: 1001,
            李四: 2003,
            王五: 9006]
println map4.getClass()