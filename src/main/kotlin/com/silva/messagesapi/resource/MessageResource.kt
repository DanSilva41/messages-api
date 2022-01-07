package com.silva.messagesapi.resource

import com.silva.messagesapi.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource {

    @GetMapping
    fun getAll(): List<Message> = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Hola!"),
    )
}