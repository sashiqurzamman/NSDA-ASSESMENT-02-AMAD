fun main(args: Array<String>) {
    val account = BankAccount("123456789", 1000.0)

    println("Initial balance: ${account.getBalance()}")
    account.deposit(500.0)
    println("Balance after deposit: ${account.getBalance()}")
    account.withdraw(2000.0)
    println("Balance after withdrawal: ${account.getBalance()}")

    account.withdraw(300.0)
    println("Final balance: ${account.getBalance()}")
}