package com.best

import org.gradle.api.*;

class GradlePluginExt implements Plugin<Project> {
    void apply(Project project) {
        doApply()
        project.task('hello') {
            group = "latest.inc"
            description = "gradle build script template"
            doLast {
                println "Hello from the GradlePluginExt Plugin Class"
            }
        }
    }

    private void doApply() {
        println '------------------------'
        println new Date().format('yyyy-MM-dd HH:mm:ss') + ': applying you customize plugin'
        println '------------------------'
    }
}
