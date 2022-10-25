package feature.rest.presentation.panel.request

import feature.rest.presentation.component.request.ParamsTable
import net.miginfocom.swing.MigLayout
import javax.swing.JPanel

class ParamsPanel : JPanel(MigLayout()) {
    init {
        add(ParamsTable(), "growx,pushx")
    }
}