package feature.rest.presentation.panel.request

import net.miginfocom.swing.MigLayout
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea
import org.fife.ui.rsyntaxtextarea.SyntaxConstants
import org.fife.ui.rtextarea.RTextScrollPane
import javax.swing.JComboBox
import javax.swing.JPanel

class BodyPanel : JPanel(MigLayout()) {
    init {
        val type = JComboBox<String>()
        type.addItem("Multipart Form")
        type.addItem("JSON")
        type.addItem("Text")
        add(type, "growx,wrap")
        add(RTextScrollPane(RSyntaxTextArea()), "grow,push")
    }
}