fun main() {
    val student = StudentAccount("S1234", 100.0, "Alex", 4321)

    student.accountStatus()
    student.viewBalance()

    student.saveMoney(50.0)
    student.viewBalance()

    student.spendMoney(150.0)
    student.accountStatus()


    student.spendMoney(10.0)
}