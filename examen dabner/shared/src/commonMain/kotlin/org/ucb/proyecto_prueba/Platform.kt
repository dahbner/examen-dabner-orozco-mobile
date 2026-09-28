package org.ucb.proyecto_prueba

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform