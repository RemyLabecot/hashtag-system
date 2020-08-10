package com.remy.hashtagsystem.infrastructure.entities

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Content")
class ContentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    internal var id: Long = 0

    @Column
    internal var content: String? = null
}
