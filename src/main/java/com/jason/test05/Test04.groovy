package com.jason.test05

import groovy.xml.MarkupBuilder

def s = new StringWriter()

def mb = new MarkupBuilder(s)

mb.students() {
    student(id:'1') {
        name(a:'1', '张三')
        age(18)
        sex('男')
        score('98')
    }
    student(id:'1') {
        name('李四')
        age(){
            va('21')
        }
        sex('男')
        score('93')
    }
}

println s