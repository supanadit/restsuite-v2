package feature.rest.domain.repositories

import okhttp3.Request

interface RestRepository {
    fun getData(request: Request) {
    }
}