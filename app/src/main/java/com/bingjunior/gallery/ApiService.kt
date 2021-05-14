package com.bingjunior.gallery

import retrofit2.http.GET

interface ApiService {
    @GET("https://api.flickr.com/services/rest/?method=flickr.photos.getRecent&per_page=20&page=1&api_key=6f102c62f41998d151e5a1b48713cf13&format=json&nojsoncallback=1&extras=url_s")
    suspend fun fetchImages(): PhotosSearchResponse
}
