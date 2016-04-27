package info.solidsoft.gradle.pitest

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin

class PitestPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.plugins.withType(JavaPlugin) {
            project.apply plugin: PitestPluginJava
        }

    }
}
