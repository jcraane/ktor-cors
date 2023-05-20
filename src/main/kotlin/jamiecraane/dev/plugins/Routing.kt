package jamiecraane.dev.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/messages") {
            call.respondText("Messages")
        }

        patch("/message/{id}") {
            val id = call.parameters["id"]
            call.respondText("Message with id $id updated")
        }
    }
}
