package domain

data class Identifier(
    val teamCode: String,
    val teamCollaborators: List<Collaborator>,

)
