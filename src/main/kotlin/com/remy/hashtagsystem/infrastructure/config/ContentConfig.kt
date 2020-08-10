package com.remy.hashtagsystem.infrastructure.config

import com.remy.hashtagsystem.domain.repositories.ContentRepository
import com.remy.hashtagsystem.domain.services.ContentService
import com.remy.hashtagsystem.domain.services.ContentServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ContentConfig {

    @Bean
    fun getContentService(contentRepository: ContentRepository): ContentService {
        return ContentServiceImpl(contentRepository)
    }
}