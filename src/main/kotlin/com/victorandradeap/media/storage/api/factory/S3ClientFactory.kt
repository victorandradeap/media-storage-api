package com.victorandradeap.media.storage.api.factory

import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import jakarta.inject.Singleton
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.s3.S3Client

@Factory
class S3ClientFactory {

    @Bean
    @Singleton
    fun s3Client(): S3Client {
        return S3Client.builder()
            .region(Region.US_EAST_1)
            .build();
    }
}
