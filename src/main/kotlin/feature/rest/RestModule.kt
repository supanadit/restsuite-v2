package feature.rest

import dagger.Module
import dagger.Provides
import feature.rest.data.datasources.RestLocalDataSource
import feature.rest.data.datasources.RestRemoteDataSource
import feature.rest.data.repositories.RestRepositoryImpl
import feature.rest.presentation.panel.RestPanel
import javax.inject.Singleton

@Module
class RestModule {

    @Provides
    fun restRepositoryImpl(restLocalDataSource: RestLocalDataSource, restRemoteDataSource: RestRemoteDataSource) =
        RestRepositoryImpl(restLocalDataSource, restRemoteDataSource)

    @Provides
    @Singleton
    fun restPanel(restRepositoryImpl: RestRepositoryImpl) = RestPanel(restRepositoryImpl)
}