package com.example.tutorials

fun main() {
    // Nullable type
    var username: String? = "Kotlin"
    username = null
    println(username)

    //non-nullable
    var name: String = "Kotlin"  // Non-nullable, can't be null
    //name = null  // Error: Null can not be a value of a non-null type String
}