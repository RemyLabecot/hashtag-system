package com.remy.hashtagsystem.infrastructure.entity

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@AllArgsConstructor
@Getter
@Setter
@Entity
class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    internal var id: Long = 0

    @Column
    internal var content: String? = null
}
