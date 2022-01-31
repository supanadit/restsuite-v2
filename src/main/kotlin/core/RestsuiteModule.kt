package core

import dagger.Module
import dagger.Provides
import feature.tab.presentation.panel.TabPanel
import javax.inject.Singleton

@Module
class RestsuiteModule {
    @Provides
    @Singleton
    fun restsuiteFrame(tabPanel: TabPanel) = RestsuiteFrame(tabPanel)

    @Provides
    fun restsuiteInstance(restsuiteFrame: RestsuiteFrame) = RestsuiteInstance(restsuiteFrame)
}