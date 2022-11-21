package domain

data class Collaborator(
    val name: String,
    val email: String,
    val telephone: String
) {
    override fun toString(): String {
        return "Nome: $name - Email: $email - Telefone: $telephone."
    }
}