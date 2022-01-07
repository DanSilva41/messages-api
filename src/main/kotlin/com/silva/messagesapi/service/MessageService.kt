package com.silva.messagesapi.service

import com.silva.messagesapi.model.Message
import com.silva.messagesapi.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val messageRepository: MessageRepository) {

    fun findMessages(): List<Message> = messageRepository.findMessages()

    fun post(message: Message) {
        messageRepository.save(message)
    }
}
