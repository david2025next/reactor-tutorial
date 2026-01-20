package org.next.roman

import reactor.kotlin.core.publisher.toFlux

fun main() {

    (1..4).toFlux()
        .map { if (it <= 3) return@map it else throw RuntimeException("Go to 4") }
        .subscribe({ println(it) }, { System.err.println("Error $it") }, { println("Done") })
}