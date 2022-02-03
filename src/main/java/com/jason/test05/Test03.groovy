package com.jason.test05

final String xml = '''
<students>
    <student id="1">
        <name>张三</name>
        <age>18</age>
        <sex>男</sex>
        <score>98</score>
    </student>
    <student id="2">
        <name>李四</name>
        <age>21</age>
        <sex>女</sex>
        <score>93</score>
    </student>
    <student id="3">
        <name>王五</name>
        <age>19</age>
        <sex>女</sex>
        <score>89</score>
    </student>
</students>
'''

def xs = new XmlSlurper()
def students = xs.parseText(xml)
println students.student[0].name.text()

println students.student[1].@id

println '-------------------------------------------------------'

def list = []
students.student.each {
    it->list.add(it.name.text() + "---" + it.age.text())
}

println list.toListString()