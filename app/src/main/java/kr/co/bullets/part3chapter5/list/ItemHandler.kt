package kr.co.bullets.part3chapter5.list

import kr.co.bullets.part3chapter5.model.ListItem

interface ItemHandler {
    fun onClickFavorite(item: ListItem)
}