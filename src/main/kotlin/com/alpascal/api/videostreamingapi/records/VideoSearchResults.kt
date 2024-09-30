package com.alpascal.api.videostreamingapi.records

data class VideoSearchResults(
    val videoSearchListings: List<Video>,
) {
    companion object {
        @JvmStatic
        fun videoSearch(tag: String): List<Video> = Video.getAll(tag)
    }
}

