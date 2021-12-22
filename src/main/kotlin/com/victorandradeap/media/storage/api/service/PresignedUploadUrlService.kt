package com.victorandradeap.media.storage.api.service

import com.victorandradeap.media.storage.api.configuration.AppPropertiesConfiguration
import com.victorandradeap.media.storage.api.model.response.PresignedUploadUrlResponse
import com.victorandradeap.media.storage.api.service.storage.StorageService
import io.minio.http.Method
import jakarta.inject.Singleton
import java.util.UUID

@Singleton
class PresignedUploadUrlService(
    private val storageService: StorageService,
    private val appPropertiesConfiguration: AppPropertiesConfiguration
) {

    fun getPresignedUploadUrl(): PresignedUploadUrlResponse {
        val objectKey = UUID.randomUUID().toString()
        val method = Method.PUT

        val presignedUploadURL = storageService.getSignedUploadUrl(
            appPropertiesConfiguration.sandboxBucketName,
            objectKey,
            method,
            appPropertiesConfiguration.uploadSignatureDurationInMinutes
        )

        return PresignedUploadUrlResponse(
            objectKey,
            presignedUploadURL,
            method.name,
            appPropertiesConfiguration.uploadSignatureDurationInMinutes
        )
    }
}
