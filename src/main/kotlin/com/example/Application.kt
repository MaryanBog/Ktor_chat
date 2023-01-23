package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.Koin

fun main() {
    embeddedServer(Netty, port = 8082, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
//    install(Koin){
//        module(mainModule)
//    }
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
    configureRouting()
}
