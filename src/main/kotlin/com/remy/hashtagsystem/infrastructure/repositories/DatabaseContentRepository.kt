package com.remy.hashtagsystem.infrastructure.repositories

import com.remy.hashtagsystem.domain.models.Content
import com.remy.hashtagsystem.domain.repositories.ContentRepository
import com.remy.hashtagsystem.infrastructure.entities.ContentEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.ArrayList

@Repository
interface DatabaseContentRepository : CrudRepository<ContentEntity, Long>, ContentRepository  {
    override fun findAll(): List<ContentEntity>
    override fun getContents(): List<Content> {
        val contentList = ArrayList<Content>()
        val contentEntityList = findAll()

        contentEntityList.stream().forEach {
            contentEntity ->
            val content = Content(contentEntity.id, contentEntity.content)
            contentList.add(content)
        }
        return contentList
    }
}
