package com.github.jsbzg.intellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.jsbzg.intellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
