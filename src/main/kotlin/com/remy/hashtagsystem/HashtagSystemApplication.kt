package com.remy.hashtagsystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class HashtagSystemApplication: SpringBootServletInitializer()

fun main(args: Array<String>) {
	runApplication<HashtagSystemApplication>(*args)
}
