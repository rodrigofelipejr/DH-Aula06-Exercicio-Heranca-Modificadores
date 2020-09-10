class ContaCorrente(numeroConta: Int, titular: Cliente) : Conta(numeroConta, titular) {
    private var chequeEspecial: Double = 800.0

    init {
        println("Conta corrente criada com sucesso!")
    }

    override fun sacarDinheiro(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            println("Saque realizado com sucesso! [R$ $valor]")
        } else if ((saldo + chequeEspecial) >= valor) {
//            val valorReal: Double = valor - saldo
            val chequeEspecialUtilizado: Double = valor - saldo
            saldo = 0.0
            chequeEspecial -= chequeEspecialUtilizado

            println("Saque realizado com sucesso! [R\$ $valor] [Cheque especial utilizado R$ ${chequeEspecialUtilizado}]")
        } else {
            println("Saldo insuficiente para saque!")
        }
        consultaSaldo()
    }

    fun depositarCheques(cheque: Cheque) {
        saldo += cheque.valor
        println("Cheque no valor de R$ ${cheque.valor} depositado com sucesso!")
        consultaSaldo()
    }

    override fun consultaSaldo() {
        super.consultaSaldo()
        println("Saldo cheque especial: R$ $chequeEspecial")
    }
}