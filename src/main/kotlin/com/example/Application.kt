package com.example

import org.slf4j.bridge.SLF4JBridgeHandler

import io.micronaut.runtime.Micronaut.run
fun main(args: Array<String>) {
	SLF4JBridgeHandler.removeHandlersForRootLogger()
    SLF4JBridgeHandler.install()
	run(*args)
}

