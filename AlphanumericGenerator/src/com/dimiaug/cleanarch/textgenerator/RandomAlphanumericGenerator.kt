package com.dimiaug.cleanarch.textgenerator

import com.dimiaug.cleanarch.port.TextGenerator
import kotlin.random.Random

private const val source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890     "

class RandomAlphanumericGenerator : TextGenerator {

    override fun generate(): String {
        val randInt = generateRandomInt(100)
        return List(randInt) { source.random() }.joinToString("")
    }

    private fun generateRandomInt(until: Int): Int {
        return Random.Default.nextInt(until)
    }

}