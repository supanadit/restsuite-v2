package feature.rest.presentation.component.request

import javax.swing.JScrollPane
import javax.swing.JTable
import javax.swing.ListSelectionModel
import javax.swing.table.DefaultTableModel

class HeaderTable : JScrollPane() {
    private var defaultTableModel: DefaultTableModel = DefaultTableModel()
    private var requestTable: JTable


    init {
        defaultTableModel.addColumn("Key")
        defaultTableModel.addColumn("Value")
        requestTable = JTable(defaultTableModel)
        setViewportView(requestTable)
        requestTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION)
    }
}