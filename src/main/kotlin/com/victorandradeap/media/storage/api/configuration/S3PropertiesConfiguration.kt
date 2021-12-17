package com.victorandradeap.media.storage.api.configuration

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("api.aws.s3")
class S3PropertiesConfiguration {
    var endpoint: String = ""
    var bucketName: String = ""
}
