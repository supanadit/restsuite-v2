package feature.rest.presentation.component.request

import java.util.*
import javax.swing.JScrollPane
import javax.swing.JTable
import javax.swing.ListSelectionModel
import javax.swing.table.DefaultTableModel

class ParamsTable : JScrollPane() {
    private var defaultTableModel: DefaultTableModel = DefaultTableModel()
    private var requestTable: JTable


    init {
        defaultTableModel.addColumn("Key")
        defaultTableModel.addColumn("Value")
        requestTable = JTable(defaultTableModel)
        setViewportView(requestTable)
        requestTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION)
        // Add Example Row
        defaultTableModel.addRow(fun(): Vector<String> {
            val row = Vector<String>()
            row.add("Hello World")
            row.add("Hello World")
            return row
        }())
    }
}