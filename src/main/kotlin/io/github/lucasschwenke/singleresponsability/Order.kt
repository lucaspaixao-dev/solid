package io.github.lucasschwenke.singleresponsability

import java.time.LocalDateTime

data class Order(
    val id: String,
    val user: User,
    val createdAt: LocalDateTime
)
