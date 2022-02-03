package com.jason.test02

//def s1 = new Student()
//println s1

def s5 = new Student(name: "丽丽", age: 19)
println s5

println "学生的姓名是：${s5.name}，学生的年龄是：${s5.age}"
println "学生的姓名是：${s5.getName()}，学生的年龄是：${s5.getAge()}"



//def s6 = new Student(name: "丽丽")
//println s6
//
//def s2 = new Student("丽丽", 19)
//def s3 = ['娜娜', 17] as Student
//Student s4 = ['露露', 15]
//println s2
//println s3
//println s4

println s5.m1()
println s5.m2('张三','李四')
println Student.m3()