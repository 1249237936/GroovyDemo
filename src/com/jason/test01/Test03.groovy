package com.jason.test01

def str1 = "higroovy"
println "字符串的长度：" + str1.length()
println "字符串是否为空：" + str1.isEmpty()

def str2 = "higroovy"
println "判断两个字符串是否相等：" + str1.equals(str2)
println "字符串从固定位置截取：" + str1.substring(3)
println "字符串从固定位置截取：" + str1.substring(2, 4)
println "替换字符串为新字符串：" + str1.replace('o', '0')

def str3 = "a-b-c-d-e-f"
def split = str3.split("-")
println "按照指定的字符串进行分裂为数组的形式：" + split

def str4 = "higroovy"
println "转大写字母：" + str4.toUpperCase()
println "转小写字母：" + str4.toUpperCase().toLowerCase()

def str5 = "    hi groovy   "
println "去除首尾空格：" + str5.trim()

def str6 = "a"
def str7 = "b"
println "字符串的比较：" + str6.compareTo(str7)