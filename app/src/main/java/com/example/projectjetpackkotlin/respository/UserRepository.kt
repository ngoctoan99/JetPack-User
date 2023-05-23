package com.example.projectjetpackkotlin.respository

import com.example.projectjetpackkotlin.datasource.RestDataSource
import com.example.projectjetpackkotlin.model.User
import javax.inject.Inject

interface UserRepository {
    suspend fun getNewUser():User
}
class UserRepositoryImp @Inject constructor(private val dataSource: RestDataSource,):UserRepository{
    override suspend fun getNewUser():User {
        val name = dataSource.getUserName().results[0].name!!
        val location = dataSource.getUserLocation().results[0].location!!
        val picture = dataSource.getUserPicture().results[0].picture!!
        val user = User(name.first ,name.last , location.city, picture.thumbnail,)
        return user

    }
}