pluginManagement {
    repositories {
        maven { url = uri("$rootDir/repo") }
        mavenLocal()
        mavenCentral()
        google()
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/public/") }
        maven { url = uri("https://maven.aliyun.com/repository/google/") }
        maven { url = uri("https://maven.aliyun.com/repository/releases") }
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
    }
    plugins {
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url = uri("$rootDir/repo") }
        mavenLocal()
        mavenCentral()
        google()
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/public/") }
        maven { url = uri("https://maven.aliyun.com/repository/google/") }
        maven { url = uri("https://maven.aliyun.com/repository/releases") }
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
    }
}
include(":app")
includeBuild("gradle-plugin")
include(":h5container")
include(":reactcontainer")
include(":foundation")
