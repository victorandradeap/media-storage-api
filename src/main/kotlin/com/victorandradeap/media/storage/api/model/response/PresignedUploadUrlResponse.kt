package com.victorandradeap.media.storage.api.model.response

import io.swagger.v3.oas.annotations.responses.ApiResponse

@ApiResponse
data class PresignedUploadUrlResponse(
    val objectKey: String,
    val url: String,
    val method: String,
    val uploadSignatureDurationInMinutes: Int
)
