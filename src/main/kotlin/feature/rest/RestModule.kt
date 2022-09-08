package feature.rest

import dagger.Module
import dagger.Provides
import feature.rest.data.repositories.RestRepositoryImpl
import feature.rest.presentation.panel.RestPanel
import javax.inject.Singleton

@Module
class RestModule {
    @Provides
    @Singleton
    fun restPanel(restRepositoryImpl: RestRepositoryImpl) = RestPanel(restRepositoryImpl)
}