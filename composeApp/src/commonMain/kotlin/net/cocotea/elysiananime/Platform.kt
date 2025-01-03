package net.cocotea.elysiananime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform