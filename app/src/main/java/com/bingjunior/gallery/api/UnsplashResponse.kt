package com.bingjunior.gallery.api

import com.bingjunior.gallery.data.UnsplashPhoto


data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)