package com.victorandradeap.media.storage.api.factory

import com.victorandradeap.media.storage.api.configuration.S3PropertiesConfiguration
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Requires
import jakarta.inject.Singleton
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.s3.S3Client
import java.net.URI

@Factory
class S3ClientFactory(
    private val s3PropertiesConfiguration: S3PropertiesConfiguration,
    private val awsCredentialsProvider: AwsCredentialsProvider
) {

    @Bean
    @Singleton
    @Requires(property = "api.environment", value = "local")
    fun s3Client(): S3Client {
        return S3Client.builder()
            .region(Region.US_EAST_1)
            .credentialsProvider(awsCredentialsProvider)
            .endpointOverride(URI(s3PropertiesConfiguration.endpoint))
            .build()
    }
}
