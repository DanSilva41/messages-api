package com.silva.messagesapi.resource

import com.silva.messagesapi.model.Message
import com.silva.messagesapi.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(val messageService: MessageService) {

    @GetMapping
    fun getAll(): List<Message> = messageService.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        messageService.post(message)
    }
}