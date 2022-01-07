package com.silva.messagesapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MessagesApiApplication

fun main(args: Array<String>) {
    runApplication<MessagesApiApplication>(*args)
}
