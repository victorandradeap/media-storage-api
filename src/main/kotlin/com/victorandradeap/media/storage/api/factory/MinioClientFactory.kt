package com.victorandradeap.media.storage.api.factory

import com.victorandradeap.media.storage.api.configuration.MinioPropertiesConfiguration
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.minio.MinioClient
import javax.inject.Singleton

@Factory
class MinioClientFactory(private val minioPropertiesConfiguration: MinioPropertiesConfiguration) {

    @Bean
    @Singleton
    fun minioClient(): MinioClient {
        return MinioClient.builder()
            .endpoint(minioPropertiesConfiguration.endpoint)
            .credentials(minioPropertiesConfiguration.user, minioPropertiesConfiguration.password)
            .build()
    }
}
