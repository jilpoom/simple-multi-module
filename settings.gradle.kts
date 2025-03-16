rootProject.name = "nettee-simple-multi-module"

include("common")
include("monolithic")

include("core:exception-handler-core")
findProject(":core:exception-handler-core")?.name = "exception-handler-core"

include("core:jpa-core")
findProject(":core:jpa-core")?.name = "jpa-core"

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
