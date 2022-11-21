package utils

import core.TitleProperty
import java.io.File
import java.nio.file.Paths

class FileUtils {

    private val path = Paths.get("").toAbsolutePath().toString()

    fun getTitleProperty(title: String): TitleProperty {
        return if (title.contains("/")) {
            TitleProperty.FILE_PATH
        } else {
            TitleProperty.FILE_NAME
        }
    }

    fun getFileInCurrentPath(fileName: String): File? {
        val file = File("$path/$fileName.222")
        val fileExists = file.exists()

        return if (fileExists) file else null
    }

    fun getFileByPath(filePath: String): File? {
        val file = File("$filePath.222")
        val fileExists = file.exists()

        return if (fileExists) file else null
    }

    fun readFile(file: File): List<String> {
        val fileStringLines = mutableListOf<String>()
        file.forEachLine { fileStringLines.add(it.uppercase()) }

        return fileStringLines
    }
}