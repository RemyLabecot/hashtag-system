package com.remy.hashtagsystem.domain.ports

import com.remy.hashtagsystem.domain.models.ContentDTO

interface ContentServicePort {
    fun getContents(): List<ContentDTO>
}