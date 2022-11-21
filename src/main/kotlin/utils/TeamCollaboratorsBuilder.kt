package utils

import domain.Collaborator

class TeamCollaboratorsBuilder {
    companion object {
        fun getTeamCollaborators(): List<Collaborator> {
            return listOf(
                Collaborator(
                    name = "Alexandre Karl",
                    email = "alexandre.alves@ucsal.edu.br",
                    telephone = "71 99636-1186"
                ),
                Collaborator(
                    name = "Antonio Carlos",
                    email = "antoniocc.filho@ucsal.edu.br",
                    telephone = "71 99401-1114"
                ),
                Collaborator(
                    name = "Berman Schultz",
                    email = "berman.schultz@ucsal.edu.br",
                    telephone = "71 98772-3621"
                ),
                Collaborator(
                    name = "Luiz Felipe Viana",
                    email = "luizf.nascimento@ucsal.edu.br",
                    telephone = "71 99671-4267"
                )
            )
        }
    }
}