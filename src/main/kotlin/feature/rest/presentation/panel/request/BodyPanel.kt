package feature.rest.presentation.panel.request

import net.miginfocom.swing.MigLayout
import javax.swing.JComboBox
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.JTable
import javax.swing.table.DefaultTableModel

class BodyPanel : JPanel(MigLayout()) {
    init {
        val type = JComboBox<String>()
        type.addItem("Multipart Form")
        type.addItem("JSON")
        type.addItem("Text")
        add(type, "growx,wrap")
        //add(RTextScrollPane(RSyntaxTextArea()), "grow,push")
        val column = DefaultTableModel()
        column.addColumn("Name")
        column.addColumn("Value")
        add(JScrollPane(JTable(column)), "grow,push")
    }
}