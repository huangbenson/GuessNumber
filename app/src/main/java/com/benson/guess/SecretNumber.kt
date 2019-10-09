package com.benson.guess

import java.util.*

class SecretNumber {
    val secrect = Random().nextInt(10) + 1
    var count = 0
    fun validate(number: Int): Int {
        count++
        return number - secrect
    }
}

fun main() {
    val secretNumber = SecretNumber()
    println(secretNumber.secrect)
    println("${secretNumber.validate(2)}, count: ${secretNumber.count}")
}