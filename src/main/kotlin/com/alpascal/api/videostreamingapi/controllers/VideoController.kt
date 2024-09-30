package com.alpascal.api.videostreamingapi.controllers

import com.alpascal.api.videostreamingapi.records.Video
import com.alpascal.api.videostreamingapi.records.VideoSearchResults
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
    fun videoSearch(@Argument tag: String,) = VideoSearchResults.videoSearch(tag)
}
