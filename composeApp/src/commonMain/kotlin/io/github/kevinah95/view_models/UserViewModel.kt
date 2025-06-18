package io.github.kevinah95.view_models

import androidx.lifecycle.ViewModel
import repository.UserRepository

class UserViewModel(private val repository: UserRepository) : ViewModel() {
    fun sayHello(name: String) : String {
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hola '${it.name}'" } ?: "User '$name' not found."
    }
}