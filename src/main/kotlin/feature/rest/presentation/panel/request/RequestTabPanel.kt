package feature.rest.presentation.panel.request

import javax.swing.JTabbedPane

class RequestTabPanel : JTabbedPane() {
    init {
        add("Query Params", ParamsPanel())
        add("Header", HeadersPanel())
        add("Body", BodyPanel())
    }
}