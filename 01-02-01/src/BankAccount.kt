class BankAccount(private val accountNumber: String,
    private var balance: Double) {
    fun getBalance(): Double {
        return balance
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount")
        }else{
            println("Invalid deposit amount: $amount. Must be greater than zero.")
        }
    }

    fun withdraw(amount: Double) {
        if(amount > balance) {
            println("Insufficient funds for withdrawal of: $amount")
        } else if (amount > 0) {
            balance -= amount
            println("Withdrawal: $amount")
        } else {
            println("Invalid withdrawal amount")
        }
    }
}