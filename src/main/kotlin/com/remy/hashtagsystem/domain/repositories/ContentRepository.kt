package com.remy.hashtagsystem.domain.repositories

import com.remy.hashtagsystem.domain.models.Content

interface ContentRepository {
    fun getContents(): List<Content>
}
