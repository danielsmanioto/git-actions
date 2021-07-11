package com.danielsmanioto.gitactions.gitactions.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping("/{name}")
    fun hello(@PathVariable name : String) : ResponseEntity<String> {
        return ResponseEntity.ok(name);
    }

}
