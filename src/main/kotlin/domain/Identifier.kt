package domain

data class Identifier(
    val teamCode: String,
    val teamCollaborators: List<Collaborator>
) {
    override fun toString(): String {
        var text = ""

        text += "$teamCode\n\n"
        teamCollaborators.map { text += "${it.toString()}\n"}

        return text
    }
}
