import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.10"
    id("io.qameta.allure") version "2.11.2"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation ("io.appium:java-client:7.5.1")
    implementation("org.junit.jupiter:junit-jupiter-api:5.9.2")

}

allure {
    report {
        version.set("2.20.0")
    }
}

tasks.test {
    useJUnitPlatform()
    finalizedBy("allureReport")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}