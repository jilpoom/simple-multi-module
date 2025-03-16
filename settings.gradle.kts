pluginManagement {
    plugins {
        kotlin("jvm") version "1.9.0"
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "nettee-simple-multi-module"

include("common")
include("core:exception-handler-core")
include("core:jpa-core")

findProject(":core:jpa-core")?.name = "jpa-core"
findProject(":core:exception-handler-core")?.name = "exception-handler-core"
