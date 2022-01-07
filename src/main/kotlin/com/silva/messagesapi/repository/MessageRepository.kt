package com.silva.messagesapi.repository

import com.silva.messagesapi.model.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {

    @Query("SELECT id, text FROM message")
    fun findMessages(): List<Message>
}
