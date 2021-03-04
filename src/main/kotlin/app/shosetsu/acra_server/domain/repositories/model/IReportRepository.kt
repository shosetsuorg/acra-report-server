package app.shosetsu.acra_server.domain.repositories.model

import app.shosetsu.acra_server.domain.model.AcraReport

/**
 * acra-server
 * 04 / 03 / 2021
 */
interface IReportRepository {
	fun saveReport(acraReport: AcraReport)

	fun removeReport(acraReport: AcraReport)

	fun loadReports(): List<AcraReport>
}