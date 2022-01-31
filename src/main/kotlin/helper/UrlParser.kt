package helper

import feature.rest.data.model.component.RequestModel

open class UrlParser(var url: String?) {

    private val http = "http://"
    private val https = "https://"
    private val www = "wwww."

    private fun isHttp(): Boolean {
        var isValidHttp = false
        if (url!!.length >= http.length) {
            isValidHttp = url!!.substring(0, http.length) == http
        }
        return isValidHttp
    }

    private fun isHttps(): Boolean {
        var isValidHttps = false
        if (url!!.length >= https.length) {
            isValidHttps = url!!.substring(0, https.length) == https
        }
        return isValidHttps
    }

    private fun isUseWWW(): Boolean {
        var isUserUrl = false
        var index = -1
        if (isHttp()) {
            index = http.length
        } else if (isHttps()) {
            index = https.length
        }
        if (index != -1) {
            index += (www.length - 1)
            isUserUrl = url!!.length > index
        }
        return isUserUrl
    }

    private fun isHasCleanUrlTarget(): Boolean {
        var isHasUrl = false
        var index = -1
        if (isHttp()) {
            index = http.length
        } else if (isHttps()) {
            index = https.length
        }
        if (index != -1) {
            if (isUseWWW()) {
                index += (www.length - 1)
            }
            isHasUrl = url!!.length > index
        }
        return isHasUrl
    }

    fun isHasDomain(): Boolean {
        var isHasDomain = false
        var index = -1
        if (isHttp()) {
            index = http.length
        } else if (isHttps()) {
            index = https.length
        }
        if (index != -1) {
            if (isUseWWW()) {
                index += (www.length - 1)
            }
            if (url!!.length > index) {
                val url = url!!.substring(index, url!!.length)
                val urlSplit = url.split("\\.").toTypedArray()
                if (urlSplit.size >= 2) {
                    isHasDomain = true
                }
            }
        }
        return isHasDomain
    }

    fun isValid(): Boolean {
        var isValid = false
        if (isHttp() || isHttps()) {
            if (isHasCleanUrlTarget()) {
                isValid = true
            }
        }
        return isValid
    }

    fun hasQueryParams(): Boolean {
        var isHasQueryParams = false
        var index = -1
        if (isHttp()) {
            index = http.length
        } else if (isHttps()) {
            index = https.length
        }
        if (index != -1) {
            if (isUseWWW()) {
                index += (www.length - 1)
            }
            if (url!!.length > index) {
                val url = url!!.substring(index, url!!.length)
                val urlSplit = url.split("\\.").toTypedArray()
                if (urlSplit.isNotEmpty()) {
                    val lengthUrlPathDomain = urlSplit.size - 1
                    val urlPathDomain = urlSplit[lengthUrlPathDomain]
                    val urlSplitPathDomain = urlPathDomain.split("/").toTypedArray()
                    if (urlSplitPathDomain.isNotEmpty()) {
                        val lengthLastPath = urlSplitPathDomain.size - 1
                        val queryParams = urlSplitPathDomain[lengthLastPath].split("\\?").toTypedArray()
                        if (queryParams.size >= 2) {
                            isHasQueryParams = true
                        }
                    }
                }
            }
        }
        return isHasQueryParams
    }

    fun getQueryParams(): ArrayList<RequestModel> {
        val requestModel: ArrayList<RequestModel> = ArrayList()
        var index = -1
        if (isHttp()) {
            index = http.length
        } else if (isHttps()) {
            index = https.length
        }
        if (index != -1) {
            if (isUseWWW()) {
                index += (www.length - 1)
            }
            if (url!!.length > index) {
                val url = url!!.substring(index, url!!.length)
                val urlSplit = url.split("\\.").toTypedArray()
                if (urlSplit.isNotEmpty()) {
                    val lengthUrlPathDomain = urlSplit.size - 1
                    val urlPathDomain = urlSplit[lengthUrlPathDomain]
                    val urlSplitPathDomain = urlPathDomain.split("/").toTypedArray()
                    if (urlSplitPathDomain.isNotEmpty()) {
                        val lengthLastPath = urlSplitPathDomain.size - 1
                        val queryParams = urlSplitPathDomain[lengthLastPath].split("\\?").toTypedArray()
                        if (queryParams.size >= 2) {
                            val params = queryParams[1].split("&").toTypedArray()
                            for (i in params.indices) {
                                val keyValue = params[i].split("=").toTypedArray()
                                val requestModelData: RequestModel = if (keyValue.size > 1) {
                                    RequestModel(keyValue[0], keyValue[1])
                                } else {
                                    RequestModel(keyValue[0], "")
                                }
                                requestModel.add(requestModelData)
                            }
                        }
                    }
                }
            }
        }
        return requestModel
    }
}