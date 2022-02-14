package com.avinash

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/CONTENT_NEGOTIATION_DEMO")
class ContentNegotiationVersioningApi {

    @Get("/call", consumes = [MediaType.APPLICATION_JSON], produces = [MediaType.APPLICATION_JSON])
    fun callV1(): MutableHttpResponse<*>? {
        return HttpResponse.ok("Calling CONTENT_NEGOTIATION_DEMO V1")
    }

    @Get("/call", consumes = ["application/vnd.v2+json"], produces = ["application/vnd.v2+json"])
    fun callV2(): MutableHttpResponse<*>? {
        return HttpResponse.ok("Calling CONTENT_NEGOTIATION_DEMO V2")
    }

    @Get("/call", consumes = ["application/vnd.v3+json"], produces = ["application/vnd.v3+json"])
    fun callV3(): MutableHttpResponse<*>? {
        return HttpResponse.ok("Calling CONTENT_NEGOTIATION_DEMO V3")
    }

}
