package com.victorandradeap.media.storage.api.configuration

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("api")
class AppPropertiesConfiguration {
    var uploadSignatureDurationInMinutes: Int = 0
    var mainBucketName: String = ""
    var sandboxBucketName: String = ""
}
