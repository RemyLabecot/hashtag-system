package com.remy.hashtagsystem.infrastructure.repository

import com.remy.hashtagsystem.infrastructure.entity.Content
import org.springframework.data.repository.CrudRepository

interface ContentRepository : CrudRepository<Content, Long> {
    override fun findAll(): List<Content>
}
