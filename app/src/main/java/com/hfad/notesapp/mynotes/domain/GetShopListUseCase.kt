package com.hfad.notesapp.mynotes.domain

class GetShopListUseCase (private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem>{
        return shopListRepository.getShopList()
    }
}