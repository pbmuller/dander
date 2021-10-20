package com.github.pbmuller.dander.services

import com.intellij.openapi.project.Project
import com.github.pbmuller.dander.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
