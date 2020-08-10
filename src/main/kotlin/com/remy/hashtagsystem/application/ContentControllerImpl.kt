package com.remy.hashtagsystem.application

import com.remy.hashtagsystem.domain.models.ContentDTO
import com.remy.hashtagsystem.domain.ports.ContentServicePort
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class ContentControllerImpl(private val contentServicePort: ContentServicePort): ContentController {

    override fun getContents(): ResponseEntity<List<ContentDTO>> {
        return ResponseEntity(contentServicePort.getContents(), HttpStatus.OK)
    }
}
