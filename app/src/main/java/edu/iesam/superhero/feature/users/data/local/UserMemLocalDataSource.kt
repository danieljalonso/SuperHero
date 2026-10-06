package edu.iesam.superhero.feature.users.data.local

import edu.iesam.superhero.feature.users.domain.User

class UserMemLocalDataSource {

    private val localUsers = mutableListOf(
        User("Hugo", "Rodriguez", "12345678E"),
        User("Gabriel", "Vegas", "87654321Z")
    )

    fun getAll() = localUsers

    fun save(user: User) {
        localUsers.add(user)
    }

    fun delete(dni: String) {
        localUsers.removeIf {user: User -> user.dni == dni }
    }

}