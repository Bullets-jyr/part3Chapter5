package kr.co.bullets.part3chapter5.repository

import io.reactivex.rxjava3.core.Observable
import kr.co.bullets.part3chapter5.model.ListItem

interface SearchRepository {

    fun search(query: String): Observable<List<ListItem>>
}