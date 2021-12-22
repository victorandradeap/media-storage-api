package com.victorandradeap.media.storage.api.model.request

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
data class SaveMediaRequest(

    @get:NotBlank
    val objectKey: String
)
