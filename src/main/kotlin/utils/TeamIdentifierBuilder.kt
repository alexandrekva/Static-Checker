package utils

import domain.Identifier

class TeamIdentifierBuilder {
    companion object {
        fun getTeamIdentifier(): Identifier {
            return Identifier(
                teamCode = "E03",
                teamCollaborators = TeamCollaboratorsBuilder.getTeamCollaborators()
            )
        }
    }
}