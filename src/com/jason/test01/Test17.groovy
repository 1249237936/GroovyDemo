package com.jason.test01

def map = ['张三'    : 1001,
           '李四'    : 2003,
           '王五'    : 9006,
           '朱六'    : 9005,
           'newMap': ['x': 1, 'y': 2]]

map.each { println it.key + "----" + it.value }
map.each { key, value -> println key + "----" + value }

map.eachWithIndex { Map.Entry<String, Serializable> entry, int index -> println entry.key + "----" + entry.value + "----" + index }

map.eachWithIndex { key, value, index -> println key + "----" + value + "----" + index }
