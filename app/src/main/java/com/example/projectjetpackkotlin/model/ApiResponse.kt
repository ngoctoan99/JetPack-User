package com.example.projectjetpackkotlin.model

data class ApiResponse (
    val results: List<Results> = emptyList(),
        ){


}
data class Results(
    val name : UserName?,
    val location: UserLocation?,
    val picture: UserPicture?,
)