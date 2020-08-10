package com.remy.hashtagsystem.domain.services

import com.remy.hashtagsystem.domain.models.Content

interface ContentService {
    fun getContents(): List<Content>
}