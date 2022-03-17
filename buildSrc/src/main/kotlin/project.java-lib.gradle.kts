plugins {
    `java-library`
}

version = "0.1-SNAPSHOT"
description = "Java dependencies"

repositories {
    mavenCentral()
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.2.6")
    implementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")

    implementation("org.junit.jupiter:junit-jupiter-params:5.7.0")
    implementation("org.junit.platform:junit-platform-runner:1.7.0")

    implementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.assertj:assertj-core:3.11.1")
}

tasks.test {
    useJUnitPlatform()
}