package com.example.testapplicationfororderingfood.domain

import androidx.lifecycle.LiveData

class GetPlaceListUseCase(private val placeListRepository: PlateListRepository) {
    fun getPlaceList(): LiveData<List<Plate>>{
        return placeListRepository.getPlateList()
    }
}