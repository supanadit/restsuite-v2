package feature.rest.presentation.panel

import feature.rest.domain.repositories.RestRepository
import feature.rest.presentation.component.RequestTypeCombobox
import feature.rest.presentation.panel.request.RequestTabPanel
import feature.rest.presentation.panel.response.ResponseTabPanel
import net.miginfocom.swing.MigLayout
import javax.inject.Inject
import javax.swing.JButton
import javax.swing.JPanel
import javax.swing.JTextField

class RestPanel @Inject constructor(restRepository: RestRepository) : JPanel(MigLayout("insets 10 10 10 10")) {
    private val apiURL = JTextField()
    private val sendButton = JButton("Send")
    private val requestTypeCombobox = RequestTypeCombobox()

    init {
        add(apiURL, "growx, pushx")
        add(requestTypeCombobox)
        add(sendButton, "wrap")
        sendButton.addActionListener {
            restRepository.getData()
        }
        // Request Tab Panel
        add(RequestTabPanel(), "growx, pushx, span 3, wrap")
        // Response Tab Panel
        add(ResponseTabPanel(), "growx, growy, pushy, pushx, span 3, h 500")
    }
}