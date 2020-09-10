abstract class Conta(var numeroConta: Int, var titular: Cliente) {
    protected var saldo: Double = 0.0

    init {
        println("Olá ${titular.sobrenome}!")
    }

    open fun depositarDinheiro(valor: Double) {
        saldo += valor
        println("Deposito de $valor realizado com sucesso!")
        consultaSaldo()
    }

    open fun sacarDinheiro(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            println("Saque realizado com sucesso!")
        } else {
            println("Saldo insuficiente para saque!")
        }
        consultaSaldo()
    }

    open fun consultaSaldo() {
        println("Saldo atual: R$ $saldo")
    }
}