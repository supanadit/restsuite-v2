package feature.rest.presentation.component

import feature.rest.data.model.component.RequestTypeModel
import feature.rest.presentation.renderer.RequestTypeRenderer
import javax.swing.JComboBox

class RequestTypeCombobox : JComboBox<RequestTypeModel>() {
    var listTypeRequest: ArrayList<RequestTypeModel> = ArrayList()

    init {
        setRenderer(RequestTypeRenderer())

        listTypeRequest.add(RequestTypeModel.getType())
        listTypeRequest.add(RequestTypeModel.postType())
        listTypeRequest.add(RequestTypeModel.deleteType())
        listTypeRequest.add(RequestTypeModel.putType())

        for (requestTypeModel in listTypeRequest) {
            addItem(requestTypeModel)
        }
    }
}