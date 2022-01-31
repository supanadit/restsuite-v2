package feature.tab.presentation.panel

import core.panel.UnderConstructionPanel
import feature.rest.presentation.panel.RestPanel
import javax.swing.JTabbedPane

class TabPanel(restPanel: RestPanel) : JTabbedPane() {
    init {
        add("Rest API", restPanel)
        add("SSE", UnderConstructionPanel())
        add("Websocket", UnderConstructionPanel())
        add("Socket IO", UnderConstructionPanel())
    }
}