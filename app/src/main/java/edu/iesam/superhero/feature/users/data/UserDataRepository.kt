package edu.iesam.superhero.feature.users.data

import edu.iesam.superhero.feature.users.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.users.domain.User
import edu.iesam.superhero.feature.users.domain.UserRepository

class UserDataRepository(val userMemLocalDataSource: UserMemLocalDataSource) : UserRepository{

    override fun getUsers(): List<User> = userMemLocalDataSource.getAll()

    override fun addUser(user: User) {
        userMemLocalDataSource.save(user)
    }

    override fun deleteUser(dni: String) {
        userMemLocalDataSource.delete(dni)
    }

}