package repository

import model.User

class UserRepositoryImpl : UserRepository {
    private val _users = arrayListOf<User>(User("Kevin"))


    override fun findUser(name: String): User? {
        return _users.firstOrNull { it.name == name }
    }

    override fun addUsers(users: List<User>) {
        _users.addAll(users)
    }

}