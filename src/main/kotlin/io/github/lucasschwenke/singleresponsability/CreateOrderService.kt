package io.github.lucasschwenke.singleresponsability

import java.time.LocalDateTime
import java.util.UUID

class CreateOrderService {

    fun createUserOrder(user: User) {
        val order = Order(
            id = UUID.randomUUID().toString(),
            user = user,
            createdAt = LocalDateTime.now()
        )

        print("Sending order to checkout ....")
    }
}