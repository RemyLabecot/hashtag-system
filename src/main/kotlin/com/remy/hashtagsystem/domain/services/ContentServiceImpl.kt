package com.remy.hashtagsystem.domain.services

import com.remy.hashtagsystem.domain.models.Content
import com.remy.hashtagsystem.domain.repositories.ContentRepository

class ContentServiceImpl(private val contentRepository: ContentRepository) : ContentService {

    override fun getContents(): List<Content> {
        return contentRepository.toto()
    }
}
