package com.remy.hashtagsystem.infrastructure.adapters.persistence

import com.remy.hashtagsystem.domain.models.Content
import com.remy.hashtagsystem.domain.repositories.ContentRepository
import com.remy.hashtagsystem.infrastructure.repositories.DatabaseContentRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class ContentAdapter(val databaseContentRepository: DatabaseContentRepository) : ContentRepository {

    override fun getContents(): List<Content> {
        val contentList = ArrayList<Content>()
        val contentEntityList = databaseContentRepository.findAll()

        contentEntityList.stream().forEach {
            contentEntity ->
            val content = Content(contentEntity.id, contentEntity.content)
            contentList.add(content)
        }
        return contentList
    }
}