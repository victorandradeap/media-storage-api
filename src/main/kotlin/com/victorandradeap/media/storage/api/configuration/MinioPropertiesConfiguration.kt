package com.victorandradeap.media.storage.api.configuration

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("api.minio")
class MinioPropertiesConfiguration {

    var endpoint: String = ""
    var user: String = ""
    var password: String = ""
    var bucketName: String = ""
}
