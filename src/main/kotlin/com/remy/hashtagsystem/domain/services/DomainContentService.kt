package com.remy.hashtagsystem.domain.services

import com.remy.hashtagsystem.domain.models.ContentDTO
import com.remy.hashtagsystem.domain.ports.ContentPersistencePort
import com.remy.hashtagsystem.domain.ports.ContentServicePort

class DomainContentService(private val contentPersistencePort: ContentPersistencePort) : ContentServicePort {

    override fun getContents(): List<ContentDTO> = contentPersistencePort.getContents()
}
