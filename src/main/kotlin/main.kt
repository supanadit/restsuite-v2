import com.formdev.flatlaf.FlatIntelliJLaf
import core.RestsuiteInstance
import core.RestsuiteModule
import dagger.Component
import feature.rest.RestModule
import feature.tab.TabModule
import javax.inject.Singleton


@Singleton
@Component(modules = [RestsuiteModule::class, RestModule::class, TabModule::class])
interface RestsuiteComponent {
    fun instance(): RestsuiteInstance
}

fun main() {
    FlatIntelliJLaf.setup()

    val app: RestsuiteComponent = DaggerRestsuiteComponent.create()
    app.instance().start()
}