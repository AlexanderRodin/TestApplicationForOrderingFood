package com.example.testapplicationfororderingfood.domain

import androidx.lifecycle.LiveData

interface PlateListRepository {
    fun getPlate(itemPlateId: Int): Plate
    fun getPlateList(): LiveData<List<Plate>>
}