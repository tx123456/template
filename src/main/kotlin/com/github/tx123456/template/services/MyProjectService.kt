package com.github.tx123456.template.services

import com.intellij.openapi.project.Project
import com.github.tx123456.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
