plugins {
    application
}

dependencies {
    implementation(platform(libs.spring.dependencies))
    implementation("ch.qos.logback:logback-classic")
}

application {
    mainClass.set("ru.calculator.CalcDemo")
    applicationDefaultJvmArgs = listOf(
        "-Xms512m", "-Xmx512m",
        "-XX:+HeapDumpOnOutOfMemoryError",
        "-XX:HeapDumpPath=./logs/heapdump.hprof",
        "-XX:+UseG1GC",
        "-Xlog:gc=debug:file=./logs/gc-%p-%t.log:tags,uptime,time,level:filecount=5,filesize=10m"
    )
}
