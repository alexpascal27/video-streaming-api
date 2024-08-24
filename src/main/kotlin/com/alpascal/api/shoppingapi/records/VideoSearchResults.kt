package com.alpascal.api.shoppingapi.records

data class VideoSearchResults(
    val videoSearchListings: List<Video>,
) {
    companion object {
        @JvmStatic
        fun videoSearch(): List<Video> = Video.getAll()
    }
}

