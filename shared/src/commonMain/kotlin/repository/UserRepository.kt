package repository

import model.User

interface UserRepository {
    fun findUser(name: String): User?
    fun addUsers(users: List<User>)
}