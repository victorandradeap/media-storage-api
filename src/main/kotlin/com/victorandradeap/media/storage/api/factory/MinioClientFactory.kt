package com.victorandradeap.media.storage.api.factory

import com.victorandradeap.media.storage.api.configuration.MinioPropertiesConfiguration
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Requires
import io.minio.MinioClient
import jakarta.inject.Singleton

@Factory
class MinioClientFactory(
    private val minioPropertiesConfiguration: MinioPropertiesConfiguration
) {

    @Bean
    @Singleton
    @Requires(property = "api.environment", value = "local")
    fun minioClient(): MinioClient {
        return MinioClient.builder()
            .endpoint(minioPropertiesConfiguration.endpoint)
            .credentials(minioPropertiesConfiguration.accesskey, minioPropertiesConfiguration.secretkey)
            .build();
    }
}
