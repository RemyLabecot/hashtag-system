package com.remy.hashtagsystem.infrastructure.repositories

import com.remy.hashtagsystem.infrastructure.entities.ContentEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DatabaseContentRepository : CrudRepository<ContentEntity, Long> {
    override fun findAll(): List<ContentEntity>
}
