package com.victorandradeap.media.storage.api.configuration

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("api.minio")
class MinioPropertiesConfiguration {
    var endpoint: String = ""
    var accesskey: String = ""
    var secretkey: String = ""
}
