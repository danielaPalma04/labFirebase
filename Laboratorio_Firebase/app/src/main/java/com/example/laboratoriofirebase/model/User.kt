package com.example.laboratoriofirebase.model

data class User(
    val email: String,
    val userId: String,
    val name: String
){
    fun topMap(): MutableMap<String, Any>{
        return mutableMapOf(
            "email" to email,
            "userId" to userId,
            "name" to name
        )
    }
}
