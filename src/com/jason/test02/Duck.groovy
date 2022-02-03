package com.jason.test02

class Duck implements Swimming , Flying{

    @Override
    void drink() {
        println '游泳的时候喝到水'
    }
}
