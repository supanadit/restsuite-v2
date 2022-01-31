package feature.rest.data.datasources

import javax.inject.Inject

class RestLocalDataSource @Inject constructor() {
    fun hello() {
        println("Hello From Local Data Source")
    }
}