package feature.rest.presentation.panel.response

import net.miginfocom.swing.MigLayout
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea
import org.fife.ui.rsyntaxtextarea.SyntaxConstants
import org.fife.ui.rtextarea.RTextScrollPane
import java.awt.Color
import javax.swing.BorderFactory
import javax.swing.JPanel
import javax.swing.UIManager

class BodyPanel : JPanel(MigLayout()) {
    init {
        val background = UIManager.getColor("Table.background")
        val lineColor = UIManager.getColor("Table.gridColor")
        val fontColor = UIManager.getColor("FormattedTextField.foreground")
        val selectionColor = UIManager.getColor("FormattedTextField.selectionBackground")

        val syntax = RSyntaxTextArea()
        syntax.syntaxEditingStyle = SyntaxConstants.SYNTAX_STYLE_JSON
        syntax.isCodeFoldingEnabled = true

        // UI Customization
        syntax.currentLineHighlightColor = background
        syntax.background = background
        syntax.tabLineColor = background
        syntax.border = BorderFactory.createLineBorder(lineColor)
        syntax.foreground = fontColor
        syntax.selectionColor = selectionColor
        // This Code let selected text be white
        syntax.useSelectedTextColor = true
        syntax.selectedTextColor = Color.white

        add(RTextScrollPane(syntax), "grow, push, span 3")
    }
}