package com.dimiaug.cleanarch.writer

import com.dimiaug.cleanarch.port.Writer
import java.io.File

class FileWriter : Writer {

    override fun write(outputFunc: String) {
        val file = File("output.txt")
        file.appendText(outputFunc + "\n")
    }

}
