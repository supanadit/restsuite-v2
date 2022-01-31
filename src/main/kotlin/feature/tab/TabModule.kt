package feature.tab

import dagger.Module
import dagger.Provides
import feature.rest.presentation.panel.RestPanel
import feature.tab.presentation.panel.TabPanel
import javax.inject.Singleton

@Module
class TabModule {
    @Provides
    @Singleton
    fun tabPanel(restPanel: RestPanel) = TabPanel(restPanel)
}