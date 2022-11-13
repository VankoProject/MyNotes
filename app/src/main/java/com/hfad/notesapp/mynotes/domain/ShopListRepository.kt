package com.hfad.notesapp.mynotes.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem) {
        TODO()
    }

    fun deleteShopItem(shopItem: ShopItem) {
        TODO()
    }

    fun editShopItem(item: ShopItem) {
        TODO()
    }

    fun getShopItem(shopItemId: ShopItem): ShopItem {
        return TODO()
    }

    fun getShopList(): List<ShopItem> {
        TODO()
    }
}