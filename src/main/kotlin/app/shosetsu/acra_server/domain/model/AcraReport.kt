package app.shosetsu.acra_server.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * acra-server
 * 04 / 03 / 2021
 */
@Serializable
data class AcraReport(
	@SerialName("REPORT_ID")
	val reportID: String,

	@SerialName("APP_VERSION_CODE")
	val appVersionCode: Int,

	@SerialName("APP_VERSION_NAME")
	val appVersionName: String,

	@SerialName("PACKAGE_NAME")
	val packageName: String,

	@SerialName("FILE_PATH")
	val filePath: String,

	@SerialName("PHONE_MODEL")
	val phoneModel: String,

	@SerialName("BRAND")
	val brand: String,

	@SerialName("PRODUCT")
	val product: String,

	@SerialName("ANDROID_VERSION")
	val androidVersion: String,

	@SerialName("STACK_TRACE")
	val stackTrace: String,

	@SerialName("LOGCAT")
	val logCat: String
)
