package com.github.dot888.myfirstideaplugin.services

import com.intellij.openapi.project.Project
import com.github.dot888.myfirstideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
