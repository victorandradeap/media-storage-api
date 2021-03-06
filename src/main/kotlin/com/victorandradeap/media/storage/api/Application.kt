package com.victorandradeap.media.storage.api

import io.micronaut.runtime.Micronaut.build
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
    info = Info(
        title = "media-storage-api",
        version = "0.0.1",
        description = "Media Storage API",
        contact = Contact(name = "Victor Andrade", email = "victorandradeap@gmail.com")
    )
)
object Api

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.victorandradeap.media.storage.api")
        .start()
}
