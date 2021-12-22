package com.victorandradeap.media.storage.api.service.storage

import io.minio.CopyObjectArgs
import io.minio.CopySource
import io.minio.GetPresignedObjectUrlArgs
import io.minio.MinioClient
import io.minio.http.Method
import jakarta.inject.Singleton
import java.util.concurrent.TimeUnit

@Singleton
class StorageService(
    private val minioClient: MinioClient,
    private val asyncStorageService: AsyncStorageService
) {

    fun moveObject(sourceBucket: String, sourceObjectKey: String, destinationBucket: String): String {
        val copyObjectArgs = CopyObjectArgs.builder()
            .source(CopySource.builder().bucket(sourceBucket).`object`(sourceObjectKey).build())
            .bucket(destinationBucket)
            .`object`(sourceObjectKey)
            .build()

        val objectKey = minioClient.copyObject(copyObjectArgs).etag()
        asyncStorageService.deleteObjectAsync(sourceBucket, sourceObjectKey)

        return objectKey
    }

    fun getSignedUploadUrl(bucket: String, objectKey: String, method: Method, signatureDuration: Int): String {
        val getPresignedObjectUrlArgs = GetPresignedObjectUrlArgs.builder()
            .bucket(bucket)
            .expiry(signatureDuration, TimeUnit.MINUTES)
            .method(method)
            .`object`(objectKey)
            .build()

        return minioClient.getPresignedObjectUrl(getPresignedObjectUrlArgs)
    }
}
