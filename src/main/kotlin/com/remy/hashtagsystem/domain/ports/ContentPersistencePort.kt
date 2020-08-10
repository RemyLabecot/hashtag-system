package com.remy.hashtagsystem.domain.ports

import com.remy.hashtagsystem.domain.models.ContentDTO

interface ContentPersistencePort {
    fun getContents(): List<ContentDTO>
}