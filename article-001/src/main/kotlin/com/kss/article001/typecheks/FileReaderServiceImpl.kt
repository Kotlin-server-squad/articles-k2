package com.kss.article001.typecheks

class FileReaderServiceImpl {
    fun readFile(fileReader: Any) {
        if (fileReader is TextFileReader) {
            fileReader.read()
        } else if (fileReader is CsvFileReader) {
            fileReader.read()
        } else if (fileReader is ExcelFileReader) {
            fileReader.read()
        }
    }
}