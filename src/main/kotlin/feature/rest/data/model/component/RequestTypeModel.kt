package feature.rest.data.model.component

import feature.rest.domain.entities.RequestTypeEntity

class RequestTypeModel(override var name: String) : RequestTypeEntity {
    companion object {
        fun typeGET() = RequestTypeModel("GET")

        fun typeDELETE() = RequestTypeModel("DELETE")

        fun typePUT() = RequestTypeModel("PUT")

        fun typePOST() = RequestTypeModel("POST")
    }
}