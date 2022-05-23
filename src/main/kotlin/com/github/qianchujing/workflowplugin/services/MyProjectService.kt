package com.github.qianchujing.workflowplugin.services

import com.intellij.openapi.project.Project
import com.github.qianchujing.workflowplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
