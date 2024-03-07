package com.bottroth.endpoints

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        TestEndpoint.registerRoutes(this)
    }
}