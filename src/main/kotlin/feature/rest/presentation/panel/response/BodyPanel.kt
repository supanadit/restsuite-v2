package feature.rest.presentation.panel.response

import net.miginfocom.swing.MigLayout
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea
import org.fife.ui.rtextarea.RTextScrollPane
import javax.swing.JPanel

class BodyPanel : JPanel(MigLayout()) {
    init {
        add(RTextScrollPane(RSyntaxTextArea()), "grow, push, span 3")
    }
}