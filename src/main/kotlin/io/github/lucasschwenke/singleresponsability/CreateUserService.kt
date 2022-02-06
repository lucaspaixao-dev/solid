package io.github.lucasschwenke.singleresponsability

class CreateUserService {

    fun createUser(user: User) {
        validateName(user.name)
        validateEmail(user.email)
        validateAge(user.age)

        print("Creating a new user...")
    }

    private fun validateName(name: String?) {
        name?.run {
            throw Exception("The name not be empty.")
        }
    }

    private fun validateEmail(email: String?) {
        email?.run {
            throw Exception("The email not be empty.")
        }
    }

    private fun validateAge(age: Int) {
        if (age <= 0) {
            throw Exception("The user age needs to be bigger than 0.")
        }
    }
}