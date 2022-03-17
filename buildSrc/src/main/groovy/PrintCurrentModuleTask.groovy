import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class PrintCurrentModuleTask extends DefaultTask {

    @Input
    abstract Property<String> getCurrentModule()

    PrintCurrentModuleTask() {
        currentModule.convention('I am here!')
    }

    @TaskAction
    def greetings() {
        println "The plugin says Hey:  ${currentModule.get()} !"
    }
}

