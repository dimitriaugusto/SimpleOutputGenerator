package com.dimiaug.cleanarch.writer

import com.dimiaug.cleanarch.port.Writer

class ConsoleWriter : Writer {

    override fun write(outputFunc: String) {
        println(outputFunc)
    }

}
