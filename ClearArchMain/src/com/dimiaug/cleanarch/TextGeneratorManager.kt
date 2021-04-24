package com.dimiaug.cleanarch

import com.dimiaug.cleanarch.port.TextGenerator
import com.dimiaug.cleanarch.port.Writer
import kotlin.random.Random

class TextGeneratorManager(private val textGenerator: TextGenerator, private val writer: Writer) {

    fun generateAndWrite(cycles: Int) {
        repeat(generateRandomInt(cycles)) {
            writer.write(textGenerator.generate())
        }
    }

    private fun generateRandomInt(until: Int): Int {
        return Random.Default.nextInt(until)
    }

}