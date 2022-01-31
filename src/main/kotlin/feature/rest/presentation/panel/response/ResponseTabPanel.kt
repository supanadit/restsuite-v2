package feature.rest.presentation.panel.response

import javax.swing.JTabbedPane

class ResponseTabPanel : JTabbedPane() {
    init {
        add("Response", BodyPanel())
    }
}