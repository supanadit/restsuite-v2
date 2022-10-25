package feature.rest.presentation.panel.request

import feature.rest.presentation.component.request.HeaderTable
import net.miginfocom.swing.MigLayout
import javax.swing.JPanel

class HeadersPanel : JPanel(MigLayout()) {
    init {
        add(HeaderTable(), "growx,pushx")
    }
}