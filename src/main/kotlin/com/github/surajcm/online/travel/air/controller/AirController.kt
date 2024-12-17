package com.github.surajcm.online.travel.air.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AirController {
    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello World!"
    }
}