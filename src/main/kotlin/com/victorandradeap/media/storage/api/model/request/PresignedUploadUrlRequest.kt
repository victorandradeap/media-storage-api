package com.victorandradeap.media.storage.api.model.request

import javax.validation.constraints.NotBlank

data class PresignedUploadUrlRequest(

    @get:NotBlank
    val contentType: String
)
