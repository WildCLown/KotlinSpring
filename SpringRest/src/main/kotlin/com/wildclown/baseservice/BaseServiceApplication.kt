package com.wildclown.baseservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BaseServiceApplication

fun main(args: Array<String>){
    runApplication<BaseServiceApplication>(*args)
}