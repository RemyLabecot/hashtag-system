package com.remy.hashtagsystem.infrastructure.adapters.webApi

import com.remy.hashtagsystem.domain.models.Content
import com.remy.hashtagsystem.domain.services.ContentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/content")
class ContentController(private val contentService: ContentService) {

    @GetMapping("/all")
    fun getContents(): ResponseEntity<List<Content>> {
        return ResponseEntity(contentService.getContents(), HttpStatus.OK)
    }
}
