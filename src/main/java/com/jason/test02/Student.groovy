package com.jason.test02

class Student implements TestInterface {

    String name
    Integer age

    Student() {
    }

    Student(String name, Integer age) {
        this.name = name
        this.age = age
    }

    def m1() {
        '方法1'
    }

    def m2(param1, param2) {
        "方法2：${param1}-----${param2}"
    }

    static def m3() {
        '方法3'
    }

    @Override
    void a() {

    }

    @Override
    def b(Object param1) {
        return null
    }
}
