plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(":gradleCmd")
}

gradlePlugin {
    plugins.create("dev.fasd.gradle.git") {
        id = "dev.fasd.gradle.git"
        implementationClass = "dev.fasd.gradleGit.GitPlugin"
    }
}