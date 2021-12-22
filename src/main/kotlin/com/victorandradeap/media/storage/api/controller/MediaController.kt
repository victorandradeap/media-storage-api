package com.victorandradeap.media.storage.api.controller

import com.victorandradeap.media.storage.api.model.request.SaveMediaRequest
import com.victorandradeap.media.storage.api.model.response.SaveMediaResponse
import com.victorandradeap.media.storage.api.service.SaveMediaStorageService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/media/storage")
class MediaController(private val saveMediaStorageService: SaveMediaStorageService) {

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun save(@Body @Valid saveMediaRequest: SaveMediaRequest): HttpResponse<SaveMediaResponse> {
        val saveMediaResponse = saveMediaStorageService.save(saveMediaRequest)
        return HttpResponse.created(saveMediaResponse)
    }
}
