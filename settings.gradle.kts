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

include("services:board:api")
findProject(":services:board:api")?.name = "api"

include("services:board:api:domain")
findProject(":services:board:api:domain")?.name = "domain"

include("services:board:api:exception")
findProject(":services:board:api:exception")?.name = "exception"

include("services:board:api:readmodel")
findProject(":services:board:api:readmodel")?.name = "readmodel"
include("services:board:application")
findProject(":services:board:application")?.name = "application"
