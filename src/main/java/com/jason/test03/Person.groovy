package com.jason.test03

class Person {
    String name
    Integer age

    def eat() {
        return '可以吃饭'
    }

    @Override
    Object invokeMethod(String name, Object args) {
        println '调用了invokeMethod方法'
        return "当前这个方法是：${name}，当前方法的参数是：${args}"
    }

    def methodMissing(String name, Object args) {
        println '调用了methodMissing方法'
        return "当前这个方法是：${name}，当前方法的参数是：${args}"
    }
}
