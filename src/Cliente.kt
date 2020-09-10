class Cliente(var numeroCliente: Int, var sobrenome: String, var RG: String, var CPF: String) {
    init {
        println("Cliente $sobrenome cadastrado com sucesso!")
    }
}