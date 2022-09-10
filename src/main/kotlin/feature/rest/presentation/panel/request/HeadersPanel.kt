package feature.rest.presentation.panel.request

import net.miginfocom.swing.MigLayout
import java.awt.Color
import javax.swing.*
import javax.swing.table.DefaultTableModel

class HeadersPanel : JPanel(MigLayout()) {
    init {
        val scrollPane = JScrollPane()
        val tableModel = DefaultTableModel()
        tableModel.addColumn("Key")
        tableModel.addColumn("Value")
        val headerTable = JTable(tableModel)
        scrollPane.setViewportView(headerTable)
        val bar = JToolBar()
        bar.orientation = SwingConstants.HORIZONTAL
        val b1 = JButton()
        val b2 = JButton()
//        b1.icon = UIManager.getIcon("Tree.closedIcon")
        b1.text = "Add"
        bar.add(b1)

        b2.text = "Delete"
        bar.add(b2)
        bar.border = BorderFactory.createLineBorder(Color.lightGray)
        add(bar, "growx,wrap")
        add(scrollPane, "growx,pushx")
    }
}