package edu.iesam.superhero.feature.superheroes.presentacion

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.superheroes.data.SuperheroDataRepository
import edu.iesam.superhero.feature.superheroes.data.local.SuperheroMemLocalDataSource
import edu.iesam.superhero.feature.superheroes.domain.AddSuperheroUseCase
import edu.iesam.superhero.feature.superheroes.domain.DeleteSuperheroUseCase
import edu.iesam.superhero.feature.superheroes.domain.GetSuperheroesUseCase
import edu.iesam.superhero.feature.superheroes.domain.Superhero

class SuperheroListViewModel : ViewModel() {

    fun getSuperheroes(): List<Superhero> {
        val getSuperheroesUseCase = GetSuperheroesUseCase(SuperheroDataRepository(SuperheroMemLocalDataSource()))

        return getSuperheroesUseCase.invoke()
    }

    fun addSuperhero(superhero: Superhero) {
        val superhero = Superhero("-1", "Prueba", "-1-prueba", "https://imgs.search.brave.com/fCIUpqb9m7QlpFgPZL8qviqsvXd2yvI43McHUMUFm3g/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNzgv/NTAwLzczMC9zbWFs/bC9wbGFjZWhvbGRl/ci1mdW5jdGlvbmFs/LWNsZWFuLWludGVy/ZmFjZS1mZWF0dXJl/LXZlY3Rvci5qcGc")

        val addSuperheroUseCase = AddSuperheroUseCase(SuperheroDataRepository(SuperheroMemLocalDataSource()))

        addSuperheroUseCase.invoke(superhero)
    }

    fun deleteSuperhero(superhero: Superhero) {
        val id = "3"

        val deleteSuperheroUseCase = DeleteSuperheroUseCase(SuperheroDataRepository(SuperheroMemLocalDataSource()))

        deleteSuperheroUseCase.invoke(id)
    }

}