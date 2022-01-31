package core

import feature.tab.presentation.panel.TabPanel
import java.awt.BorderLayout
import java.awt.Dimension
import javax.inject.Inject
import javax.inject.Singleton
import javax.swing.JFrame

@Singleton
class RestsuiteFrame @Inject constructor(tabPanel: TabPanel) : JFrame("Restsuite") {
    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        size = Dimension(1024, 768)
        // Add Tab Panel
        add(tabPanel, BorderLayout.CENTER)
    }
}