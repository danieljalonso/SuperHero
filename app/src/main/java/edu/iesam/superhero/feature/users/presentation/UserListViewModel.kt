package edu.iesam.superhero.feature.users.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.users.data.UserDataRepository
import edu.iesam.superhero.feature.users.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.users.domain.AddUserUseCase
import edu.iesam.superhero.feature.users.domain.User
import edu.iesam.superhero.feature.users.domain.DeleteUserUseCase
import edu.iesam.superhero.feature.users.domain.GetUsersUseCase

class UserListViewModel(
    private val getUsersUseCase: GetUsersUseCase) : ViewModel() {

    fun getUsers() = getUsersUseCase.invoke()

    fun addUser() {
        var user = User("Daniel", "Jimenez Alonso", "12345678A")

        val addUserUseCase = AddUserUseCase(UserDataRepository(UserMemLocalDataSource()))

        addUserUseCase.invoke(user)
    }

    fun deleteUser() {
        var dni = "12345678A"

        val deleteUserUseCase = DeleteUserUseCase(UserDataRepository(UserMemLocalDataSource()))

        deleteUserUseCase.invoke(dni)
    }

}