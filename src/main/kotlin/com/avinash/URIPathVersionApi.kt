package com.avinash

import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/URI_PATH_DEMO")
class URIPathVersionApi {
    @Get("/v1/call")
    fun callV1(): MutableHttpResponse<*>? {
        return HttpResponse.ok("Calling URI_PATH_DEMO V1")
    }

    @Get("/v2/call")
    fun callV2(): MutableHttpResponse<*>? {
        return HttpResponse.ok("Calling URI_PATH_DEMO V2")
    }
}