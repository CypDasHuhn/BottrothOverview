package com.bottroth.endpoints

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class ExampleRequest(val message: String, val count: Int)
class TestEndpoint {
    companion object{
        fun registerRoutes(routing: Routing) {
            routing.post("/test") {
                val request = call.receive<ExampleRequest>()
                val doubledCount = request.count * 2
                call.respond("Hey! ${request.message}, $doubledCount")
            }
            routing.get("/cool") {
                call.respond("cool B)")
            }
        }
    }
}