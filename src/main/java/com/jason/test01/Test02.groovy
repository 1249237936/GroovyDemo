package com.jason.test01

def str1 = 'hi groo\nvy1'
println str1
println str1.class

def str2 = "hi groovy2"
println str2
println str2.class

def str3 = '''hi groovy3'''
println str3
println str3.class

def str4 = '''\
hi 
groovy4'''
println str4

def str5 = "groovy5"
def str6 = "hi ${str5}"
println str6
println str6.class

def str7 = "100 + 100 = ${100 + 100}"
println str7
println str7.class

def str8 = test(str6)
println str8
println str8.class

String test(String s) {
    return s
}