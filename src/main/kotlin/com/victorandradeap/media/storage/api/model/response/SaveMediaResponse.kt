package com.victorandradeap.media.storage.api.model.response

import io.micronaut.core.annotation.Introspected
import io.swagger.v3.oas.annotations.responses.ApiResponse

@ApiResponse
@Introspected
data class SaveMediaResponse(
    val id: String
)
