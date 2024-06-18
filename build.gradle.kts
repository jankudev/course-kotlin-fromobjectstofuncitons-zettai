plugins {
    kotlin("jvm") version "1.9.23"
}

group = "dev.janku.learn.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}