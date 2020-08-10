package com.remy.hashtagsystem.application

import com.remy.hashtagsystem.domain.models.ContentDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@RequestMapping("/content")
interface ContentController {

    @GetMapping("/all")
    fun getContents(): ResponseEntity<List<ContentDTO>>
}