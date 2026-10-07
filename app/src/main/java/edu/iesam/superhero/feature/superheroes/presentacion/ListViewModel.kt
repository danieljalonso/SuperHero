package edu.iesam.superhero.feature.superheroes.presentacion

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.superheroes.data.SuperheroDataRepository
import edu.iesam.superhero.feature.superheroes.data.local.SuperheroMemLocalDataSource
import edu.iesam.superhero.feature.superheroes.domain.AddSuperheroUseCase
import edu.iesam.superhero.feature.superheroes.domain.DeleteSuperheroUseCase
import edu.iesam.superhero.feature.superheroes.domain.GetSuperheroesUseCase
import edu.iesam.superhero.feature.superheroes.domain.Superhero
import edu.iesam.superhero.feature.users.domain.GetUsersUseCase

class ListViewModel(private val getSuperheroesUseCase: GetSuperheroesUseCase): ViewModel() {

    fun getSuperheroes() = getSuperheroesUseCase.invoke()

    fun addSuperhero(superhero: Superhero) {
        val superhero = Superhero("4", "Abomination", "4-abomination", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/4-abomination.jpg")

        val addSuperheroUseCase = AddSuperheroUseCase(SuperheroDataRepository(SuperheroMemLocalDataSource()))

        addSuperheroUseCase.invoke(superhero)
    }

    fun deleteSuperhero(superhero: Superhero) {
        val id = "3"

        val deleteSuperheroUseCase = DeleteSuperheroUseCase(SuperheroDataRepository(SuperheroMemLocalDataSource()))

        deleteSuperheroUseCase.invoke(id)
    }

}