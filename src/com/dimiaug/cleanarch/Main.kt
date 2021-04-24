package com.dimiaug.cleanarch

import com.dimiaug.cleanarch.port.TextGenerator
import com.dimiaug.cleanarch.textgenerator.RandomAlphanumericGenerator
import com.dimiaug.cleanarch.writer.ConsoleWriter

fun main(args: Array<String>) {
//    val generator = RandomDateGenerator()
//    val generator = RandomColorGenerator()

    val generator = RandomAlphanumericGenerator()

//    val writer = FileWriter()
    val writer = ConsoleWriter()

    TextGeneratorManager(generator as TextGenerator, writer).generateAndWrite(30)
}

