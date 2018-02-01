class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = {balance += amount; balance}
  def withdraw(amount: Double) = {balance -= amount; balance}
}



class SavingsAccount(initialBalance: Double)
  extends BankAccount(initialBalance) {
  private var balance = initialBalance
  private var freePoundageTimes = 3

  def earnMonthlyInterest(): Double = {
    freePoundageTimes = 3
    balance = balance + balance * 0.01
    balance
  }

  override def deposit(amount: Double): Double = {
    balance = super.deposit(amount)
    if (freePoundageTimes > 0) {
      balance
    } else {
      balance -= 1
      balance
    }

  }

  override def withdraw(amount: Double): Double = {
    balance = super.withdraw(amount)
    if (freePoundageTimes > 0) {
      balance
    } else {
      balance -= 1
      balance
    }
  }
}
