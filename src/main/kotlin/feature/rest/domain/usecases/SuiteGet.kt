package feature.rest.domain.usecases

import feature.rest.domain.entities.HeaderEntity
import feature.rest.domain.repositories.RestRepository
import okhttp3.Request
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SuiteGet @Inject constructor(private val restRepository: RestRepository) {
    fun requestGet(URL: String, headers: List<HeaderEntity>) {
        val builder = Request.Builder()
        //var url = HttpUrl.Builder()
        for (header in headers) {
            builder.addHeader(header.name, header.name)
        }
        this.restRepository.getData(builder.url(URL).build())
    }
}