package kr.co.bullets.part3chapter5

import io.reactivex.rxjava3.core.Observable
import kr.co.bullets.part3chapter5.model.ImageListResponse
import kr.co.bullets.part3chapter5.model.VideoListResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface SearchService {

    @Headers("Authorization: KakaoAK ")
    @GET("image")
    fun searchImage(@Query("query") query: String): Observable<ImageListResponse>

    @Headers("Authorization: KakaoAK ")
    @GET("vclip")
    fun searchVideo(@Query("query") query: String): Observable<VideoListResponse>
}