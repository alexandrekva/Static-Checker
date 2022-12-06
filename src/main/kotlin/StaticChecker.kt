import analyser.FileCleaner
import analyser.LexicalAnalyser
import core.Strings
import core.TitleProperty
import utils.FileUtils
import utils.TeamIdentifierBuilder
import java.io.File

class StaticChecker {
    private val fileUtils = FileUtils()

    init {
        welcomeUser()
        val file = getFile()
        val fileCleaner = FileCleaner(file)
        val cleanFile = fileCleaner.getCleanFile()

        val lexicalAnalyser = LexicalAnalyser(cleanFile)
        lexicalAnalyser.analyseFile()

        //fileUtils.generateFile("test.LEX", TeamIdentifierBuilder.getTeamIdentifier().toString())
    }

    private fun getFile(): File {
        var invalidFile = true
        var file: File? = null

        getFileName(Strings.enterFileText)?.let { file = searchFile(it) }
        if (file != null) invalidFile = false

        while (invalidFile) {
            getFileName(Strings.enterFileTextInvalid)?.let { file = searchFile(it) }
            if (file != null) invalidFile = false
        }

        return file!!
    }

    private fun getFileName(message: String): String? {
        print(message)
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