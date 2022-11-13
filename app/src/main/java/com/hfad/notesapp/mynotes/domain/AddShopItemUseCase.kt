package com.hfad.notesapp.mynotes.domain

class AddShopItemUseCase (private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem:ShopItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}