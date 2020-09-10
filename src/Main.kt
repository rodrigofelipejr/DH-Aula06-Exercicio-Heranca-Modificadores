fun main() {
    val cliente1 = Cliente(99, "Silva", "99999999", "99999999999")
    val contaPoupanca = ContaPoupanca(88, cliente1, .5)

    with(contaPoupanca) {
        depositarDinheiro(100.0)
        recolherJuros()
        sacarDinheiro(70.0)
        sacarDinheiro(150.0)
    }

    println("")

    val contaCorrente = ContaCorrente(88, cliente1)
    val cheque = Cheque(50.0, 341, "2020-10-09")

    with(contaCorrente) {
        depositarDinheiro(200.0)
        depositarCheques(cheque)
        sacarDinheiro(230.0)
        sacarDinheiro(555.0)
        sacarDinheiro(300.0)
    }


}