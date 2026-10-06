package edu.iesam.superhero.feature.users.domain

class GetUsersUseCase(private val userRepository: UserRepository) {

    operator fun invoke(): List<User> = userRepository.getUsers()

}