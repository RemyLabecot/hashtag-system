package com.remy.hashtagsystem.infrastructure.config

import com.remy.hashtagsystem.domain.ports.ContentPersistencePort
import com.remy.hashtagsystem.domain.ports.ContentServicePort
import com.remy.hashtagsystem.domain.services.DomainContentService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ContentConfig {

    @Bean
    fun getContentServicePort(contentPersistencePort: ContentPersistencePort): ContentServicePort {
        return DomainContentService(contentPersistencePort)
    }
}