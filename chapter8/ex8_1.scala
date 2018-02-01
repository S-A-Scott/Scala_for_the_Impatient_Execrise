class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = {balance += amount; balance}
  def withdraw(amount: Double) = {balance -= amount; balance}
}

class CheckingAccount(initialBalance: Double)
  extends BankAccount(initialBalance) {
  private var balance = initialBalance

  override def deposit(amount: Double): Double = {
    balance = super.deposit(amount) - 1
    balance
  }

  override def withdraw(amount: Double): Double = {
    balance = super.withdraw(amount) - 1
    balance
  }
}

