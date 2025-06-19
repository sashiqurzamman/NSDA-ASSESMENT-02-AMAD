class StudentAccount(
    private val studentId: String,
    private var accountBalance: Double,
    private val studentName: String,
    private val passwordPin: Int
) {

    private fun isActive(): Boolean {
        return accountBalance > 0.0
    }

    fun viewBalance() {
        println("Current Balance: $$accountBalance")
    }

    fun saveMoney(amount: Double) {
        if (!isActive()) {
            println("Account is inactive. Cannot save money.")
            return
        }
        if (amount > 0) {
            accountBalance += amount
            println("$amount saved successfully.")
        } else {
            println("Invalid amount to save.")
        }
    }

    fun spendMoney(amount: Double) {
        if (!isActive()) {
            println("Account is inactive. Cannot spend money.")
            return
        }
        if (amount > accountBalance) {
            println("Insufficient funds.")
        } else if (amount > 0) {
            accountBalance -= amount
            println("$amount spent successfully.")
        } else {
            println("Invalid amount to spend.")
        }
    }

    fun accountStatus() {
        if (isActive()) {
            println("Account is active. Balance: $$accountBalance")
        } else {
            println("Account is inactive.")
        }
    }
}

