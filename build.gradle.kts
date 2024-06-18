plugins {
    kotlin("jvm") version "1.9.23"
}

group = "dev.janku.learn.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")

    testImplementation("org.junit.jupiter:junit-jupiter-engine:${property("junitVersion")}")
    testImplementation("io.strikt:strikt-core:${property("striktVersion")}")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:${property("junitLauncherVersion")}")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("passed", "skipped", "failed")
    }

    //if true show println in test console
    testLogging.showStandardStreams = false

    // start tests every time, even when code not changed
    outputs.upToDateWhen { false }
}