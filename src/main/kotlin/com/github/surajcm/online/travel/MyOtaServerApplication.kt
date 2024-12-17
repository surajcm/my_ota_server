package com.github.surajcm.online.travel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyOtaServerApplication

fun main(args: Array<String>) {
	runApplication<MyOtaServerApplication>(*args)
}
