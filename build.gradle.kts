plugins {
    kotlin("jvm") version "1.8.0"
    `java-library`
    `maven-publish`
}

group = "com.andriel"
version = "1"


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.andriel"
            artifactId = "person"
            version = "1"

            from(components["java"])
        }
    }
}


repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}
