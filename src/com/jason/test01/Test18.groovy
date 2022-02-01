package com.jason.test01

def map = ['张三': ['score': 68, 'sex': '女'],
           '李四': ['score': 32, 'sex': '男'],
           '王五': ['score': 71, 'sex': '女'],
           '朱六': ['score': 74, 'sex': '男']]

println map.find { it.value.score > 70 }
println map.findAll { it.value.score > 70 }

println map.count { it.value.score > 60 && it.value.sex == '女' }

println map.findAll { it.value.score > 70 }
        .collect { it.key }

println map.groupBy { it.value.score >= 60 ? '及格' : '不及格' }
