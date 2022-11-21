package utils

import domain.Collaborator

class TeamCollaboratorsBuilder {
    companion object {
        fun getTeamCollaborators(): List<Collaborator> {
            return listOf(
                Collaborator(
                    name = "Alexandre Karl Volkert Alves",
                    email = "alexandre.alves@ucsal.edu.br",
                    telephone = "71 99636-1186"
                )
            )
        }
    }
}