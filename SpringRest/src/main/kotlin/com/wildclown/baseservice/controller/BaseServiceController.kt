package com.wildclown.baseservice.controller

import com.wildclown.baseservicedto.PingRequestDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/wcbase")
class BaseServiceController {

    @GetMapping("/ping")
    fun getPing(): String {
        return "pong"
    }

    @PostMapping("/ping")
    fun postPing(
        @RequestBody pingRequestBody: PingRequestDto
    ): String {
        return "pong of ${pingRequestBody.ping}"
    }
}