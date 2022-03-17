object Versions {
    //SPRING
    val spring_boot_starter_web = "2.6.3"

    //CASSANDRA
    val spring_data_cassandra = "3.3.1"

    //METRICS
    val prometheus ="1.8.2"

    //LOGGING
    val logback_logstash ="7.0.1"

    //TEST
    val mockito ="4.3.1"

    //MOCKS
    val wiremock ="2.27.2"

    //PRODUCTIVITY
    val guava = "31.0.1-jre"
}

 object Deps {
    //SPRING
    val spring_boot_starter_web = "org.springframework.boot:spring-boot-starter-web:${Versions.spring_boot_starter_web}"

    //CASSANDRA
    val cassandra = "org.springframework.data:spring-data-cassandra:${Versions.spring_data_cassandra}"

    //METRICS
    val prometheus = "io.micrometer:micrometer-registry-prometheus:${Versions.prometheus}"

    //LOGGING
    val logback_logstash = "net.logstash.logback:logstash-logback-encoder:${Versions.logback_logstash}"

    //TEST
    val mockito = "org.mockito:mockito-core:${Versions.mockito}"

    //MOCKS
    val wiremock = "com.github.tomakehurst:wiremock:${Versions.wiremock}"

    //PRODUCTIVITY
    val guava =  "com.google.guava:guava:${Versions.guava}"
}
