package com.jason.test01

def map = ['张三': ['score': 68, 'sex': '女'],
           '李四': ['score': 32, 'sex': '男'],
           '王五': ['score': 71, 'sex': '女'],
           '朱六': ['score': 74, 'sex': '男']]

def newMap = map.sort { stu1, stu2 ->
    def score1 = stu1.value.score
    def score2 = stu2.value.score
    return score1 == score2 ? 0 : score1 < score2 ? 1 : -1
}
println newMap