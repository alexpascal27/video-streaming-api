package com.alpascal.api.videostreamingapi.records

data class VideoSearchResults(
    val videoSearchListings: List<Video>,
) {
    companion object {
        @JvmStatic
        fun videoSearch(): List<Video> = Video.getAll()
    }
}

