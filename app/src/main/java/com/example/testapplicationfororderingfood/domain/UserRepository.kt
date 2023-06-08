package com.example.testapplicationfororderingfood.domain

interface UserRepository {
    fun getUser(userId: Int):User
}