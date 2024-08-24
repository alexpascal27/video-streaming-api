package com.alpascal.api.shoppingapi.controllers

import com.alpascal.api.shoppingapi.records.Video
import com.alpascal.api.shoppingapi.records.VideoSearchResults
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class VideoController {
    @QueryMapping
    fun videoById(
        @Argument id: String,
    ): Video = Video.getById(id)

    @QueryMapping
    fun videoSearch() = VideoSearchResults.videoSearch()
}
