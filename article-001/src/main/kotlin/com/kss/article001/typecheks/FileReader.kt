package com.kss.article001.typecheks

interface FileReader {
    fun read()
}

class TextFileReader: FileReader {
    override fun read() {
        println("Reading text file")
    }
}

class CsvFileReader: FileReader {
    override fun read() {
        println("Reading csv file")
    }
}

class ExcelFileReader: FileReader {
    override fun read() {
        println("Reading excel file")
    }
}