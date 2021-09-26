package dev.fasd.gradleGit

import org.gradle.api.Project
import dev.fasd.gradleCmd.execCmd

/**
 * Название последнего тега
 */
fun Project.gitGetLastTag(): String {
    return execCmd("git describe --abbrev=0").trim()
}

/**
 * Описание выбраного тега
 * @param tag наименование тега
 */
fun Project.gitGetTagDescription(tag: String): String {
    return execCmd("git tag -l --format=%(contents) $tag").trim()
}

/**
 * Описсание последнего тега
 */
fun Project.gitGetLastTagDescription(): String {
    return gitGetTagDescription(gitGetLastTag())
}

/**
 * Количество коммитов
 */
fun Project.gitGetCountCommits(): Int {
    return execCmd("git rev-list --all --count").toInt()
}