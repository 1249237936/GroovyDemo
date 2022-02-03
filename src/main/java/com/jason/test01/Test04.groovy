package com.jason.test01

def str1 = "higroovy"
println "以str1字符串为中心在两侧用空格进行填充为指定长度：" + str1.center(12)
println "以str1字符串为中心在两侧用空格进行填充为指定长度：" + str1.center(12, 'a')

println "在str1的左侧进行填充：" + str1.padLeft(10, 'a')
println "在str1的右侧进行填充：" + str1.padRight(10, 'a')

def str2 = "hellogroovy"
def str3 = "groovy"
println str2.minus(str3)

def str4 = 'higroovy'
println "字符串的逆序/倒叙：" + str4.reverse()

println "首字母大写：" + str4.capitalize()

def str5 = "123"
println "类型转换：" + str5.toBigInteger().class

def str6 = "a"
def str7 = "b"
println str6 > str7

def str8 = "groovy"
println str8[1]
println str8[2..3]

def str9 = "hellogroovy"
def str10 = "groovy"
println str9 - str10