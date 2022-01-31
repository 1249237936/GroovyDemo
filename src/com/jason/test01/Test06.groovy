package com.jason.test01

for (def i = 1; i <= 10; i++) {
    println i
}

println "--------------------------------------"

for (i in 10..30) {
    println i
}

println "--------------------------------------"

for (i in [1, 2, 3, 4, 5]) {
    println i
}

println "--------------------------------------"

for (i in [1002: "张三", 2004: "李四", 9004: "赵六"]) {
    println i.key + " : " + i.value
}