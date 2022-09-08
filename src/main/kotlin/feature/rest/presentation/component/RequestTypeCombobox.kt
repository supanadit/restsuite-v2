package feature.rest.presentation.component

import feature.rest.data.model.component.RequestTypeModel
import feature.rest.presentation.renderer.RequestTypeRenderer
import javax.swing.JComboBox

class RequestTypeCombobox : JComboBox<RequestTypeModel>() {
    private var listTypeRequest: ArrayList<RequestTypeModel> = ArrayList()

    init {
        setRenderer(RequestTypeRenderer())

        listTypeRequest.add(RequestTypeModel.typeGET())
        listTypeRequest.add(RequestTypeModel.typePOST())
        listTypeRequest.add(RequestTypeModel.typeDELETE())
        listTypeRequest.add(RequestTypeModel.typePUT())

        for (requestTypeModel in listTypeRequest) {
            addItem(requestTypeModel)
        }
    }
}