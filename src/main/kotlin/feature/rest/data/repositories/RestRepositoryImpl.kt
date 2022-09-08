package feature.rest.data.repositories

import feature.rest.data.datasources.RestLocalDataSource
import feature.rest.data.datasources.RestRemoteDataSource
import feature.rest.domain.repositories.RestRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RestRepositoryImpl @Inject constructor(
    private val localSource: RestLocalDataSource, private val remoteSource: RestRemoteDataSource
) : RestRepository {

    override fun getData() {
        this.localSource.hello()
        this.remoteSource.hello()
        this.remoteSource.getFromURL()
        println("Hello World")
    }
}