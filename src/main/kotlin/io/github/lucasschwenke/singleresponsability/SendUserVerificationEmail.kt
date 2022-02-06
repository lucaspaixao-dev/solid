package io.github.lucasschwenke.singleresponsability

class SendUserVerificationEmail(
    private val userRepository: UserRepository
) {

    fun sendUserEmailConfirmation(email: String) {
        userRepository.findUserByEmail(email)?.run {
            print("Sending email..")
        }
    }
}