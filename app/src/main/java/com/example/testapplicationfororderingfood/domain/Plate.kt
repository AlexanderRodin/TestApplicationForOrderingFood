package com.example.testapplicationfororderingfood.domain

data class Plate(
    val id : Int,
    val name: String,
    val price: Int,
    val description: String,
    val weight: Int,
    val type : String
)