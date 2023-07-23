package kr.co.bullets.part3chapter5.model

import java.util.Date

interface ListItem {
    val thumbnailUrl: String
    val dateTime: Date
    val isFavorite: Boolean
}