package edu.iesam.superhero.feature.users.domain

class DeleteUserUseCase(private val userRepository: UserRepository) {

    fun invoke(dni: String) {
        userRepository.deleteUser(dni)
    }

}