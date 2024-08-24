package com.alpascal.api.shoppingapi.records

data class Video(
    val id: String,
    val name: String,
    val duration: String,
    val iconURL: String,
    val thumbnailURL: String,
    val creatorName: String,
    val viewCount: String,
    val timeSincePublished: String,
    val isCreatorVerified: Boolean = false,
) {
    companion object {
        private val videos =
            listOf(
                Video(
                    id = "1",
                    name = "Video 1",
                    duration = "1:00",
                    iconURL = "https://via.placeholder.com/150",
                    thumbnailURL = "https://bit.ly/2Z4KKcF",
                    creatorName = "Creator 1",
                    viewCount = "1,000",
                    timeSincePublished = "1 day ago",
                    isCreatorVerified = false,
                ),
                Video(
                    id = "2",
                    name = "Video 2",
                    duration = "2:00",
                    iconURL = "https://via.placeholder.com/150",
                    thumbnailURL = "https://bit.ly/2Z4KKcF",
                    creatorName = "Creator 2",
                    viewCount = "2,000",
                    timeSincePublished = "2 months ago",
                    isCreatorVerified = true,
                ),
                Video(
                    id = "3",
                    name = "Video 3",
                    duration = "3:00",
                    iconURL = "https://via.placeholder.com/150",
                    thumbnailURL = "https://bit.ly/2Z4KKcF",
                    creatorName = "Creator 3",
                    viewCount = "3,000",
                    timeSincePublished = "3 years ago",
                    isCreatorVerified = false,
                ),
                Video(
                    id = "4",
                    name = "Video 4",
                    duration = "4:00",
                    iconURL = "https://via.placeholder.com/150",
                    thumbnailURL = "https://bit.ly/2Z4KKcF",
                    creatorName = "Creator 4",
                    viewCount = "4,000",
                    timeSincePublished = "4 hours ago",
                    isCreatorVerified = false,
                ),
                Video(
                    id = "5",
                    name = "Video 5",
                    duration = "5:00",
                    iconURL = "https://via.placeholder.com/150",
                    thumbnailURL = "https://bit.ly/2Z4KKcF",
                    creatorName = "Creator 5",
                    viewCount = "5,000",
                    timeSincePublished = "5 minutes ago",
                    isCreatorVerified = true,
                ),
            )

        @JvmStatic
        fun getById(id: String): Video =
            videos.find { it.id == id } ?: Video(
                id = "0",
                name = "",
                duration = "",
                iconURL = "",
                thumbnailURL = "",
                creatorName = "",
                viewCount = "",
                timeSincePublished = "",
            )

        fun getAll(): List<Video> = videos
    }
}
