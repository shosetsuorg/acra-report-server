package app.shosetsu.acra_server.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * acra-server
 * 04 / 03 / 2021
 */
@Serializable
data class LoginEntity(
	@SerialName("name")
	val userName: String,
	val password: String
)