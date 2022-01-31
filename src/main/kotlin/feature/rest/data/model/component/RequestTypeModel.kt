package feature.rest.data.model.component

import feature.rest.domain.entities.RequestTypeEntity

class RequestTypeModel(override var name: String) : RequestTypeEntity {
    companion object {
        fun getType() = RequestTypeModel("GET")

        fun deleteType() = RequestTypeModel("DELETE")

        fun putType() = RequestTypeModel("PUT")

        fun postType() = RequestTypeModel("POST")
    }
}