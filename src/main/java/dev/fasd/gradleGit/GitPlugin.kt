package dev.fasd.gradleGit

import org.gradle.api.Plugin
import org.gradle.api.Project

class GitPlugin : Plugin<Project>
{
    override fun apply(target: Project) {
        target.tasks.register("gitLastTag") {
            val tag = target.gitGetLastTag()
            val description = target.gitGetTagDescription(tag)
            println("Git Last Tag: $tag, $description")
        }

        target.tasks.register("gitGetCountCommits") {
            val count = target.gitGetCountCommits()
            println("Git Count Commits: $count")
        }
    }
}