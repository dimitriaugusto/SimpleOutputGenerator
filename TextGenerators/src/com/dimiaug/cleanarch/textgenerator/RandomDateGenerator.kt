package com.dimiaug.cleanarch.textgenerator

import com.dimiaug.cleanarch.port.TextGenerator
import java.time.LocalDateTime

class RandomDateGenerator : TextGenerator {

    override fun generate(): String {
        return generateRandomDate()
    }

    private fun generateRandomDate(): String {
        return LocalDateTime.now().toString()
    }

}
