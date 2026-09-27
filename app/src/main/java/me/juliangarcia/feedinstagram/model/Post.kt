package me.juliangarcia.feedinstagram.model

data class Post (
    val id: Int,
    val username: String,
    //
    val profileImageUrl: String,
    val imageUrl: String,
    val likes: Int,
    val captions: String,
    //
    val isLiked: Boolean = false
)

data class Story(
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    //
    val hasSeen: Boolean = false
)