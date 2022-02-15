package feature.rest.presentation.component.request

import feature.rest.data.model.component.RequestModel
import javax.swing.JScrollPane
import javax.swing.JTable
import javax.swing.ListSelectionModel
import javax.swing.table.DefaultTableModel

class ParamsTable(editable: Boolean) : JScrollPane() {
    private var defaultTableModel: DefaultTableModel
    private var requestTable: JTable


    init {
        defaultTableModel = object : DefaultTableModel() {
            override fun isCellEditable(row: Int, column: Int): Boolean {
                return editable
            }
        }
        defaultTableModel.addColumn("Key")
        defaultTableModel.addColumn("Value")
        requestTable = JTable(defaultTableModel)
        setViewportView(requestTable)
        requestTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION)
    }

    private fun getModel(): DefaultTableModel {
        return defaultTableModel
    }

    fun deleteSelectedRow() {
        if (requestTable.selectedRow >= 0) {
            getModel().removeRow(requestTable.selectedRow)
            if (getModel().rowCount != 0) {
                requestTable.requestFocus()
                requestTable.changeSelection(getModel().rowCount - 1, 0, true, false)
            }
        }
    }

    fun addNewEmptyRow() {
        addRow(RequestModel("", ""))
    }

    private fun addRow(requestModel: RequestModel) {
        addRow(requestModel, true)
    }

    private fun addRow(requestModel: RequestModel, withFocus: Boolean) {
        getModel().addRow(arrayOf<Any>(requestModel.key, requestModel.value))
        if (withFocus) {
            if (getModel().rowCount != 0) {
                requestTable.editCellAt(getModel().rowCount - 1, 0)
                requestTable.requestFocus()
            }
        }
    }

    fun setFromRequestArrayList(requestModelArrayList: ArrayList<RequestModel>) {
        val rowCount = getModel().rowCount
        for (i in rowCount - 1 downTo 0) {
            getModel().removeRow(i)
        }
        for (requestModel in requestModelArrayList) {
            addRow(requestModel, false)
        }
    }

    fun getRequest(): ArrayList<RequestModel> {
        val requestModels: ArrayList<RequestModel> = ArrayList<RequestModel>()
        for (i in 0 until defaultTableModel.rowCount) {
            val key = defaultTableModel.getValueAt(i, 0).toString()
            val value = defaultTableModel.getValueAt(i, 1).toString()
            requestModels.add(RequestModel(key, value))
        }
        return requestModels
    }
}