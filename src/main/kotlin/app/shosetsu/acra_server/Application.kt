package app.shosetsu.acra_server

import app.shosetsu.acra_server.domain.model.AcraReport
import app.shosetsu.acra_server.domain.model.LoginEntity
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.html.respondHtml
import io.ktor.http.HttpStatusCode
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import io.ktor.serialization.json
import kotlinx.html.*
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
	install(ContentNegotiation) {
		json(Json {
			ignoreUnknownKeys = true
		})
	}
	routing {
		post("/android") {
			val acraReport: AcraReport;
			try {
				acraReport = call.receive()
			} catch (e: SerializationException) {
				println("Improper report: ")
				e.printStackTrace()
				return@post
			}

			println("I received $acraReport")

		}

		get("/admin") {
			val loginDetails: LoginEntity
			try {
				loginDetails = call.receive()
			} catch (e: SerializationException) {
				call.respond(
					HttpStatusCode.BadRequest,
					"JSON Serialization error"
				)
				return@get
			}

			call.respondHtml {
				head {
					title {
						+"Shosetsu Report"
					}
				}
				body {
					h2 {
						+"List of shosetsu android errors"
					}
				}
			}
		}
	}
}