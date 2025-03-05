plugins {
    `maven-publish`
    kotlin("jvm") version "2.0.0"
}

group = "com.wildclown.baseservicedto"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_21

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.0")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "com.wildclown.baseservicedto"
            artifactId = "base-dto"
            version = "1.0.0"
        }
    }
    repositories {
        mavenLocal()
    }
}

kotlin {
    jvmToolchain(21)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
