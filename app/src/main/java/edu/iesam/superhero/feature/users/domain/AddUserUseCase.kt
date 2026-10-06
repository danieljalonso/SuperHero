package edu.iesam.superhero.feature.users.domain

class AddUserUseCase(private val userRepository: UserRepository) {

    fun invoke(user: User) {
        userRepository.addUser(user)
    }

}