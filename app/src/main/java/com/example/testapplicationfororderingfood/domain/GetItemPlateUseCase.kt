package com.example.testapplicationfororderingfood.domain

class GetItemPlateUseCase (private val placeListRepository: PlateListRepository) {
    fun getItemPlate(itemPlateId : Int): Plate{
        return placeListRepository.getPlate(itemPlateId)
    }
}