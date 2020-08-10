package com.remy.hashtagsystem.infrastructure.config

import com.remy.hashtagsystem.domain.services.ContentService
import com.remy.hashtagsystem.domain.services.ContentServiceImpl
import com.remy.hashtagsystem.infrastructure.repositories.DatabaseContentRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ContentConfig {

    @Bean
    fun getContentService(databaseContentRepository: DatabaseContentRepository): ContentService {
        return ContentServiceImpl(databaseContentRepository)
    }
}