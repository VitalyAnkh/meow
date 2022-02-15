package com.github.vitalyankh.meow.services

import com.intellij.openapi.project.Project
import com.github.vitalyankh.meow.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
