plugins {
    id("java-library")
    id("maven-publish")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
dependencies {
    implementation(libs.androidx.annotation.jvm)

}
publishing {
    publications {
        register<MavenPublication>("release") {
            afterEvaluate {
                from(components.findByName("release"))
            }
        }
    }
}
