package core

import javax.inject.Inject
import javax.inject.Singleton
import javax.swing.SwingUtilities

@Singleton
class RestsuiteInstance @Inject constructor(private val frame: RestsuiteFrame) {
    fun start() = SwingUtilities.invokeLater {
        frame.isVisible = true
        frame.setLocationRelativeTo(null)
    }
}