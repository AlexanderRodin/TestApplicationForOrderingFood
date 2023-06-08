package com.example.testapplicationfororderingfood.domain

class GetUserUseCase(private val userRepository: UserRepository) {
    fun getUser(userId: Int):User{
        return userRepository.getUser(userId)
    }
}