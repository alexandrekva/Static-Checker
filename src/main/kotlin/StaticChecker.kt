import core.Strings
import core.TitleProperty
import utils.FileUtils
import java.io.File

class StaticChecker {
    private val fileUtils = FileUtils()

    init {
        welcomeUser()
        val file = getFile()
        val fileLines = fileUtils.readFile(file)
    }

    private fun getFile(): File {
        var invalidFile = true
        var file: File? = null

        while (invalidFile) {
            getFileName()?.let { file = searchFile(it) }
            if (file != null) invalidFile = false

        }

        return file!!
    }

    private fun getFileName(): String? {
        print(Strings.enterFileText)
        return readLine()
    }

    private fun searchFile(fileNameOrPath: String): File? {
        val titleProperty = fileUtils.getTitleProperty(fileNameOrPath)

        return when (titleProperty) {
            TitleProperty.FILE_NAME -> { fileUtils.getFileInCurrentPath(fileNameOrPath) }
            TitleProperty.FILE_PATH -> { fileUtils.getFileByPath(fileNameOrPath)}
        }
    }

    private fun welcomeUser() {
        println(Strings.appTitle)
        println(Strings.welcomeText)
    }

}