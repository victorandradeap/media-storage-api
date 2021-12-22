package com.victorandradeap.media.storage.api.controller

import com.victorandradeap.media.storage.api.model.response.PresignedUploadUrlResponse
import com.victorandradeap.media.storage.api.service.PresignedUploadUrlService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.validation.Validated

@Validated
@Controller("/upload")
class UploadController(private val uploadMediaStorageService: PresignedUploadUrlService) {

    @Get("/presigned/url")
    @Produces(MediaType.APPLICATION_JSON)
    fun getPresignedUploadUrl(): MutableHttpResponse<PresignedUploadUrlResponse> {
        return HttpResponse.ok(uploadMediaStorageService.getPresignedUploadUrl())
    }
}
