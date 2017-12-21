package com.example.kotlinstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong

@SpringBootApplication
class KotlinStudyApplication

fun main(args: Array<String>) {
    runApplication<KotlinStudyApplication>(*args)
}


@RestController
class UserController{
    val counter = AtomicLong()


    @GetMapping("/user")
    fun getUsers(@RequestParam(value = "name", defaultValue = "World") name: String ) = User(counter.incrementAndGet(), "hello, $name")
}
