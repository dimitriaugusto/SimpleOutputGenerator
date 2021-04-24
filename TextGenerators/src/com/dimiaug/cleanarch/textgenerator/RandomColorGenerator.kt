package com.dimiaug.cleanarch.textgenerator

import com.dimiaug.cleanarch.port.TextGenerator
import kotlin.random.Random

class RandomColorGenerator : TextGenerator {

    override fun generate(): String {
        return generateRandomText()
    }

    private fun generateRandomText(): String {
        val list = listOf("black", "white", "blue", "yellow", "brown", "red", "green")
        return list[generateRandomInt(0, list.size)]
    }

    private fun generateRandomInt(min: Int, until: Int): Int {
        return Random.Default.nextInt(min, until)
    }

}