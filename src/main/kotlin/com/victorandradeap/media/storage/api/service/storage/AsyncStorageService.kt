package com.victorandradeap.media.storage.api.service.storage

import io.micronaut.scheduling.annotation.Async
import io.minio.MinioClient
import io.minio.RemoveObjectArgs
import jakarta.inject.Singleton
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Singleton
open class AsyncStorageService(
    private val minioClient: MinioClient
) {

    private var log: Logger = LoggerFactory.getLogger(AsyncStorageService::class.java)

    @Async
    open fun deleteObjectAsync(bucket: String, objectKey: String) {
        val removeObjectArgs = RemoveObjectArgs.builder()
            .bucket(bucket)
            .`object`(objectKey)
            .build()

        minioClient.removeObject(removeObjectArgs)
        log.info("The object {}/{} was removed with success.", bucket, objectKey)
    }
}
