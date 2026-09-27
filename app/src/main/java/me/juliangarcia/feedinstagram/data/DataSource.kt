package me.juliangarcia.feedinstagram.data

import me.juliangarcia.feedinstagram.model.Post
import me.juliangarcia.feedinstagram.model.Story

object DataSource {

    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "android Developer",
            profileImageUrl = "https://picsum.photos/seed/user1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/200/200",
            likes = 1_204,
            captions = "Explorando Jetpack Compose #Android, #Kotlin"
        ),
        Post(
            id = 2,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/200/200",
            likes = 847,
            captions = "Data class features son la mejor feature de kotlin",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "compose_ui",
            profileImageUrl = "https://picsum.photos/seed/user3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/200/200",
            likes = 3_456,
            captions = "Material 3 + compose = perfecta combinacion"
        ),
        Post(
            id = 4,
            username = "Google devs",
            profileImageUrl = "https://picsum.photos/seed/user4/200/200",
            imageUrl = "https://picsum.photos/seed/post4/200/200",
            likes = 12_891,
            captions = "Android 15 trae increibles mejoras de performance"
        ),
        Post(
            id = 5,
            username = "mobile_craft",
            profileImageUrl = "https://picsum.photos/seed/user5/200/200",
            imageUrl = "https://picsum.photos/seed/post5/200/200",
            likes = 629,
            captions = "Lazy Column vs Recyclerview, con cual te quedas?"
        ),
        Post(
            id = 6,
            username = "ux_android",
            profileImageUrl = "https://picsum.photos/seed/user6/200/200",
            imageUrl = "https://picsum.photos/seed/post6/200/200",
            likes = 2_103,
            captions = "animaciones fluidas con animate*AsState",
            isLiked = true
        ),
        Post(
            id = 7,
            username = "dev_colombia",
            profileImageUrl = "https://picsum.photos/seed/user7/200/200",
            imageUrl = "https://picsum.photos/seed/post7/200/200",
            likes = 445,
            captions = "Coil hace super facil las imagenes en compose"
        ),
        Post(
            id = 8,
            username = "trabajo_instagram",
            profileImageUrl = "https://picsum.photos/seed/user8/200/200",
            imageUrl = "https://picsum.photos/seed/post8/200/200",
            likes = 4_300,
            captions = "hacer 10 posts en Datasource"
        ),
        Post(
            id = 9,
            username = "Row_column",
            profileImageUrl = "https://picsum.photos/seed/user9/200/200",
            imageUrl = "https://picsum.photos/seed/post9/200/200",
            likes = 1_234,
            captions= "Las rows son las que ayudan en la parte horizontal"
        ),
        Post(
            id = 10,
            username = "place_holder",
            profileImageUrl = "https://picsum.photos/seed/user10/200/200",
            imageUrl = "https://picsum.photos/seed/post10/200/200",
            likes = 2_123,
            captions = "mostrar un composable mientras la imagen carga o falla"
        )
    )

    fun getStories(): List<Story> = listOf(
        Story(id = 1, username = "Tu historia", profileImageUrl = "", hasSeen = false),
        Story(id = 2, username = "android_dev", profileImageUrl = "https://picsum.photos/seed/s2/200/200", hasSeen = false),
        Story(id = 3, username = "compose_fan", profileImageUrl = "https://picsum.photos/seed/s3/200/200", hasSeen = false),
        Story(id = 4, username = "google_dev", profileImageUrl = "https://picsum.photos/seed/s4/200/200", hasSeen = true),
        Story(id = 5, username = "kotlin_lover", profileImageUrl = "https://picsum.photos/seed/s5/200/200", hasSeen = false),
        Story(id = 6, username = "ui_ux_pro", profileImageUrl = "https://picsum.photos/seed/s6/200/200", hasSeen = true),
        Story(id = 7, username = "mobile_dev", profileImageUrl = "https://picsum.photos/seed/s7/200/200", hasSeen = false)
    )
}