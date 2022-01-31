package feature.rest.presentation.renderer

import feature.rest.data.model.component.RequestTypeModel
import java.awt.Component
import javax.swing.DefaultListCellRenderer
import javax.swing.JList

class RequestTypeRenderer : DefaultListCellRenderer() {
    override fun getListCellRendererComponent(
        list: JList<*>?,
        value: Any?,
        index: Int,
        isSelected: Boolean,
        cellHasFocus: Boolean
    ): Component {
        var value = value
        if (value is RequestTypeModel) {
            value = value.name
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus)
        return this
    }
}