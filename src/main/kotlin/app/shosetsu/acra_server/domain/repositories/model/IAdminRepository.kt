package app.shosetsu.acra_server.domain.repositories.model

import app.shosetsu.acra_server.domain.model.LoginEntity
import app.shosetsu.acra_server.domain.model.SessionKey

/**
 * acra-server
 * 04 / 03 / 2021
 */
interface IAdminRepository {
	fun isValidLogin(loginEntity: LoginEntity): Boolean

	fun login(loginEntity: LoginEntity): SessionKey

	fun isValidKey(sessionKey: SessionKey): Boolean
}