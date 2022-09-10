package feature.rest.data.datasources

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import javax.inject.Inject


class RestRemoteDataSource @Inject constructor() {
    private val client = OkHttpClient()
    fun hello() {
        println("From Remote Data Source")
    }

    fun getFromURL(request: Request) {
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")

            for ((name, value) in response.headers) {
                println("$name: $value")
            }

            println(response.body!!.string())
        }
    }
}