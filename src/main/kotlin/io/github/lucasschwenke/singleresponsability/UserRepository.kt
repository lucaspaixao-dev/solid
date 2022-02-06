package io.github.lucasschwenke.singleresponsability

interface UserRepository {

    fun findUserByEmail(email: String): User?
}