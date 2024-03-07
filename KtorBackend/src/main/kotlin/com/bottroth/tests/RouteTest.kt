package com.bottroth.tests

import com.bottroth.endpoints.ExampleRequest
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.*

class RouteTest {
    @Test
    fun testRoot() = testApplication {
        val exampleRequest = ExampleRequest(message = "cool", count = 2)
        /*val response = client.post("/test") {
            contentType(ContentType.Application.Json)
            setBody(Json.encodeToString(ExampleRequest.serializer(), exampleRequest))
        }*/
        val response = client.get("/")
        print(response)
    }
}