rootProject.name = "nettee-simple-multi-module"

// Simple modules
include("common", "monolithic")

// Core modules
val coreModules = listOf("exception-handler-core", "jpa-core")
coreModules.forEach { module ->
    val path = "core:$module"
    include(path)
    findProject(":$path")?.name = module
}

// Board service modules
val boardApiSubModules = listOf("domain", "exception", "readmodel")
boardApiSubModules.forEach { subModule ->
    val path = "services:board:api:$subModule"
    include(path)
    findProject(":$path")?.name = subModule
}

// Board application module
include("services:board:application")
findProject(":services:board:application")?.name = "application"
