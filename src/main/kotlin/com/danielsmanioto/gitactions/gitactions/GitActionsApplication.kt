package com.danielsmanioto.gitactions.gitactions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitActionsApplication

fun main(args: Array<String>) {
	runApplication<GitActionsApplication>(*args)
}
