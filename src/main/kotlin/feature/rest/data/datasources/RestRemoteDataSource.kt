package feature.rest.data.datasources

import javax.inject.Inject

class RestRemoteDataSource @Inject constructor() {
    fun hello() {
        println("From Remote Data Source")
    }
}