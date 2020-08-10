package com.remy.hashtagsystem.infrastructure.adapter
import com.remy.hashtagsystem.domain.models.ContentDTO
import com.remy.hashtagsystem.domain.ports.ContentPersistencePort
import com.remy.hashtagsystem.infrastructure.repository.ContentRepository
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Component
import java.util.*

@Component
class ContentAdapter(private val contentRepository: ContentRepository): ContentPersistencePort {

    override fun getContents(): List<ContentDTO> {
        val contentList = ArrayList<ContentDTO>()
        val contentEntityList = contentRepository.findAll()

        for (contentEntity in contentEntityList) {
            val content = ContentDTO()
            BeanUtils.copyProperties(contentEntity, content)
            contentList.add(content)
        }
        return contentList
    }
}
