package com.worldsnas.daggerfeatures.network

import androidx.lifecycle.LiveData
import com.worldsnas.daggerfeatures.db.UserDao
import com.worldsnas.daggerfeatures.model.User
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun getAllLocalUsers(): LiveData<List<User>>
}


@Singleton
class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {

    override fun getAllLocalUsers() = userDao.allUsers()
}