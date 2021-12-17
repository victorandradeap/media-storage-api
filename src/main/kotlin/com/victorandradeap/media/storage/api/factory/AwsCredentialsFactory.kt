package com.victorandradeap.media.storage.api.factory

import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Requires
import jakarta.inject.Singleton
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider

@Factory
class AwsCredentialsFactory {

    @Bean
    @Singleton
    @Requires(property = "api.environment", value = "local")
    fun awsCredentialsProvider(): AwsCredentialsProvider {
        return StaticCredentialsProvider.create(
            AwsBasicCredentials.create("accesskey", "secretkey")
        )
    }
}
