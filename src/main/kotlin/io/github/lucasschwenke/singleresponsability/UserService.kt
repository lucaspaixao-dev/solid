package io.github.lucasschwenke.singleresponsability

import java.time.LocalDateTime
import java.util.UUID

class UserService(
    private val userRepository: UserRepository
) {

    fun createUser(user: User) {
        print("Creating a new user...")
    }

    fun updateUser(user: User) {
        print("Updating a user...")
    }

    fun sendUserEmailConfirmation(email: String) {
        userRepository.findUserByEmail(email)?.run {
            print("Sending email..")
        }
    }

    fun createUserOrder(user: User) {
        val order = Order(
            id = UUID.randomUUID().toString(),
            user = user,
            createdAt = LocalDateTime.now()
        )

        print("Sending order to checkout ....")
    }
}