package com.avinash

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.eagerInitSingletons(true)
		.packages("com.avinash")
		.start()
}

