package core.panel

import java.awt.GridBagLayout
import javax.swing.JLabel
import javax.swing.JPanel

class UnderConstructionPanel : JPanel() {

    init {
        layout = GridBagLayout()
        add(JLabel("Under Construction"))
    }
}