package feature.rest.presentation.panel.request

import core.panel.UnderConstructionPanel
import javax.swing.JTabbedPane

class RequestTabPanel : JTabbedPane() {
    init {
        add("Query Params", ParamsPanel())
        add("Header", UnderConstructionPanel())
        add("Body", UnderConstructionPanel())
    }
}