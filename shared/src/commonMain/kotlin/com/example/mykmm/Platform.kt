package com.example.mykmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform