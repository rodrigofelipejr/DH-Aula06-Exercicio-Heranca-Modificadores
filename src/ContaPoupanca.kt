class ContaPoupanca(numeroConta: Int, titular: Cliente, var taxaJuros: Double) : Conta(numeroConta, titular) {
    init {
        println("Conta poupança criada com sucesso!")
    }

    fun recolherJuros() {
        saldo += saldo / 100 * taxaJuros
        println("Juros recolhido...")
        consultaSaldo()
    }
}