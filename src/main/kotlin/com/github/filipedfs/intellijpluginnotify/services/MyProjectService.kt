package com.github.filipedfs.intellijpluginnotify.services

import com.intellij.openapi.project.Project
import com.github.filipedfs.intellijpluginnotify.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
