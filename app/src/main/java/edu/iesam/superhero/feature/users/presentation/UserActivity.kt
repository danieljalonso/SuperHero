package edu.iesam.superhero.feature.users.presentation

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.superhero.R
import edu.iesam.superhero.feature.users.data.UserDataRepository
import edu.iesam.superhero.feature.users.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.users.domain.GetUsersUseCase

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listViewModel = UserListViewModel(GetUsersUseCase(UserDataRepository(UserMemLocalDataSource())))
        Log.d(TAG, "onCreate: ${listViewModel.getUsers()}")

        val inputName = findViewById<TextView>(R.id.input_name)
        inputName.text = listViewModel.getUsers().first().name

    }

    companion object {
        val TAG = UserActivity::class.java.simpleName
    }

}