package com.victorandradeap.media.storage.api.service

import com.victorandradeap.media.storage.api.configuration.AppPropertiesConfiguration
import com.victorandradeap.media.storage.api.model.request.SaveMediaRequest
import com.victorandradeap.media.storage.api.model.response.SaveMediaResponse
import com.victorandradeap.media.storage.api.service.storage.StorageService
import jakarta.inject.Singleton

@Singleton
class SaveMediaStorageService(
    private val storageService: StorageService,
    private val appPropertiesConfiguration: AppPropertiesConfiguration
) {

    fun save(saveMediaRequest: SaveMediaRequest): SaveMediaResponse {
        val newObjectKey = storageService.moveObject(
            appPropertiesConfiguration.sandboxBucketName,
            saveMediaRequest.objectKey,
            appPropertiesConfiguration.mainBucketName
        )
        return SaveMediaResponse(newObjectKey)
    }
}
