package com.jason.test02

class Student {
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
}
