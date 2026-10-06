package edu.iesam.superhero.feature.users.domain

interface UserRepository {

    fun getUsers(): List<User>

    fun addUser(user: User)

    fun deleteUser(dni: String)

}