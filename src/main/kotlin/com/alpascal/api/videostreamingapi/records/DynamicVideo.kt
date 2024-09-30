package com.alpascal.api.videostreamingapi.records

import com.alpascal.api.videostreamingapi.enums.Tag

class DynamicVideo(
    val name: Map<Tag, String>,
    val thumbnailURL: Map<Tag, String>,
) {
    companion object {
        fun getThumbnailURL(index: Int, tag: Tag): String? {
            val dynamicVideo = dynamicVideoList[index]
            return dynamicVideo.thumbnailURL[tag] ?:  dynamicVideo.thumbnailURL[Tag.ALL]
        }

        fun getName(index: Int, tag: Tag): String? {
            val dynamicVideo = dynamicVideoList[index]
            return dynamicVideo.name[tag] ?: dynamicVideo.name[Tag.ALL]
        }

        fun mapStringToTag(tag: String): Tag {
            return when (tag) {
                "Gaming" -> Tag.GAMING
                "Learning" -> Tag.LEARNING
                "For Women" -> Tag.FOR_WOMEN
                else -> Tag.ALL
            }
        }

        private val dynamicVideoList = listOf(
            DynamicVideo(
                name = mapOf(
                    Tag.ALL to "10 Amazing Facts You Didn't Know!",
                    Tag.GAMING to "10 Amazing Facts Gamers Don't Know!",
                    Tag.LEARNING to "10 Amazing Facts That Will Boost Your IQ!",
                    Tag.FOR_WOMEN to "10 Amazing Facts That You Should Know As A Woman!",
                ),
                thumbnailURL = mapOf(
                    Tag.ALL to "facts-all.jpeg",
                    Tag.GAMING to "facts-gaming.jpeg",
                    Tag.LEARNING to "facts-learning.jpeg",
                    Tag.FOR_WOMEN to "facts-woman.jpeg",
                )
            ),
            DynamicVideo(
                name = mapOf(
                    Tag.ALL to "How to Cook the Perfect Steak",
                    Tag.GAMING to "How to Hit The Perfect Steak Speedrun",
                    Tag.LEARNING to "How to Cook the Perfect Steak According To Science",
                    Tag.FOR_WOMEN to "How to Cook the Perfect Steak the Feminine Way",
                ),
                thumbnailURL = mapOf(
                    Tag.ALL to "steak-all.jpeg",
                    Tag.GAMING to "steak-gaming.jpeg",
                    Tag.LEARNING to "steak-learning.jpeg",
                    Tag.FOR_WOMEN to "steak-woman.jpeg",
                ),
            ),
            DynamicVideo(
                name = mapOf(
                    Tag.ALL to "Top 20 Travel Destinations You Must Visit Before You Die",
                    Tag.GAMING to "Top 20 Travel Destinations Your Favorite Streamers Visit",
                    Tag.LEARNING to "Top 20 Travel Destinations You Must Visit According To Science",
                    Tag.FOR_WOMEN to "Top 20 Travel Destinations That Will Empower You As A Woman",
                ),
                thumbnailURL = mapOf(
                    Tag.ALL to "destinations-all.jpeg"
                )
            )
        )
    }


}